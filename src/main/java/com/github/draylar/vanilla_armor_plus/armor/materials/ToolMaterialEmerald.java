package com.github.draylar.vanilla_armor_plus.armor.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialEmerald implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 1028;
    }

    @Override
    public float getBlockBreakingSpeed()
    {
        return 12;
    }

    @Override
    public float getAttackDamage()
    {
        return 5;
    }

    @Override
    public int getMiningLevel()
    {
        return 3;
    }

    @Override
    public int getEnchantability()
    {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Items.EMERALD);
    }
}
