package com.abdmoh.improvedbiomes.init;

import com.abdmoh.improvedbiomes.blocks.saplings.*;
import net.minecraft.block.*;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.potion.Effects;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;

@ObjectHolder("improvedbiomes")
public class ModBlocks {
    //building blocks tab
    public static Block CHERRY_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F)).setRegistryName("cherry_planks");
    public static Block MAPLE_PLANKS = new Block(Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F)).setRegistryName("maple_planks");
    public static Block BAOBAB_PLANKS = new Block(Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F)).setRegistryName("baobab_planks");
    public static Block CHERRY_LOG = new LogBlock(MaterialColor.GRAY, Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("cherry_log");
    public static Block MAPLE_LOG = new LogBlock(MaterialColor.BROWN, Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("maple_log");
    public static Block BAOBAB_LOG = new LogBlock(MaterialColor.DIRT, Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("baobab_log");
    public static Block STRIPPED_CHERRY_LOG = new LogBlock(MaterialColor.RED_TERRACOTTA, Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("stripped_cherry_log");
    public static Block STRIPPED_MAPLE_LOG = new LogBlock(MaterialColor.SAND, Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("stripped_maple_log");
    public static Block STRIPPED_BAOBAB_LOG = new LogBlock(MaterialColor.ORANGE_TERRACOTTA, Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("stripped_baobab_log");
    public static Block STRIPPED_CHERRY_WOOD = new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("stripped_cherry_wood");
    public static Block STRIPPED_MAPLE_WOOD = new RotatedPillarBlock(Properties.create(Material.WOOD, MaterialColor.SAND).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("stripped_maple_wood");
    public static Block STRIPPED_BAOBAB_WOOD = new RotatedPillarBlock(Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("stripped_baobab_wood");
    public static Block CHERRY_WOOD = new RotatedPillarBlock(Properties.create(Material.WOOD, MaterialColor.GRAY).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("cherry_wood");
    public static Block MAPLE_WOOD = new RotatedPillarBlock(Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("maple_wood");
    public static Block BAOBAB_WOOD = new RotatedPillarBlock(Properties.create(Material.WOOD, MaterialColor.DIRT).sound(SoundType.WOOD).hardnessAndResistance(2.0F)).setRegistryName("baobab_wood");
    public static Block MAPLE_SLAB = new SlabBlock(Properties.create(Material.WOOD, MaterialColor.SAND).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("maple_slab");

    //decorations tab
    public static Block CHERRY_SAPLING = new CherrySapling().setRegistryName("cherry_sapling");
    public static Block MAPLE_SAPLING = new MapleSapling().setRegistryName("maple_sapling");
    public static Block AUTUMN_BIRCH_SAPLING = new AutumnBirchSapling().setRegistryName("autumn_birch_sapling");
    public static Block BAOBAB_SAPLING = new BaobabSapling().setRegistryName("baobab_sapling");
    public static Block CHERRY_LEAVES = new LeavesBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName("cherry_leaves");
    public static Block MAPLE_LEAVES = new LeavesBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName("maple_leaves");
    public static Block AUTUMN_BIRCH_LEAVES = new LeavesBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName("autumn_birch_leaves");
    public static Block BAOBAB_LEAVES = new LeavesBlock(Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName("baobab_leaves");
    public static Block PANSY = new FlowerBlock(Effects.INSTANT_HEALTH, 1, Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)).setRegistryName("pansy");
    public static Block CROCUS = new FlowerBlock(Effects.HASTE, 9, Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)).setRegistryName("crocus");
    public static Block WHITE_COSMOS = new FlowerBlock(Effects.NAUSEA, 12, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)).setRegistryName("white_cosmos");
    public static Block CRIMSON_COSMOS = new FlowerBlock(Effects.NAUSEA, 12, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)).setRegistryName("crimson_cosmos");
    public static Block ORANGE_COSMOS = new FlowerBlock(Effects.NAUSEA, 12, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)).setRegistryName("orange_cosmos");
    public static Block MAGENTA_COSMOS = new FlowerBlock(Effects.NAUSEA, 12, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)).setRegistryName("magenta_cosmos");
}
