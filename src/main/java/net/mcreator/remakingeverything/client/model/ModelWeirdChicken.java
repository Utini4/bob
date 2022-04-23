package net.mcreator.remakingeverything.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelWeirdChicken<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("remaking_everything", "model_weird_chicken"),
			"main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_wing;
	public final ModelPart right_wing;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelWeirdChicken(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_wing = root.getChild("left_wing");
		this.right_wing = root.getChild("right_wing");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(0.0F, 15.0F, -4.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 9).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing",
				CubeListBuilder.create().texOffs(24, 13).addBox(6.0F, 3.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(-4.0F, 13.0F, 0.0F));
		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing",
				CubeListBuilder.create().texOffs(24, 13).addBox(-7.0F, 3.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(4.0F, 13.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(26, 0).addBox(1.0F, 1.0F, -3.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(-1.0F, 19.0F, 1.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(26, 0).addBox(-5.0F, 1.0F, -3.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(2.0F, 19.0F, 1.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		left_wing.render(poseStack, buffer, packedLight, packedOverlay);
		right_wing.render(poseStack, buffer, packedLight, packedOverlay);
		left_leg.render(poseStack, buffer, packedLight, packedOverlay);
		right_leg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
