package com.abdmoh.improvedbiomes.blocks;

import com.abdmoh.improvedbiomes.blocks.trees.MapleTree;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MapleSapling extends SaplingBlock {
    public MapleSapling() {
        super(new MapleTree(), Properties.create(Material.PLANTS)
                .sound(SoundType.PLANT)
                .hardnessAndResistance(0.0F)
                .doesNotBlockMovement()
                .tickRandomly()
        );
        setRegistryName("maple_sapling");
    }
}
