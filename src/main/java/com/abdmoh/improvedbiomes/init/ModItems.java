package com.abdmoh.improvedbiomes.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder("improvedbiomes")
public class ModItems {
    //building blocks
    public static final Item CHERRY_PLANKS = new BlockItem(ModBlocks.CHERRY_PLANKS, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cherry_planks");
    public static final Item MAPLE_PLANKS = new BlockItem(ModBlocks.MAPLE_PLANKS, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("maple_planks");
    public static final Item BAOBAB_PLANKS = new BlockItem(ModBlocks.BAOBAB_PLANKS, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("baobab_planks");
    public static final Item CHERRY_LOG = new BlockItem(ModBlocks.CHERRY_LOG, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cherry_log");
    public static final Item MAPLE_LOG = new BlockItem(ModBlocks.MAPLE_LOG, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("maple_log");
    public static final Item BAOBAB_LOG = new BlockItem(ModBlocks.BAOBAB_LOG, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("baobab_log");
    public static final Item STRIPPED_CHERRY_LOG = new BlockItem(ModBlocks.STRIPPED_CHERRY_LOG, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_cherry_log");
    public static final Item STRIPPED_MAPLE_LOG = new BlockItem(ModBlocks.STRIPPED_MAPLE_LOG, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_maple_log");
    public static final Item STRIPPED_BAOBAB_LOG = new BlockItem(ModBlocks.STRIPPED_BAOBAB_LOG, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_baobab_log");
    public static final Item STRIPPED_CHERRY_WOOD = new BlockItem(ModBlocks.STRIPPED_CHERRY_WOOD, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_cherry_wood");
    public static final Item STRIPPED_MAPLE_WOOD = new BlockItem(ModBlocks.STRIPPED_MAPLE_WOOD, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_maple_wood");
    public static final Item STRIPPED_BAOBAB_WOOD = new BlockItem(ModBlocks.STRIPPED_BAOBAB_WOOD, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("stripped_baobab_wood");
    public static final Item CHERRY_WOOD = new BlockItem(ModBlocks.CHERRY_WOOD, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("cherry_wood");
    public static final Item MAPLE_WOOD = new BlockItem(ModBlocks.MAPLE_WOOD, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("maple_wood");
    public static final Item BAOBAB_WOOD = new BlockItem(ModBlocks.BAOBAB_WOOD, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("baobab_wood");
    public static final Item MAPLE_SLAB = new BlockItem(ModBlocks.MAPLE_SLAB, new Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("maple_slab");

    //decorations
    public static final Item CHERRY_SAPLING = new BlockItem(ModBlocks.CHERRY_SAPLING, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("cherry_sapling");
    public static final Item MAPLE_SAPLING = new BlockItem(ModBlocks.MAPLE_SAPLING, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("maple_sapling");
    public static final Item AUTUMN_BIRCH_SAPLING = new BlockItem(ModBlocks.AUTUMN_BIRCH_SAPLING, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("autumn_birch_sapling");
    public static final Item BAOBAB_SAPLING = new BlockItem(ModBlocks.BAOBAB_SAPLING, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("baobab_sapling");
    public static final Item CHERRY_LEAVES = new BlockItem(ModBlocks.CHERRY_LEAVES, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("cherry_leaves");
    public static final Item MAPLE_LEAVES = new BlockItem(ModBlocks.MAPLE_LEAVES, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("maple_leaves");
    public static final Item AUTUMN_BIRCH_LEAVES = new BlockItem(ModBlocks.AUTUMN_BIRCH_LEAVES, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("autumn_birch_leaves");
    public static final Item BAOBAB_LEAVES = new BlockItem(ModBlocks.BAOBAB_LEAVES, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("baobab_leaves");
    public static final Item PANSY = new BlockItem(ModBlocks.PANSY, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("pansy");
    public static final Item CROCUS = new BlockItem(ModBlocks.CROCUS, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("crocus");
    public static final Item WHITE_COSMOS = new BlockItem(ModBlocks.WHITE_COSMOS, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("white_cosmos");
    public static final Item CRIMSON_COSMOS = new BlockItem(ModBlocks.CRIMSON_COSMOS, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("crimson_cosmos");
    public static final Item ORANGE_COSMOS = new BlockItem(ModBlocks.ORANGE_COSMOS, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("orange_cosmos");
    public static final Item MAGENTA_COSMOS = new BlockItem(ModBlocks.MAGENTA_COSMOS, new Properties().group(ItemGroup.DECORATIONS)).setRegistryName("magenta_cosmos");

    //foodstuffs
    public static final Item CHERRIES = new Item(new Properties().group(ItemGroup.FOOD).food(ModFoods.CHERRIES)).setRegistryName("cherries");
}
