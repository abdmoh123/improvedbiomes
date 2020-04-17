package com.abdmoh.improvedbiomes.blocks;

import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AutumnBirchLeaves extends LeavesBlock {
    public AutumnBirchLeaves() {
        super(Properties.create(Material.LEAVES)
                .hardnessAndResistance(0.2F)
                .tickRandomly()
                .sound(SoundType.PLANT)
        );
        setRegistryName("autumn_birch_leaves");
    }
}
