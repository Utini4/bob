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
public class Modelweirdpig<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("remaking_everything", "modelweirdpig"),
			"main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;

	public Modelweirdpig(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(28, 8).addBox(-5.0F, -10.0F, -10.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 2.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.0F, -7.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(0.0F, 13.0F, -5.0F));
		PartDefinition bone = head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(16, 16).addBox(-2.0F, -12.0F, -15.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.6F, 12.5F, -21.0F, -3.1416F, 0.0436F, 3.1416F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-8.0F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(3.0F, 18.0F, 7.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(0, 16).addBox(4.0F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(-3.0F, 18.0F, 7.0F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(0, 16).addBox(-8.0F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(3.0F, 18.0F, -5.0F));
		PartDefinition leg4 = leg3.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(0, 16).addBox(4.0F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(-6.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		body.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leg1.render(poseStack, buffer, packedLight, packedOverlay);
		leg2.render(poseStack, buffer, packedLight, packedOverlay);
		leg3.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
