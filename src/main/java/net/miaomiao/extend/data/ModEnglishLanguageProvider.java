package net.miaomiao.extend.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.miaomiao.extend.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLanguageProvider extends FabricLanguageProvider {
    public ModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.ONE_ZIPPER_OBSIDIAN, "One Zipper Obsidian");
        translationBuilder.add(ModBlocks.TWO_ZIPPER_OBSIDIAN, "Two Zipper Obsidian");
        translationBuilder.add(ModBlocks.THREE_ZIPPER_OBSIDIAN, "Three Zipper Obsidian");
        translationBuilder.add(ModBlocks.FOUR_ZIPPER_OBSIDIAN, "Four Zipper Obsidian");
        translationBuilder.add(ModBlocks.FIVE_ZIPPER_OBSIDIAN, "Five Zipper Obsidian");
        translationBuilder.add(ModBlocks.SIX_ZIPPER_OBSIDIAN, "Six Zipper Obsidian");
        translationBuilder.add(ModBlocks.SEVEN_ZIPPER_OBSIDIAN, "Seven Zipper Obsidian");
        translationBuilder.add(ModBlocks.EIGHT_ZIPPER_OBSIDIAN, "Eight Zipper Obsidian");
        translationBuilder.add(ModBlocks.NINE_ZIPPER_OBSIDIAN, "Nine Zipper Obsidian");

        translationBuilder.add("itemGroup.mmz.silicon_build", "Miaomiaozi's Extend");
    }
}
