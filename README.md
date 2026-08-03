# AUTISM Older Version Support

compatibility addon for [AUTISM Client](https://github.com/AutismDevelopment/Autism-Client) that backports it from **26.2** to older minecraft versions (1.21 through 1.21.11).

made by **@n1kvz** on discord

## what does this do

AUTISM Client is built for minecraft **26.2** (requires java 25, fabric loader 0.19.3+, fabric api 0.152.2+). this addon backports it to work on 1.21.x versions by patching compatibility layers.

handles:
- attribute differences (26.2 added bounciness, friction_modifier, air_drag_modifier, name_tag_distance, below_name_distance)
- packet structure changes between versions
- registry differences (new blocks/mobs/biomes in 26.2 that don't exist in 1.21.x like sulfur cubes, sulfur caves)
- NBT data format changes (HurtByTimestamp removal, bed block entity removal)
- network protocol compatibility
- java version differences (26.2 needs java 25, 1.21.x runs on java 21)

makes sure AUTISM Client's modules, macros, payload sender, and NBT tools work on 1.21.x without crashes.

## supported versions

works on minecraft versions:
- **1.21** (base version)
- **1.21.1** through **1.21.11**

AUTISM Client natively supports: **26.2** (java 25, fabric loader 0.19.3+)

if you need support for 1.20.x, 1.19.x, or 1.21.12+ let me know.

## how to install

1. download AUTISM Client jar (built for 26.2)
2. download this addon jar (from releases)
3. put both jars into your `.minecraft/mods` folder
4. make sure you're using:
   - java 21+ (not java 25)
   - fabric loader 0.16.0+
   - fabric api for your minecraft version
5. launch minecraft on any 1.21.x version

you'll see log messages confirming compatibility patches were applied.

## what works

everything the main client does should work:
- all modules
- macro system (actions, conditions, presets)
- custom payload sender
- nbt viewer
- packet tools
- commands
- lan sync

if something breaks on a specific version let me know.

## known issues

- some packet handling edge cases might not be perfect on all 1.21.x subversions
- if AUTISM Client updates heavily this might need updates

## building from source

```bash
git clone https://github.com/bestluaucoder/Autism-Older-version-support
cd Autism-Older-version-support
./gradlew build
```

jar will be in `build/libs/`

note: if gradle wrapper isn't set up yet, run `gradle wrapper --gradle-version 8.5` first

## contributing

open source under GPL-3.0 (same as AUTISM Client). prs welcome for:
- more version support
- bug fixes
- better compatibility implementations

## credits

- AUTISM Client devs (Melonik) for the sick client
- everyone testing this on different versions

---

autism client best client fr (sigil on 1.8.9 still different tho)
