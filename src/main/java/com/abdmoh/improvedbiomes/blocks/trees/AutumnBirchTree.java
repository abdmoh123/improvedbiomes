package com.abdmoh.improvedbiomes.blocks.trees;

import com.abdmoh.improvedbiomes.world.features.AutumnBirchTreeFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.BirchTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class AutumnBirchTree extends Tree {
    @Nullable
    public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return new AutumnBirchTreeFeature(NoFeatureConfig::deserialize, true, false);
    }
}
