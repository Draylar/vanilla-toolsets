package com.github.draylar.vanilla_armor_plus.armor.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialEmerald implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 0;
    }

    @Override
    public float getBlockBreakingSpeed()
    {
        return 0;
    }

    @Override
    public float getAttackDamage()
    {
        return 0;
    }

    @Override
    public int getMiningLevel()
    {
        return 0;
    }

    @Override
    public int getEnchantability()
    {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return null;
    }
}
