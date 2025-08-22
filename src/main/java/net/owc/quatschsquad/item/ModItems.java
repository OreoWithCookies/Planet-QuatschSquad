package net.owc.quatschsquad.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.owc.quatschsquad.QuatschSquad;
import net.owc.quatschsquad.item.custom.MineItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(QuatschSquad.MOD_ID);

    //explosive Items
    public static final DeferredItem<Item> MINE = ITEMS.register("mine",
            () -> new MineItem(new Item.Properties().stacksTo(16)));

    //Guns
    public static final DeferredItem<Item> MUSKET = ITEMS.register("musket",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
