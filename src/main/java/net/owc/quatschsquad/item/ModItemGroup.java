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
                        output.accept(ModItems.CONSTITUTION_ITEM);
                    }).build());

    public static final Supplier<CreativeModeTab> EXPLOSIVES_TAB = ITEM_GROUP.register("explosives_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MINE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(QuatschSquad.MOD_ID, "politics_tab"))
                    .title(Component.translatable("itemgroup.quatschsquad.explosives"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MINE);
                        output.accept(ModBlocks.NUKE);
                    }).build());

    public static final Supplier<CreativeModeTab> AMMO_TAB = ITEM_GROUP.register("ammo_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SOLID_MEDIUM_SHELL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(QuatschSquad.MOD_ID, "explosives_tab"))
                    .title(Component.translatable("itemgroup.quatschsquad.ammo"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SOLID_MEDIUM_SHELL);
                        output.accept(ModItems.SMOKE_MEDIUM_SHELL);
                        output.accept(ModItems.AP_MEDIUM_SHELL);
                        output.accept(ModItems.HE_MEDIUM_SHELL);
                        output.accept(ModItems.GAS_MEDIUM_SHELL);
                        output.accept(ModItems.MEDIUM_SHELL_CASING);

                        output.accept(ModItems.SHELL_TIP);
                        output.accept(ModItems.SHELL_TIP_SMOKE);
                        output.accept(ModItems.SHELL_TIP_AP);
                        output.accept(ModItems.SHELL_TIP_HE);
                        output.accept(ModItems.SHELL_TIP_GAS);
                    }).build());

    public static void register(IEventBus eventBus) {
        ITEM_GROUP.register(eventBus);
    }
}
