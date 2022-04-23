
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remakingeverything.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.remakingeverything.entity.WeirdpigEntity;
import net.mcreator.remakingeverything.entity.WeirdSheepEntity;
import net.mcreator.remakingeverything.entity.WeirdCowEntity;
import net.mcreator.remakingeverything.entity.WeirdChickenEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RemakingEverythingModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<WeirdpigEntity> WEIRDPIG = register("weirdpig",
			EntityType.Builder.<WeirdpigEntity>of(WeirdpigEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WeirdpigEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<WeirdCowEntity> WEIRD_COW = register("weird_cow",
			EntityType.Builder.<WeirdCowEntity>of(WeirdCowEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WeirdCowEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<WeirdChickenEntity> WEIRD_CHICKEN = register("weird_chicken",
			EntityType.Builder.<WeirdChickenEntity>of(WeirdChickenEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeirdChickenEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<WeirdSheepEntity> WEIRD_SHEEP = register("weird_sheep",
			EntityType.Builder.<WeirdSheepEntity>of(WeirdSheepEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeirdSheepEntity::new).sized(0.1f, 0.1f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WeirdpigEntity.init();
			WeirdCowEntity.init();
			WeirdChickenEntity.init();
			WeirdSheepEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WEIRDPIG, WeirdpigEntity.createAttributes().build());
		event.put(WEIRD_COW, WeirdCowEntity.createAttributes().build());
		event.put(WEIRD_CHICKEN, WeirdChickenEntity.createAttributes().build());
		event.put(WEIRD_SHEEP, WeirdSheepEntity.createAttributes().build());
	}
}
