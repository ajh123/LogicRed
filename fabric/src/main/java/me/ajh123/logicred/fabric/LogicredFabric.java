package me.ajh123.logicred.fabric;

import me.ajh123.logicred.Logicred;
import net.fabricmc.api.ModInitializer;

public final class LogicredFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Logicred.init();
    }
}
