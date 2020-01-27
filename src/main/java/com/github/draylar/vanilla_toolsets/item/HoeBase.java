package com.github.draylar.vanilla_toolsets.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {
    public HoeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
