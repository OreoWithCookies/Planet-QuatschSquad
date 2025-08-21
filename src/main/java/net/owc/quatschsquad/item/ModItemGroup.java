package net.owc.quatschsquad.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.owc.quatschsquad.QuatschSquad;
import net.owc.quatschsquad.block.ModBlocks;

import java.util.function.Supplier;

public class ModItemGroup {
    public static final DeferredRegister<CreativeModeTab> ITEM_GROUP =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuatschSquad.MOD_ID);

    //add item-groups below
    public static final Supplier<CreativeModeTab> POLITICS_TAB = ITEM_GROUP.register("politics_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GLOBE.get()))
                    .title(Component.translatable("itemgroup.quatschsquad.politics"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GLOBE);
                    }).build());

    public static final Supplier<CreativeModeTab> EXPLOSIVES_TAB = ITEM_GROUP.register("explosives_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MINE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(QuatschSquad.MOD_ID, "politics_tab"))
                    .title(Component.translatable("itemgroup.quatschsquad.explosives"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MINE);
                    }).build());

    public static void register(IEventBus eventBus) {
        ITEM_GROUP.register(eventBus);
    }
}
