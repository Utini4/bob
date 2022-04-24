package net.mcreator.remakingeverything.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelalcohol<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("remaking_everything", "modelalcohol"),
			"main");
	public final ModelPart stick12;

	public Modelalcohol(ModelPart root) {
		this.stick12 = root.getChild("stick12");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition stick12 = partdefinition.addOrReplaceChild("stick12",
				CubeListBuilder.create().texOffs(0, 16).addBox(5.0F, 9.0F, -8.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(5.0F, 10.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(5.0F, 7.0F, -8.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(5.0F, 4.75F, -8.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(5.0F, 4.75F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-6.5F, 10.25F, 6.5F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		stick12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
