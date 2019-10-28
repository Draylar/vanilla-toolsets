package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.item.*;

public class HoeBase extends HoeItem
{
    public HoeBase(IItemTier toolMaterial_1)
    {
        super(toolMaterial_1, -3.0F, new Item.Properties().group(ItemGroup.TOOLS));
    }
}
