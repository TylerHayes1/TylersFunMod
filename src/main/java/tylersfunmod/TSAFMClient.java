package tylersfunmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import tylersfunmod.block.ModBlocks;

public class TSAFMClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COTTON_PLANT, RenderLayer.getCutout());
    }
}
