package com.pianomanu.woods.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import com.pianomanu.woods.block.WoodsMossBlock;
import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.world.biome.WoodsBiome;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class ForestLanternsFeature extends Feature<NoFeatureConfig> {

    public ForestLanternsFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
        super(configFactoryIn);
    }

    @Override
    public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        BlockPos.Mutable blockpos$mutableblockpos = new BlockPos.Mutable();
        BlockPos.Mutable blockpos$mutableblockpos1 = new BlockPos.Mutable();
        for(int i = 0; i < 16; ++i) {
            for(int j = 0; j < 16; ++j) {
                int k = pos.getX() + i;
                int l = pos.getZ() + j;
                int i1 = worldIn.getHeight(Heightmap.Type.MOTION_BLOCKING, k, l);
                blockpos$mutableblockpos.setPos(k, i1, l);
                blockpos$mutableblockpos1.setPos(blockpos$mutableblockpos).move(Direction.DOWN, 1);
                WoodsBiome biome = (WoodsBiome) worldIn.getBiome(blockpos$mutableblockpos);
                int chance = new Random().nextInt(40);
                if (chance == 1) {
                    worldIn.setBlockState(blockpos$mutableblockpos, BlockList.moss.getDefaultState(), 2);
                    BlockState blockstate = worldIn.getBlockState(blockpos$mutableblockpos1);
                    if (blockstate.has(WoodsMossBlock.MOSSY)) {
                        worldIn.setBlockState(blockpos$mutableblockpos1, blockstate.with(WoodsMossBlock.MOSSY, Boolean.valueOf(true)), 2);
                    }
                }
            }
        }

        return true;
    }
}
