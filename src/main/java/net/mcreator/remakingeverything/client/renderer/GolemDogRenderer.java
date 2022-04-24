package net.mcreator.remakingeverything.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.remakingeverything.entity.GolemDogEntity;
import net.mcreator.remakingeverything.client.model.ModelGolemDog;

public class GolemDogRenderer extends MobRenderer<GolemDogEntity, ModelGolemDog<GolemDogEntity>> {
	public GolemDogRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGolemDog(context.bakeLayer(ModelGolemDog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GolemDogEntity entity) {
		return new ResourceLocation("remaking_everything:textures/iron_golem.png");
	}
}
