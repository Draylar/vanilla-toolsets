package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.item.Items;
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
    public float getMiningSpeed()
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
        return Ingredient.ofItems(Items.QUARTZ);
    }
}
