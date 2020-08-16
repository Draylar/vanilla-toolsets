package draylar.vt;

import draylar.vt.registry.Materials;
import draylar.vt.registry.Items;
import net.fabricmc.api.ModInitializer;

public class VanillaToolsets implements ModInitializer {

    public static final String MOD_ID = "vanilla-toolsets";

    @Override
    public void onInitialize() {
        Materials.init();
        Items.init();
    }
}