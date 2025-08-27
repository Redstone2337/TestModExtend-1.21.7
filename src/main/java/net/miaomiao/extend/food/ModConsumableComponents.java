package net.miaomiao.extend.food;

import net.miaomiao.extend.TestModMiaomiaozi;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.UseAction;
import net.minecraft.sound.SoundEvents;

import java.util.List;

public class ModConsumableComponents {

    public static final ConsumableComponent.Builder FOOD = food();
    public static final ConsumableComponent.Builder DRINK = drink();

    public static final ConsumableComponent CREAM_BUN = food()
            .consumeSeconds(2.0f)
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            new StatusEffectInstance(
                                    StatusEffects.SATURATION, 600, 3, false, true
                            )
                    )
            )
            .build();

    public static final ConsumableComponent CREAM_BISCUIT = food()
            .consumeSeconds(6.0f)
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                                    new StatusEffectInstance(
                                            StatusEffects.SATURATION, 600, 3, false, true
                                    ),
                                    new StatusEffectInstance(
                                            StatusEffects.REGENERATION, 200, 1, false, true
                                    ),
                                    new StatusEffectInstance(
                                            StatusEffects.RESISTANCE, 600, 0, false, true
                                    )
                            )
                    )
            )
            .build();


    public static void init() {
        TestModMiaomiaozi.LOGGER.info("饮品食品组件注册成功");
    }

    public static ConsumableComponent.Builder food() {
        return ConsumableComponent.builder().consumeSeconds(1.6F).useAction(UseAction.EAT).sound(SoundEvents.ENTITY_GENERIC_EAT).consumeParticles(true);
    }

    public static ConsumableComponent.Builder drink() {
        return ConsumableComponent.builder().consumeSeconds(1.6F).useAction(UseAction.DRINK).sound(SoundEvents.ENTITY_GENERIC_DRINK).consumeParticles(false);
    }
}
