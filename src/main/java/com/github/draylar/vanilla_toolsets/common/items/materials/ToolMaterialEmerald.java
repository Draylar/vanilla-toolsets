package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public class ToolMaterialEmerald implements IItemTier
{
    @Override
    public int getMaxUses()
    {
        return 1028;
    }

    @Override
    public float getEfficiency()
    {
        return 7;
    }

    @Override
    public float getAttackDamage()
    {
        return 4;
    }

    @Override
    public int getHarvestLevel()
    {
        return 3;
    }

    @Override
    public int getEnchantability()
    {
        return 15;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(Items.EMERALD);
    }
}
