package com.github.draylar.vanilla_toolsets.tools.quartz;

import com.github.draylar.vanilla_toolsets.VanillaToolsets;
import com.github.draylar.vanilla_toolsets.tools.base.ArmorBase;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;

public class ArmorQuartz
{
    public static void registerArmor()
    {
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_helmet", new ArmorBase(VanillaToolsets.armorMaterialQuartz, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_chestplate", new ArmorBase(VanillaToolsets.armorMaterialQuartz, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_leggings", new ArmorBase(VanillaToolsets.armorMaterialQuartz, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_boots", new ArmorBase(VanillaToolsets.armorMaterialQuartz, EquipmentSlot.FEET));
    }
}
