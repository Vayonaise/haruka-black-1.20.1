package net.viennetta.harukablack.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.viennetta.harukablack.HarukaBlack;

public class HarukaBlackItemGroups {
    public static final ItemGroup HARUKA_BLACK_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(HarukaBlack.MOD_ID, "harukablack"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.harukablack"))
                    .icon(() -> new ItemStack(HarukaBlackItems.FROSTBITE)).entries((displayContext, entries) -> {
                        entries.add(HarukaBlackItems.FROSTBITE);

                    }).build());

    public static void registerItemGroups(){

        HarukaBlack.LOGGER.info("Registering Item Groups for " + HarukaBlack.MOD_ID);
    }
}
