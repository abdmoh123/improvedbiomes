package com.abdmoh.improvedbiomes.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class MaplePlanks extends Block {
    public MaplePlanks() {
        super(Properties.create(Material.WOOD, MaterialColor.WOOD)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(2.0F, 3.0F)
        );
        setRegistryName("maple_planks");
    }
}
