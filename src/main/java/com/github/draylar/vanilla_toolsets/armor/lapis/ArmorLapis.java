package com.github.draylar.vanilla_toolsets.armor.lapis;

import com.github.draylar.vanilla_toolsets.VanillaToolsets;
import com.github.draylar.vanilla_toolsets.armor.base.ArmorBase;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;

public class ArmorLapis
{
    public static void registerArmor()
    {
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_helmet", new ArmorBase(VanillaToolsets.armorMaterialLapis, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_chestplate", new ArmorBase(VanillaToolsets.armorMaterialLapis, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_leggings", new ArmorBase(VanillaToolsets.armorMaterialLapis, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_boots", new ArmorBase(VanillaToolsets.armorMaterialLapis, EquipmentSlot.FEET));
    }
}
