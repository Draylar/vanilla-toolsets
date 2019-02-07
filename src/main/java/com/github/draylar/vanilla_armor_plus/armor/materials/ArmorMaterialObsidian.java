package com.github.draylar.vanilla_armor_plus.armor.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class ArmorMaterialObsidian implements ArmorMaterial
{
    @Override
    public int getDurability(EquipmentSlot equipmentSlot)
    {
        return 0;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot equipmentSlot)
    {
        return 0;
    }

    @Override
    public int getEnchantability()
    {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return null;
    }

    @Override
    public String getName()
    {
        return "obsidian";
    }

    @Override
    public float getToughness()
    {
        return 0;
    }
}
