package tylersfunmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import tylersfunmod.block.ModBlocks;
import tylersfunmod.entity.ModEntities;
import tylersfunmod.entity.client.CockroachRenderer;

public class TSAFMClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COTTON_PLANT, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.COCKROACH, CockroachRenderer::new);
    }
}
