package name.yliveto.block;

import name.yliveto.Yliveto;
import name.yliveto.block.custom.Blender;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    //add dumass blocks below, you get the rest
    public static final Block ZAZA_BLOCK = registerBlock("zaza_block",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block DONER_BLOCK = registerBlock("doner_block",
            new Block(FabricBlockSettings.copyOf(Blocks.WET_SPONGE)));
    public static final Block BLENDER = registerBlock("blender",
            new Blender(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE)));


    private static Block registerBlock(String name, Block block) {
       registerBlockItem(name, block);
       return Registry.register(Registries.BLOCK, new Identifier(Yliveto.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
    return Registry.register(Registries.ITEM, new Identifier(Yliveto.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }



    public static void registerModBlocks() {
        Yliveto.LOGGER.info("Registering ModBlocks for " + Yliveto.MOD_ID);


    }


}
