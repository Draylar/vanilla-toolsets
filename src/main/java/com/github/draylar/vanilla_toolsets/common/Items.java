package com.github.draylar.vanilla_toolsets.common;

import com.github.draylar.vanilla_toolsets.VanillaToolsets;
import com.github.draylar.vanilla_toolsets.common.items.emerald.*;
import com.github.draylar.vanilla_toolsets.common.items.lapis.*;
import com.github.draylar.vanilla_toolsets.common.items.obsidian.*;
import com.github.draylar.vanilla_toolsets.common.items.quartz.*;
import net.minecraft.util.registry.Registry;

public class Items
{
    public static void registerItems()
    {
        // emerald set
        ArmorEmerald.registerArmor();
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_pickaxe", new PickaxeEmerald());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_axe", new AxeEmerald());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_shovel", new ShovelEmerald());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_hoe", new HoeEmerald());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_sword", new SwordEmerald());


        // obsidian set
        ArmorObsidian.registerArmor();
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_pickaxe", new PickaxeObsidian());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_axe", new AxeObsidian());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_shovel", new ShovelObsidian());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_hoe", new HoeObsidian());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_sword", new SwordObsidian());

        // lapis set
        ArmorLapis.registerArmor();
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_pickaxe", new PickaxeLapis());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_axe", new AxeLapis());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_shovel", new ShovelLapis());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_hoe", new HoeLapis());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_sword", new SwordLapis());

        // quartz set
        ArmorQuartz.registerArmor();
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_pickaxe", new PickaxeQuartz());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_axe", new AxeQuartz());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_shovel", new ShovelQuartz());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_hoe", new HoeQuartz());
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_sword", new SwordQuartz());
    }
}
