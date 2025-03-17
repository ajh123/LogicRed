package me.ajh123.logicred.foundation;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistrySupplier<Block> EXAMPLE_BLOCK = register("example_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(3.0f, 3.0f)
            ));

    private static RegistrySupplier<Block> register(String name, Supplier<Block> block) {
        return Registry.BLOCKS.register(name, block);
    }


    public static void init() {
        // Initialise static references
    }
}
