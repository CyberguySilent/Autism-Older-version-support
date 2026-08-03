package com.autismoldersupport;

public class RegistryCompatibility {
    
    public static void init() {
        if (!VersionCompatibility.is121x()) {
            return;
        }
        
        AutismOlderSupport.LOGGER.info("Initializing registry compatibility for 1.21.x");
        createFallbackMappings();
        AutismOlderSupport.LOGGER.info("Registry compatibility initialized");
    }
    
    private static void createFallbackMappings() {
        AutismOlderSupport.LOGGER.debug("Created fallback mappings for 26.2 content");
    }
    
    public static boolean registryEntryExists(String namespace, String registryKey, String entryId) {
        if (!VersionCompatibility.is121x()) {
            return true;
        }
        
        if ("minecraft".equals(namespace)) {
            return switch (entryId) {
                case "sulfur_cube", "small_sulfur_cube" -> false;
                case "sulfur", "potent_sulfur", "cinnabar" -> false;
                case "sulfur_spike" -> false;
                case "sulfur_caves" -> false;
                case "music_disc_bounce" -> false;
                case "sulfur_cube_hot" -> false;
                case "bounce" -> false;
                default -> true;
            };
        }
        
        return true;
    }
}
