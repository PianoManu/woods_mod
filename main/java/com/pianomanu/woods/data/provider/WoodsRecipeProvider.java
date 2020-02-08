package com.pianomanu.woods.data.provider;

import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.list.ItemList;
import com.pianomanu.woods.tags.WoodsItemTags;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import org.lwjgl.system.CallbackI;

import java.util.function.Consumer;

public class WoodsRecipeProvider extends RecipeProvider {

    public WoodsRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }



    @Override
    public void registerRecipes(Consumer<IFinishedRecipe> consumer) {

        /*
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_epidote_gem, 1).key('#', ItemList.epidote_gem).key('I', ItemList.purity_gem).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_epidote_gems", this.hasItem(ItemList.epidote_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_fire_opal_gem, 1).key('#', ItemList.fire_opal_gem).key('I', ItemList.purity_gem).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_fire_opal_gems", this.hasItem(ItemList.fire_opal_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_green_opal_gem, 1).key('#', ItemList.green_opal_gem).key('I', ItemList.purity_gem).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_green_opal_gems", this.hasItem(ItemList.green_opal_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_azurite_gem, 1).key('#', ItemList.azurite_gem).key('I', ItemList.purity_gem).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_azurite_gems", this.hasItem(ItemList.azurite_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_heliodor_gem, 1).key('#', ItemList.heliodor_gem).key('I', ItemList.purity_gem).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_heliodor_gems", this.hasItem(ItemList.heliodor_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_amethyst_gem, 1).key('#', ItemList.amethyst_gem).key('I', ItemList.purity_gem).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_amethyst_gems", this.hasItem(ItemList.amethyst_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_rhodochrosite_gem, 1).key('#', ItemList.rhodochrosite_gem).key('I', ItemList.purity_gem).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_rhodochrosite_gems", this.hasItem(ItemList.rhodochrosite_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_rose_quartz_gem, 1).key('#', ItemList.rose_quartz_gem).key('I', ItemList.purity_gem).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_rose_quartz_gems", this.hasItem(ItemList.rose_quartz_gem)).build(consumer);*/
        /*
        ShapedRecipeBuilder.shapedRecipe(ItemList.epidote_block, 1). key('#', ItemList.pure_epidote_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_epidote_gem", this.hasItem(ItemList.pure_epidote_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.fire_opal_block, 1). key('#', ItemList.pure_fire_opal_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_fire_opal_gem", this.hasItem(ItemList.pure_fire_opal_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.green_opal_block, 1). key('#', ItemList.pure_green_opal_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_green_opal_gem", this.hasItem(ItemList.pure_green_opal_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.heliodor_block, 1). key('#', ItemList.pure_heliodor_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_heliodor_gem", this.hasItem(ItemList.pure_heliodor_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.amethyst_block, 1). key('#', ItemList.pure_amethyst_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_amethyst_gem", this.hasItem(ItemList.pure_amethyst_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.azurite_block, 1). key('#', ItemList.pure_azurite_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_azurite_gem", this.hasItem(ItemList.pure_azurite_gem)).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemList.mossy_stick, 4). key('#', WoodsItemTags.MOSSY_PLANKS).patternLine("#").patternLine("#").addCriterion("has_mossy_planks", this.hasItem(WoodsItemTags.MOSSY_PLANKS)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.small_forest_lantern, 4).key('#', ItemList.moss_item).key('+', Items.STICK).patternLine("#").patternLine("+").addCriterion("has_moss", this.hasItem(ItemList.moss_item)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.medium_forest_lantern, 4).key('#', ItemList.moss_item).key('+', ItemList.small_forest_lantern).patternLine("#+#").patternLine("+#+").patternLine("#+#").addCriterion("has_moss", this.hasItem(ItemList.moss_item)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.large_forest_lantern, 4).key('#', ItemList.moss_item).key('+', ItemList.medium_forest_lantern).patternLine("#+#").patternLine("+++").patternLine("#+#").addCriterion("has_moss", this.hasItem(ItemList.moss_item)).build(consumer);
         */
        //ShapedRecipeBuilder.shapedRecipe(ItemList.oak_branch, 4).key('#',Items.OAK_LOG).key('+', ItemList.moss_item).patternLine(" + ").patternLine("+#+").patternLine(" + ").addCriterion("has_moss", this.hasItem(ItemList.moss_item)).build(consumer);
        //ShapedRecipeBuilder.shapedRecipe(ItemList.oak_all_branch, 5).key('#', ItemList.oak_branch).patternLine(" # ").patternLine("###").patternLine(" # ").addCriterion("has_branches", this.hasItem(ItemList.oak_branch)).build(consumer);
        //ShapedRecipeBuilder.shapedRecipe(ItemList.oak_pillar_branch, 3).key('#', ItemList.oak_branch).patternLine("#").patternLine("#").patternLine("#").addCriterion("has_branches", this.hasItem(ItemList.oak_branch)).build(consumer);
        //ShapedRecipeBuilder.shapedRecipe(ItemList.oak_cross_branch, 4).key('#', ItemList.oak_branch).patternLine(" # ").patternLine("# #").patternLine(" # ").addCriterion("has_branches", this.hasItem(ItemList.oak_branch)).build(consumer);
        //ShapelessRecipeBuilder.shapelessRecipe(ItemList.oak_flexible_branch, 1).addIngredient(ItemList.oak_branch).addCriterion("has_branches", this.hasItem(ItemList.oak_branch)).build(consumer);
        //ShapelessRecipeBuilder.shapelessRecipe(ItemList.oak_branch, 1).addIngredient(ItemList.oak_all_branch).addCriterion("has_branches", this.hasItem(ItemList.oak_branch)).build(consumer);
        //ShapelessRecipeBuilder.shapelessRecipe(ItemList.oak_branch, 1).addIngredient(ItemList.oak_cross_branch).addCriterion("has_branches", this.hasItem(ItemList.oak_branch)).build(consumer);
        //ShapelessRecipeBuilder.shapelessRecipe(ItemList.oak_branch, 1).addIngredient(ItemList.oak_pillar_branch).addCriterion("has_branches", this.hasItem(ItemList.oak_branch)).build(consumer);
        //ShapelessRecipeBuilder.shapelessRecipe(ItemList.oak_branch, 1).addIngredient(ItemList.oak_flexible_branch).addCriterion("has_branches", this.hasItem(ItemList.oak_branch)).build(consumer);
        //ShapedRecipeBuilder.shapedRecipe(ItemList.sand_slab, 3).key('#', Items.SAND).patternLine("###").addCriterion("has_sand", this.hasItem(Items.SAND)).build(consumer);
        //ShapedRecipeBuilder.shapedRecipe(ItemList.gravel_slab, 3).key('#', Items.GRAVEL).patternLine("###").addCriterion("has_gravel", this.hasItem(Items.GRAVEL)).build(consumer);
        //ShapedRecipeBuilder.shapedRecipe(ItemList.rhodochrosite_block, 1). key('#', ItemList.pure_rhodochrosite_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_rhodochrosite_gem", this.hasItem(ItemList.pure_rhodochrosite_gem)).build(consumer);
        //ShapedRecipeBuilder.shapedRecipe(ItemList.rose_quartz_block, 1). key('#', ItemList.pure_rose_quartz_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_rose_quartz_gem", this.hasItem(ItemList.pure_rose_quartz_gem)).build(consumer);
        //ShapedRecipeBuilder.shapedRecipe(ItemList.purity_gem_block, 1). key('#', ItemList.purity_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_purity_gem", this.hasItem(ItemList.purity_gem)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.purity_gem, 9).addIngredient(ItemList.purity_gem_block).addCriterion("has_purity_gem", this.hasItem(ItemList.purity_gem)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.epidote_gem, 9).addIngredient(ItemList.epidote_block).addCriterion("has_epidote_gem", this.hasItem(ItemList.epidote_gem)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.fire_opal_gem, 9).addIngredient(ItemList.fire_opal_block).addCriterion("has_fire_opal_gem", this.hasItem(ItemList.fire_opal_gem)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.heliodor_gem, 9).addIngredient(ItemList.heliodor_block).addCriterion("has_heliodor_gem", this.hasItem(ItemList.heliodor_gem)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.green_opal_gem, 9).addIngredient(ItemList.green_opal_block).addCriterion("has_green_opal_gem", this.hasItem(ItemList.green_opal_gem)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.amethyst_gem, 9).addIngredient(ItemList.amethyst_block).addCriterion("has_amethyst_gem", this.hasItem(ItemList.amethyst_gem)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.azurite_gem, 9).addIngredient(ItemList.azurite_block).addCriterion("has_azurite_gem", this.hasItem(ItemList.azurite_gem)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.rhodochrosite_gem, 9).addIngredient(ItemList.rhodochrosite_block).addCriterion("has_rhodochrosite_gem", this.hasItem(ItemList.rhodochrosite_gem)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemList.rose_quartz_gem, 9).addIngredient(ItemList.rose_quartz_block).addCriterion("has_rose_quartz_gem", this.hasItem(ItemList.rose_quartz_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.dirt_slab, 6).key('#', Items.DIRT).patternLine("###").addCriterion("has_dirt", this.hasItem(Items.DIRT)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.grass_slab, 6).key('#', Items.GRASS_BLOCK).patternLine("###").addCriterion("has_grass", this.hasItem(Items.GRASS_BLOCK)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.sand_slab, 6).key('#', Items.SAND).patternLine("###").addCriterion("has_sand", this.hasItem(Items.SAND)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.gravel_slab, 6).key('#', Items.GRAVEL).patternLine("###").addCriterion("has_gravel", this.hasItem(Items.GRAVEL)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.dirt_stairs, 6).key('#', Items.DIRT).patternLine("###").addCriterion("has_dirt", this.hasItem(Items.DIRT)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.grass_stairs, 6).key('#', Items.GRASS_BLOCK).patternLine("###").addCriterion("has_grass", this.hasItem(Items.GRASS_BLOCK)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.sand_stairs, 4).key('#', Items.SAND).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_sand", this.hasItem(Items.SAND)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.gravel_stairs, 4).key('#', Items.GRAVEL).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_gravel", this.hasItem(Items.GRAVEL)).build(consumer);
    }

}
