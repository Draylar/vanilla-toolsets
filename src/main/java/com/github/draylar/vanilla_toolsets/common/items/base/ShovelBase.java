package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.item.*;

public class ShovelBase extends ShovelItem
{
    public ShovelBase(IItemTier toolMaterial_1)
    {
        super(toolMaterial_1, -0.5f, -3.0F, new Item.Properties().group(ItemGroup.TOOLS));
    }
}
