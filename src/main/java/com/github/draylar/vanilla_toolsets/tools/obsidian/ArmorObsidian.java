package com.github.draylar.vanilla_toolsets.tools.obsidian;

import com.github.draylar.vanilla_toolsets.VanillaToolsets;
import com.github.draylar.vanilla_toolsets.tools.base.ArmorBase;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;

public class ArmorObsidian
{
    public static void registerArmor()
    {
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_helmet", new ArmorBase(VanillaToolsets.armorMaterialObsidian, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_chestplate", new ArmorBase(VanillaToolsets.armorMaterialObsidian, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_leggings", new ArmorBase(VanillaToolsets.armorMaterialObsidian, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_boots", new ArmorBase(VanillaToolsets.armorMaterialObsidian, EquipmentSlot.FEET));
    }
}
