package com.github.draylar.vanilla_toolsets.common.items.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterialEmerald implements ArmorMaterial
{
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[]{3, 6, 8, 3};

    @Override
    public int getDurability(EquipmentSlot equipmentSlot)
    {
        return BASE_DURABILITY[equipmentSlot.getEntitySlotId()] * 25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot equipmentSlot)
    {
        return PROTECTION_AMOUNTS[equipmentSlot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability()
    {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return SoundEvents.ENTITY_VILLAGER_AMBIENT;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Items.EMERALD);
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
