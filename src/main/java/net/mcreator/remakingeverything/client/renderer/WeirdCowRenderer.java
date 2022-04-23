package net.mcreator.remakingeverything.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.remakingeverything.entity.WeirdCowEntity;
import net.mcreator.remakingeverything.client.model.Modelweirdcow;

public class WeirdCowRenderer extends MobRenderer<WeirdCowEntity, Modelweirdcow<WeirdCowEntity>> {
	public WeirdCowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweirdcow(context.bakeLayer(Modelweirdcow.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeirdCowEntity entity) {
		return new ResourceLocation("remaking_everything:textures/cow.png");
	}
}
