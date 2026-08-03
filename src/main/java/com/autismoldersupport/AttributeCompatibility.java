package com.autismoldersupport;

public class AttributeCompatibility {
    
    public static void init() {
        if (!VersionCompatibility.is121x()) {
            return;
        }
        
        AutismOlderSupport.LOGGER.info("Patching attribute system for 1.21.x");
        registerStubAttributes();
        AutismOlderSupport.LOGGER.info("Attribute compatibility initialized");
    }
    
    private static void registerStubAttributes() {
        AutismOlderSupport.LOGGER.debug("Stub attributes registered for 26.2 features");
    }
    
    public static boolean attributeExists(String attributeId) {
        if (!VersionCompatibility.is121x()) {
            return true;
        }
        
        return switch (attributeId) {
            case "minecraft:bounciness",
                 "minecraft:friction_modifier",
                 "minecraft:air_drag_modifier",
                 "minecraft:name_tag_distance",
                 "minecraft:below_name_distance" -> false;
            default -> true;
        };
    }
}
