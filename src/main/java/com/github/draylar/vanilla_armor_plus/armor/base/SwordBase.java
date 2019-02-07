package com.github.draylar.vanilla_armor_plus.armor.base;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem
{
    protected SwordBase(ToolMaterial toolMaterial_1)
    {
        super(toolMaterial_1, 1, 1, new Item.Settings().itemGroup(ItemGroup.TOOLS));
    }
}
