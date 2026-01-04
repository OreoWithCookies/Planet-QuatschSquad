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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CONSTITUTION_ITEM.get(), 1)
                .requires(Ingredient.of(Items.PAPER))
                .requires(Ingredient.of(Items.FEATHER))
                .unlockedBy("has_constitution_item", has(ModItems.CONSTITUTION_ITEM)).save(recipeOutput);
    }
}
