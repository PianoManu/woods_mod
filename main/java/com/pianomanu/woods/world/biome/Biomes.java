package com.pianomanu.woods.world.biome;

import java.util.Collections;

import com.pianomanu.woods.WoodsMain;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

@net.minecraftforge.registries.ObjectHolder(WoodsMain.MOD_ID)
public class Biomes {
    public static Biome WET_FOREST_BIOME;

    public static void registerBiomes() {
        registerBiome(WET_FOREST_BIOME, Type.FOREST);
    }

    public static void registerBiome(Biome biome, Type...types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }

    static {
        Collections.addAll(Biome.BIOMES, WET_FOREST_BIOME);
    }
}
