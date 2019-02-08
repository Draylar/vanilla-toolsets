package com.github.draylar.vanilla_toolsets.armor.materials;

import net.minecraft.block.Blocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialObsidian implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 2048;
    }

    @Override
    public float getBlockBreakingSpeed()
    {
        return 5;
    }

    @Override
    public float getAttackDamage()
    {
        return 4.5f;
    }

    @Override
    public int getMiningLevel()
    {
        return 3;
    }

    @Override
    public int getEnchantability()
    {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Blocks.OBSIDIAN);
    }
}
