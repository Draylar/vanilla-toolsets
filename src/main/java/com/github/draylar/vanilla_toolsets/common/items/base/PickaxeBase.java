package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem
{
    public PickaxeBase(ToolMaterial toolMaterial_1)
    {
        super(toolMaterial_1, -1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
