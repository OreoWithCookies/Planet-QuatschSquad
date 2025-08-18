package net.owc.quatschsquad.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.owc.quatschsquad.QuatschSquad;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(QuatschSquad.MOD_ID);

    //add Items below

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
