package com.pianomanu.woods.block;

import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;

public class WoodsAllBranchBlock extends WoodsBaseBranchBlock {
    
    public WoodsAllBranchBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, true).with(EAST, true).with(SOUTH, true).with(WEST, true).with(UP, true).with(DOWN, true));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState();
    }
}
