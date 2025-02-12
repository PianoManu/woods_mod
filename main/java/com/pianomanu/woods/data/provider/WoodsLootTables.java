package com.pianomanu.woods.data.provider;

import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.list.ItemList;
import net.minecraft.data.DataGenerator;

public class WoodsLootTables extends WoodsBaseLootTableProvider {

    public WoodsLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(BlockList.moss, createStandardTable("moss", BlockList.moss));
        //test purposes: lootTables.put(BlockList.moss, createStandardTable("moss", Blocks.DIAMOND_BLOCK));
        lootTables.put(BlockList.mossy_oak_log, createStandardTable("mossy_oak_log", BlockList.mossy_oak_log));
        lootTables.put(BlockList.mossy_birch_log, createStandardTable("mossy_birch_log", BlockList.mossy_birch_log));
        lootTables.put(BlockList.mossy_spruce_log, createStandardTable("mossy_spruce_log", BlockList.mossy_spruce_log));
        lootTables.put(BlockList.mossy_jungle_log, createStandardTable("mossy_jungle_log", BlockList.mossy_jungle_log));
        lootTables.put(BlockList.mossy_acacia_log, createStandardTable("mossy_acacia_log", BlockList.mossy_acacia_log));
        lootTables.put(BlockList.mossy_dark_oak_log, createStandardTable("mossy_dark_oak_log", BlockList.mossy_dark_oak_log));

        lootTables.put(BlockList.mossy_oak_planks, createStandardTable("mossy_oak_planks", BlockList.mossy_oak_planks));
        lootTables.put(BlockList.mossy_birch_planks, createStandardTable("mossy_birch_planks", BlockList.mossy_birch_planks));
        lootTables.put(BlockList.mossy_spruce_planks, createStandardTable("mossy_spruce_planks", BlockList.mossy_spruce_planks));
        lootTables.put(BlockList.mossy_jungle_planks, createStandardTable("mossy_jungle_planks", BlockList.mossy_jungle_planks));
        lootTables.put(BlockList.mossy_acacia_planks, createStandardTable("mossy_acacia_planks", BlockList.mossy_acacia_planks));
        lootTables.put(BlockList.mossy_dark_oak_planks, createStandardTable("mossy_dark_oak_planks", BlockList.mossy_dark_oak_planks));

        lootTables.put(BlockList.mossy_oak_slab, createStandardTable("mossy_oak_slab", BlockList.mossy_oak_slab));
        lootTables.put(BlockList.mossy_birch_slab, createStandardTable("mossy_birch_slab", BlockList.mossy_birch_slab));
        lootTables.put(BlockList.mossy_spruce_slab, createStandardTable("mossy_spruce_slab", BlockList.mossy_spruce_slab));
        lootTables.put(BlockList.mossy_jungle_slab, createStandardTable("mossy_jungle_slab", BlockList.mossy_jungle_slab));
        lootTables.put(BlockList.mossy_acacia_slab, createStandardTable("mossy_acacia_slab", BlockList.mossy_acacia_slab));
        lootTables.put(BlockList.mossy_dark_oak_slab, createStandardTable("mossy_dark_oak_slab", BlockList.mossy_dark_oak_slab));

        lootTables.put(BlockList.mossy_oak_stairs, createStandardTable("mossy_oak_stairs", BlockList.mossy_oak_stairs));
        lootTables.put(BlockList.mossy_birch_stairs, createStandardTable("mossy_birch_stairs", BlockList.mossy_birch_stairs));
        lootTables.put(BlockList.mossy_spruce_stairs, createStandardTable("mossy_spruce_stairs", BlockList.mossy_spruce_stairs));
        lootTables.put(BlockList.mossy_jungle_stairs, createStandardTable("mossy_jungle_stairs", BlockList.mossy_jungle_stairs));
        lootTables.put(BlockList.mossy_acacia_stairs, createStandardTable("mossy_acacia_stairs", BlockList.mossy_acacia_stairs));
        lootTables.put(BlockList.mossy_dark_oak_stairs, createStandardTable("mossy_dark_oak_stairs", BlockList.mossy_dark_oak_stairs));
        /*
        lootTables.put(BlockList.mossy_oak_stairs, createStandardTable("mossy_oak_stairs", BlockList.mossy_oak_stairs));
        lootTables.put(BlockList.mossy_birch_stairs, createStandardTable("mossy_birch_stairs", BlockList.mossy_birch_stairs));
        lootTables.put(BlockList.mossy_spruce_stairs, createStandardTable("mossy_spruce_stairs", BlockList.mossy_spruce_stairs));
        lootTables.put(BlockList.mossy_jungle_stairs, createStandardTable("mossy_jungle_stairs", BlockList.mossy_jungle_stairs));
        lootTables.put(BlockList.mossy_acacia_stairs, createStandardTable("mossy_acacia_stairs", BlockList.mossy_acacia_stairs));
        lootTables.put(BlockList.mossy_dark_oak_stairs, createStandardTable("mossy_dark_oak_stairs", BlockList.mossy_dark_oak_stairs));
        */
        lootTables.put(BlockList.mossy_oak_fence, createStandardTable("mossy_oak_fence", BlockList.mossy_oak_fence));
        lootTables.put(BlockList.mossy_birch_fence, createStandardTable("mossy_birch_fence", BlockList.mossy_birch_fence));
        lootTables.put(BlockList.mossy_spruce_fence, createStandardTable("mossy_spruce_fence", BlockList.mossy_spruce_fence));
        lootTables.put(BlockList.mossy_jungle_fence, createStandardTable("mossy_jungle_fence", BlockList.mossy_jungle_fence));
        lootTables.put(BlockList.mossy_acacia_fence, createStandardTable("mossy_acacia_fence", BlockList.mossy_acacia_fence));
        lootTables.put(BlockList.mossy_dark_oak_fence, createStandardTable("mossy_dark_oak_fence", BlockList.mossy_dark_oak_log));

