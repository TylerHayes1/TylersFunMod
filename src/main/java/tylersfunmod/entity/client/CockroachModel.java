package tylersfunmod.entity.client;

import net.minecraft.util.Identifier;
import tylersfunmod.TSAFM;
import tylersfunmod.entity.custom.CockroachEntity;
import software.bernie.geckolib.model.GeoModel;

public class CockroachModel extends GeoModel<CockroachEntity> {

    @Override
    public Identifier getModelResource(CockroachEntity animatable) {
        return new Identifier(TSAFM.MOD_ID, "geo/cockroach.geo.json");
    }

    @Override
    public Identifier getTextureResource(CockroachEntity animatable) {
        return new Identifier(TSAFM.MOD_ID, "textures/entity/cockroach.png");
    }

    @Override
    public Identifier getAnimationResource(CockroachEntity animatable) {
        return new Identifier(TSAFM.MOD_ID, "animations/cockroach.animation.json");
    }
}
