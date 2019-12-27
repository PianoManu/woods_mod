package com.pianomanu.woods.woods_blocks.trees;

import com.pianomanu.woods.world.gen.feature.MossyDarkOakTreeFeature;
import net.minecraft.block.trees.BigTree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.DarkOakTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class MossyDarkOakTree extends BigTree {
    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return null;
    }

    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
        return new MossyDarkOakTreeFeature(NoFeatureConfig::deserialize, true);
    }
}
