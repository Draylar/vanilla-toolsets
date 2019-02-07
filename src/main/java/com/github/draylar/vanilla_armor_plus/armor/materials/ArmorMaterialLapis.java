package com.github.draylar.vanilla_armor_plus.armor.materials;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterialLapis implements ArmorMaterial
{
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[]{1, 3, 4, 2};

    @Override
    public int getDurability(EquipmentSlot equipmentSlot)
    {
        return BASE_DURABILITY[equipmentSlot.getEntitySlotId()] * 10;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot equipmentSlot)
    {
        return PROTECTION_AMOUNTS[equipmentSlot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability()
    {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Blocks.LAPIS_BLOCK);
    }

    @Override
    public String getName()
    {
        return "lapis";
    }

    @Override
    public float getToughness()
    {
        return 0;
    }
}
