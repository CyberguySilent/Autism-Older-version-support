# Setup Instructions

## Prerequisites
- Java 21 or higher
- Gradle 8.5+ (or use wrapper)

## Initial Setup

### 1. Generate Gradle Wrapper
If you don't have the gradle wrapper files yet, run:
```bash
gradle wrapper --gradle-version 8.5
```

This creates:
- `gradlew` (Linux/Mac)
- `gradlew.bat` (Windows)
- `gradle/wrapper/` directory

### 2. Build the Addon
```bash
./gradlew build
```

The compiled jar will be in `build/libs/`

### 3. Installation
1. Drop the addon jar into `.minecraft/mods`
2. Make sure AUTISM Client is also installed
3. Launch Minecraft 1.21.x

## Note
This addon currently provides a compatibility framework. The actual implementation may need adjustments based on what AUTISM Client actually requires.
