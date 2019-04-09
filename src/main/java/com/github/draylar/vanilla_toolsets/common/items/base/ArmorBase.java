package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ArmorBase extends ArmorItem
{
    public ArmorBase(ArmorMaterial armorMaterial_1, EquipmentSlot equipmentSlot_1)
    {
        super(armorMaterial_1, equipmentSlot_1, new Item.Settings().itemGroup(ItemGroup.COMBAT));
    }
}
