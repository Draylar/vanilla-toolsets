package com.github.draylar.vanilla_toolsets.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {
    public SwordBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 1, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
