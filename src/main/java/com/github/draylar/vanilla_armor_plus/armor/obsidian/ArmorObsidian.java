package com.github.draylar.vanilla_armor_plus.armor.obsidian;

import com.github.draylar.vanilla_armor_plus.ArmorPlus;
import com.github.draylar.vanilla_armor_plus.armor.base.ArmorBase;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;

public class ArmorObsidian
{
    public static void registerArmor()
    {
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":obsidian_helmet", new ArmorBase(ArmorPlus.armorMaterialObsidian, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":obsidian_chestplate", new ArmorBase(ArmorPlus.armorMaterialObsidian, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":obsidian_leggings", new ArmorBase(ArmorPlus.armorMaterialObsidian, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":obsidian_boots", new ArmorBase(ArmorPlus.armorMaterialObsidian, EquipmentSlot.FEET));
    }
}
