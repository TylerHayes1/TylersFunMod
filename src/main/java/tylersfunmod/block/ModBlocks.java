package tylersfunmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import tylersfunmod.TSAFM;
import tylersfunmod.block.custom.CottonBlock;

public class ModBlocks {

    public static final Block COTTON_PLANT = registerBlockWithoutBlockItem("cotton_plant",
            new CottonBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TSAFM.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TSAFM.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(TSAFM.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        TSAFM.LOGGER.info("Registering ModBlocks for " + TSAFM.MOD_ID);
    }
}
