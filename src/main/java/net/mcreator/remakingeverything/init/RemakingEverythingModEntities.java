
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
import net.mcreator.remakingeverything.entity.PurpleMinionEntity;
import net.mcreator.remakingeverything.entity.PowpowpowpowpowEntity;
import net.mcreator.remakingeverything.entity.MinionEntity;
import net.mcreator.remakingeverything.entity.MafiaVillagerEntity;
import net.mcreator.remakingeverything.entity.GolemDogEntity;
import net.mcreator.remakingeverything.entity.GhastwithsaddleEntity;
import net.mcreator.remakingeverything.entity.AlcoholicEntity;
import net.mcreator.remakingeverything.entity.AlcoholEntity;

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
	public static final EntityType<MafiaVillagerEntity> MAFIA_VILLAGER = register("mafia_villager",
			EntityType.Builder.<MafiaVillagerEntity>of(MafiaVillagerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MafiaVillagerEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<PowpowpowpowpowEntity> POWPOWPOWPOWPOW = register("entitybulletpowpowpowpowpow",
			EntityType.Builder.<PowpowpowpowpowEntity>of(PowpowpowpowpowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(PowpowpowpowpowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<GolemDogEntity> GOLEM_DOG = register("golem_dog",
			EntityType.Builder.<GolemDogEntity>of(GolemDogEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GolemDogEntity::new).sized(1f, 1f));
	public static final EntityType<GhastwithsaddleEntity> GHASTWITHSADDLE = register("ghastwithsaddle",
			EntityType.Builder.<GhastwithsaddleEntity>of(GhastwithsaddleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhastwithsaddleEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<MinionEntity> MINION = register("minion",
			EntityType.Builder.<MinionEntity>of(MinionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MinionEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<PurpleMinionEntity> PURPLE_MINION = register("purple_minion",
			EntityType.Builder.<PurpleMinionEntity>of(PurpleMinionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PurpleMinionEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<AlcoholicEntity> ALCOHOLIC = register("alcoholic",
			EntityType.Builder.<AlcoholicEntity>of(AlcoholicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlcoholicEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<AlcoholEntity> ALCOHOL = register("entitybulletalcohol",
			EntityType.Builder.<AlcoholEntity>of(AlcoholEntity::new, MobCategory.MISC).setCustomClientFactory(AlcoholEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

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
			MafiaVillagerEntity.init();
			GolemDogEntity.init();
			GhastwithsaddleEntity.init();
			MinionEntity.init();
			PurpleMinionEntity.init();
			AlcoholicEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WEIRDPIG, WeirdpigEntity.createAttributes().build());
		event.put(WEIRD_COW, WeirdCowEntity.createAttributes().build());
		event.put(WEIRD_CHICKEN, WeirdChickenEntity.createAttributes().build());
		event.put(WEIRD_SHEEP, WeirdSheepEntity.createAttributes().build());
		event.put(MAFIA_VILLAGER, MafiaVillagerEntity.createAttributes().build());
		event.put(GOLEM_DOG, GolemDogEntity.createAttributes().build());
		event.put(GHASTWITHSADDLE, GhastwithsaddleEntity.createAttributes().build());
		event.put(MINION, MinionEntity.createAttributes().build());
		event.put(PURPLE_MINION, PurpleMinionEntity.createAttributes().build());
		event.put(ALCOHOLIC, AlcoholicEntity.createAttributes().build());
	}
}
