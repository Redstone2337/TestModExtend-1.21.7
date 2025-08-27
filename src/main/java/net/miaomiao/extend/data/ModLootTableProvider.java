package net.miaomiao.extend.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.miaomiao.extend.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ONE_ZIPPER_OBSIDIAN);
        addDrop(ModBlocks.TWO_ZIPPER_OBSIDIAN);
        addDrop(ModBlocks.THREE_ZIPPER_OBSIDIAN);
        addDrop(ModBlocks.FOUR_ZIPPER_OBSIDIAN);
        addDrop(ModBlocks.FIVE_ZIPPER_OBSIDIAN);
        addDrop(ModBlocks.SIX_ZIPPER_OBSIDIAN);
        addDrop(ModBlocks.SEVEN_ZIPPER_OBSIDIAN);
        addDrop(ModBlocks.EIGHT_ZIPPER_OBSIDIAN);
        addDrop(ModBlocks.NINE_ZIPPER_OBSIDIAN);
    }
}
