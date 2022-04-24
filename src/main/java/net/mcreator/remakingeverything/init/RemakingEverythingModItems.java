
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
import net.mcreator.remakingeverything.item.PowpowpowpowpowItem;
import net.mcreator.remakingeverything.item.IronRodItem;
import net.mcreator.remakingeverything.item.GhastSnacksItem;
import net.mcreator.remakingeverything.item.BananaItem;
import net.mcreator.remakingeverything.item.ArsonCommitting101Item;
import net.mcreator.remakingeverything.item.AlcoholItem;

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
	public static final Item MAFIA_VILLAGER = register(
			new SpawnEggItem(RemakingEverythingModEntities.MAFIA_VILLAGER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("mafia_villager_spawn_egg"));
	public static final Item POWPOWPOWPOWPOW = register(new PowpowpowpowpowItem());
	public static final Item GOLEM_DOG = register(
			new SpawnEggItem(RemakingEverythingModEntities.GOLEM_DOG, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("golem_dog_spawn_egg"));
	public static final Item IRON_ROD = register(new IronRodItem());
	public static final Item ARSON_COMMITTING_101 = register(new ArsonCommitting101Item());
	public static final Item GHASTWITHSADDLE = register(
			new SpawnEggItem(RemakingEverythingModEntities.GHASTWITHSADDLE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("ghastwithsaddle_spawn_egg"));
	public static final Item GHAST_SNACKS = register(new GhastSnacksItem());
	public static final Item MINION = register(
			new SpawnEggItem(RemakingEverythingModEntities.MINION, -1780720, -14788189, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("minion_spawn_egg"));
	public static final Item BANANA = register(new BananaItem());
	public static final Item PURPLE_MINION = register(
			new SpawnEggItem(RemakingEverythingModEntities.PURPLE_MINION, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("purple_minion_spawn_egg"));
	public static final Item ALCOHOLIC = register(
			new SpawnEggItem(RemakingEverythingModEntities.ALCOHOLIC, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("alcoholic_spawn_egg"));
	public static final Item ALCOHOL = register(new AlcoholItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
