package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem
{
    public ShovelBase(ToolMaterial toolMaterial_1)
    {
        super(toolMaterial_1, -0.5f, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
