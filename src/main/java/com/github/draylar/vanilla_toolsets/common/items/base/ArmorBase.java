package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

public class ArmorBase extends ArmorItem
{
    public ArmorBase(IArmorMaterial material, EquipmentSlotType slot)
    {
        super(material, slot, new Item.Properties().group(ItemGroup.COMBAT));
    }
}
