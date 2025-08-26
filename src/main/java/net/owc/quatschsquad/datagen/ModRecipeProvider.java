package net.owc.quatschsquad.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;
import net.owc.quatschsquad.block.ModBlocks;
import net.owc.quatschsquad.item.ModItems;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GLOBE.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" C ")
                .define('A', Ingredient.of(Items.MAP))
                .define('B', Ingredient.of(Items.COMPASS))
                .define('C', Ingredient.of(Items.GOLD_INGOT))
                .unlockedBy("has_gold", has(Items.RAW_GOLD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SOLID_MEDIUM_SHELL.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" CC")
                .define('A', ModItems.SHELL_TIP.get())
                .define('B', Ingredient.of(Items.GOLD_INGOT))
                .define('C', Ingredient.of(Items.GUNPOWDER))
                .unlockedBy("has_gold", has(Items.RAW_GOLD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.AP_MEDIUM_SHELL.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" CC")
                .define('A', ModItems.SHELL_TIP_AP.get())
                .define('B', Ingredient.of(Items.GOLD_INGOT))
                .define('C', Ingredient.of(Items.GUNPOWDER))
                .unlockedBy("has_gold", has(Items.RAW_GOLD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.HE_MEDIUM_SHELL.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" CC")
                .define('A', ModItems.SHELL_TIP_HE.get())
                .define('B', Ingredient.of(Items.GOLD_INGOT))
                .define('C', Ingredient.of(Items.GUNPOWDER))
                .unlockedBy("has_gold", has(Items.RAW_GOLD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.GAS_MEDIUM_SHELL.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" CC")
                .define('A', ModItems.SHELL_TIP_GAS.get())
                .define('B', Ingredient.of(Items.GOLD_INGOT))
                .define('C', Ingredient.of(Items.GUNPOWDER))
                .unlockedBy("has_gold", has(Items.RAW_GOLD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SMOKE_MEDIUM_SHELL.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" CC")
                .define('A', ModItems.SHELL_TIP_SMOKE.get())
                .define('B', Ingredient.of(Items.GOLD_INGOT))
                .define('C', Ingredient.of(Items.GUNPOWDER))
                .unlockedBy("has_gold", has(Items.RAW_GOLD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SHELL_TIP.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern("AAA")
                .define('A', Ingredient.of(Items.IRON_INGOT))
                .unlockedBy("has_raw_iron", has(Items.RAW_IRON)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SHELL_TIP_AP.get(), 1)
                .requires(ModItems.SHELL_TIP)
                .requires(Ingredient.of(Items.IRON_INGOT))
                .unlockedBy("has_shell_tip", has(ModItems.SHELL_TIP)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SHELL_TIP_HE.get(), 1)
                .requires(ModItems.SHELL_TIP)
                .requires(Ingredient.of(Items.TNT))
                .unlockedBy("has_shell_tip", has(ModItems.SHELL_TIP)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SHELL_TIP_GAS.get(), 1)
                .requires(ModItems.SHELL_TIP)
                .requires(Ingredient.of(Items.POISONOUS_POTATO))
                .unlockedBy("has_shell_tip", has(ModItems.SHELL_TIP)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SHELL_TIP_SMOKE.get(), 1)
                .requires(ModItems.SHELL_TIP)
                .requires(Ingredient.of(Items.WIND_CHARGE))
                .unlockedBy("has_shell_tip", has(ModItems.SHELL_TIP)).save(recipeOutput);
    }
}
