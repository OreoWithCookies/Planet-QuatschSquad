package net.owc.quatschsquad.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.owc.quatschsquad.QuatschSquad;
import net.owc.quatschsquad.block.custom.GlobeBlock;
import net.owc.quatschsquad.block.custom.NukeBlock;
import net.owc.quatschsquad.item.ModItems;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(QuatschSquad.MOD_ID);

    //politics
    public static final DeferredBlock<Block> GLOBE = registerBlock("globe",
            () -> new GlobeBlock(BlockBehaviour.Properties.of().noOcclusion()));

    //explosives
    public static final DeferredBlock<Block> NUKE = registerBlock("nuke",
            () -> new NukeBlock(BlockBehaviour.Properties.of().noOcclusion().strength(5f).sound(SoundType.ANVIL)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
