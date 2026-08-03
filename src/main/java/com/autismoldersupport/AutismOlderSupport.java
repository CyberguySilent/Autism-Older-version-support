package com.autismoldersupport;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutismOlderSupport implements ClientModInitializer {
    public static final String MOD_ID = "autism-older-support";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("AUTISM Older Version Support loaded");
        VersionCompatibility.init();
        LOGGER.info("Compatibility layer initialized");
    }
}
