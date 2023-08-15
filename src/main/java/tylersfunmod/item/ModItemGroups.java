package tylersfunmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import tylersfunmod.TSAFM;
import net.minecraft.item.Items;
import tylersfunmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TSAFM.MOD_ID, "denim"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.TSAFM"))
                    .icon(() -> new ItemStack(ModItems.DENIM)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.COTTON_PLANT);
                        entries.add(ModItems.COTTON_BULB);

                        entries.add(ModItems.DENIM);
                        entries.add(ModItems.JORTS);

                    }).build());
    public static void registerItemGroups() {
        TSAFM.LOGGER.info("Registering Item Groups for " + TSAFM.MOD_ID);
    }
}
