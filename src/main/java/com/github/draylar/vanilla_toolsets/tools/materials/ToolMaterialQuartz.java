package com.github.draylar.vanilla_toolsets.tools.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialQuartz implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 1028;
    }

    @Override
    public float getBlockBreakingSpeed()
    {
        return 6;
    }

    @Override
    public float getAttackDamage()
    {
        return 4;
    }

    @Override
    public int getMiningLevel()
    {
        return 1;
    }

    @Override
    public int getEnchantability()
    {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return null;
    }
}
