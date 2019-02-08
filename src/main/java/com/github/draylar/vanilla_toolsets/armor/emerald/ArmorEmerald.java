package com.github.draylar.vanilla_toolsets.armor.emerald;

import com.github.draylar.vanilla_toolsets.VanillaToolsets;
import com.github.draylar.vanilla_toolsets.armor.base.ArmorBase;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;

public class ArmorEmerald
{
    public static ArmorBase emeraldHelmet;
    public static ArmorBase emeraldChestplate;
    public static ArmorBase emeraldLeggings;
    public static ArmorBase emeraldBoots;

    public static void registerArmor()
    {
        emeraldHelmet = Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_helmet", new ArmorBase(VanillaToolsets.armorMaterialEmerald, EquipmentSlot.HEAD));
        emeraldChestplate = Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_chestplate", new ArmorBase(VanillaToolsets.armorMaterialEmerald, EquipmentSlot.CHEST));
        emeraldLeggings = Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_leggings", new ArmorBase(VanillaToolsets.armorMaterialEmerald, EquipmentSlot.LEGS));
        emeraldBoots = Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_boots", new ArmorBase(VanillaToolsets.armorMaterialEmerald, EquipmentSlot.FEET));
    }
}
