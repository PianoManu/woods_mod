package com.pianomanu.woods;

import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.list.ItemList;
import com.pianomanu.woods.woods_blocks.WoodsSapling;
import com.pianomanu.woods.woods_blocks.WoodsStairs;
import com.pianomanu.woods.woods_blocks.trees.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.state.IStateHolder;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(WoodsMain.MOD_ID)
public class WoodsMain {

    public static WoodsMain instance;
    public static final String MOD_ID = "woods_mod";
    private static final Logger logger = LogManager.getLogger(MOD_ID);

    public WoodsMain() {
        instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {
        logger.info("Setup method for woods_mod registered");
    }
    private void clientRegistries(final FMLClientSetupEvent event) {
        logger.info("ClientRegistries method for woods_mod registered");
    }

    @Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
    @ObjectHolder(WoodsMain.MOD_ID)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {

            event.getRegistry().registerAll(

                    ItemList.moss_item = new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64)).setRegistryName(location("moss_item")),
                    ItemList.mossy_stick = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("mossy_stick")),
                    ItemList.epidote_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("epidote_gem")),



                    ItemList.mossy_oak_planks = new BlockItem(BlockList.mossy_oak_planks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_oak_planks")),
                    ItemList.mossy_birch_planks = new BlockItem(BlockList.mossy_birch_planks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_birch_planks")),
                    ItemList.mossy_spruce_planks = new BlockItem(BlockList.mossy_spruce_planks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_spruce_planks")),
                    ItemList.mossy_jungle_planks = new BlockItem(BlockList.mossy_jungle_planks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_jungle_planks")),
                    ItemList.mossy_acacia_planks = new BlockItem(BlockList.mossy_acacia_planks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_acacia_planks")),
                    ItemList.mossy_dark_oak_planks = new BlockItem(BlockList.mossy_dark_oak_planks, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_dark_oak_planks")),

                    ItemList.mossy_oak_log = new BlockItem(BlockList.mossy_oak_log, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_oak_log")),
                    ItemList.mossy_birch_log = new BlockItem(BlockList.mossy_birch_log, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_birch_log")),
                    ItemList.mossy_spruce_log = new BlockItem(BlockList.mossy_spruce_log, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_spruce_log")),
                    ItemList.mossy_jungle_log = new BlockItem(BlockList.mossy_jungle_log, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_jungle_log")),
                    ItemList.mossy_acacia_log = new BlockItem(BlockList.mossy_acacia_log, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_acacia_log")),
                    ItemList.mossy_dark_oak_log = new BlockItem(BlockList.mossy_dark_oak_log, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_dark_oak_log")),

                    ItemList.mossy_oak_slab = new BlockItem(BlockList.mossy_oak_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_oak_slab")),
                    ItemList.mossy_birch_slab = new BlockItem(BlockList.mossy_birch_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_birch_slab")),
                    ItemList.mossy_spruce_slab = new BlockItem(BlockList.mossy_spruce_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_spruce_slab")),
                    ItemList.mossy_jungle_slab = new BlockItem(BlockList.mossy_jungle_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_jungle_slab")),
                    ItemList.mossy_acacia_slab = new BlockItem(BlockList.mossy_acacia_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_acacia_slab")),
                    ItemList.mossy_dark_oak_slab = new BlockItem(BlockList.mossy_dark_oak_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_dark_oak_slab")),

                    ItemList.mossy_oak_stairs = new BlockItem(BlockList.mossy_oak_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_oak_stairs")),
                    ItemList.mossy_birch_stairs = new BlockItem(BlockList.mossy_birch_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_birch_stairs")),
                    ItemList.mossy_spruce_stairs = new BlockItem(BlockList.mossy_spruce_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_spruce_stairs")),
                    ItemList.mossy_jungle_stairs = new BlockItem(BlockList.mossy_jungle_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_jungle_stairs")),
                    ItemList.mossy_acacia_stairs = new BlockItem(BlockList.mossy_acacia_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_acacia_stairs")),
                    ItemList.mossy_dark_oak_stairs = new BlockItem(BlockList.mossy_dark_oak_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_dark_oak_stairs")),

                    ItemList.mossy_oak_fence = new BlockItem(BlockList.mossy_oak_fence, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_oak_fence")),
                    ItemList.mossy_birch_fence = new BlockItem(BlockList.mossy_birch_fence, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_birch_fence")),
                    ItemList.mossy_spruce_fence = new BlockItem(BlockList.mossy_spruce_fence, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_spruce_fence")),
                    ItemList.mossy_jungle_fence = new BlockItem(BlockList.mossy_jungle_fence, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_jungle_fence")),
                    ItemList.mossy_acacia_fence = new BlockItem(BlockList.mossy_acacia_fence, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_acacia_fence")),
                    ItemList.mossy_dark_oak_fence = new BlockItem(BlockList.mossy_dark_oak_fence, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_dark_oak_fence")),

                    ItemList.mossy_oak_sapling = new BlockItem(BlockList.mossy_oak_sapling, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_oak_sapling")),
                    ItemList.mossy_birch_sapling = new BlockItem(BlockList.mossy_birch_sapling, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_birch_sapling")),
                    ItemList.mossy_spruce_sapling = new BlockItem(BlockList.mossy_spruce_sapling, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_spruce_sapling")),
                    ItemList.mossy_jungle_sapling = new BlockItem(BlockList.mossy_jungle_sapling, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_jungle_sapling")),
                    ItemList.mossy_acacia_sapling = new BlockItem(BlockList.mossy_acacia_sapling, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_acacia_sapling")),
                    ItemList.mossy_dark_oak_sapling = new BlockItem(BlockList.mossy_dark_oak_sapling, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("mossy_dark_oak_sapling")),

                    ItemList.epidote_ore = new BlockItem(BlockList.epidote_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("epidote_ore"))


            );

            logger.info("Registered all items from woods_mod.");
        }

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {

            event.getRegistry().registerAll(

                    BlockList.mossy_oak_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_oak_planks")),
                    BlockList.mossy_birch_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_birch_planks")),
                    BlockList.mossy_spruce_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_spruce_planks")),
                    BlockList.mossy_jungle_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_jungle_planks")),
                    BlockList.mossy_acacia_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_acacia_planks")),
                    BlockList.mossy_dark_oak_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("mossy_dark_oak_planks")),
                    //not sure if it's the right way to cast, but it works... let me know if you have a better solution
                    BlockList.mossy_oak_log = (LogBlock) new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location( "mossy_oak_log")),
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
                    BlockList.mossy_oak_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_oak_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_oak_stairs")),
                    BlockList.mossy_birch_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_birch_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_birch_stairs")),
                    BlockList.mossy_spruce_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_spruce_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_spruce_stairs")),
                    BlockList.mossy_jungle_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_jungle_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_jungle_stairs")),
                    BlockList.mossy_acacia_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_acacia_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_acacia_stairs")),
                    BlockList.mossy_dark_oak_stairs = (StairsBlock) new WoodsStairs(BlockList.mossy_dark_oak_planks.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_dark_oak_stairs")),

                    BlockList.mossy_oak_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_oak_fence")),
                    BlockList.mossy_birch_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_birch_fence")),
                    BlockList.mossy_spruce_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_spruce_fence")),
                    BlockList.mossy_jungle_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_jungle_fence")),
                    BlockList.mossy_acacia_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_acacia_fence")),
                    BlockList.mossy_dark_oak_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0f).harvestLevel(1).harvestTool(ToolType.AXE)).setRegistryName(location("mossy_dark_oak_fence")),

                    BlockList.mossy_oak_sapling = (WoodsSapling) new WoodsSapling(new MossyOakTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_oak_sapling")),
                    BlockList.mossy_birch_sapling = (WoodsSapling) new WoodsSapling(new MossyBirchTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_birch_sapling")),
                    BlockList.mossy_spruce_sapling = (WoodsSapling) new WoodsSapling(new MossySpruceTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_spruce_sapling")),
                    BlockList.mossy_jungle_sapling = (WoodsSapling) new WoodsSapling(new MossyJungleTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_jungle_sapling")),
                    BlockList.mossy_acacia_sapling = (WoodsSapling) new WoodsSapling(new MossyAcaciaTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_acacia_sapling")),
                    BlockList.mossy_dark_oak_sapling = (WoodsSapling) new WoodsSapling(new MossyDarkOakTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("mossy_dark_oak_sapling")),

                    BlockList.epidote_ore = (OreBlock) new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("epidote_ore"))

            );
            
            logger.info("Registered all blocks from woods_mod.");
        }






        //is used to set the registry name of an item, method registerItems is clearer
        private static ResourceLocation location(String name) {
            return new ResourceLocation(MOD_ID,name);
        }
    }
}
