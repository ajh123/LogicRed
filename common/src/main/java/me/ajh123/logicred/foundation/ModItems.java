package me.ajh123.logicred.foundation;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ModItems {
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = register("example_item",
            () -> new BlockItem(ModBlocks.EXAMPLE_BLOCK.get(), new Item.Properties()
            ));

    private static RegistrySupplier<Item> register(String name, Supplier<Item> item) {
        return Registry.ITEMS.register(name, item);
    }

    public static void init() {
        // Initialise static references
    }
}
