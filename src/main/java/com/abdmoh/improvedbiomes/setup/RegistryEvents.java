package com.abdmoh.improvedbiomes.setup;

import com.abdmoh.improvedbiomes.ImprovedBiomes;
import com.abdmoh.improvedbiomes.init.*;
import com.abdmoh.improvedbiomes.world.gen.biomes.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
// Event bus for receiving Registry Events)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents extends ImprovedBiomes {
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        //registers blocks
        event.getRegistry().registerAll(
                //building blocks
                ModBlocks.CHERRY_PLANKS,
                ModBlocks.MAPLE_PLANKS,
                ModBlocks.BAOBAB_PLANKS,
                ModBlocks.CHERRY_LOG,
                ModBlocks.MAPLE_LOG,
                ModBlocks.BAOBAB_LOG,
                ModBlocks.STRIPPED_CHERRY_LOG,
                ModBlocks.STRIPPED_MAPLE_LOG,
                ModBlocks.STRIPPED_BAOBAB_LOG,
                ModBlocks.STRIPPED_CHERRY_WOOD,
                ModBlocks.STRIPPED_MAPLE_WOOD,
                ModBlocks.STRIPPED_BAOBAB_WOOD,
                ModBlocks.CHERRY_WOOD,
                ModBlocks.MAPLE_WOOD,
                ModBlocks.BAOBAB_WOOD,
                ModBlocks.MAPLE_SLAB,

                //decorations
                ModBlocks.CHERRY_SAPLING,
                ModBlocks.MAPLE_SAPLING,
                ModBlocks.AUTUMN_BIRCH_SAPLING,
                ModBlocks.BAOBAB_SAPLING,
                ModBlocks.CHERRY_LEAVES,
                ModBlocks.MAPLE_LEAVES,
                ModBlocks.AUTUMN_BIRCH_LEAVES,
                ModBlocks.BAOBAB_LEAVES,
                ModBlocks.PANSY,
                ModBlocks.CROCUS,
                ModBlocks.WHITE_COSMOS,
                ModBlocks.CRIMSON_COSMOS,
                ModBlocks.ORANGE_COSMOS,
                ModBlocks.MAGENTA_COSMOS
        );
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        //registers items and block items
        event.getRegistry().registerAll(
                //building blocks
                ModItems.CHERRY_PLANKS,
                ModItems.MAPLE_PLANKS,
                ModItems.BAOBAB_PLANKS,
                ModItems.CHERRY_LOG,
                ModItems.MAPLE_LOG,
                ModItems.BAOBAB_LOG,
                ModItems.STRIPPED_CHERRY_LOG,
                ModItems.STRIPPED_MAPLE_LOG,
                ModItems.STRIPPED_BAOBAB_LOG,
                ModItems.STRIPPED_CHERRY_WOOD,
                ModItems.STRIPPED_MAPLE_WOOD,
                ModItems.STRIPPED_BAOBAB_WOOD,
                ModItems.CHERRY_WOOD,
                ModItems.MAPLE_WOOD,
                ModItems.BAOBAB_WOOD,
                ModItems.MAPLE_SLAB,

                //decoration blocks
                ModItems.CHERRY_SAPLING,
                ModItems.MAPLE_SAPLING,
                ModItems.AUTUMN_BIRCH_SAPLING,
                ModItems.BAOBAB_SAPLING,
                ModItems.CHERRY_LEAVES,
                ModItems.MAPLE_LEAVES,
                ModItems.AUTUMN_BIRCH_LEAVES,
                ModItems.BAOBAB_LEAVES,
                ModItems.PANSY,
                ModItems.CROCUS,
                ModItems.WHITE_COSMOS,
                ModItems.CRIMSON_COSMOS,
                ModItems.ORANGE_COSMOS,
                ModItems.MAGENTA_COSMOS,

                //foodstuffs
                ModItems.CHERRIES
        );
    }

    @SubscribeEvent
    public static void onBiomesRegistry(final RegistryEvent.Register<Biome> event) {
        //registers biomes
        event.getRegistry().registerAll(
                ModBiomes.MAPLE_FOREST = new MapleForestBiome().setRegistryName("maple_forest"),
                ModBiomes.PUMPKIN_PLAINS = new PumpkinPlainsBiome().setRegistryName("pumpkin_plains")
        );
        //allows biomes to spawn
        ModBiomes.registerBiomes();
    }
}