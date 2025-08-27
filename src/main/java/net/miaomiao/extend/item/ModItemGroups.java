package net.miaomiao.extend.item;

import net.miaomiao.extend.TestModMiaomiaozi;
import net.miaomiao.extend.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> MIAOMIAOZI_GROUP = register("miaomiaozi_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(TestModMiaomiaozi.MOD_ID,id));
    }

    public static void init() {
        Registry.register(Registries.ITEM_GROUP,ModItemGroups.MIAOMIAOZI_GROUP,
                ItemGroup.create(
                                ItemGroup.Row.TOP, 0)
                        .displayName(Text.translatable("itemGroup.mmz.silicon_build"))
                        .icon(() -> new ItemStack(ModBlocks.ONE_ZIPPER_OBSIDIAN)).entries((displayContext, entries) -> {
                            entries.add(ModBlocks.ONE_ZIPPER_OBSIDIAN);
                            entries.add(ModBlocks.TWO_ZIPPER_OBSIDIAN);
                            entries.add(ModBlocks.THREE_ZIPPER_OBSIDIAN);
                            entries.add(ModBlocks.FOUR_ZIPPER_OBSIDIAN);
                            entries.add(ModBlocks.FIVE_ZIPPER_OBSIDIAN);
                            entries.add(ModBlocks.SIX_ZIPPER_OBSIDIAN);
                            entries.add(ModBlocks.SEVEN_ZIPPER_OBSIDIAN);
                            entries .add(ModBlocks.EIGHT_ZIPPER_OBSIDIAN);
                            entries.add(ModBlocks.NINE_ZIPPER_OBSIDIAN);
                            entries.add(ModItems.CREAM_BUN);
                            entries.add(ModItems.CREAM_BISCUIT);
                        })
                        .build()
        );
        // This method is intentionally left blank.
        // It can be used to trigger the class loading and
        TestModMiaomiaozi.LOGGER.info("注册物品栏成功！");
    }
}
/*

*/

