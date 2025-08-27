package net.miaomiao.extend;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.miaomiao.extend.data.ModEnglishLanguageProvider;
import net.miaomiao.extend.data.ModLootTableProvider;
import net.miaomiao.extend.data.ModModelsProvider;
import net.miaomiao.extend.data.ModRecipesProvider;

public class TestModMiaomiaoziDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelsProvider::new);
        pack.addProvider(ModEnglishLanguageProvider::new);
        pack.addProvider(ModRecipesProvider::new);
        pack.addProvider(ModLootTableProvider::new);
	}
}
