package com.github.draylar.vanilla_toolsets;

import com.github.draylar.vanilla_toolsets.common.Items;
import com.github.draylar.vanilla_toolsets.common.items.materials.*;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VanillaToolsets.MOD_ID)
public class VanillaToolsets
{
	public static final String MOD_ID = "vanilla-toolsets";

	public static final IArmorMaterial ARMOR_EMERALD = new ArmorMaterialEmerald();
	public static final IItemTier TOOL_EMERALD = new ToolMaterialEmerald();

	public static final IArmorMaterial ARMOR_OBSIDIAN = new ArmorMaterialObsidian();
	public static final IItemTier TOOL_OBSIDIAN = new ToolMaterialObsidian();

	public static final IArmorMaterial ARMOR_LAPIS = new ArmorMaterialLapis();
	public static final IItemTier TOOL_LAPIS = new ToolMaterialLapis();

	public static final IArmorMaterial ARMOR_QUARTZ = new ArmorMaterialQuartz();
	public static final IItemTier TOOL_QUARTZ = new ToolMaterialQuartz();

	public static final IArmorMaterial ARMOR_FIERY = new ArmorMaterialFiery();
	public static final IItemTier TOOL_FIERY = new ToolMaterialFiery();

	public static VanillaToolsets instance;

	private static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public VanillaToolsets() {
		instance = this;

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.info("Setup method registered.");
	}

	private void clientRegistries(final FMLClientSetupEvent event) {
		LOGGER.info("clientRegistries method registered.");
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			Items.registerItems();
			LOGGER.info("Items registered.");
		}

	}
}
