package com.abdmoh.improvedbiomes.blocks;

import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class StrippedMapleLog extends LogBlock {
    public StrippedMapleLog() {
        super(MaterialColor.WOOD, Properties.create(Material.WOOD)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(2.0F)
        );
        setRegistryName("stripped_maple_log");
    }
}
