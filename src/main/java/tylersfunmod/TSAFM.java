package tylersfunmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tylersfunmod.block.ModBlocks;
import tylersfunmod.entity.ModEntities;
import tylersfunmod.entity.custom.CockroachEntity;
import tylersfunmod.item.ModItemGroups;
import tylersfunmod.item.ModItems;
import tylersfunmod.util.ModRegistries;

public class TSAFM implements ModInitializer {
	public static final String MOD_ID = "tsafm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		FabricDefaultAttributeRegistry.register(ModEntities.COCKROACH, CockroachEntity.setAttributes());
	}
}