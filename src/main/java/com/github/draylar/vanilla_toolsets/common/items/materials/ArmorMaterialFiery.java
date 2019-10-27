package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class ArmorMaterialFiery implements IArmorMaterial
{
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[]{3, 6, 6, 2};

    @Override
    public int getDurability(EquipmentSlotType equipmentSlot)
    {
        return BASE_DURABILITY[equipmentSlot.getIndex()] * 12;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType equipmentSlot)
    {
        return PROTECTION_AMOUNTS[equipmentSlot.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return 10;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(Items.FIRE_CHARGE);
    }

    @Override
    public String getName()
    {
        return "fiery";
    }

    @Override
    public float getToughness()
    {
        return 0;
    }
}
