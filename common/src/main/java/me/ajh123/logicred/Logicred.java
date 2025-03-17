package me.ajh123.logicred;

import dev.architectury.registry.registries.RegistrySupplier;
import me.ajh123.logicred.foundation.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public final class Logicred {
    public static final String MOD_ID = "logicred";

    public static void init() {
        Registry.init();
    }
}
