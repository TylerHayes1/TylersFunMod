package tylersfunmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import tylersfunmod.TSAFM;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import tylersfunmod.block.ModBlocks;
import tylersfunmod.item.custom.DenimArmorItem;

public class ModItems {
    public static final Item DENIM = registerItem("denim", new Item(new FabricItemSettings()));
    public static final Item JORTS = registerItem("jorts", new DenimArmorItem(ModArmorMaterials.DENIM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));


    public static final Item COTTON_BULB = registerItem("cotton_bulb", new Item(new FabricItemSettings()));
    public static final Item COTTON_SEEDS = registerItem("cotton_seeds", new AliasedBlockItem(ModBlocks.COTTON_PLANT, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DENIM);
        entries.add(COTTON_BULB);
    }
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {

        entries.add(COTTON_SEEDS);
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {

        entries.add(JORTS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TSAFM.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TSAFM.LOGGER.info("Registering Mod Items for " + TSAFM.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
