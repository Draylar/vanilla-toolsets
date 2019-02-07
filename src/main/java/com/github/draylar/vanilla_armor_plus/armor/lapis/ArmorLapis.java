package com.github.draylar.vanilla_armor_plus.armor.lapis;

import com.github.draylar.vanilla_armor_plus.ArmorPlus;
import com.github.draylar.vanilla_armor_plus.armor.base.ArmorBase;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;

public class ArmorLapis
{
    public static void registerArmor()
    {
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":lapis_helmet", new ArmorBase(ArmorPlus.armorMaterialLapis, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":lapis_chestplate", new ArmorBase(ArmorPlus.armorMaterialLapis, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":lapis_leggings", new ArmorBase(ArmorPlus.armorMaterialLapis, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":lapis_boots", new ArmorBase(ArmorPlus.armorMaterialLapis, EquipmentSlot.FEET));
    }
}
