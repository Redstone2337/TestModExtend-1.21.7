package net.miaomiao.extend.item;

import net.miaomiao.extend.TestModMiaomiaozi;
import net.miaomiao.extend.food.ModConsumableComponents;
import net.miaomiao.extend.food.ModFoodComponents;
import net.miaomiao.extend.item.custom.CreamBiscuitItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {


    public static final Item CREAM_BUN = register("cream_bun", new Item.Settings()
            .food(ModFoodComponents.CREAM_BUN, ModConsumableComponents.CREAM_BUN)
            .maxCount(64)
    );

    public static final Item CREAM_BISCUIT = register("cream_biscuit",
            CreamBiscuitItem::new,
            new Item.Settings()
            .food(ModFoodComponents.CREAM_BISCUIT, ModConsumableComponents.CREAM_BISCUIT)
                    .attributeModifiers(CreamBiscuitItem.createAttributeModifiers())
            .maxCount(64)
    );


    private static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestModMiaomiaozi.MOD_ID, id));
        return Items.register(registryKey, factory, settings);
    }

    private static Item register(String id, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestModMiaomiaozi.MOD_ID, id));
        return Items.register(registryKey, Item::new, settings);
    }

    public static void init() {
        TestModMiaomiaozi.LOGGER.info("物品注册成功！");
    }
}
