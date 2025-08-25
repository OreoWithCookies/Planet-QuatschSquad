package net.owc.quatschsquad.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class NukeBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<NukeBlock> CODEC = simpleCodec(NukeBlock::new);

    private static final VoxelShape NORTH_SHAPE = Block.box(2.0, 0.0, -9.0, 14.0, 12.0, 24.0);
    private static final VoxelShape EAST_SHAPE  = Block.box(-9.0, 0.0, 2.0, 24.0, 12.0, 14.0);
    private static final VoxelShape SOUTH_SHAPE = Block.box(2.0, 0.0, -8.0, 14.0, 12.0, 25.0); // adjust if needed
    private static final VoxelShape WEST_SHAPE  = Block.box(-8.0, 0.0, 2.0, 25.0, 12.0, 14.0);

    public NukeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case EAST  -> EAST_SHAPE;
            case WEST  -> WEST_SHAPE;
            default -> NORTH_SHAPE;
        };
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
