package com.pianomanu.woods.block.trees;

import java.util.Random;
import javax.annotation.Nullable;

import com.pianomanu.woods.world.gen.feature.MossyOakBigTreeFeature;
import com.pianomanu.woods.world.gen.feature.MossyTreeFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.BigTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeature;

public class MossyOakTree extends Tree {

    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return (AbstractTreeFeature<NoFeatureConfig>)(random.nextInt(10) == 0 ? new MossyOakBigTreeFeature(NoFeatureConfig::deserialize, true) : new MossyTreeFeature(NoFeatureConfig::deserialize, true));
    }
}
