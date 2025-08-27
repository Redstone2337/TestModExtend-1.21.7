package net.miaomiao.extend.data;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.miaomiao.extend.block.ModBlocks;
import net.miaomiao.extend.item.ModItems;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ONE_ZIPPER_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TWO_ZIPPER_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THREE_ZIPPER_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FOUR_ZIPPER_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIVE_ZIPPER_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SIX_ZIPPER_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SEVEN_ZIPPER_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EIGHT_ZIPPER_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NINE_ZIPPER_OBSIDIAN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CREAM_BUN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREAM_BISCUIT, Models.GENERATED);
    }
}
