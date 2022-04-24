// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGolemDog<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "golemdog"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public ModelGolemDog(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 40)
						.addBox(-9.0F, 3.0F, -8.0F, 18.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-9.0F, 3.0F, 3.0F, 18.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, 0.5F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(60, 58).addBox(9.0F, -2.5F, 13.0F, 4.0F, 30.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 16.0F, 4.5F, 1.5708F, -0.6109F, -1.5708F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -4.5F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-1.0F, 2.0F, -6.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, -5.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(37, 0)
						.addBox(-7.5F, 1.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 0)
						.addBox(1.5F, 1.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 12.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(60, 0)
						.addBox(-7.5F, 1.0F, -2.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(1.5F, 1.0F, -2.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}