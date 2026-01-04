package net.owc.quatschsquad.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.owc.quatschsquad.QuatschSquad;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(QuatschSquad.MOD_ID);

    //politics Items
    public static final DeferredItem<Item> CONSTITUTION_ITEM = ITEMS.register("constitution_item",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
