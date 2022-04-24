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
public class Modelalcoholic<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("remaking_everything", "modelalcoholic"),
			"main");
	public final ModelPart head;
	public final ModelPart sticks;

	public Modelalcoholic(ModelPart root) {
		this.head = root.getChild("head");
		this.sticks = root.getChild("sticks");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition sticks = partdefinition.addOrReplaceChild("sticks", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition stick6 = sticks.addOrReplaceChild("stick6",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-4.5F, -21.75F, -1.5F));
		PartDefinition stick4 = sticks.addOrReplaceChild("stick4",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-14.5F, -21.75F, -1.5F));
		PartDefinition stick14 = sticks.addOrReplaceChild("stick14",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-14.5F, -21.75F, 8.5F));
		PartDefinition stick8 = sticks.addOrReplaceChild("stick8",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-4.5F, -21.75F, 8.5F));
		PartDefinition stick5 = sticks.addOrReplaceChild("stick5",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-14.25F, -21.75F, -1.75F));
		PartDefinition stick1 = sticks.addOrReplaceChild("stick1",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-16.5F, -25.75F, -3.5F));
		PartDefinition stick13 = sticks.addOrReplaceChild("stick13",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-2.5F, -25.75F, -3.5F));
		PartDefinition stick2 = sticks.addOrReplaceChild("stick2",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-2.5F, -25.75F, 10.5F));
		PartDefinition stick3 = sticks.addOrReplaceChild("stick3",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-16.5F, -25.75F, 10.5F));
		PartDefinition stick7 = sticks.addOrReplaceChild("stick7",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-6.5F, -13.75F, 0.5F));
		PartDefinition stick10 = sticks.addOrReplaceChild("stick10",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-12.5F, -13.75F, 0.5F));
		PartDefinition stick9 = sticks.addOrReplaceChild("stick9",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-12.5F, -13.75F, 6.5F));
		PartDefinition stick12 = sticks.addOrReplaceChild("stick12",
				CubeListBuilder.create().texOffs(0, 16).addBox(8.0F, 3.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(13, 16)
						.addBox(8.0F, 4.0F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 24)
						.addBox(8.0F, 1.0F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(52, 15)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.75F)).texOffs(52, 24)
						.addBox(8.0F, -1.25F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-6.5F, -13.75F, 6.5F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		sticks.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.sticks.yRot = ageInTicks / 20.f;
	}
}
