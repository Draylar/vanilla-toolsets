package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialFiery implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 325;
    }

    @Override
    public float getMiningSpeed()
    {
        return 5.5F;
    }

    @Override
    public float getAttackDamage()
    {
        return 3;
    }

    @Override
    public int getMiningLevel()
    {
        return 1;
    }

    @Override
    public int getEnchantability()
    {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Items.FIRE_CHARGE);
    }
}
