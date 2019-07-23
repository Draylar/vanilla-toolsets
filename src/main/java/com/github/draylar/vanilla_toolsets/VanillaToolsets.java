package com.github.draylar.vanilla_toolsets;

import com.github.draylar.vanilla_toolsets.common.Items;
import com.github.draylar.vanilla_toolsets.common.items.materials.*;
import net.fabricmc.api.ModInitializer;

public class VanillaToolsets implements ModInitializer
{
	public static final String MOD_ID = "vanilla-toolsets";

	public static final ArmorMaterialEmerald ARMOR_EMERALD = new ArmorMaterialEmerald();
	public static final ToolMaterialEmerald TOOL_EMERALD = new ToolMaterialEmerald();

	public static final ArmorMaterialObsidian ARMOR_OBSIDIAN = new ArmorMaterialObsidian();
	public static final ToolMaterialObsidian TOOL_OBSIDIAN = new ToolMaterialObsidian();

	public static final ArmorMaterialLapis ARMOR_LAPIS = new ArmorMaterialLapis();
	public static final ToolMaterialLapis TOOL_LAPIS = new ToolMaterialLapis();

	public static final ArmorMaterialQuartz ARMOR_QUARTZ = new ArmorMaterialQuartz();
	public static final ToolMaterialQuartz TOOL_QUARTZ = new ToolMaterialQuartz();

	public static final ArmorMaterialFiery ARMOR_FIERY = new ArmorMaterialFiery();
	public static final ToolMaterialFiery TOOL_FIERY = new ToolMaterialFiery();

	@Override
	public void onInitialize()
	{
		Items.registerItems();
	}
}
