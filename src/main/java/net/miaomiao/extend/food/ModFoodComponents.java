package net.miaomiao.extend.food;

import net.miaomiao.extend.TestModMiaomiaozi;
import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent CREAM_BUN = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.2F)
            .alwaysEdible()
            .build();

    public static final FoodComponent CREAM_BISCUIT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .alwaysEdible()
            .build();

    public static void init() {
        TestModMiaomiaozi.LOGGER.info("食品注册成功！");
    }
}
