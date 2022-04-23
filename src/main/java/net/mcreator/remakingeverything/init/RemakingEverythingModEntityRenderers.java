
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remakingeverything.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.remakingeverything.client.renderer.WeirdpigRenderer;
import net.mcreator.remakingeverything.client.renderer.WeirdSheepRenderer;
import net.mcreator.remakingeverything.client.renderer.WeirdCowRenderer;
import net.mcreator.remakingeverything.client.renderer.WeirdChickenRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RemakingEverythingModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RemakingEverythingModEntities.WEIRDPIG, WeirdpigRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.WEIRD_COW, WeirdCowRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.WEIRD_CHICKEN, WeirdChickenRenderer::new);
		event.registerEntityRenderer(RemakingEverythingModEntities.WEIRD_SHEEP, WeirdSheepRenderer::new);
	}
}
