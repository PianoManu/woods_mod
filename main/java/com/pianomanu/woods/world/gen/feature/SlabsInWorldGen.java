package com.pianomanu.woods.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import com.pianomanu.woods.list.BlockList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowyDirtBlock;
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
        BlockPos.MutableBlockPos blockpos$mutableblockposWestDown = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockposNorthDown = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockposEastDown = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockposSouthDown = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockposUp = new BlockPos.MutableBlockPos();

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
                BlockState blockStateDown = worldIn.getBlockState(blockpos$mutableblockpos1);
                BlockState blockStateUp = worldIn.getBlockState(blockpos$mutableblockposUp.setPos(blockpos$mutableblockpos).move(Direction.UP,1));
                BlockState blockStateWest = worldIn.getBlockState(blockpos$mutableblockposWest.setPos(blockpos$mutableblockpos).move(Direction.WEST, 1));
                BlockState blockStateNorth = worldIn.getBlockState(blockpos$mutableblockposNorth.setPos(blockpos$mutableblockpos).move(Direction.NORTH, 1));
                BlockState blockStateEast = worldIn.getBlockState(blockpos$mutableblockposEast.setPos(blockpos$mutableblockpos).move(Direction.EAST, 1));
                BlockState blockStateSouth = worldIn.getBlockState(blockpos$mutableblockposSouth.setPos(blockpos$mutableblockpos).move(Direction.SOUTH, 1));
                BlockState blockStateWestDown = worldIn.getBlockState(blockpos$mutableblockposWestDown.setPos(blockpos$mutableblockpos).move(Direction.WEST, 1).move(Direction.DOWN, 1));
                BlockState blockStateNorthDown = worldIn.getBlockState(blockpos$mutableblockposNorthDown.setPos(blockpos$mutableblockpos).move(Direction.NORTH, 1).move(Direction.DOWN, 1));
                BlockState blockStateEastDown = worldIn.getBlockState(blockpos$mutableblockposEastDown.setPos(blockpos$mutableblockpos).move(Direction.EAST, 1).move(Direction.DOWN, 1));
                BlockState blockStateSouthDown = worldIn.getBlockState(blockpos$mutableblockposSouthDown.setPos(blockpos$mutableblockpos).move(Direction.SOUTH, 1).move(Direction.DOWN, 1));

                Biome biome = worldIn.getBiome(blockpos$mutableblockpos);
                /*if (biome.doesWaterFreeze(worldIn, blockpos$mutableblockpos1, false)) {
                    worldIn.setBlockState(blockpos$mutableblockpos1, Blocks.ICE.getDefaultState(), 2);
                }*/
                //Grass landscapes
                if ((blockStateWest == Blocks.GRASS_BLOCK.getDefaultState() && blockStateEastDown == Blocks.GRASS_BLOCK.getDefaultState()) || (blockStateNorth == Blocks.GRASS_BLOCK.getDefaultState() && blockStateSouthDown == Blocks.GRASS_BLOCK.getDefaultState()) || (blockStateEast == Blocks.GRASS_BLOCK.getDefaultState() && blockStateWestDown == Blocks.GRASS_BLOCK.getDefaultState()) || (blockStateSouth == Blocks.GRASS_BLOCK.getDefaultState() && blockStateNorthDown == Blocks.GRASS_BLOCK.getDefaultState())) {
                    if (blockStateWest == Blocks.AIR.getDefaultState() || blockStateNorth == Blocks.AIR.getDefaultState() || blockStateEast == Blocks.AIR.getDefaultState() || blockStateSouth == Blocks.AIR.getDefaultState() || blockStateWest == Blocks.GRASS.getDefaultState() || blockStateNorth == Blocks.GRASS.getDefaultState() || blockStateEast == Blocks.GRASS.getDefaultState() || blockStateSouth == Blocks.GRASS.getDefaultState()) {
                        isAtLevelDifference = true;
                    }
                    if (blockStateWest == BlockList.grass_slab.getDefaultState() || blockStateNorth == BlockList.grass_slab.getDefaultState() || blockStateEast == BlockList.grass_slab.getDefaultState() || blockStateSouth == BlockList.grass_slab.getDefaultState() || blockStateWest == Blocks.GRASS.getDefaultState() || blockStateNorth == Blocks.GRASS.getDefaultState() || blockStateEast == Blocks.GRASS.getDefaultState() || blockStateSouth == Blocks.GRASS.getDefaultState()) {
                        isAtLevelDifference = true;
                    }

                }
                //Desert etc
                if ((blockStateWest == Blocks.SAND.getDefaultState() && blockStateEastDown == Blocks.SAND.getDefaultState()) || (blockStateNorth == Blocks.SAND.getDefaultState() && blockStateSouthDown == Blocks.SAND.getDefaultState()) || (blockStateEast == Blocks.SAND.getDefaultState() && blockStateWestDown == Blocks.SAND.getDefaultState()) || (blockStateSouth == Blocks.SAND.getDefaultState() && blockStateNorthDown == Blocks.SAND.getDefaultState())) {
                    if (blockStateWest == Blocks.AIR.getDefaultState() || blockStateNorth == Blocks.AIR.getDefaultState() || blockStateEast == Blocks.AIR.getDefaultState() || blockStateSouth == Blocks.AIR.getDefaultState() || blockStateWest == Blocks.GRASS.getDefaultState() || blockStateNorth == Blocks.GRASS.getDefaultState() || blockStateEast == Blocks.GRASS.getDefaultState() || blockStateSouth == Blocks.GRASS.getDefaultState()) {
                        isAtLevelDifference = true;
                    }
                    if (blockStateWest == BlockList.sand_slab.getDefaultState() || blockStateNorth == BlockList.sand_slab.getDefaultState() || blockStateEast == BlockList.sand_slab.getDefaultState() || blockStateSouth == BlockList.sand_slab.getDefaultState() || blockStateWest == Blocks.GRASS.getDefaultState() || blockStateNorth == Blocks.GRASS.getDefaultState() || blockStateEast == Blocks.GRASS.getDefaultState() || blockStateSouth == Blocks.GRASS.getDefaultState()) {
                        isAtLevelDifference = true;
                    }
                }
                //gravel regions
                if ((blockStateWest == Blocks.GRAVEL.getDefaultState() && blockStateEastDown == Blocks.GRAVEL.getDefaultState()) || (blockStateNorth == Blocks.GRAVEL.getDefaultState() && blockStateSouthDown == Blocks.GRAVEL.getDefaultState()) || (blockStateEast == Blocks.GRAVEL.getDefaultState() && blockStateWestDown == Blocks.GRAVEL.getDefaultState()) || (blockStateSouth == Blocks.GRAVEL.getDefaultState() && blockStateNorthDown == Blocks.GRAVEL.getDefaultState())) {
                    if (blockStateWest == Blocks.AIR.getDefaultState() || blockStateNorth == Blocks.AIR.getDefaultState() || blockStateEast == Blocks.AIR.getDefaultState() || blockStateSouth == Blocks.AIR.getDefaultState() || blockStateWest == Blocks.GRASS.getDefaultState() || blockStateNorth == Blocks.GRASS.getDefaultState() || blockStateEast == Blocks.GRASS.getDefaultState() || blockStateSouth == Blocks.GRASS.getDefaultState()) {
                        isAtLevelDifference = true;
                    }
                    if (blockStateWest == BlockList.gravel_slab.getDefaultState() || blockStateNorth == BlockList.gravel_slab.getDefaultState() || blockStateEast == BlockList.gravel_slab.getDefaultState() || blockStateSouth == BlockList.gravel_slab.getDefaultState() || blockStateWest == Blocks.GRASS.getDefaultState() || blockStateNorth == Blocks.GRASS.getDefaultState() || blockStateEast == Blocks.GRASS.getDefaultState() || blockStateSouth == Blocks.GRASS.getDefaultState()) {
                        isAtLevelDifference = true;
                    }
                }
                //stoney biomes
                if ((blockStateWest == Blocks.STONE.getDefaultState() && blockStateEastDown == Blocks.STONE.getDefaultState()) || (blockStateNorth == Blocks.STONE.getDefaultState() && blockStateSouthDown == Blocks.STONE.getDefaultState()) || (blockStateEast == Blocks.STONE.getDefaultState() && blockStateWestDown == Blocks.STONE.getDefaultState()) || (blockStateSouth == Blocks.STONE.getDefaultState() && blockStateNorthDown == Blocks.STONE.getDefaultState())) {
                    if (blockStateWest == Blocks.AIR.getDefaultState() || blockStateNorth == Blocks.AIR.getDefaultState() || blockStateEast == Blocks.AIR.getDefaultState() || blockStateSouth == Blocks.AIR.getDefaultState() || blockStateWest == Blocks.GRASS.getDefaultState() || blockStateNorth == Blocks.GRASS.getDefaultState() || blockStateEast == Blocks.GRASS.getDefaultState() || blockStateSouth == Blocks.GRASS.getDefaultState()) {
                        isAtLevelDifference = true;
                    }
                    if (blockStateWest == Blocks.STONE_SLAB.getDefaultState() || blockStateNorth == Blocks.STONE_SLAB.getDefaultState() || blockStateEast == Blocks.STONE_SLAB.getDefaultState() || blockStateSouth == Blocks.STONE_SLAB.getDefaultState() || blockStateWest == Blocks.GRASS.getDefaultState() || blockStateNorth == Blocks.GRASS.getDefaultState() || blockStateEast == Blocks.GRASS.getDefaultState() || blockStateSouth == Blocks.GRASS.getDefaultState()) {
                        isAtLevelDifference = true;
                    }
                }

                //if (biome.doesSnowGenerate(worldIn, blockpos$mutableblockpos)) {
                BlockState blockstate = worldIn.getBlockState(blockpos$mutableblockpos1);
                if (blockstate == Blocks.GRASS_BLOCK.getDefaultState() && isAtLevelDifference) {
                    worldIn.setBlockState(blockpos$mutableblockpos, BlockList.grass_slab.getDefaultState(), 2);
                    worldIn.setBlockState(blockpos$mutableblockpos1, Blocks.DIRT.getDefaultState(), 2);
                    worldIn.setBlockState(blockpos$mutableblockposUp, Blocks.AIR.getDefaultState(), 2);
                }
                if (blockstate == Blocks.STONE.getDefaultState() && isAtLevelDifference) {
                    worldIn.setBlockState(blockpos$mutableblockpos, Blocks.STONE_SLAB.getDefaultState(), 2);
                    worldIn.setBlockState(blockpos$mutableblockposUp, Blocks.AIR.getDefaultState(), 2);
                    if (blockStateDown == Blocks.GRASS_BLOCK.getDefaultState()) {
                        worldIn.setBlockState(blockpos$mutableblockpos1, Blocks.DIRT.getDefaultState(), 2);
                    }
                }
                if (blockstate == Blocks.SAND.getDefaultState() && isAtLevelDifference) {
                    worldIn.setBlockState(blockpos$mutableblockpos, BlockList.sand_slab.getDefaultState(), 2);
                    worldIn.setBlockState(blockpos$mutableblockposUp, Blocks.AIR.getDefaultState(), 2);
                    if (blockStateDown == Blocks.GRASS_BLOCK.getDefaultState()) {
                        worldIn.setBlockState(blockpos$mutableblockpos1, Blocks.DIRT.getDefaultState(), 2);
                    }
                }
                if (blockstate == Blocks.GRAVEL.getDefaultState() && isAtLevelDifference) {
                    worldIn.setBlockState(blockpos$mutableblockpos, BlockList.gravel_slab.getDefaultState(), 2);
                    worldIn.setBlockState(blockpos$mutableblockposUp, Blocks.AIR.getDefaultState(), 2);
                    if (blockStateDown == Blocks.GRASS_BLOCK.getDefaultState()) {
                        worldIn.setBlockState(blockpos$mutableblockpos1, Blocks.DIRT.getDefaultState(), 2);
                    }
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
