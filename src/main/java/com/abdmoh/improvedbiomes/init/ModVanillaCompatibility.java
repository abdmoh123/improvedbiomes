package com.abdmoh.improvedbiomes.init;

import com.abdmoh.improvedbiomes.ImprovedBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.block.FireBlock;
import net.minecraft.item.AxeItem;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class ModVanillaCompatibility {

    public static void init() {
        //makes blocks strippable
        registerStrippableBlocks(ModBlocks.BAOBAB_LOG, ModBlocks.STRIPPED_BAOBAB_LOG);
        registerStrippableBlocks(ModBlocks.BAOBAB_WOOD, ModBlocks.STRIPPED_BAOBAB_WOOD);
        registerStrippableBlocks(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
        registerStrippableBlocks(ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_WOOD);
        registerStrippableBlocks(ModBlocks.CHERRY_LOG, ModBlocks.STRIPPED_CHERRY_LOG);
        registerStrippableBlocks(ModBlocks.CHERRY_WOOD, ModBlocks.STRIPPED_CHERRY_WOOD);

        //makes blocks flammable
        registerFlammableBlocks(ModBlocks.BAOBAB_LEAVES, 30, 60);
        registerFlammableBlocks(ModBlocks.AUTUMN_BIRCH_LEAVES, 30, 60);
        registerFlammableBlocks(ModBlocks.MAPLE_LEAVES, 30, 60);
        registerFlammableBlocks(ModBlocks.BAOBAB_LOG, 5, 20);
        registerFlammableBlocks(ModBlocks.BAOBAB_PLANKS, 5, 20);
        registerFlammableBlocks(ModBlocks.BAOBAB_WOOD, 5, 20);
        registerFlammableBlocks(ModBlocks.STRIPPED_BAOBAB_LOG, 5, 20);
        registerFlammableBlocks(ModBlocks.STRIPPED_BAOBAB_WOOD, 5, 20);
        registerFlammableBlocks(ModBlocks.MAPLE_LOG, 5, 20);
        registerFlammableBlocks(ModBlocks.MAPLE_PLANKS, 5, 20);
        registerFlammableBlocks(ModBlocks.MAPLE_WOOD, 5, 20);

        //makes blocks compostable
        registerCompostableBlocks(0.3F, ModBlocks.AUTUMN_BIRCH_LEAVES);
        registerCompostableBlocks(0.3F, ModBlocks.BAOBAB_LEAVES);
        registerCompostableBlocks(0.3F, ModBlocks.MAPLE_LEAVES);
        registerCompostableBlocks(0.3F, ModBlocks.BAOBAB_SAPLING);
        registerCompostableBlocks(0.3F, ModBlocks.MAPLE_SAPLING);
        registerCompostableBlocks(0.3F, ModBlocks.AUTUMN_BIRCH_SAPLING);

        ImprovedBiomes.LOGGER.info("VanillaCompat init method registered");
    }

    //registers custom logs as strippable
    public static void registerStrippableBlocks(Block log, Block strippedLog) {
        try {
            //gets the BLOCK_STRIPPING_MAP to use in reflection
            Field field = ObfuscationReflectionHelper.findField(AxeItem.class, "field_203176_a");

            //removes the immutable map's final modifier
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

            //copies contents of the immutable map to a temporary mutable one
            Map<Block, Block> tempMap = new HashMap<>((Map<Block, Block>) field.get(null));

            //adds my custom logs to the map
            tempMap.put(log, strippedLog);
            field.set(null, tempMap);
        }
        catch (IllegalAccessException e) {
            ImprovedBiomes.LOGGER.info("Illegal access");
        }
        catch (NoSuchFieldException e) {
            ImprovedBiomes.LOGGER.info("No such field");
        }
        catch (Exception e) {
            ImprovedBiomes.LOGGER.info("Other exception");
        }
    }

    //registers custom blocks as flammable
    public static void registerFlammableBlocks(Block block, int encouragement, int flammability) {
        FireBlock fireBlock = (FireBlock) Blocks.FIRE;
        fireBlock.setFireInfo(block, encouragement, flammability);
    }

    //registers custom items as compostable
    public static void registerCompostableBlocks(float chance, IItemProvider item) {
        ComposterBlock.CHANCES.put(item.asItem(), chance);
    }
}
