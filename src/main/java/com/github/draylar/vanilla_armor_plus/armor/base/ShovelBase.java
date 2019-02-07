package com.github.draylar.vanilla_armor_plus.armor.base;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem
{
    protected ShovelBase(ToolMaterial toolMaterial_1)
    {
        super(toolMaterial_1, 1, -3.0F, new Item.Settings().itemGroup(ItemGroup.TOOLS));
    }
}
