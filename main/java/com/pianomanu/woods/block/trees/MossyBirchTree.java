package com.pianomanu.woods.block.trees;

import com.pianomanu.woods.world.gen.feature.MossyBirchTreeFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class MossyBirchTree extends Tree {

    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return new MossyBirchTreeFeature(NoFeatureConfig::deserialize, true, false);
    }
}
