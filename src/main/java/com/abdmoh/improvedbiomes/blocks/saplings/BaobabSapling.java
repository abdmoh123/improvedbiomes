package com.abdmoh.improvedbiomes.blocks.saplings;

import com.abdmoh.improvedbiomes.blocks.trees.BaobabTree;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BaobabSapling extends SaplingBlock {
    public BaobabSapling() {
        super(new BaobabTree(), Properties.create(Material.PLANTS)
                .sound(SoundType.PLANT)
                .hardnessAndResistance(0.0F)
                .doesNotBlockMovement()
                .tickRandomly()
        );
    }
}
