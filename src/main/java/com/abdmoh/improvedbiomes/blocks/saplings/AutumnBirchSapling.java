package com.abdmoh.improvedbiomes.blocks.saplings;

import com.abdmoh.improvedbiomes.blocks.trees.AutumnBirchTree;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AutumnBirchSapling extends SaplingBlock {
    public AutumnBirchSapling() {
        super(new AutumnBirchTree(), Properties.create(Material.PLANTS)
                .sound(SoundType.PLANT)
                .hardnessAndResistance(0.0F)
                .doesNotBlockMovement()
                .tickRandomly()
        );
    }
}
