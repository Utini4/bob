// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMinion<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "minion"), "main");
	private final ModelPart body;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelMinion(ModelPart root) {
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(34, 31)
						.addBox(-4.0F, 6.0F, -2.5F, 9.0F, 15.0F, 6.0F, new CubeDeformation(-0.3F)).texOffs(34, 23)
						.addBox(-4.0F, 5.25F, -2.5F, 9.0F, 2.0F, 6.0F, new CubeDeformation(-0.55F)).texOffs(34, 22)
						.addBox(-4.0F, 4.5F, -2.5F, 9.0F, 3.0F, 6.0F, new CubeDeformation(-0.8F)).texOffs(34, 22)
						.addBox(-4.0F, 4.0F, -2.5F, 9.0F, 3.0F, 6.0F, new CubeDeformation(-1.05F)).texOffs(54, 60)
						.addBox(2.0F, 3.25F, 0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).texOffs(54, 60)
						.addBox(0.0F, 3.75F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).texOffs(54, 60)
						.addBox(-0.5F, 3.5F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).texOffs(54, 60)
						.addBox(-2.0F, 3.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).texOffs(22, 32)
						.addBox(-3.25F, 6.9F, -3.4F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(0, 38)
						.addBox(-4.5F, 7.4F, -3.15F, 10.0F, 3.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 38)
						.addBox(-4.5F, 7.4F, 2.1F, 10.0F, 3.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 38)
						.addBox(-4.5F, 7.4F, -2.9F, 2.0F, 3.0F, 7.0F, new CubeDeformation(-0.75F)).texOffs(0, 38)
						.addBox(3.5F, 7.4F, -2.9F, 2.0F, 3.0F, 7.0F, new CubeDeformation(-0.75F)).texOffs(22, 32)
						.addBox(0.25F, 6.9F, -3.4F, 4.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(40, 5)
						.addBox(0.0F, -1.25F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(0, 58)
						.addBox(-0.5F, 3.25F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.6F)),
				PartPose.offset(4.3F, 17.0F, 0.5F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(40, 5)
						.addBox(-2.0F, -1.25F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(0, 58)
						.addBox(-2.5F, 3.25F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.6F)),
				PartPose.offset(-3.3F, 17.0F, 0.5F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.2F, 0.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(50, 58)
						.addBox(-2.2F, 2.25F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(2.75F, 20.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(50, 58)
						.addBox(-0.8F, 2.25F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).texOffs(52, 52)
						.addBox(-0.8F, 0.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(-1.75F, 20.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}