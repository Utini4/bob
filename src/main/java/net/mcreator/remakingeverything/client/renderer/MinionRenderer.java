package net.mcreator.remakingeverything.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.remakingeverything.entity.MinionEntity;
import net.mcreator.remakingeverything.client.model.ModelMinion;

public class MinionRenderer extends MobRenderer<MinionEntity, ModelMinion<MinionEntity>> {
	public MinionRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMinion(context.bakeLayer(ModelMinion.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinionEntity entity) {
		return new ResourceLocation("remaking_everything:textures/minion.png");
	}
}
