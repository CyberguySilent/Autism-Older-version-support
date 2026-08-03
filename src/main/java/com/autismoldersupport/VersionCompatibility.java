package com.autismoldersupport;

import net.minecraft.SharedConstants;

public class VersionCompatibility {
    private static String mcVersion;
    private static boolean is121x = false;
    
    public static void init() {
        mcVersion = SharedConstants.getGameVersion().getName();
        AutismOlderSupport.LOGGER.info("Detected Minecraft version: {}", mcVersion);
        
        // Check if we're on 1.21.x (older versions that need compatibility)
        is121x = mcVersion.startsWith("1.21");
        
        if (isVersionSupported()) {
            AutismOlderSupport.LOGGER.info("Version {} is supported, applying compatibility patches", mcVersion);
            applyPatches();
        } else {
            AutismOlderSupport.LOGGER.warn("Version {} might not be fully supported - this addon is designed for 1.21.x", mcVersion);
        }
    }
    
    private static boolean isVersionSupported() {
        // Support 1.21.x versions (older than 26.2)
        return is121x;
    }
    
    private static void applyPatches() {
        AutismOlderSupport.LOGGER.info("Applying compatibility patches for 1.21.x...");
        
        // Patch 1: Attribute compatibility (26.2 added new attributes that don't exist in 1.21.x)
        AttributeCompatibility.init();
        
        // Patch 2: Packet structure compatibility (network protocol differences)
        PacketCompatibility.init();
        
        // Patch 3: Registry compatibility (new blocks/items in 26.2 that don't exist in 1.21.x)
        RegistryCompatibility.init();
        
        // Patch 4: NBT data compatibility
        NBTCompatibility.init();
        
        AutismOlderSupport.LOGGER.info("Successfully applied all compatibility patches for version {}", mcVersion);
    }
    
    public static String getMinecraftVersion() {
        return mcVersion;
    }
    
    public static boolean is121x() {
        return is121x;
    }
}
