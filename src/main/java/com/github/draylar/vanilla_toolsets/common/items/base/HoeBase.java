package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem
{
    protected HoeBase(ToolMaterial toolMaterial_1)
    {
        super(toolMaterial_1, -3.0F, new Item.Settings().itemGroup(ItemGroup.TOOLS));
    }
}
