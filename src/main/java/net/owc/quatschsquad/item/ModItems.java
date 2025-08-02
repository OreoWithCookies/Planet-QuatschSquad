package net.owc.quatschsquad.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.owc.quatschsquad.QuatschSquadMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(QuatschSquadMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
