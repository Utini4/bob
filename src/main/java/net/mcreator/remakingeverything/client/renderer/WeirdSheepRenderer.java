package net.mcreator.remakingeverything.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.remakingeverything.entity.WeirdSheepEntity;
import net.mcreator.remakingeverything.client.model.ModelGhostsheep;

public class WeirdSheepRenderer extends MobRenderer<WeirdSheepEntity, ModelGhostsheep<WeirdSheepEntity>> {
	public WeirdSheepRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGhostsheep(context.bakeLayer(ModelGhostsheep.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeirdSheepEntity entity) {
		return new ResourceLocation("remaking_everything:textures/sheep.png");
	}
}
