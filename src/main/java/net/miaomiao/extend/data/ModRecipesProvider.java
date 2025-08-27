package net.miaomiao.extend.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.miaomiao.extend.block.ModBlocks;
import net.miaomiao.extend.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup,recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ONE_ZIPPER_OBSIDIAN)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.OBSIDIAN)
                        .criterion("has_obsidian", conditionsFromItem(Blocks.OBSIDIAN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TWO_ZIPPER_OBSIDIAN)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.ONE_ZIPPER_OBSIDIAN)
                        .criterion("has_one_zipper_obsidian", conditionsFromItem(ModBlocks.ONE_ZIPPER_OBSIDIAN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THREE_ZIPPER_OBSIDIAN)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.TWO_ZIPPER_OBSIDIAN)
                        .criterion("has_two_zipper_obsidian", conditionsFromItem(ModBlocks.TWO_ZIPPER_OBSIDIAN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOUR_ZIPPER_OBSIDIAN)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.THREE_ZIPPER_OBSIDIAN)
                        .criterion("has_three_zipper_obsidian", conditionsFromItem(ModBlocks.THREE_ZIPPER_OBSIDIAN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_ZIPPER_OBSIDIAN)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.FOUR_ZIPPER_OBSIDIAN)
                        .criterion("has_four_zipper_obsidian", conditionsFromItem(ModBlocks.FOUR_ZIPPER_OBSIDIAN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_ZIPPER_OBSIDIAN)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.FIVE_ZIPPER_OBSIDIAN)
                        .criterion("has_five_zipper_obsidian", conditionsFromItem(ModBlocks.FIVE_ZIPPER_OBSIDIAN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEVEN_ZIPPER_OBSIDIAN)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.SIX_ZIPPER_OBSIDIAN)
                        .criterion("has_six_zipper_obsidian", conditionsFromItem(ModBlocks.SIX_ZIPPER_OBSIDIAN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EIGHT_ZIPPER_OBSIDIAN)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.SEVEN_ZIPPER_OBSIDIAN)
                        .criterion("has_seven_zipper_obsidian", conditionsFromItem(ModBlocks.SEVEN_ZIPPER_OBSIDIAN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NINE_ZIPPER_OBSIDIAN)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.EIGHT_ZIPPER_OBSIDIAN)
                        .criterion("has_eight_zipper_obsidian", conditionsFromItem(ModBlocks.EIGHT_ZIPPER_OBSIDIAN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.FOOD, ModItems.CREAM_BUN)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("DDD")
                        .input('A', Items.MILK_BUCKET)
                        .input('B', Items.SUGAR)
                        .input('D', Items.WHEAT)
                        .criterion("has_sugar", conditionsFromItem(Items.SUGAR))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.FOOD, ModItems.CREAM_BISCUIT)
                        .pattern(" A ")
                        .pattern("BCB")
                        .pattern(" D ")
                        .input('A', Items.MILK_BUCKET)
                        .input('B', Items.SUGAR)
                        .input('C', ModItems.CREAM_BUN)
                        .input('D', Items.WHEAT)
                        .criterion("has_cream_bun", conditionsFromItem(ModItems.CREAM_BUN))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS,Blocks.BEDROCK)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModBlocks.NINE_ZIPPER_OBSIDIAN)
                        .criterion("has_nine_zipper_obsidian", conditionsFromItem(ModBlocks.NINE_ZIPPER_OBSIDIAN))
                        .offerTo(recipeExporter);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
