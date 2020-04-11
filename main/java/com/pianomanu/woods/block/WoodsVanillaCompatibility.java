package com.pianomanu.woods.block;

import com.pianomanu.woods.list.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;

public class WoodsVanillaCompatibility {
    public static void setup() {
        registerFlammableBlock(BlockList.mossy_oak_planks,5, 20);
        registerFlammableBlock(BlockList.mossy_birch_planks,5, 20);
        registerFlammableBlock(BlockList.mossy_spruce_planks,5, 20);
        registerFlammableBlock(BlockList.mossy_jungle_planks,5, 20);
        registerFlammableBlock(BlockList.mossy_acacia_planks,5, 20);
        registerFlammableBlock(BlockList.mossy_dark_oak_planks,5, 20);
        registerFlammableBlock(BlockList.mossy_oak_log,5, 5);
        registerFlammableBlock(BlockList.mossy_birch_log,5, 5);
        registerFlammableBlock(BlockList.mossy_spruce_log,5, 5);
        registerFlammableBlock(BlockList.mossy_jungle_log,5, 5);
        registerFlammableBlock(BlockList.mossy_acacia_log,5, 5);
        registerFlammableBlock(BlockList.mossy_dark_oak_log,5, 5);
        registerFlammableBlock(BlockList.mossy_oak_stairs,5, 20);
        registerFlammableBlock(BlockList.mossy_birch_stairs,5, 20);
        registerFlammableBlock(BlockList.mossy_spruce_stairs,5, 20);
        registerFlammableBlock(BlockList.mossy_jungle_stairs,5, 20);
        registerFlammableBlock(BlockList.mossy_acacia_stairs,5, 20);
        registerFlammableBlock(BlockList.mossy_dark_oak_stairs,5, 20);
        registerFlammableBlock(BlockList.mossy_oak_fence,5, 20);
        registerFlammableBlock(BlockList.mossy_birch_fence,5, 20);
        registerFlammableBlock(BlockList.mossy_spruce_fence,5, 20);
        registerFlammableBlock(BlockList.mossy_jungle_fence,5, 20);
        registerFlammableBlock(BlockList.mossy_acacia_fence,5, 20);
        registerFlammableBlock(BlockList.mossy_dark_oak_fence,5, 20);
        registerFlammableBlock(BlockList.mossy_oak_slab,5, 20);
        registerFlammableBlock(BlockList.mossy_birch_slab,5, 20);
        registerFlammableBlock(BlockList.mossy_spruce_slab,5, 20);
        registerFlammableBlock(BlockList.mossy_jungle_slab,5, 20);
        registerFlammableBlock(BlockList.mossy_acacia_slab,5, 20);
        registerFlammableBlock(BlockList.mossy_dark_oak_slab,5, 20);

    }

    public static void registerFlammableBlock(Block blockIn, int encouragement, int flammability)
    {
        FireBlock fireblock = (FireBlock) Blocks.FIRE;
        fireblock.setFireInfo(blockIn, encouragement, flammability);
    }
}
