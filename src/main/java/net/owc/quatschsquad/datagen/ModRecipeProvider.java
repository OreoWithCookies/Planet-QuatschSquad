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

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.MEDIUM_SHELL_CASING.get())
                .pattern("A A")
                .pattern("A A")
                .pattern("AAA")
                .define('A', Ingredient.of(Items.IRON_INGOT))
                .unlockedBy("has_gold", has(Items.IRON_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SOLID_MEDIUM_SHELL.get(), 1)
                .requires(ModItems.MEDIUM_SHELL_CASING)
                .requires(Ingredient.of(Items.IRON_INGOT))
                .unlockedBy("has_bismuth_block", has(ModItems.MEDIUM_SHELL_CASING)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AP_MEDIUM_SHELL.get(), 1)
                .requires(ModItems.MEDIUM_SHELL_CASING)
                .requires(Ingredient.of(Items.IRON_BLOCK))
                .unlockedBy("has_bismuth_block", has(ModItems.MEDIUM_SHELL_CASING)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HE_MEDIUM_SHELL.get(), 1)
                .requires(ModItems.MEDIUM_SHELL_CASING)
                .requires(Ingredient.of(Items.TNT))
                .unlockedBy("has_bismuth_block", has(ModItems.MEDIUM_SHELL_CASING)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SMOKE_MEDIUM_SHELL.get(), 1)
                .requires(ModItems.MEDIUM_SHELL_CASING)
                .requires(Ingredient.of(Items.WIND_CHARGE))
                .unlockedBy("has_bismuth_block", has(ModItems.MEDIUM_SHELL_CASING)).save(recipeOutput);
    }
}
