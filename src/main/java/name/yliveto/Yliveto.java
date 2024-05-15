package name.yliveto;

import name.yliveto.biome.ModBiomes;
import name.yliveto.block.ModBlocks;
import name.yliveto.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Yliveto implements ModInitializer {
	public static final String MOD_ID = "yliveto";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBiomes.registerModBiomes();
	}
}