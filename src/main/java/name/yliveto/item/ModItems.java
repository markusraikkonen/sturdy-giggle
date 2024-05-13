package name.yliveto.item;

import name.yliveto.Yliveto;
import name.yliveto.block.ModBlocks;
import name.yliveto.item.custom.PirkkaKebabSauce;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //add dumbass items below
    public static final Item PIRKKAKEBABSAUCE = registerItem("pirkkakebabsauce", new PirkkaKebabSauce(new FabricItemSettings().food(ModFoodComponents.PIRKKAKEBABSAUCE)));
    public static final Item PEBBLE =registerItem("pebble", new Item(new FabricItemSettings().food(ModFoodComponents.PEBBLE)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(PIRKKAKEBABSAUCE);
        entries.add(PEBBLE);
        entries.add(ModBlocks.ZAZA_BLOCK);
        entries.add(ModBlocks.DONER_BLOCK);
    }
    //add dumbass items above

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Yliveto.MOD_ID, name), item);
    }

    public static void registerModItems () {
        Yliveto.LOGGER.info("Registering Mod Items for" + Yliveto.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }


}
