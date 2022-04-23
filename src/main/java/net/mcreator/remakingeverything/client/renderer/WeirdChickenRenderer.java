package net.mcreator.remakingeverything.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.remakingeverything.entity.WeirdChickenEntity;
import net.mcreator.remakingeverything.client.model.ModelWeirdChicken;

public class WeirdChickenRenderer extends MobRenderer<WeirdChickenEntity, ModelWeirdChicken<WeirdChickenEntity>> {
	public WeirdChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWeirdChicken(context.bakeLayer(ModelWeirdChicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeirdChickenEntity entity) {
		return new ResourceLocation("remaking_everything:textures/chicken.png");
	}
}
