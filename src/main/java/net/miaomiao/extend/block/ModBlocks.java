package net.miaomiao.extend.block;

import net.miaomiao.extend.TestModMiaomiaozi;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {



    private static Block register(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestModMiaomiaozi.MOD_ID,id));
        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }

    private static Block register(String id, AbstractBlock.Settings settings) {
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestModMiaomiaozi.MOD_ID,id));
        final Block block = Blocks.register(registryKey, Block::new, settings);
        Items.register(block);
        return block;
    }

    private static Block register(String id,
                                  Function<AbstractBlock.Settings, Block> factory,
                                  AbstractBlock.Settings settings,
                                  boolean registerItems) {
//        final Identifier identifier = Identifier.of("tutorial", path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestModMiaomiaozi.MOD_ID,id));
        final Block block = Blocks.register(registryKey, factory, settings);
        if (registerItems) {
            Items.register(block);
        }
        return block;
    }

    private static Block register(String id, AbstractBlock.Settings settings,boolean registerItems) {
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestModMiaomiaozi.MOD_ID,id));
        final Block block = Blocks.register(registryKey, Block::new, settings);
        if (registerItems) {
            Items.register(block);
        }
        return block;
    }

    public static void init() {
        TestModMiaomiaozi.LOGGER.info("方块注册成功！");
    }
}
