package name.yliveto.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PIRKKAKEBABSAUCE = new FoodComponent.Builder().alwaysEdible().hunger(8).saturationModifier(2)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 5), 100).build();

    public static final FoodComponent PEBBLE = new FoodComponent.Builder().hunger(2).saturationModifier(20)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 3600, 999), 100).build();

    public static final FoodComponent BOTTLEOFCYANIDE = new FoodComponent.Builder().alwaysEdible().hunger(0).saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1,0), 100).build();

    public static final FoodComponent BUCKETOFCYANIDE = new FoodComponent.Builder().alwaysEdible().hunger(0).saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1,99), 100).build();

    public static final FoodComponent BUCKETOFOATMILK = new FoodComponent.Builder().hunger(5).saturationModifier(4).build();

    public static final FoodComponent COCOAPOWDER = new FoodComponent.Builder().hunger(1).saturationModifier(0).build();

    public static final FoodComponent CHOCOLATEBAR = new FoodComponent.Builder().hunger(8).saturationModifier(1).build();

    public static final FoodComponent CARAMEL = new FoodComponent.Builder().hunger(1).saturationModifier(0).build();

    public static final FoodComponent MINT = new FoodComponent.Builder().hunger(2).saturationModifier(2).build();

    public static final FoodComponent DUMLEOATDRINK = new FoodComponent.Builder().hunger(12).saturationModifier(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200,1), 100).build();

    public static final FoodComponent PATKISOATDRINK = new FoodComponent.Builder().hunger(12).saturationModifier(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200,1), 100).build();
}
