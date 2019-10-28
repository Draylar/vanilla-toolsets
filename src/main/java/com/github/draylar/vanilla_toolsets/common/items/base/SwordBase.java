package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.item.*;

public class SwordBase extends SwordItem
{
    public SwordBase(IItemTier toolMaterial_1)
    {
        super(toolMaterial_1, 1, -2.4f, new Item.Properties().group(ItemGroup.COMBAT));
    }
}
