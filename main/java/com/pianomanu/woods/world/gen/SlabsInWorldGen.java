package com.pianomanu.woods.world.gen;

import com.mojang.datafixers.Dynamic;
import com.pianomanu.woods.init.WoodsBlockStateProperties;
import com.pianomanu.woods.list.BlockList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowyDirtBlock;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class SlabsInWorldGen extends Feature<NoFeatureConfig> {


    public SlabsInWorldGen(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
        super(configFactoryIn);
    }

    @Override
    public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockpos1 = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockposWest = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockposNorth = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockposEast = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockposSouth = new BlockPos.MutableBlockPos();

        int ypos = 255; //height limit, count down until grass or stone is found
        for(int i = 0; i < 16; ++i) {
            for(int j = 0; j < 16; ++j) {
                boolean isAtLevelDifference = false;
                int k = pos.getX() + i;
                int l = pos.getZ() + j;
                //int i1 = worldIn.getHeight(Heightmap.Type.MOTION_BLOCKING, k, l);
                int i1 = worldIn.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, k, l);

                blockpos$mutableblockpos.setPos(k, i1, l);
                /*if (worldIn.getBlockState(blockpos$mutableblockpos) != Blocks.GRASS_BLOCK.getDefaultState()) {
                    while ((worldIn.getBlockState(blockpos$mutableblockpos) == Blocks.OAK_LEAVES.getDefaultState() || worldIn.getBlockState(blockpos$mutableblockpos) == Blocks.BIRCH_LEAVES.getDefaultState() || worldIn.getBlockState(blockpos$mutableblockpos) == Blocks.AIR.getDefaultState())&& i1 > 60) {
                        i1--;
                    }
                }
                blockpos$mutableblockpos.setPos(k, i1, l);*/
                blockpos$mutableblockpos1.setPos(blockpos$mutableblockpos).move(Direction.DOWN, 1);
                BlockState blockStateWest = worldIn.getBlockState(blockpos$mutableblockposWest.setPos(blockpos$mutableblockpos).move(Direction.WEST, 1));
                BlockState blockStateNorth = worldIn.getBlockState(blockpos$mutableblockposNorth.setPos(blockpos$mutableblockpos).move(Direction.NORTH, 1));
                BlockState blockStateEast = worldIn.getBlockState(blockpos$mutableblockposEast.setPos(blockpos$mutableblockpos).move(Direction.EAST, 1));
                BlockState blockStateSouth = worldIn.getBlockState(blockpos$mutableblockposSouth.setPos(blockpos$mutableblockpos).move(Direction.SOUTH, 1));
                Biome biome = worldIn.getBiome(blockpos$mutableblockpos);
                /*if (biome.doesWaterFreeze(worldIn, blockpos$mutableblockpos1, false)) {
                    worldIn.setBlockState(blockpos$mutableblockpos1, Blocks.ICE.getDefaultState(), 2);
                }*/
                if (blockStateWest == Blocks.GRASS_BLOCK.getDefaultState() || blockStateNorth == Blocks.GRASS_BLOCK.getDefaultState() || blockStateEast == Blocks.GRASS_BLOCK.getDefaultState() || blockStateSouth == Blocks.GRASS_BLOCK.getDefaultState()) {
                    if (blockStateWest == Blocks.AIR.getDefaultState() || blockStateNorth == Blocks.AIR.getDefaultState() || blockStateEast == Blocks.AIR.getDefaultState() || blockStateSouth == Blocks.AIR.getDefaultState()) {
                        isAtLevelDifference = true;
                    }
                }

                //if (biome.doesSnowGenerate(worldIn, blockpos$mutableblockpos)) {
                BlockState blockstate = worldIn.getBlockState(blockpos$mutableblockpos1);
                if (blockstate == Blocks.GRASS_BLOCK.getDefaultState() && isAtLevelDifference) {
                    worldIn.setBlockState(blockpos$mutableblockpos, BlockList.grass_slab.getDefaultState(), 2);
                }

                    if (blockstate.has(SnowyDirtBlock.SNOWY)) {
                        worldIn.setBlockState(blockpos$mutableblockpos1, Blocks.GRASS_BLOCK.getDefaultState(), 2);
                    }
                //}
            }
        }

        return true;
    }
}
