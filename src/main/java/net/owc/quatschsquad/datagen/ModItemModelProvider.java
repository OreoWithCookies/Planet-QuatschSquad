package net.owc.quatschsquad.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.owc.quatschsquad.QuatschSquad;
import net.owc.quatschsquad.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, QuatschSquad.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SHELL_TIP.get());
        basicItem(ModItems.SHELL_TIP_GAS.get());
        basicItem(ModItems.SHELL_TIP_SMOKE.get());
        basicItem(ModItems.SHELL_TIP_AP.get());
        basicItem(ModItems.SHELL_TIP_HE.get());
        basicItem(ModItems.CONSTITUTION_ITEM.get());
    }
}
