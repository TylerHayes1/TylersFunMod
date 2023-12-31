package tylersfunmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import tylersfunmod.TSAFM;
import tylersfunmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup DENIM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TSAFM.MOD_ID, "denim"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.TSAFM"))
                    .icon(() -> new ItemStack(ModItems.DENIM)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.COTTON_PLANT);
                        entries.add(ModItems.COTTON_BULB);

                        entries.add(ModItems.DENIM);
                        entries.add(ModItems.JORTS);
                        entries.add(ModItems.NETHERITE_JORTS);

                        entries.add(ModItems.LOBSTER);
                        entries.add(ModItems.LOBSTER_TAIL);
                        entries.add(ModBlocks.LOBSTER_TROPHY);

                        entries.add(ModItems.COCKROACH_SPAWN_EGG);

                    }).build());
    public static void registerItemGroups() {
        TSAFM.LOGGER.info("Registering Item Groups for " + TSAFM.MOD_ID);
    }
}
