package net.viennetta.harukablack.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.viennetta.harukablack.HarukaBlack;

public class HarukaBlackItems {
    public static final Item JOLLYGEEPER = registerItem("jollygeeper", new Item(new FabricItemSettings()));
    public static final Item FROSTBITE = registerItem("frostbite", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries){
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(HarukaBlack.MOD_ID, name), item);
    }

    public static void registerModItems(){
        HarukaBlack.LOGGER.info("Registering Mod Items for " + HarukaBlack.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(HarukaBlackItems::addItemsToIngredientsTabItemGroup);
    }
}
