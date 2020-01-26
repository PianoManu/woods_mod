package com.pianomanu.woods.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.BlockRenderLayer;

public class WoodsStairsCutoutMipped extends StairsBlock {


    @SuppressWarnings("deprecation")
    public WoodsStairsCutoutMipped(BlockState state, Properties properties) {
        super(state, properties);
    }
    
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
