package name.yliveto.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PIRKKAKEBABSAUCE = new FoodComponent.Builder().alwaysEdible().hunger(8).saturationModifier(2)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 5), 100).build();
    public static final FoodComponent PEBBLE = new FoodComponent.Builder().hunger(2).saturationModifier(20)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 3600, 999), 100).build();


}
