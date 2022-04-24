
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
import net.mcreator.remakingeverything.client.model.Modelghastsaddle;
import net.mcreator.remakingeverything.client.model.Modelalcoholic;
import net.mcreator.remakingeverything.client.model.Modelalcohol;
import net.mcreator.remakingeverything.client.model.ModelWeirdChicken;
import net.mcreator.remakingeverything.client.model.ModelMinion2;
import net.mcreator.remakingeverything.client.model.ModelMinion;
import net.mcreator.remakingeverything.client.model.ModelMafiaVillager;
import net.mcreator.remakingeverything.client.model.ModelGolemDog;
import net.mcreator.remakingeverything.client.model.ModelGhostsheep;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RemakingEverythingModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelMafiaVillager.LAYER_LOCATION, ModelMafiaVillager::createBodyLayer);
		event.registerLayerDefinition(ModelGhostsheep.LAYER_LOCATION, ModelGhostsheep::createBodyLayer);
		event.registerLayerDefinition(ModelMinion2.LAYER_LOCATION, ModelMinion2::createBodyLayer);
		event.registerLayerDefinition(ModelWeirdChicken.LAYER_LOCATION, ModelWeirdChicken::createBodyLayer);
		event.registerLayerDefinition(ModelGolemDog.LAYER_LOCATION, ModelGolemDog::createBodyLayer);
		event.registerLayerDefinition(Modelalcoholic.LAYER_LOCATION, Modelalcoholic::createBodyLayer);
		event.registerLayerDefinition(Modelweirdpig.LAYER_LOCATION, Modelweirdpig::createBodyLayer);
		event.registerLayerDefinition(Modelghastsaddle.LAYER_LOCATION, Modelghastsaddle::createBodyLayer);
		event.registerLayerDefinition(Modelalcohol.LAYER_LOCATION, Modelalcohol::createBodyLayer);
		event.registerLayerDefinition(Modelweirdcow.LAYER_LOCATION, Modelweirdcow::createBodyLayer);
		event.registerLayerDefinition(ModelMinion.LAYER_LOCATION, ModelMinion::createBodyLayer);
	}
}
