package com.github.draylar.vanilla_armor_plus;

import com.github.draylar.vanilla_armor_plus.armor.materials.ArmorMaterialEmerald;
import com.github.draylar.vanilla_armor_plus.armor.materials.ArmorMaterialObsidian;
import com.github.draylar.vanilla_armor_plus.armor.materials.ToolMaterialEmerald;
import com.github.draylar.vanilla_armor_plus.armor.materials.ToolMaterialObsidian;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class ArmorPlus implements ModInitializer
{
	public static final String MOD_ID = "vanilla-armor-plus";

	public static final ArmorMaterialEmerald armorMaterialEmerald = new ArmorMaterialEmerald();
	public static final ToolMaterialEmerald toolMaterialEmerald = new ToolMaterialEmerald();

	public static final ArmorMaterialObsidian armorMaterialObsidian = new ArmorMaterialObsidian();
	public static final ToolMaterialObsidian toolMaterialObsidian = new ToolMaterialObsidian();

	@Override
	public void onInitialize()
	{
		Items.registerItems();
	}
}
