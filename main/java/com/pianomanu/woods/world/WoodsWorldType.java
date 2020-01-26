package com.pianomanu.woods.world;

import com.pianomanu.woods.list.BiomesList;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;

public class WoodsWorldType extends WorldType {

    public WoodsWorldType() {
        super("woods_world_type");
    }

    public ChunkGenerator<?> createChunkGenerator(World world) {
        OverworldGenSettings settings = new OverworldGenSettings();
        SingleBiomeProviderSettings single = new SingleBiomeProviderSettings();
        OverworldBiomeProviderSettings biomes = new OverworldBiomeProviderSettings();
        biomes.setGeneratorSettings(settings);
        single.setBiome(BiomesList.WET_FOREST_BIOME);
        return new OverworldChunkGenerator(world, new SingleBiomeProvider(single), settings);
    }




}
