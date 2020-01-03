package com.pianomanu.woods.block.trees;

import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.world.gen.feature.MossyJungleBigTreeFeature;
import net.minecraft.block.Blocks;
import net.minecraft.block.trees.BigTree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class MossyJungleTree extends BigTree {
    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return new TreeFeature(NoFeatureConfig::deserialize, true, 4 + random.nextInt(7), BlockList.mossy_jungle_log.getDefaultState(), Blocks.JUNGLE_LEAVES.getDefaultState(), false).setSapling((net.minecraft.block.SaplingBlock)Blocks.JUNGLE_SAPLING);
    }

    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
        return new MossyJungleBigTreeFeature(NoFeatureConfig::deserialize, true, 10, 20, BlockList.mossy_jungle_log.getDefaultState(), Blocks.JUNGLE_LEAVES.getDefaultState()).setSapling((net.minecraft.block.SaplingBlock)Blocks.JUNGLE_SAPLING);
    }
}
