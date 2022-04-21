package net.mcreator.remakingeverything.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.remakingeverything.entity.WeirdpigEntity;
import net.mcreator.remakingeverything.client.model.Modelweirdpig;

public class WeirdpigRenderer extends MobRenderer<WeirdpigEntity, Modelweirdpig<WeirdpigEntity>> {
	public WeirdpigRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweirdpig(context.bakeLayer(Modelweirdpig.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeirdpigEntity entity) {
		return new ResourceLocation("remaking_everything:textures/weirdpig.png");
	}
}
