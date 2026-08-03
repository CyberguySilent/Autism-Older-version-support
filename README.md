# AUTISM Older Version Support

yo, this is a compatibility addon for [AUTISM Client](https://github.com/AutismDevelopment/Autism-Client) that lets you run it on older minecraft versions. the main client targets the latest versions but sometimes you just need to run it on 1.21.x servers or older clients for testing/compatibility reasons.

made by **@n1kvz** on discord

## what does this do

basically patches the version compatibility layer so AUTISM Client's modules, macros, and tools actually work on older game versions without breaking. handles the annoying api differences, packet structure changes, and all that stuff between versions.

without this addon, you'd get crashes or broken features when trying to use AUTISM Client on anything older than what it was built for.

## supported versions

right now this works on:
- **1.21.x** (1.21, 1.21.1, 1.21.2, etc.)

more versions might come later if people actually use this and request them. dm me if you need specific version support.

## how to install

1. download AUTISM Client from the main repo
2. download this addon (grab the jar from releases)
3. throw both jars into your `.minecraft/mods` folder
4. make sure you're using fabric loader 0.16.0+ and java 21
5. launch minecraft on whichever 1.21.x version you want

that's it. if both mods load correctly you'll see a message in the log saying compatibility patches were applied.

## what works

pretty much everything the main client does should work:
- all modules
- macro system (actions, conditions, presets)
- custom payload sender
- nbt viewer
- packet tools
- commands
- lan sync

if something's broken on a specific version let me know and i'll see if it's fixable.

## known issues

- some edge cases with packet handling might not be perfect on all 1.21.x subversions
- if the main client updates and changes their api heavily this might need updates too

## building from source

if you wanna build this yourself:

```bash
git clone https://github.com/bestluaucoder/Autism-Older-version-support
cd Autism-Older-version-support
./gradlew build
```

the jar will be in `build/libs/`

note: you need the AUTISM Client api published to your local maven first. check their addon template docs for how to do that.

## contributing

this is open source under GPL-3.0 (same as the main client). if you wanna add support for more versions or fix bugs, prs are welcome.

## credits

- AUTISM Client devs for making a sick client with good addon support
- everyone testing this on different versions

---

autism client best client fr (though sigil on 1.8.9 still hits different ngl)
