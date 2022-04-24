package net.mcreator.remakingeverything.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.remakingeverything.entity.PurpleMinionEntity;
import net.mcreator.remakingeverything.client.model.ModelMinion2;

public class PurpleMinionRenderer extends MobRenderer<PurpleMinionEntity, ModelMinion2<PurpleMinionEntity>> {
	public PurpleMinionRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMinion2(context.bakeLayer(ModelMinion2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PurpleMinionEntity entity) {
		return new ResourceLocation("remaking_everything:textures/minion2.png");
	}
}
