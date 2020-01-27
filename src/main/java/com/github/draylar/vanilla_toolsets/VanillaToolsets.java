package com.github.draylar.vanilla_toolsets;

import com.github.draylar.vanilla_toolsets.registry.Materials;
import com.github.draylar.vanilla_toolsets.registry.Items;
import net.fabricmc.api.ModInitializer;

public class VanillaToolsets implements ModInitializer {

    public static final String MOD_ID = "vanilla-toolsets";

    @Override
    public void onInitialize() {
        Materials.init();
        Items.init();
    }
}