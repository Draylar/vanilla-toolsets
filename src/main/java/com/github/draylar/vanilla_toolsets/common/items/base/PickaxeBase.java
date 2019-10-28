package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.item.*;

public class PickaxeBase extends PickaxeItem
{
    public PickaxeBase(IItemTier toolMaterial_1)
    {
        super(toolMaterial_1, -1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS));
    }
}
