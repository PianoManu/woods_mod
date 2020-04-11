package com.pianomanu.woods.world.biome;

import com.pianomanu.woods.list.BlockList;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.biome.Biome;

public class WoodsBiome extends Biome {

    protected WoodsBiome(Builder biomeBuilder) {
        super(biomeBuilder);
    }

    public boolean doesMossGenerate(IWorldReader worldIn, BlockPos pos) {
        if (this.getTemperature(pos) >= 0.15F) {
            return false;
        } else {
            BlockState blockstate = worldIn.getBlockState(pos);
            if (blockstate.isAir(worldIn, pos) && BlockList.moss.getDefaultState().isValidPosition(worldIn, pos)) {
                return true;
            }
            return true;
        }
    }
}
