package com.abdmoh.improvedbiomes.setup;

import com.abdmoh.improvedbiomes.ImprovedBiomes;
import com.abdmoh.improvedbiomes.blocks.*;
import com.abdmoh.improvedbiomes.init.ModBiomes;
import com.abdmoh.improvedbiomes.init.ModBlocks;
import com.abdmoh.improvedbiomes.world.gen.biomes.MapleForestBiome;
import com.abdmoh.improvedbiomes.world.gen.biomes.PumpkinPlainsBiome;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
        event.getRegistry().registerAll(
                new MapleLeaves(),
                new AutumnBirchLeaves(),
                new BaobabLeaves(),
                new MapleSapling(),
                new AutumnBirchSapling(),
                new BaobabSapling(),
                new MaplePlanks(),
                new BaobabPlanks(),
                new MapleLog(),
                new BaobabLog(),
                new StrippedMapleLog(),
                new StrippedBaobabLog(),
                new StrippedMapleWood(),
                new StrippedBaobabWood(),
                new MapleWood(),
                new BaobabWood()
        );
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        Item.Properties buildingBlocks = new Item.Properties().group(ItemGroup.BUILDING_BLOCKS);
        Item.Properties decorations = new Item.Properties().group(ItemGroup.DECORATIONS);

        event.getRegistry().registerAll(
                new BlockItem(ModBlocks.MAPLE_LEAVES, decorations).setRegistryName("maple_leaves"),
                new BlockItem(ModBlocks.AUTUMN_BIRCH_LEAVES, decorations).setRegistryName("autumn_birch_leaves"),
                new BlockItem(ModBlocks.BAOBAB_LEAVES, decorations).setRegistryName("baobab_leaves"),
                new BlockItem(ModBlocks.MAPLE_SAPLING, decorations).setRegistryName("maple_sapling"),
                new BlockItem(ModBlocks.AUTUMN_BIRCH_SAPLING, decorations).setRegistryName("autumn_birch_sapling"),
                new BlockItem(ModBlocks.BAOBAB_SAPLING, decorations).setRegistryName("baobab_sapling"),
                new BlockItem(ModBlocks.MAPLE_PLANKS, buildingBlocks).setRegistryName("maple_planks"),
                new BlockItem(ModBlocks.BAOBAB_PLANKS, buildingBlocks).setRegistryName("baobab_planks"),
                new BlockItem(ModBlocks.MAPLE_LOG, buildingBlocks).setRegistryName("maple_log"),
                new BlockItem(ModBlocks.BAOBAB_LOG, buildingBlocks).setRegistryName("baobab_log"),
                new BlockItem(ModBlocks.STRIPPED_MAPLE_LOG, buildingBlocks).setRegistryName("stripped_maple_log"),
                new BlockItem(ModBlocks.STRIPPED_BAOBAB_LOG, buildingBlocks).setRegistryName("stripped_baobab_log"),
                new BlockItem(ModBlocks.STRIPPED_MAPLE_WOOD, buildingBlocks).setRegistryName("stripped_maple_wood"),
                new BlockItem(ModBlocks.STRIPPED_BAOBAB_WOOD, buildingBlocks).setRegistryName("stripped_baobab_wood"),
                new BlockItem(ModBlocks.MAPLE_WOOD, buildingBlocks).setRegistryName("maple_wood"),
                new BlockItem(ModBlocks.BAOBAB_WOOD, buildingBlocks).setRegistryName("baobab_wood")
        );
    }

    @SubscribeEvent
    public static void onBiomesRegistry(final RegistryEvent.Register<Biome> event) {
        event.getRegistry().registerAll(
                ModBiomes.MAPLE_FOREST = new MapleForestBiome(),
                ModBiomes.PUMPKIN_PLAINS = new PumpkinPlainsBiome()
        );

        ModBiomes.registerBiomes();
    }
}