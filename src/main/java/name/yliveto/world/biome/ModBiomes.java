package name.yliveto.world.biome;

import name.yliveto.Yliveto;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class ModBiomes {
    public static final RegistryKey<Biome> ZAZA_JUNGLE = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Yliveto.MOD_ID, "zaza_jungle"));

    public static void boostrap(Registerable<Biome> context) {
        context.register(ZAZA_JUNGLE, testBiome(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome testBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
               new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                       context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);



        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.5f)
                .temperature(3.5f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build())
                .build();
    }


    public static void registerModBiomes() {
        Yliveto.LOGGER.info("Registering Mod Biomes for " + Yliveto.MOD_ID);
    }
}
