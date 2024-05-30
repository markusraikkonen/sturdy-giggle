package name.yliveto.block.entity;

import name.yliveto.Yliveto;
import name.yliveto.block.ModBlocks;
import name.yliveto.block.custom.Blender;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<BlenderEntity> BLENDER_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Yliveto.MOD_ID, "blender_be"),
                    FabricBlockEntityTypeBuilder.create(BlenderEntity::new,
                            ModBlocks.BLENDER).build());


    public static void registerBlockEntities() {
        Yliveto.LOGGER.info("Registering Block Entities for" + Yliveto.MOD_ID);
    }

}
