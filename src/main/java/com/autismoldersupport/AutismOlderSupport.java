package com.autismoldersupport;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutismOlderSupport implements ModInitializer {
    public static final String MOD_ID = "autism-older-support";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("AUTISM Older Version Support loaded - making the client work on legacy versions");
        
        // Version compatibility initialization
        VersionCompatibility.init();
        
        LOGGER.info("Compatibility layer initialized for Minecraft 1.21+");
    }
}
