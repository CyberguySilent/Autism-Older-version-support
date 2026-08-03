package com.autismoldersupport;

import net.minecraft.SharedConstants;

public class VersionCompatibility {
    private static String mcVersion;
    private static boolean isSupported = false;
    private static int minorVersion = 0;
    
    public static void init() {
        mcVersion = SharedConstants.getGameVersion().getName();
        AutismOlderSupport.LOGGER.info("Detected Minecraft version: {}", mcVersion);
        
        parseVersion();
        
        if (isVersionSupported()) {
            AutismOlderSupport.LOGGER.info("Applying compatibility patches for version {}", mcVersion);
            applyPatches();
        } else {
            AutismOlderSupport.LOGGER.warn("Version {} is not supported. Supported: 1.21 - 1.21.11", mcVersion);
        }
    }
    
    private static void parseVersion() {
        if (mcVersion.startsWith("1.21")) {
            if (mcVersion.equals("1.21")) {
                isSupported = true;
                minorVersion = 0;
            } else if (mcVersion.startsWith("1.21.")) {
                try {
                    String minorStr = mcVersion.substring(5);
                    minorVersion = Integer.parseInt(minorStr);
                    isSupported = minorVersion >= 0 && minorVersion <= 11;
                } catch (NumberFormatException e) {
                    isSupported = false;
                }
            }
        }
    }
    
    private static boolean isVersionSupported() {
        return isSupported;
    }
    
    private static void applyPatches() {
        AutismOlderSupport.LOGGER.info("Applying compatibility patches for 1.21.{}", minorVersion);
        
        AttributeCompatibility.init();
        PacketCompatibility.init();
        RegistryCompatibility.init();
        NBTCompatibility.init();
        
        AutismOlderSupport.LOGGER.info("Successfully applied all compatibility patches");
    }
    
    public static String getMinecraftVersion() {
        return mcVersion;
    }
    
    public static int getMinorVersion() {
        return minorVersion;
    }
    
    public static boolean isSupported() {
        return isSupported;
    }
    
    public static boolean is121x() {
        return isSupported;
    }
}
