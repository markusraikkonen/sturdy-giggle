package name.yliveto;

import name.yliveto.screen.BlenderScreen;
import name.yliveto.screen.BlenderScreenHandler;
import name.yliveto.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class YlivetoClient implements ClientModInitializer {
   @Override
   public void onInitializeClient() {

      HandledScreens.register(ModScreenHandlers.BLENDER_SCREEN_HANDLER, BlenderScreen::new);




   }
}
