package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ToolMaterialObsidian implements IItemTier
{
    @Override
    public int getMaxUses()
    {
        return 2048;
    }

    @Override
    public float getEfficiency()
    {
        return 5;
    }

    @Override
    public float getAttackDamage()
    {
        return 4.5f;
    }

    @Override
    public int getHarvestLevel()
    {
        return 3;
    }

    @Override
    public int getEnchantability()
    {
        return 5;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(Blocks.OBSIDIAN);
    }
}
