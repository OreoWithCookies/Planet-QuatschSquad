package net.owc.quatschsquad.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.owc.quatschsquad.QuatschSquadMod;
import net.owc.quatschsquad.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuatschSquadMod.MOD_ID);

    public static final Supplier<CreativeModeTab> POLITICS_TAB = CREATIVE_MODE_TAB.register("politics_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GLOBE))
                    .title(Component.translatable("creativetab.quatschsquad.politics_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GLOBE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
