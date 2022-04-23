
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remakingeverything.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.remakingeverything.client.model.Modelweirdpig;
import net.mcreator.remakingeverything.client.model.Modelweirdcow;
import net.mcreator.remakingeverything.client.model.ModelWeirdChicken;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RemakingEverythingModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelWeirdChicken.LAYER_LOCATION, ModelWeirdChicken::createBodyLayer);
		event.registerLayerDefinition(Modelweirdpig.LAYER_LOCATION, Modelweirdpig::createBodyLayer);
		event.registerLayerDefinition(Modelweirdcow.LAYER_LOCATION, Modelweirdcow::createBodyLayer);
	}
}
