package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ToolMaterialLapis implements IItemTier
{
    @Override
    public int getMaxUses()
    {
        return 220;
    }

    @Override
    public float getEfficiency()
    {
        return 6;
    }

    @Override
    public float getAttackDamage()
    {
        return 3.5f;
    }

    @Override
    public int getHarvestLevel()
    {
        return 2;
    }

    @Override
    public int getEnchantability()
    {
        return 30;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(Blocks.LAPIS_BLOCK);
    }
}
