package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class ArmorMaterialObsidian implements IArmorMaterial
{
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[]{3, 5, 5, 3};

    @Override
    public int getDurability(EquipmentSlotType equipmentSlot)
    {
        return BASE_DURABILITY[equipmentSlot.getIndex()] * 50;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType equipmentSlot)
    {
        return PROTECTION_AMOUNTS[equipmentSlot.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return 5;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return SoundEvents.BLOCK_METAL_BREAK;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(Blocks.OBSIDIAN);
    }

    @Override
    public String getName()
    {
        return "obsidian";
    }

    @Override
    public float getToughness()
    {
        return 3;
    }
}
