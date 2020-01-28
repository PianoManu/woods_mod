package com.pianomanu.woods.world.biome;

import java.util.Collections;

import com.pianomanu.woods.WoodsMain;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.pianomanu.woods.list.BiomesList.*;

@net.minecraftforge.registries.ObjectHolder(WoodsMain.MOD_ID)
public class WoodsBiomes {

    public static void registerBiomes() {
        registerBiome(WET_FOREST_BIOME, Type.FOREST);
        //registerBiome(SHARP_MOUNTAINS_BIOME, Type.MOUNTAIN);
    }

    public static void registerBiome(Biome biome, Type...types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }

    static {
        Collections.addAll(Biome.BIOMES, WET_FOREST_BIOME/*, SHARP_MOUNTAINS_BIOME*/);
    }
}
