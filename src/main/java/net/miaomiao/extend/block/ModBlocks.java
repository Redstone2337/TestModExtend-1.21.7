package net.miaomiao.extend.block;

import net.miaomiao.extend.TestModMiaomiaozi;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block ONE_ZIPPER_OBSIDIAN = register("one_zipper_obsidian",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(450.0F, 1200.0F)
    );

    public static final Block TWO_ZIPPER_OBSIDIAN = register("two_zipper_obsidian",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(450.0F, 1200.0F)
    );

    public static final Block THREE_ZIPPER_OBSIDIAN = register("three_zipper_obsidian",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(450.0F, 1200.0F)
    );

    public static final Block FOUR_ZIPPER_OBSIDIAN = register("four_zipper_obsidian",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(450.0F, 1200.0F)
    );

    public static final Block FIVE_ZIPPER_OBSIDIAN = register("five_zipper_obsidian",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(450.0F, 1200.0F)
    );

    public static final Block SIX_ZIPPER_OBSIDIAN = register("six_zipper_obsidian",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(450.0F, 1200.0F)
    );

    public static final Block SEVEN_ZIPPER_OBSIDIAN = register("seven_zipper_obsidian",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(450.0F, 1200.0F)
    );

    public static final Block EIGHT_ZIPPER_OBSIDIAN = register("eight_zipper_obsidian",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(450.0F, 1200.0F)
    );

    public static final Block NINE_ZIPPER_OBSIDIAN = register("nine_zipper_obsidian",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(450.0F, 1200.0F)
    );



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
