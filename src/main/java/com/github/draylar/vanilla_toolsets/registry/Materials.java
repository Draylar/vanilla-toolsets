package com.github.draylar.vanilla_toolsets.registry;

import com.github.draylar.vanilla_toolsets.material.*;

public class Materials {

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

    public static void init() {
        // NO-OP
    }

    private Materials() {
        // NO-OP
    }
}
