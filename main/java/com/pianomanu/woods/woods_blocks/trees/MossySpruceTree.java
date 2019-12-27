package com.pianomanu.woods.woods_blocks.trees;

import com.pianomanu.woods.world.gen.feature.MossySpruceBigTreeFeature;
import com.pianomanu.woods.world.gen.feature.MossySpruceNormalTreeFeature;
import net.minecraft.block.trees.BigTree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class MossySpruceTree extends BigTree {
    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return new MossySpruceNormalTreeFeature(NoFeatureConfig::deserialize, true);
    }

    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
        return new MossySpruceBigTreeFeature(NoFeatureConfig::deserialize, false, random.nextBoolean());
    }
}