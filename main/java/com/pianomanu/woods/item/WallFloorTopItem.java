package com.pianomanu.woods.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;
import java.util.Map;

public class WallFloorTopItem extends BlockItem {
    protected final Block wallBlock;
    protected final Block topBlock;
    public WallFloorTopItem(Block blockIn, Block wallBlockIn, Block topBlockIn, Properties builder) {
        super(blockIn, builder);
        this.wallBlock = wallBlockIn;
        this.topBlock = topBlockIn;
    }

    @Nullable
    protected BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState blockstateWall = this.wallBlock.getStateForPlacement(context);
        BlockState blockstateTop = this.topBlock.getStateForPlacement(context);
        BlockState blockstate2;
        IWorldReader iworldreader = context.getWorld();
        BlockPos blockpos = context.getPos();

        for(Direction direction : context.getNearestLookingDirections()) {
            if (direction == Direction.UP) {
                return blockstateTop;
            }
            if (direction == Direction.DOWN) {
                return this.getBlock().getStateForPlacement(context);
            }
            else {
                return blockstateWall;
            }
            /*if (direction != Direction.UP) {
                BlockState blockstate2 = direction == Direction.DOWN ? this.getBlock().getStateForPlacement(context) : blockstateWall;
                if (blockstate2 != null && blockstate2.isValidPosition(iworldreader, blockpos) && direction != Direction.DOWN) {
                    blockstate1 = blockstate2;
                    break;
                }
                if (direction == Direction.DOWN) {
                    blockstate1 = blockstateTop;
                    break;
                }
            }*/
        }
        return null;
        //return blockstate1 != null && iworldreader.func_217350_a(blockstate1, blockpos, ISelectionContext.dummy()) ? blockstate1 : null;
    }

    public void addToBlockToItemMap(Map<Block, Item> blockToItemMap, Item itemIn) {
        super.addToBlockToItemMap(blockToItemMap, itemIn);
        blockToItemMap.put(this.wallBlock, itemIn);
        blockToItemMap.put(this.topBlock, itemIn);
    }

    public void removeFromBlockToItemMap(Map<Block, Item> blockToItemMap, Item itemIn) {
        super.removeFromBlockToItemMap(blockToItemMap, itemIn);
        blockToItemMap.remove(this.wallBlock);
        blockToItemMap.remove(this.topBlock);
    }

}
