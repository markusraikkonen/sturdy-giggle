package name.yliveto.datagen;

import name.yliveto.block.ModBlocks;
import name.yliveto.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZAZA_BLOCK);

        blockStateModelGenerator.registerSimpleState(ModBlocks.BLENDER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PEBBLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIRKKAKEBABSAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUMLEOATDRINK, Models.GENERATED);
        itemModelGenerator.register(ModItems.PATKISOATDRINK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARAMEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCOAPOWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATEBAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOTTLEOFCYANIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUCKETOFCYANIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUCKETOFOATMILK, Models.GENERATED);
    }
}
