package com.github.draylar.vanilla_armor_plus.armor.emerald;

import com.github.draylar.vanilla_armor_plus.ArmorPlus;
import com.github.draylar.vanilla_armor_plus.armor.base.ArmorBase;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;

public class ArmorEmerald
{
    public static void registerArmor()
    {
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":emerald_helmet", new ArmorBase(ArmorPlus.armorMaterialEmerald, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":emerald_chestplate", new ArmorBase(ArmorPlus.armorMaterialEmerald, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":emerald_leggings", new ArmorBase(ArmorPlus.armorMaterialEmerald, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, ArmorPlus.MOD_ID + ":emerald_boots", new ArmorBase(ArmorPlus.armorMaterialEmerald, EquipmentSlot.FEET));
    }
}
