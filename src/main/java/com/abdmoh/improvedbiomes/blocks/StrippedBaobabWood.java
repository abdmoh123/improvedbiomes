package com.abdmoh.improvedbiomes.blocks;

import net.minecraft.block.LogBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class StrippedBaobabWood extends RotatedPillarBlock {
    public StrippedBaobabWood() {
        super(Properties.create(Material.WOOD, MaterialColor.DIRT)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(2.0F)
        );
        setRegistryName("stripped_baobab_wood");
    }
}
