package com.abdmoh.improvedbiomes.world.features;

import com.abdmoh.improvedbiomes.init.ModBlocks;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LogBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.HugeTreesFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class BaobabTreeFeature extends HugeTreesFeature<NoFeatureConfig> {
    public BaobabTreeFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn, boolean doBlockNotifyOnPlace, int baseHeightIn, int extraRandomHeightIn, BlockState trunkIn, BlockState leafIn) {
        super(configFactoryIn, doBlockNotifyOnPlace, baseHeightIn, extraRandomHeightIn, trunkIn, leafIn);
        setSapling(ModBlocks.BAOBAB_SAPLING);
    }

    @Override
    public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox boundsIn) {

        int i = this.getHeight(rand);

        //places branches and leaves and roots
        for(int j = position.getY() + i - 2 - rand.nextInt(2); j > position.getY() + i / 2; j -= 1 + rand.nextInt(2)) {
            float f = rand.nextFloat() * ((float)Math.PI * 2F) * 10;
            int k = position.getX() + (int)(0.5F + MathHelper.cos(f) * 4.0F);
            int l = position.getZ() + (int)(0.5F + MathHelper.sin(f) * 4.0F);

            float f2 = rand.nextFloat() * ((float)Math.PI * 2F);
            int k2 = position.getX() + (int)(0.5F + MathHelper.cos(f2) * 4.0F);
            int l2 = position.getZ() + (int)(0.5F + MathHelper.sin(f2) * 4.0F);

            for(int i1 = 0; i1 < 7; ++i1) {
                k = position.getX() + (int)(1.5F + MathHelper.cos(f) * (float)i1);
                l = position.getZ() + (int)(1.5F + MathHelper.sin(f) * (float)i1);

                //places branches
                BlockPos bP = new BlockPos(k, j + i1 / 2, l);
                this.setLogState(changedBlocks, worldIn, bP, this.trunk.with(LogBlock.AXIS, this.getLogAxis(position, bP)), boundsIn);

                //places roots
                //BlockPos bP2 = new BlockPos(k2, position.getY(), l2);
                //this.setLogState(changedBlocks, worldIn, bP2, this.trunk.with(LogBlock.AXIS, this.getLogAxis(position, bP2)), boundsIn);
            }

            int j2 = 1 + rand.nextInt(2);
            int j1 = j;

            //places leaves on the branches
            for(int k1 = j - j2; k1 <= j1; ++k1) {
                int l1 = k1 - j1;
                this.func_222838_b(worldIn, new BlockPos(k, k1 + 5, l), 1 - l1, boundsIn, changedBlocks);
            }
        }

        //places trunk of tree
        for(int i2 = 0; i2 < i; ++i2) {
            if (i2 < i - 1) {
                //places north west log block
                BlockPos blockPos = position.up(i2);
                if (checkBlockPos(worldIn, blockPos)) {
                    this.setLogState(changedBlocks, worldIn, blockPos, this.trunk, boundsIn);
                }

                //places north log block
                BlockPos blockPos1 = blockPos.east();
                if (checkBlockPos(worldIn, blockPos1)) {
                    this.setLogState(changedBlocks, worldIn, blockPos1, this.trunk, boundsIn);
                }

                //places middle log block
                BlockPos blockPos2 = blockPos.south().east();
                if (checkBlockPos(worldIn, blockPos2)) {
                    this.setLogState(changedBlocks, worldIn, blockPos2, this.trunk, boundsIn);
                }

                //places west log block
                BlockPos blockPos3 = blockPos.south();
                if (checkBlockPos(worldIn, blockPos3)) {
                    this.setLogState(changedBlocks, worldIn, blockPos3, this.trunk, boundsIn);
                }

                //places north east log block
                BlockPos blockPos4 = blockPos.east().east();
                if (checkBlockPos(worldIn, blockPos4)) {
                    this.setLogState(changedBlocks, worldIn, blockPos4, this.trunk, boundsIn);
                }

                //places east log block
                BlockPos blockPos5 = blockPos.south().east().east();
                if (checkBlockPos(worldIn, blockPos5)) {
                    this.setLogState(changedBlocks, worldIn, blockPos5, this.trunk, boundsIn);
                }

                //places south west log block
                BlockPos blockPos6 = blockPos.south().south();
                if (checkBlockPos(worldIn, blockPos6)) {
                    this.setLogState(changedBlocks, worldIn, blockPos6, this.trunk, boundsIn);
                }

                //places south log block
                BlockPos blockPos7 = blockPos.south().south().east();
                if (checkBlockPos(worldIn, blockPos7)) {
                    this.setLogState(changedBlocks, worldIn, blockPos7, this.trunk, boundsIn);
                }

                //places south east log block
                BlockPos blockPos8 = blockPos.south().south().east().east();
                if (checkBlockPos(worldIn, blockPos8)) {
                    this.setLogState(changedBlocks, worldIn, blockPos8, this.trunk, boundsIn);
                }
            }
        }
        return true;
    }

    //makes branches use sideways logs instead of vertical logs
    private Direction.Axis getLogAxis(BlockPos position1, BlockPos position2) {
        Direction.Axis direction$axis = Direction.Axis.Y;
        int i = Math.abs(position2.getX() - position1.getX());
        int j = Math.abs(position2.getZ() - position1.getZ());
        int k = Math.max(i, j);
        if (k > 0) {
            if (i == k) {
                direction$axis = Direction.Axis.X;
            } else if (j == k) {
                direction$axis = Direction.Axis.Z;
            }
        }

        return direction$axis;
    }

    private static boolean checkBlockPos(IWorldGenerationBaseReader p_214587_0_, BlockPos p_214587_1_) {
        if (!(p_214587_0_ instanceof net.minecraft.world.IWorldReader)) // FORGE: Redirect to state method when possible
            return p_214587_0_.hasBlockState(p_214587_1_, (p_214573_0_) -> {
                Block block = p_214573_0_.getBlock();
                return p_214573_0_.isAir() || p_214573_0_.isIn(BlockTags.LEAVES) || block == Blocks.GRASS_BLOCK || Block.isDirt(block) || block.isIn(BlockTags.LOGS) || block.isIn(BlockTags.SAPLINGS) || block == Blocks.VINE;
            });
        else return p_214587_0_.hasBlockState(p_214587_1_, state -> state.canBeReplacedByLogs((net.minecraft.world.IWorldReader)p_214587_0_, p_214587_1_));
    }
}
