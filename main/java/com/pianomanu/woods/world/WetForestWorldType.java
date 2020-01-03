package com.pianomanu.woods.world;

import com.pianomanu.woods.world.biome.Biomes;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;

/*public class WetForestWorldType extends WorldType {
    public WetForestWorldType() {
        super("wet_forest_type");
    }

    @Override
    public ChunkGenerator<?> createChunkGenerator(World world) {
        OverworldGenSettings settings = new OverworldGenSettings();
        SingleBiomeProviderSettings single = new SingleBiomeProviderSettings();
        single.setBiome(Biomes.WET_FOREST_BIOME);
        return new OverworldChunkGenerator(world, new SingleBiomeProvider(single), settings);
    }
}*/
