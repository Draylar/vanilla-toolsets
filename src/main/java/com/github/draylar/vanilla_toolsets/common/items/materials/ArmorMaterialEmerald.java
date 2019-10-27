package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class ArmorMaterialEmerald implements IArmorMaterial
{
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[]{2, 5, 6, 3};

    @Override
    public int getDurability(EquipmentSlotType equipmentSlot)
    {
        return BASE_DURABILITY[equipmentSlot.getIndex()] * 25;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType equipmentSlot)
    {
        return PROTECTION_AMOUNTS[equipmentSlot.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return 25;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return SoundEvents.ENTITY_VILLAGER_AMBIENT;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(Items.EMERALD);
    }

    @Override
    public String getName()
    {
        return "emerald";
    }

    @Override
    public float getToughness()
    {
        return 2;
    }
}
