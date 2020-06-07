package com.abdmoh.improvedbiomes.blocks.trees;

import com.abdmoh.improvedbiomes.init.ModBlocks;
import com.abdmoh.improvedbiomes.world.features.BaobabTreeFeature;
import net.minecraft.block.trees.BigTree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class BaobabTree extends BigTree {
    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
        return (new BaobabTreeFeature(NoFeatureConfig::deserialize, true, 10, 4, ModBlocks.BAOBAB_LOG.getDefaultState(), ModBlocks.BAOBAB_LEAVES.getDefaultState()));
    }

    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return null;
    }
}
