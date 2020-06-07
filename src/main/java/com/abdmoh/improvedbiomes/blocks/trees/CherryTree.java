package com.abdmoh.improvedbiomes.blocks.trees;

import com.abdmoh.improvedbiomes.init.ModBlocks;
import com.abdmoh.improvedbiomes.world.features.BigCherryTreeFeature;
import com.abdmoh.improvedbiomes.world.features.BigMapleTreeFeature;
import com.abdmoh.improvedbiomes.world.features.CherryTreeFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.SavannaTreeFeature;
import net.minecraft.world.gen.feature.TreeFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class CherryTree extends Tree {
    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
        return (AbstractTreeFeature)(random.nextInt(10) == 0 ? new BigCherryTreeFeature(NoFeatureConfig::deserialize, true) : new CherryTreeFeature(NoFeatureConfig::deserialize,true));
    }
}
