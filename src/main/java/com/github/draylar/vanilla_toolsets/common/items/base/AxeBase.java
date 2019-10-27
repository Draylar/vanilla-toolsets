package com.github.draylar.vanilla_toolsets.common.items.base;

import net.minecraft.item.*;

public class AxeBase extends AxeItem
{
    public AxeBase(IItemTier material)
    {
        super(material, 3, -3.0f, new Item.Properties().group(ItemGroup.TOOLS));
    }
}
