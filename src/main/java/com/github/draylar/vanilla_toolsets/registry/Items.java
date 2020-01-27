package com.github.draylar.vanilla_toolsets.registry;

import com.github.draylar.vanilla_toolsets.VanillaToolsets;
import com.github.draylar.vanilla_toolsets.item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;

public class Items {

    public static void init() {
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_pickaxe", new PickaxeBase(Materials.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_axe", new AxeBase(Materials.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_shovel", new ShovelBase(Materials.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_hoe", new HoeBase(Materials.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_sword", new SwordBase(Materials.TOOL_EMERALD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_helmet", new ArmorBase(Materials.ARMOR_EMERALD, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_chestplate", new ArmorBase(Materials.ARMOR_EMERALD, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_leggings", new ArmorBase(Materials.ARMOR_EMERALD, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":emerald_boots", new ArmorBase(Materials.ARMOR_EMERALD, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_pickaxe", new PickaxeBase(Materials.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_axe", new AxeBase(Materials.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_shovel", new ShovelBase(Materials.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_hoe", new HoeBase(Materials.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_sword", new SwordBase(Materials.TOOL_OBSIDIAN));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_helmet", new ArmorBase(Materials.ARMOR_OBSIDIAN, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_chestplate", new ArmorBase(Materials.ARMOR_OBSIDIAN, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_leggings", new ArmorBase(Materials.ARMOR_OBSIDIAN, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":obsidian_boots", new ArmorBase(Materials.ARMOR_OBSIDIAN, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_pickaxe", new PickaxeBase(Materials.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_axe", new AxeBase(Materials.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_shovel", new ShovelBase(Materials.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_hoe", new HoeBase(Materials.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_sword", new SwordBase(Materials.TOOL_LAPIS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_helmet", new ArmorBase(Materials.ARMOR_LAPIS, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_chestplate", new ArmorBase(Materials.ARMOR_LAPIS, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_leggings", new ArmorBase(Materials.ARMOR_LAPIS, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":lapis_boots", new ArmorBase(Materials.ARMOR_LAPIS, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_pickaxe", new PickaxeBase(Materials.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_axe", new AxeBase(Materials.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_shovel", new ShovelBase(Materials.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_hoe", new HoeBase(Materials.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_sword", new SwordBase(Materials.TOOL_QUARTZ));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_helmet", new ArmorBase(Materials.ARMOR_QUARTZ, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_chestplate", new ArmorBase(Materials.ARMOR_QUARTZ, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_leggings", new ArmorBase(Materials.ARMOR_QUARTZ, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":quartz_boots", new ArmorBase(Materials.ARMOR_QUARTZ, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_pickaxe", new PickaxeBase(Materials.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_axe", new AxeBase(Materials.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_shovel", new ShovelBase(Materials.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_hoe", new HoeBase(Materials.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_sword", new SwordBase(Materials.TOOL_FIERY));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_helmet", new ArmorBase(Materials.ARMOR_FIERY, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_chestplate", new ArmorBase(Materials.ARMOR_FIERY, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_leggings", new ArmorBase(Materials.ARMOR_FIERY, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, VanillaToolsets.MOD_ID + ":fiery_boots", new ArmorBase(Materials.ARMOR_FIERY, EquipmentSlot.FEET));
    }

    private Items() {
        // NO-OP
    }
}
