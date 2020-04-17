package com.abdmoh.improvedbiomes.blocks;

import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class StrippedMapleWood extends RotatedPillarBlock {
    public StrippedMapleWood() {
        super(Properties.create(Material.WOOD, MaterialColor.DIRT)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(2.0F)
        );
        setRegistryName("stripped_maple_wood");
    }
}
