package com.abdmoh.improvedbiomes.world.features;

import com.abdmoh.improvedbiomes.init.ModBlocks;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class CherryTreeFeature extends AbstractTreeFeature<NoFeatureConfig> {
    private static final BlockState LOG = ModBlocks.CHERRY_LOG.getDefaultState();
    private static final BlockState LEAVES = ModBlocks.CHERRY_LEAVES.getDefaultState();

    public CherryTreeFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51443_1_, boolean p_i51443_2_) {
        super(p_i51443_1_, p_i51443_2_);
    }

    public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox boundsIn) {
        int i = rand.nextInt(3) + rand.nextInt(3) + 5;
        boolean flag = true;
        if (position.getY() >= 1 && position.getY() + i + 1 <= worldIn.getMaxHeight()) {
            int i3;
            int j3;
            for(int j = position.getY(); j <= position.getY() + 1 + i; ++j) {
                int k = 1;
                if (j == position.getY()) {
                    k = 0;
                }

                if (j >= position.getY() + 1 + i - 2) {
                    k = 2;
                }

                BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

                for(i3 = position.getX() - k; i3 <= position.getX() + k && flag; ++i3) {
                    for(j3 = position.getZ() - k; j3 <= position.getZ() + k && flag; ++j3) {
                        if (j >= 0 && j < worldIn.getMaxHeight()) {
                            if (!func_214587_a(worldIn, blockpos$mutableblockpos.setPos(i3, j, j3))) {
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
                Direction direction = Direction.Plane.HORIZONTAL.random(rand);
                int k2 = i - rand.nextInt(4) - 1;
                int l2 = 3 - rand.nextInt(3);
                i3 = position.getX();
                j3 = position.getZ();
                int j1 = 0;

                int l3;
                for(int k1 = 0; k1 < i; ++k1) {
                    l3 = position.getY() + k1;
                    if (k1 >= k2 && l2 > 0) {
                        i3 += direction.getXOffset();
                        j3 += direction.getZOffset();
                        --l2;
                    }

                    BlockPos blockpos = new BlockPos(i3, l3, j3);
                    if (isAirOrLeaves(worldIn, blockpos)) {
                        this.func_208532_a(changedBlocks, worldIn, blockpos, boundsIn);
                        j1 = l3;
                    }
                }

                BlockPos blockpos2 = new BlockPos(i3, j1, j3);

                int i4;
                for(l3 = -3; l3 <= 3; ++l3) {
                    for(i4 = -3; i4 <= 3; ++i4) {
                        if (Math.abs(l3) != 3 || Math.abs(i4) != 3) {
                            this.placeLeafAt(changedBlocks, worldIn, blockpos2.add(l3, 0, i4), boundsIn);
                        }
                    }
                }

                blockpos2 = blockpos2.up();

                for(l3 = -1; l3 <= 1; ++l3) {
                    for(i4 = -1; i4 <= 1; ++i4) {
                        this.placeLeafAt(changedBlocks, worldIn, blockpos2.add(l3, 0, i4), boundsIn);
                    }
                }

                this.placeLeafAt(changedBlocks, worldIn, blockpos2.east(2), boundsIn);
                this.placeLeafAt(changedBlocks, worldIn, blockpos2.west(2), boundsIn);
                this.placeLeafAt(changedBlocks, worldIn, blockpos2.south(2), boundsIn);
                this.placeLeafAt(changedBlocks, worldIn, blockpos2.north(2), boundsIn);
                i3 = position.getX();
                j3 = position.getZ();
                Direction direction1 = Direction.Plane.HORIZONTAL.random(rand);
                if (direction1 != direction) {
                    i4 = k2 - rand.nextInt(2) - 1;
                    int l4 = 1 + rand.nextInt(3);
                    j1 = 0;

                    int j5;
                    for(int i2 = i4; i2 < i && l4 > 0; --l4) {
                        if (i2 >= 1) {
                            j5 = position.getY() + i2;
                            i3 += direction1.getXOffset();
                            j3 += direction1.getZOffset();
                            BlockPos blockpos1 = new BlockPos(i3, j5, j3);
                            if (isAirOrLeaves(worldIn, blockpos1)) {
                                this.func_208532_a(changedBlocks, worldIn, blockpos1, boundsIn);
                                j1 = j5;
                            }
                        }

                        ++i2;
                    }

                    if (j1 > 0) {
                        BlockPos blockpos3 = new BlockPos(i3, j1, j3);

                        int l5;
                        for(j5 = -2; j5 <= 2; ++j5) {
                            for(l5 = -2; l5 <= 2; ++l5) {
                                if (Math.abs(j5) != 2 || Math.abs(l5) != 2) {
                                    this.placeLeafAt(changedBlocks, worldIn, blockpos3.add(j5, 0, l5), boundsIn);
                                }
                            }
                        }

                        blockpos3 = blockpos3.up();

                        for(j5 = -1; j5 <= 1; ++j5) {
                            for(l5 = -1; l5 <= 1; ++l5) {
                                this.placeLeafAt(changedBlocks, worldIn, blockpos3.add(j5, 0, l5), boundsIn);
                            }
                        }
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

    private void func_208532_a(Set<BlockPos> p_208532_1_, IWorldWriter p_208532_2_, BlockPos p_208532_3_, MutableBoundingBox p_208532_4_) {
        this.setLogState(p_208532_1_, p_208532_2_, p_208532_3_, LOG, p_208532_4_);
    }

    private void placeLeafAt(Set<BlockPos> worldIn, IWorldGenerationReader pos, BlockPos p_175924_3_, MutableBoundingBox p_175924_4_) {
        if (isAirOrLeaves(pos, p_175924_3_)) {
            this.setLogState(worldIn, pos, p_175924_3_, LEAVES, p_175924_4_);
        }

    }
}
