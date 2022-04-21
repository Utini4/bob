
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remakingeverything.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.remakingeverything.client.model.Modelweirdpig;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RemakingEverythingModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelweirdpig.LAYER_LOCATION, Modelweirdpig::createBodyLayer);
	}
}
