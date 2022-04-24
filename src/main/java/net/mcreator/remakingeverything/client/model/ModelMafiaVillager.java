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
public class ModelMafiaVillager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("remaking_everything", "model_mafia_villager"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart arms;
	public final ModelPart right_leg;
	public final ModelPart left_leg;

	public ModelMafiaVillager(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.arms = root.getChild("arms");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 2).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-4.5F, -7.75F, -4.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.5F)).texOffs(36, 56)
						.addBox(-3.5F, -9.65F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.5F)).texOffs(36, 56)
						.addBox(-5.05F, -4.65F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F)).texOffs(36, 56)
						.addBox(3.95F, -4.65F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F)).texOffs(8, 62)
						.addBox(-5.05F, -4.65F, -5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(8, 62)
						.addBox(-3.55F, -3.65F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(8, 62)
						.addBox(-3.05F, -3.4F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(8, 62)
						.addBox(-4.05F, -4.15F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(8, 62)
						.addBox(-0.05F, -4.15F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(8, 62)
						.addBox(0.45F, -3.65F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(8, 62)
						.addBox(0.95F, -3.4F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(0, 38)
						.addBox(-2.5F, -9.95F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.2F, -1.5F, -5.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition nose = head.addOrReplaceChild("nose",
				CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, 0.3F));
		PartDefinition arms_rotation = arms.addOrReplaceChild("arms_rotation",
				CubeListBuilder.create().texOffs(44, 22).addBox(-8.0F, 0.0F, -2.05F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 38)
						.addBox(-4.0F, 4.0F, -2.05F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.05F, -0.7505F, 0.0F, 0.0F));
		PartDefinition arms_flipped = arms_rotation.addOrReplaceChild("arms_flipped", CubeListBuilder.create().texOffs(44, 22).mirror()
				.addBox(4.0F, -24.0F, -2.05F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition gun7 = arms.addOrReplaceChild(
				"gun7", CubeListBuilder.create().texOffs(9, 49).addBox(-3.052F, -21.7867F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.2F))
						.texOffs(29, 52).addBox(-3.552F, -21.4867F, -6.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offset(2.25F, 20.75F, -4.05F));
		PartDefinition gun8 = gun7.addOrReplaceChild("gun8",
				CubeListBuilder.create().texOffs(17, 51).addBox(-3.052F, -20.9212F, 0.4472F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition gun9 = gun7.addOrReplaceChild("gun9",
				CubeListBuilder.create().texOffs(21, 51).addBox(-3.552F, -21.7093F, -1.4019F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.6F))
						.texOffs(21, 51).addBox(-3.552F, -19.7093F, -1.6019F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 22).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(48, 5).addBox(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		arms.render(poseStack, buffer, packedLight, packedOverlay);
		right_leg.render(poseStack, buffer, packedLight, packedOverlay);
		left_leg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
