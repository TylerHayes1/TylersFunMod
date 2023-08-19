package tylersfunmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import tylersfunmod.TSAFM;
import tylersfunmod.entity.custom.CockroachEntity;
import net.minecraft.entity.EntityType;

public class ModEntities {
    public static final EntityType<CockroachEntity> COCKROACH = Registry.register(
        Registries.ENTITY_TYPE, new Identifier(TSAFM.MOD_ID, "cockroach"),
        FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CockroachEntity::new)
                .dimensions(EntityDimensions.fixed(.4f, .2f)).build());
}
