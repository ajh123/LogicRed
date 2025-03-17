package me.ajh123.logicred.foundation;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static me.ajh123.logicred.Logicred.MOD_ID;

public class Registry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static void init() {
        ModBlocks.init();
        BLOCKS.register();
        ModItems.init();
        ITEMS.register();
    }
}
