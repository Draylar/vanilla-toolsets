package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.block.Blocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialLapis implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 220;
    }

    @Override
    public float getMiningSpeed()
    {
        return 6;
    }

    @Override
    public float getAttackDamage()
    {
        return 3.5f;
    }

    @Override
    public int getMiningLevel()
    {
        return 2;
    }

    @Override
    public int getEnchantability()
    {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Blocks.LAPIS_BLOCK);
    }
}
