package net.mcreator.remakingeverything.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WeirdCowSpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();
		execute(event, entity);
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Cow) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("custom").bypassArmor(), 100);
		}
	}
}
