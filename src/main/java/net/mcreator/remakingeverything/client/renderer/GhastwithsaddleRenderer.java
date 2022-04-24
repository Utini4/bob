package net.mcreator.remakingeverything.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.remakingeverything.entity.GhastwithsaddleEntity;
import net.mcreator.remakingeverything.client.model.Modelghastsaddle;

public class GhastwithsaddleRenderer extends MobRenderer<GhastwithsaddleEntity, Modelghastsaddle<GhastwithsaddleEntity>> {
	public GhastwithsaddleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelghastsaddle(context.bakeLayer(Modelghastsaddle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GhastwithsaddleEntity entity) {
		return new ResourceLocation("remaking_everything:textures/ghast.png");
	}
}
