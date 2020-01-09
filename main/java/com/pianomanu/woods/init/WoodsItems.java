package com.pianomanu.woods.init;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.list.ItemList;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.CallbackI;

public class WoodsItems {

    private static final Logger logger = LogManager.getLogger(WoodsMain.MOD_ID);

    @Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
    @ObjectHolder(WoodsMain.MOD_ID)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {

            event.getRegistry().registerAll(

                    ItemList.moss_item = new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64)).setRegistryName(location("moss_item")),
                    ItemList.mossy_stick = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("mossy_stick")),
                    ItemList.epidote_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("epidote_gem")),
                    ItemList.pure_epidote_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("pure_epidote_gem")),
                    ItemList.fire_opal_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("fire_opal_gem")),
                    ItemList.pure_fire_opal_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("pure_fire_opal_gem")),
                    ItemList.heliodor_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("heliodor_gem")),
                    ItemList.pure_heliodor_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("pure_heliodor_gem")),
                    ItemList.amethyst_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("amethyst_gem")),
                    ItemList.pure_amethyst_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("pure_amethyst_gem")),
                    ItemList.azurite_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("azurite_gem")),
                    ItemList.pure_azurite_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("pure_azurite_gem")),
                    ItemList.green_opal_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("green_opal_gem")),
                    ItemList.pure_green_opal_gem = new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("pure_green_opal_gem")),



                    //wood-like blocks
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
                    //other blocks
                    ItemList.epidote_ore = new BlockItem(BlockList.epidote_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("epidote_ore")),
                    ItemList.fire_opal_ore = new BlockItem(BlockList.fire_opal_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("fire_opal_ore")),
                    ItemList.heliodor_ore = new BlockItem(BlockList.heliodor_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("heliodor_ore")),
                    ItemList.amethyst_ore = new BlockItem(BlockList.amethyst_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("amethyst_ore")),
                    ItemList.azurite_ore = new BlockItem(BlockList.azurite_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("azurite_ore")),
                    ItemList.green_opal_ore = new BlockItem(BlockList.green_opal_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("green_opal_ore")),

                    ItemList.mossy_dirt = new BlockItem(BlockList.mossy_dirt, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("mossy_dirt")),

                    //organic decoration
                    ItemList.mossy_dirt = new BlockItem(BlockList.moss, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("moss")),

                    //blocks with usage
                    ItemList.wooden_box = new BlockItem(BlockList.wooden_box, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("wooden_box")),

                    ItemList.small_forest_lantern = new BlockItem(BlockList.small_forest_lantern, new Item.Properties().group(ItemGroup.DECORATIONS).maxStackSize(64)).setRegistryName(location("small_forest_lantern")),

                    ItemList.epidote_block = new BlockItem(BlockList.epidote_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("epidote_block")),
                    ItemList.fire_opal_block = new BlockItem(BlockList.fire_opal_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("fire_opal_block")),
                    ItemList.heliodor_block = new BlockItem(BlockList.heliodor_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("heliodor_block")),
                    ItemList.amethyst_block = new BlockItem(BlockList.amethyst_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("amethyst_block")),
                    ItemList.azurite_block = new BlockItem(BlockList.azurite_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("azurite_block")),
                    ItemList.green_opal_block = new BlockItem(BlockList.green_opal_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64)).setRegistryName(location("green_opal_block"))


            );

            logger.info("Registered all items from woods_mod.");
        }

        //is used to set the registry name of an item, method registerItems is clearer
        private static ResourceLocation location(String name) {
            return new ResourceLocation(WoodsMain.MOD_ID,name);
        }
    }
}
