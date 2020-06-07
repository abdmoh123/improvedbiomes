package com.abdmoh.improvedbiomes.blocks.trees;

import com.abdmoh.improvedbiomes.init.ModBlocks;
import com.abdmoh.improvedbiomes.world.features.BigMapleTreeFeature;
import net.minecraft.block.Blocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class MapleTree extends Tree {
    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return (AbstractTreeFeature)(random.nextInt(10) == 0 ? new BigMapleTreeFeature(NoFeatureConfig::deserialize, true) : new TreeFeature(NoFeatureConfig::deserialize, true, 4, ModBlocks.MAPLE_LOG.getDefaultState(), ModBlocks.MAPLE_LEAVES.getDefaultState(), false));
    }
}
