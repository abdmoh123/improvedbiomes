package com.abdmoh.improvedbiomes.world.features;

import com.abdmoh.improvedbiomes.init.ModBlocks;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class PumpkinPlainsFlowersFeature extends FlowersFeature {
    public PumpkinPlainsFlowersFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i49876_1_) {
        super(p_i49876_1_);
    }

    @Override
    public BlockState getRandomFlower(Random random, BlockPos pos) {
        double d0 = Biome.INFO_NOISE.getValue((double)pos.getX() / 200.0D, (double)pos.getZ() / 200.0D);
        if (d0 < -0.8D) {
            int j = random.nextInt(4);
            switch(j) {
                case 0:
                    return ModBlocks.ORANGE_COSMOS.getDefaultState();
                case 1:
                    return ModBlocks.CRIMSON_COSMOS.getDefaultState();
                case 2:
                    return ModBlocks.MAGENTA_COSMOS.getDefaultState();
                case 3:
                default:
                    return ModBlocks.WHITE_COSMOS.getDefaultState();
            }
        } else if (random.nextInt(3) > 0) {
            int i = random.nextInt(4);
            switch(i) {
                case 0:
                    return Blocks.POPPY.getDefaultState();
                case 1:
                    return ModBlocks.PANSY.getDefaultState();
                case 2:
                    return Blocks.OXEYE_DAISY.getDefaultState();
                case 3:
                default:
                    return ModBlocks.CROCUS.getDefaultState();
            }
        } else {
            return Blocks.DANDELION.getDefaultState();
        }
    }
}