        lootTables.put(BlockList.dirt_slab, createStandardTable("dirt_slab", BlockList.dirt_slab));
        lootTables.put(BlockList.dirt_stairs, createStandardTable("dirt_stairs", BlockList.dirt_stairs));

        lootTables.put(BlockList.mossy_dirt, createStandardTable("mossy_dirt", BlockList.mossy_dirt));

        lootTables.put(BlockList.epidote_ore, createBlockToItemLootTable("epidote_ore", ItemList.epidote_gem));
        lootTables.put(BlockList.epidote_block, createStandardTable("epidote_block", BlockList.epidote_block));
        lootTables.put(BlockList.fire_opal_ore, createBlockToItemLootTable("fire_opal_ore", ItemList.fire_opal_gem));
        lootTables.put(BlockList.fire_opal_block, createStandardTable("fire_opal_block", BlockList.fire_opal_block));
        lootTables.put(BlockList.heliodor_ore, createBlockToItemLootTable("heliodor_gem", ItemList.heliodor_gem));
        lootTables.put(BlockList.heliodor_block, createStandardTable("heliodor_block", BlockList.heliodor_block));
        lootTables.put(BlockList.amethyst_ore, createBlockToItemLootTable("amethyst_gem", ItemList.amethyst_gem));
        lootTables.put(BlockList.amethyst_block, createStandardTable("amethyst_block", BlockList.amethyst_block));
        lootTables.put(BlockList.azurite_ore, createBlockToItemLootTable("azurite_gem", ItemList.azurite_gem));
        lootTables.put(BlockList.azurite_block, createStandardTable("azurite_block", BlockList.azurite_block));
        lootTables.put(BlockList.green_opal_ore, createBlockToItemLootTable("green_opal_gem", ItemList.green_opal_gem));
        lootTables.put(BlockList.green_opal_block, createStandardTable("green_opal_block", BlockList.green_opal_block));


        lootTables.put(BlockList.small_forest_lantern, createStandardTable("small_forest_lantern", BlockList.small_forest_lantern));
        lootTables.put(BlockList.medium_forest_lantern, createStandardTable("medium_forest_lantern", BlockList.medium_forest_lantern));
        lootTables.put(BlockList.large_forest_lantern, createStandardTable("large_forest_lantern", BlockList.large_forest_lantern));

