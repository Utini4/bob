
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remakingeverything.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.remakingeverything.client.renderer.WeirdpigRenderer;
import net.mcreator.remakingeverything.client.renderer.WeirdSheepRenderer;
import net.mcreator.remakingeverything.client.renderer.WeirdCowRenderer;
import net.mcreator.remakingeverything.client.renderer.WeirdChickenRenderer;
import net.mcreator.remakingeverything.client.renderer.PurpleMinionRenderer;
import net.mcreator.remakingeverything.client.renderer.MinionRenderer;
import net.mcreator.remakingeverything.client.renderer.MafiaVillagerRenderer;
import net.mcreator.remakingeverything.client.renderer.GolemDogRenderer;
import net.mcreator.remakingeverything.client.renderer.GhastwithsaddleRenderer;
import net.mcreator.remakingeverything.client.renderer.AlcoholicRenderer;
import net.mcreator.remakingeverything.client.renderer.AlcoholRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RemakingEverythingModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RemakingEverythingModEntities.WEIRDPIG, WeirdpigRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.WEIRD_COW, WeirdCowRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.WEIRD_CHICKEN, WeirdChickenRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.WEIRD_SHEEP, WeirdSheepRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.MAFIA_VILLAGER, MafiaVillagerRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.POWPOWPOWPOWPOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.GOLEM_DOG, GolemDogRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.GHASTWITHSADDLE, GhastwithsaddleRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.MINION, MinionRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.PURPLE_MINION, PurpleMinionRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.ALCOHOLIC, AlcoholicRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.ALCOHOL, AlcoholRenderer::new);
	}
}
