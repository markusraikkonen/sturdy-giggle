package name.yliveto.world.biome;

import name.yliveto.Yliveto;
import name.yliveto.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(Yliveto.MOD_ID, "overworld"), 2));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Yliveto.MOD_ID, ModMaterialRules.makeRules());
    }
}
