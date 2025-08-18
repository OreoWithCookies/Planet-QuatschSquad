package net.owc.quatschsquad.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.owc.quatschsquad.QuatschSquad;

public class ModItemGroup {
    public static final DeferredRegister<CreativeModeTab> ITEM_GROUP = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuatschSquad.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEM_GROUP.register(eventBus);
    }
}
