package name.yliveto.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import name.yliveto.Yliveto;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<BlenderScreenHandler> BLENDER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Yliveto.MOD_ID, "blender"),
                    new ExtendedScreenHandlerType<>(BlenderScreenHandler::new));

    public static void registerScreenHandlers() {
        Yliveto.LOGGER.info("Registering Screen Handlers for " + Yliveto.MOD_ID);
    }
}
