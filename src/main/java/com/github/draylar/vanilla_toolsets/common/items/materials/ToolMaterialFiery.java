package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public class ToolMaterialFiery implements IItemTier
{
    @Override
    public int getMaxUses()
    {
        return 325;
    }

    @Override
    public float getEfficiency()
    {
        return 5.5F;
    }

    @Override
    public float getAttackDamage()
    {
        return 3;
    }

    @Override
    public int getHarvestLevel()
    {
        return 1;
    }

    @Override
    public int getEnchantability()
    {
        return 10;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(Items.FIRE_CHARGE);
    }
}
