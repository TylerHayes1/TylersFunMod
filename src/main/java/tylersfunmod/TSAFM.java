package tylersfunmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tylersfunmod.item.ModItems;

public class TSAFM implements ModInitializer {
	public static final String MOD_ID = "tylers_super_awesome_fun_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}