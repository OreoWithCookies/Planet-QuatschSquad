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
    public static final DeferredItem<Item> GAS_MEDIUM_SHELL = ITEMS.register("gas_medium_shell",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SHELL_TIP = ITEMS.register("shell_tip",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHELL_TIP_AP = ITEMS.register("shell_tip_ap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHELL_TIP_HE = ITEMS.register("shell_tip_he",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHELL_TIP_GAS = ITEMS.register("shell_tip_gas",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHELL_TIP_SMOKE = ITEMS.register("shell_tip_smoke",
            () -> new Item(new Item.Properties()));

    //Guns
    /* public static final DeferredItem<Item> MUSKET = ITEMS.register("musket",
            () -> new Item(new Item.Properties().stacksTo(1))); */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
