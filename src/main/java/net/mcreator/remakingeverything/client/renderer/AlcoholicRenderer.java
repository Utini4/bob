package net.mcreator.remakingeverything.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.remakingeverything.entity.AlcoholicEntity;
import net.mcreator.remakingeverything.client.model.Modelalcoholic;

public class AlcoholicRenderer extends MobRenderer<AlcoholicEntity, Modelalcoholic<AlcoholicEntity>> {
	public AlcoholicRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelalcoholic(context.bakeLayer(Modelalcoholic.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlcoholicEntity entity) {
		return new ResourceLocation("remaking_everything:textures/alcoholic.png");
	}
}
