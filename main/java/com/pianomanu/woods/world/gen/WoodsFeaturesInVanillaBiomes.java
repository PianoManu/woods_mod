package com.pianomanu.woods.world.gen;

import com.pianomanu.woods.list.BiomesList;
import com.pianomanu.woods.list.BlockList;
//import com.pianomanu.woods.world.biome.Biomes;
import com.pianomanu.woods.world.gen.feature.SlabsInWorldGen;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;

public class WoodsFeaturesInVanillaBiomes {

    public static void setup() {
        for(Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(new SlabsInWorldGen(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.NOPE, IPlacementConfig.NO_PLACEMENT_CONFIG));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.epidote_ore.getDefaultState(), 7), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 64)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.fire_opal_ore.getDefaultState(), 7), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 64)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.heliodor_ore.getDefaultState(), 7), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 64)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.amethyst_ore.getDefaultState(), 7), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 64)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.azurite_ore.getDefaultState(), 7), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 64)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.green_opal_ore.getDefaultState(), 7), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 64)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.purity_ore.getDefaultState(),8), Placement.COUNT_RANGE, new CountRangeConfig(2,0,0,16)));
            //BiomeDictionary.addTypes(BiomesList.WET_FOREST_BIOME, BiomeDictionary.Type.FOREST);
            //BiomeManager.removeSpawnBiome(Biomes.FOREST);
            //BiomeManager.removeSpawnBiome(Biomes.TAIGA);
            //BiomeManager.removeSpawnBiome(Biomes.TAIGA_HILLS);
            //BiomeManager.removeSpawnBiome(Biomes.WOODED_HILLS);
            //BiomeManager.removeSpawnBiome(Biomes.PLAINS);
            //BiomeManager.removeSpawnBiome(Biomes.JUNGLE);
            //BiomeManager.removeSpawnBiome(Biomes.JUNGLE_HILLS);
            BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(BiomesList.WET_FOREST_BIOME, 200));
            BiomeManager.addSpawnBiome(BiomesList.WET_FOREST_BIOME);
            BiomeProvider.BIOMES_TO_SPAWN_IN.add(BiomesList.WET_FOREST_BIOME);
        }
    }

}
