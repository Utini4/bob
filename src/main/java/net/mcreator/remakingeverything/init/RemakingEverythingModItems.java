
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remakingeverything.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.remakingeverything.item.WoodenStickItem;
import net.mcreator.remakingeverything.item.ToothpickItem;
import net.mcreator.remakingeverything.item.StoneToothpickItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RemakingEverythingModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item WEIRDPIG = register(
			new SpawnEggItem(RemakingEverythingModEntities.WEIRDPIG, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("weirdpig_spawn_egg"));
	public static final Item WOODEN_STICK = register(new WoodenStickItem());
	public static final Item TOOTHPICK = register(new ToothpickItem());
	public static final Item STONE_TOOTHPICK = register(new StoneToothpickItem());
	public static final Item WEIRD_COW = register(
			new SpawnEggItem(RemakingEverythingModEntities.WEIRD_COW, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("weird_cow_spawn_egg"));
	public static final Item WEIRD_CHICKEN = register(
			new SpawnEggItem(RemakingEverythingModEntities.WEIRD_CHICKEN, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("weird_chicken_spawn_egg"));
	public static final Item WEIRD_SHEEP = register(
			new SpawnEggItem(RemakingEverythingModEntities.WEIRD_SHEEP, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("weird_sheep_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