        lootTables.put(BlockList.oak_branch, createStandardTable("oak_branch", BlockList.oak_branch));
        lootTables.put(BlockList.oak_up_branch, createStandardTable("oak_branch", BlockList.oak_branch));
        lootTables.put(BlockList.oak_wall_branch, createStandardTable("oak_branch", BlockList.oak_branch));
        lootTables.put(BlockList.oak_all_branch, createStandardTable("oak_branch", BlockList.oak_all_branch));
        lootTables.put(BlockList.oak_pillar_branch, createStandardTable("oak_branch", BlockList.oak_pillar_branch));
        lootTables.put(BlockList.oak_cross_branch, createStandardTable("oak_branch", BlockList.oak_cross_branch));
        lootTables.put(BlockList.oak_flexible_branch, createStandardTable("oak_flexible_branch", BlockList.oak_flexible_branch));
        lootTables.put(BlockList.birch_branch, createStandardTable("birch_branch", BlockList.birch_branch));
        lootTables.put(BlockList.birch_up_branch, createStandardTable("birch_branch", BlockList.birch_branch));
        lootTables.put(BlockList.birch_wall_branch, createStandardTable("birch_branch", BlockList.birch_branch));
        lootTables.put(BlockList.birch_all_branch, createStandardTable("birch_branch", BlockList.birch_all_branch));
        lootTables.put(BlockList.birch_pillar_branch, createStandardTable("birch_branch", BlockList.birch_pillar_branch));
        lootTables.put(BlockList.birch_cross_branch, createStandardTable("birch_branch", BlockList.birch_cross_branch));
        lootTables.put(BlockList.birch_flexible_branch, createStandardTable("birch_flexible_branch", BlockList.birch_flexible_branch));
        lootTables.put(BlockList.spruce_branch, createStandardTable("spruce_branch", BlockList.spruce_branch));
        lootTables.put(BlockList.spruce_up_branch, createStandardTable("spruce_branch", BlockList.spruce_branch));
        lootTables.put(BlockList.spruce_wall_branch, createStandardTable("spruce_branch", BlockList.spruce_branch));
        lootTables.put(BlockList.spruce_all_branch, createStandardTable("spruce_branch", BlockList.spruce_all_branch));
        lootTables.put(BlockList.spruce_pillar_branch, createStandardTable("spruce_branch", BlockList.spruce_pillar_branch));
        lootTables.put(BlockList.spruce_cross_branch, createStandardTable("spruce_branch", BlockList.spruce_cross_branch));
        lootTables.put(BlockList.spruce_flexible_branch, createStandardTable("spruce_flexible_branch", BlockList.spruce_flexible_branch));
        lootTables.put(BlockList.jungle_branch, createStandardTable("jungle_branch", BlockList.jungle_branch));
        lootTables.put(BlockList.jungle_up_branch, createStandardTable("jungle_branch", BlockList.jungle_branch));
        lootTables.put(BlockList.jungle_wall_branch, createStandardTable("jungle_branch", BlockList.jungle_branch));
        lootTables.put(BlockList.jungle_all_branch, createStandardTable("jungle_branch", BlockList.jungle_all_branch));
        lootTables.put(BlockList.jungle_pillar_branch, createStandardTable("jungle_branch", BlockList.jungle_pillar_branch));
        lootTables.put(BlockList.jungle_cross_branch, createStandardTable("jungle_branch", BlockList.jungle_cross_branch));
        lootTables.put(BlockList.jungle_flexible_branch, createStandardTable("jungle_flexible_branch", BlockList.jungle_flexible_branch));
        lootTables.put(BlockList.acacia_branch, createStandardTable("acacia_branch", BlockList.acacia_branch));
        lootTables.put(BlockList.acacia_up_branch, createStandardTable("acacia_branch", BlockList.acacia_branch));
        lootTables.put(BlockList.acacia_wall_branch, createStandardTable("acacia_branch", BlockList.acacia_branch));
        lootTables.put(BlockList.acacia_all_branch, createStandardTable("acacia_branch", BlockList.acacia_all_branch));
        lootTables.put(BlockList.acacia_pillar_branch, createStandardTable("acacia_branch", BlockList.acacia_pillar_branch));
        lootTables.put(BlockList.acacia_cross_branch, createStandardTable("acacia_branch", BlockList.acacia_cross_branch));
        lootTables.put(BlockList.acacia_flexible_branch, createStandardTable("acacia_flexible_branch", BlockList.acacia_flexible_branch));
        lootTables.put(BlockList.dark_oak_branch, createStandardTable("dark_oak_branch", BlockList.dark_oak_branch));
        lootTables.put(BlockList.dark_oak_up_branch, createStandardTable("dark_oak_branch", BlockList.dark_oak_branch));
        lootTables.put(BlockList.dark_oak_wall_branch, createStandardTable("dark_oak_branch", BlockList.dark_oak_branch));
        lootTables.put(BlockList.dark_oak_all_branch, createStandardTable("dark_oak_branch", BlockList.dark_oak_all_branch));
        lootTables.put(BlockList.dark_oak_pillar_branch, createStandardTable("dark_oak_branch", BlockList.dark_oak_pillar_branch));
        lootTables.put(BlockList.dark_oak_cross_branch, createStandardTable("dark_oak_branch", BlockList.dark_oak_cross_branch));
        lootTables.put(BlockList.dark_oak_flexible_branch, createStandardTable("dark_oak_flexible_branch", BlockList.dark_oak_flexible_branch));

        //lootTables.put(BlockList.wooden_box, createStandardTable("wooden_box", BlockList.wooden_box));

        lootTables.put(BlockList.sand_slab, createStandardTable("sand_slab", BlockList.sand_slab));
        lootTables.put(BlockList.gravel_slab, createStandardTable("gravel_slab", BlockList.gravel_slab));



    }
}
