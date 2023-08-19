package tylersfunmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import tylersfunmod.TSAFM;
import tylersfunmod.entity.custom.CockroachEntity;

public class CockroachRenderer extends GeoEntityRenderer<CockroachEntity> {
    public CockroachRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new CockroachModel());
    }

    @Override
    public Identifier getTextureLocation(CockroachEntity animatable) {
        return new Identifier(TSAFM.MOD_ID, "textures/entity/cockroach.png");
    }

    @Override
    public void render(CockroachEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
