package com.abdmoh.improvedbiomes.blocks;

import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class StrippedBaobabLog extends LogBlock {
    public StrippedBaobabLog() {
        super(MaterialColor.DIRT, Properties.create(Material.WOOD)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(2.0F)
        );
        setRegistryName("stripped_baobab_log");
    }
}
