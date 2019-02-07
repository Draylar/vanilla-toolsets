package com.github.draylar.vanilla_armor_plus.armor.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class ArmorMaterialEmerald implements ArmorMaterial
{
    @Override
    public int getDurability(EquipmentSlot equipmentSlot)
    {
        return 0;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot equipmentSlot)
    {
        return 2;
    }

    @Override
    public int getEnchantability()
    {
        return 25;
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
        return "emerald";
    }

    @Override
    public float getToughness()
    {
        return 0;
    }
}
