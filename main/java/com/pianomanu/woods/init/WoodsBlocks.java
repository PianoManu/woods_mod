package com.pianomanu.woods.init;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.block.*;
import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.block.trees.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WoodsBlocks {

    private static final Logger logger = LogManager.getLogger(WoodsMain.MOD_ID);

    @Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
    @ObjectHolder(WoodsMain.MOD_ID)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {

            event.getRegistry().registerAll(

                    //wood-like blocks
                    BlockList.mossy_oak_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_oak_planks")),
                    BlockList.mossy_birch_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_birch_planks")),
                    BlockList.mossy_spruce_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_spruce_planks")),
                    BlockList.mossy_jungle_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_jungle_planks")),
                    BlockList.mossy_acacia_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_acacia_planks")),
                    BlockList.mossy_dark_oak_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_dark_oak_planks")),
                    //not sure if it's the right way to cast, but it works... let me know if you have a better solution
                    BlockList.mossy_oak_log = (LogBlock) new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_oak_log")),
                    BlockList.mossy_birch_log = (LogBlock) new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_birch_log")),
                    BlockList.mossy_spruce_log = (LogBlock) new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_spruce_log")),
                    BlockList.mossy_jungle_log = (LogBlock) new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_jungle_log")),
                    BlockList.mossy_acacia_log = (LogBlock) new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_acacia_log")),
                    BlockList.mossy_dark_oak_log = (LogBlock) new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_dark_oak_log")),
                    BlockList.mossy_oak_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_oak_slab")),
                    BlockList.mossy_birch_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_birch_slab")),
                    BlockList.mossy_spruce_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_spruce_slab")),
                    BlockList.mossy_jungle_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_jungle_slab")),
                    BlockList.mossy_acacia_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_acacia_slab")),
                    BlockList.mossy_dark_oak_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_dark_oak_slab")),
                    //created new instances of class WoodsStairs extending StairsBlock, 'cause I'm too stupid to use "new StairsBlock()" correctly...
                    BlockList.mossy_oak_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_oak_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_oak_stairs")),
                    BlockList.mossy_birch_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_birch_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_birch_stairs")),
                    BlockList.mossy_spruce_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_spruce_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_spruce_stairs")),
                    BlockList.mossy_jungle_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_jungle_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_jungle_stairs")),
                    BlockList.mossy_acacia_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_acacia_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_acacia_stairs")),
                    BlockList.mossy_dark_oak_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_dark_oak_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_dark_oak_stairs")),

                    BlockList.mossy_oak_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_oak_fence")),
                    BlockList.mossy_birch_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_birch_fence")),
                    BlockList.mossy_spruce_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_spruce_fence")),
                    BlockList.mossy_jungle_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_jungle_fence")),
                    BlockList.mossy_acacia_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_acacia_fence")),
                    BlockList.mossy_dark_oak_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_dark_oak_fence")),

                    BlockList.mossy_oak_sapling = (WoodsSapling) new WoodsSapling(new MossyOakTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_oak_sapling")),
                    BlockList.mossy_birch_sapling = (WoodsSapling) new WoodsSapling(new MossyBirchTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_birch_sapling")),
                    BlockList.mossy_spruce_sapling = (WoodsSapling) new WoodsSapling(new MossySpruceTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_spruce_sapling")),
                    BlockList.mossy_jungle_sapling = (WoodsSapling) new WoodsSapling(new MossyJungleTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_jungle_sapling")),
                    BlockList.mossy_acacia_sapling = (WoodsSapling) new WoodsSapling(new MossyAcaciaTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_acacia_sapling")),
                    BlockList.mossy_dark_oak_sapling = (WoodsSapling) new WoodsSapling(new MossyDarkOakTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_dark_oak_sapling")),

                    //oreblocks
                    BlockList.epidote_ore = (OreBlock) new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("epidote_ore")),
                    BlockList.fire_opal_ore = (OreBlock) new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("fire_opal_ore")),

                    //wet forest environment blocks
                    BlockList.mossy_dirt = new GrassBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.DIRT).tickRandomly().hardnessAndResistance(0.6F).harvestTool(ToolType.SHOVEL).sound(SoundType.PLANT)).setRegistryName(location("mossy_dirt")),

                    //organic decoration
                    BlockList.moss = (WoodsMossBlock) new WoodsMossBlock(Block.Properties.create(Material.SNOW, MaterialColor.SNOW).tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT)).setRegistryName(location("moss")), //.harvestTool(ToolType.SHOVEL)

                    //blocks with usage
                    BlockList.wooden_box = (InventoryBlock) new InventoryBlock().setRegistryName(location("wooden_box")),

                    BlockList.epidote_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("epidote_block")),
                    BlockList.fire_opal_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("fire_opal_block"))


            );

            logger.info("Registered all blocks from woods_mod.");
        }

        private static ResourceLocation location(String name) {
            return new ResourceLocation(WoodsMain.MOD_ID,name);
        }
    }
}
