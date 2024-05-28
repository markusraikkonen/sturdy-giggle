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
    public static final Item BOTTLEOFCYANIDE =registerItem("bottleofcyanide", new Item(new FabricItemSettings().food(ModFoodComponents.BOTTLEOFCYANIDE)));
    public static final Item BUCKETOFCYANIDE =registerItem("bucketofcyanide", new Item(new FabricItemSettings().food(ModFoodComponents.BUCKETOFCYANIDE)));
    public static final Item BUCKETOFOATMILK =registerItem("bucketofoatmilk", new Item(new FabricItemSettings().food(ModFoodComponents.BUCKETOFOATMILK)));
    public static final Item COCOAPOWDER =registerItem("cocoapowder", new Item(new FabricItemSettings().food(ModFoodComponents.COCOAPOWDER)));
    public static final Item CHOCOLATEBAR =registerItem("chocolatebar", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATEBAR)));
    public static final Item CARAMEL =registerItem("caramel", new Item(new FabricItemSettings().food(ModFoodComponents.CARAMEL)));
    public static final Item MINT =registerItem("mint", new Item(new FabricItemSettings().food(ModFoodComponents.MINT)));
    public static final Item DUMLEOATDRINK =registerItem("dumleoatdrink", new Item(new FabricItemSettings().food(ModFoodComponents.DUMLEOATDRINK)));
    public static final Item PATKISOATDRINK =registerItem("patkisoatdrink", new Item(new FabricItemSettings().food(ModFoodComponents.PATKISOATDRINK)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(PIRKKAKEBABSAUCE);
        entries.add(PEBBLE);
        entries.add(BOTTLEOFCYANIDE);
        entries.add(BUCKETOFCYANIDE);
        entries.add(BUCKETOFOATMILK);
        entries.add(COCOAPOWDER);
        entries.add(CHOCOLATEBAR);
        entries.add(CARAMEL);
        entries.add(MINT);
        entries.add(DUMLEOATDRINK);
        entries.add(PATKISOATDRINK);


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
