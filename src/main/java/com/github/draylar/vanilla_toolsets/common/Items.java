package com.github.draylar.vanilla_toolsets.common;

import com.github.draylar.vanilla_toolsets.VanillaToolsets;
import com.github.draylar.vanilla_toolsets.common.items.base.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.registry.Registry;

public class Items
{
    public static void registerItems()
    {
        // emerald set
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_pickaxe", new PickaxeBase(VanillaToolsets.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_axe", new AxeBase(VanillaToolsets.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_shovel", new ShovelBase(VanillaToolsets.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_hoe", new HoeBase(VanillaToolsets.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_sword", new SwordBase(VanillaToolsets.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_helmet", new ArmorBase(VanillaToolsets.ARMOR_EMERALD, EquipmentSlotType.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_chestplate", new ArmorBase(VanillaToolsets.ARMOR_EMERALD, EquipmentSlotType.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_leggings", new ArmorBase(VanillaToolsets.ARMOR_EMERALD, EquipmentSlotType.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_boots", new ArmorBase(VanillaToolsets.ARMOR_EMERALD, EquipmentSlotType.FEET));

        // obsidian set
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_pickaxe", new PickaxeBase(VanillaToolsets.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_axe", new AxeBase(VanillaToolsets.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_shovel", new ShovelBase(VanillaToolsets.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_hoe", new HoeBase(VanillaToolsets.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_sword", new SwordBase(VanillaToolsets.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_helmet", new ArmorBase(VanillaToolsets.ARMOR_OBSIDIAN, EquipmentSlotType.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_chestplate", new ArmorBase(VanillaToolsets.ARMOR_OBSIDIAN, EquipmentSlotType.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_leggings", new ArmorBase(VanillaToolsets.ARMOR_OBSIDIAN, EquipmentSlotType.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_boots", new ArmorBase(VanillaToolsets.ARMOR_OBSIDIAN, EquipmentSlotType.FEET));

        // lapis set
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_pickaxe", new PickaxeBase(VanillaToolsets.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_axe", new AxeBase(VanillaToolsets.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_shovel", new ShovelBase(VanillaToolsets.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_hoe", new HoeBase(VanillaToolsets.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_sword", new SwordBase(VanillaToolsets.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_helmet", new ArmorBase(VanillaToolsets.ARMOR_LAPIS, EquipmentSlotType.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_chestplate", new ArmorBase(VanillaToolsets.ARMOR_LAPIS, EquipmentSlotType.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_leggings", new ArmorBase(VanillaToolsets.ARMOR_LAPIS, EquipmentSlotType.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_boots", new ArmorBase(VanillaToolsets.ARMOR_LAPIS, EquipmentSlotType.FEET));

        // quartz set
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_pickaxe", new PickaxeBase(VanillaToolsets.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_axe", new AxeBase(VanillaToolsets.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_shovel", new ShovelBase(VanillaToolsets.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_hoe", new HoeBase(VanillaToolsets.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_sword", new SwordBase(VanillaToolsets.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_helmet", new ArmorBase(VanillaToolsets.ARMOR_QUARTZ, EquipmentSlotType.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_chestplate", new ArmorBase(VanillaToolsets.ARMOR_QUARTZ, EquipmentSlotType.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_leggings", new ArmorBase(VanillaToolsets.ARMOR_QUARTZ, EquipmentSlotType.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_boots", new ArmorBase(VanillaToolsets.ARMOR_QUARTZ, EquipmentSlotType.FEET));

        // fiery set
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_pickaxe", new PickaxeBase(VanillaToolsets.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_axe", new AxeBase(VanillaToolsets.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_shovel", new ShovelBase(VanillaToolsets.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_hoe", new HoeBase(VanillaToolsets.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_sword", new SwordBase(VanillaToolsets.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_helmet", new ArmorBase(VanillaToolsets.ARMOR_FIERY, EquipmentSlotType.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_chestplate", new ArmorBase(VanillaToolsets.ARMOR_FIERY, EquipmentSlotType.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_leggings", new ArmorBase(VanillaToolsets.ARMOR_FIERY, EquipmentSlotType.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_boots", new ArmorBase(VanillaToolsets.ARMOR_FIERY, EquipmentSlotType.FEET));
    }
}
