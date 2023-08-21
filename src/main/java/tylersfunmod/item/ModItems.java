package tylersfunmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import tylersfunmod.TSAFM;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import tylersfunmod.block.ModBlocks;
import tylersfunmod.entity.ModEntities;
import tylersfunmod.item.custom.DenimArmorItem;
import tylersfunmod.item.custom.NetheriteDenimArmorItem;

public class ModItems {
    public static final Item DENIM = registerItem("denim", new Item(new FabricItemSettings()));
    public static final Item JORTS = registerItem("jorts", new DenimArmorItem(ModArmorMaterials.DENIM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item NETHERITE_JORTS = registerItem("netherite_jorts", new NetheriteDenimArmorItem(ModArmorMaterials.NETHERITEDENIM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item COTTON_BULB = registerItem("cotton_bulb", new Item(new FabricItemSettings()));
    public static final Item COTTON_SEEDS = registerItem("cotton_seeds", new AliasedBlockItem(ModBlocks.COTTON_PLANT, new FabricItemSettings()));

    public static final Item LOBSTER = registerItem("lobster", new Item(new FabricItemSettings()));
    public static final Item LOBSTER_TAIL = registerItem("lobster_tail", new Item(new FabricItemSettings().food(ModFoodComponents.LOBSTER_TAIL)));

    public static final Item COCKROACH_SPAWN_EGG = registerItem("cockroach_spawn_egg",
            new SpawnEggItem(ModEntities.COCKROACH, 0x3b1e08, 0x6b462a,
                    new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DENIM);
        entries.add(COTTON_BULB);
        entries.add(LOBSTER);
    }
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(COTTON_SEEDS);
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(JORTS);
        entries.add(NETHERITE_JORTS);
    }

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(LOBSTER_TAIL);
    }

    private static void addItemsToSpawnEggItemGroup(FabricItemGroupEntries entries) {

        entries.add(COCKROACH_SPAWN_EGG);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TSAFM.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TSAFM.LOGGER.info("Registering Mod Items for " + TSAFM.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToSpawnEggItemGroup);
    }
}