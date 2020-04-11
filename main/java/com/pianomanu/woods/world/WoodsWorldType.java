package com.pianomanu.woods.world;

import com.pianomanu.woods.list.BiomesList;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.datafix.DefaultTypeReferences;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraft.world.storage.WorldInfo;

public class WoodsWorldType extends WorldType {

    public WoodsWorldType() {
        super("woods_world_type");
    }
    //TODO new worldtype
    /*public ChunkGenerator<?> createChunkGenerator(World world) {
        WorldInfo test = new WorldInfo(NBTUtil.update(p_215780_1_, DefaultTypeReferences.LEVEL, compoundnbt1, i), p_215780_1_, i, compoundnbt2););
        OverworldGenSettings settings = new OverworldGenSettings();
        SingleBiomeProviderSettings single = new SingleBiomeProviderSettings(test);
        OverworldBiomeProviderSettings biomes = new OverworldBiomeProviderSettings(test);
        biomes.setGeneratorSettings(settings);
        single.setBiome(BiomesList.WET_FOREST_BIOME);
        return new OverworldChunkGenerator(world, new SingleBiomeProvider(single), settings);
    }*/




}
