package com.abdmoh.improvedbiomes.blocks.saplings;

import com.abdmoh.improvedbiomes.blocks.trees.CherryTree;
import com.abdmoh.improvedbiomes.blocks.trees.MapleTree;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CherrySapling extends SaplingBlock {
    public CherrySapling() {
        super(new CherryTree(), Properties.create(Material.PLANTS)
                .sound(SoundType.PLANT)
                .hardnessAndResistance(0.0F)
                .doesNotBlockMovement()
                .tickRandomly()
        );
    }
}
