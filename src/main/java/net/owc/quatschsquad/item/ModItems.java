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

    //artillery Shells
    public static final DeferredItem<Item> SOLID_MEDIUM_SHELL = ITEMS.register("solid_medium_shell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AP_MEDIUM_SHELL = ITEMS.register("ap_medium_shell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMOKE_MEDIUM_SHELL = ITEMS.register("smoke_medium_shell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HE_MEDIUM_SHELL = ITEMS.register("he_medium_shell",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MEDIUM_SHELL_CASING = ITEMS.register("medium_shell_casing",
            () -> new Item(new Item.Properties()));

    //Guns
    /* public static final DeferredItem<Item> MUSKET = ITEMS.register("musket",
            () -> new Item(new Item.Properties().stacksTo(1))); */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
