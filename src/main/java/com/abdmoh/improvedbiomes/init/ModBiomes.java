package com.abdmoh.improvedbiomes.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class ModBiomes {
    public static Biome MAPLE_FOREST;
    public static Biome PUMPKIN_PLAINS;

    public static void registerBiomes() {
        registerBiome(MAPLE_FOREST, BiomeType.COOL, 80, Type.FOREST, Type.COLD);
        registerBiome(PUMPKIN_PLAINS, BiomeType.COOL, 80, Type.PLAINS, Type.COLD);
    }

    public static void registerBiome(Biome biome, BiomeType biomeType, int chance, Type... types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, chance));
    }
}
