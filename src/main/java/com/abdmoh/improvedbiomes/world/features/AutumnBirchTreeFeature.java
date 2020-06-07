package com.abdmoh.improvedbiomes.world.features;

import com.abdmoh.improvedbiomes.init.ModBlocks;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.common.IPlantable;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class AutumnBirchTreeFeature extends AbstractTreeFeature<NoFeatureConfig> {
    private static final BlockState LOG = Blocks.BIRCH_LOG.getDefaultState();
    private static final BlockState LEAF = ModBlocks.AUTUMN_BIRCH_LEAVES.getDefaultState();
    private final boolean useExtraRandomHeight;

    public AutumnBirchTreeFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn, boolean doBlockNotifyIn, boolean extraRandomHeightIn) {
        super(configIn, doBlockNotifyIn);
        this.useExtraRandomHeight = extraRandomHeightIn;
    }

    @Override
    public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox boundsIn) {
        int i = rand.nextInt(3) + 5;
        if (this.useExtraRandomHeight) {
            i += rand.nextInt(7);
        }

        boolean flag = true;
        if (position.getY() >= 1 && position.getY() + i + 1 <= worldIn.getMaxHeight()) {
            int l1;
            int l2;
            int i3;
            for(l1 = position.getY(); l1 <= position.getY() + 1 + i; ++l1) {
                int k = 1;
                if (l1 == position.getY()) {
                    k = 0;
                }

                if (l1 >= position.getY() + 1 + i - 2) {
                    k = 2;
                }

                BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

                for(l2 = position.getX() - k; l2 <= position.getX() + k && flag; ++l2) {
                    for(i3 = position.getZ() - k; i3 <= position.getZ() + k && flag; ++i3) {
                        if (l1 >= 0 && l1 < worldIn.getMaxHeight()) {
                            if (!func_214587_a(worldIn, blockpos$mutableblockpos.setPos(l2, l1, i3))) {
                                flag = false;
                            }
                        } else {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag) {
                return false;
            } else if (isSoil(worldIn, position.down(), this.getSapling()) && position.getY() < worldIn.getMaxHeight() - i - 1) {
                this.setDirtAt(worldIn, position.down(), position);

                for(l1 = position.getY() - 3 + i; l1 <= position.getY() + i; ++l1) {
                    int j2 = l1 - (position.getY() + i);
                    int k2 = 1 - j2 / 2;

                    for(l2 = position.getX() - k2; l2 <= position.getX() + k2; ++l2) {
                        i3 = l2 - position.getX();

                        for(int j1 = position.getZ() - k2; j1 <= position.getZ() + k2; ++j1) {
                            int k1 = j1 - position.getZ();
                            if (Math.abs(i3) != k2 || Math.abs(k1) != k2 || rand.nextInt(2) != 0 && j2 != 0) {
                                BlockPos blockpos = new BlockPos(l2, l1, j1);
                                if (isAirOrLeaves(worldIn, blockpos)) {
                                    this.setLogState(changedBlocks, worldIn, blockpos, LEAF, boundsIn);
                                }
                            }
                        }
                    }
                }

                for(l1 = 0; l1 < i; ++l1) {
                    if (isAirOrLeaves(worldIn, position.up(l1))) {
                        this.setLogState(changedBlocks, worldIn, position.up(l1), LOG, boundsIn);
                    }
                }

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
