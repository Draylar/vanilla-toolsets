package com.github.draylar.vanilla_toolsets;

import com.github.draylar.vanilla_toolsets.armor.materials.*;
import net.fabricmc.api.ModInitializer;

public class VanillaToolsets implements ModInitializer
{
	public static final String MOD_ID = "vanilla-toolsets";

	public static final ArmorMaterialEmerald armorMaterialEmerald = new ArmorMaterialEmerald();
	public static final ToolMaterialEmerald toolMaterialEmerald = new ToolMaterialEmerald();

	public static final ArmorMaterialObsidian armorMaterialObsidian = new ArmorMaterialObsidian();
	public static final ToolMaterialObsidian toolMaterialObsidian = new ToolMaterialObsidian();

	public static final ArmorMaterialLapis armorMaterialLapis = new ArmorMaterialLapis();
	public static final ToolMaterialLapis toolMaterialLapis = new ToolMaterialLapis();

	@Override
	public void onInitialize()
	{
		Items.registerItems();
	}
}
