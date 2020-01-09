package com.pianomanu.woods.data.provider;

import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.list.ItemList;
import com.pianomanu.woods.tags.WoodsItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class WoodsRecipeProvider extends RecipeProvider {

    public WoodsRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }



    @Override
    public void registerRecipes(Consumer<IFinishedRecipe> consumer) {

        //TODO Change Recipes
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_epidote_gem, 1).key('#', ItemList.epidote_gem).key('I', Items.STICK).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_epidote_gems", this.hasItem(ItemList.epidote_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_fire_opal_gem, 1).key('#', ItemList.fire_opal_gem).key('I', Items.STICK).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_fire_opal_gems", this.hasItem(ItemList.fire_opal_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_green_opal_gem, 1).key('#', ItemList.green_opal_gem).key('I', Items.STICK).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_green_opal_gems", this.hasItem(ItemList.green_opal_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_azurite_gem, 1).key('#', ItemList.azurite_gem).key('I', Items.STICK).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_azurite_gems", this.hasItem(ItemList.azurite_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_heliodor_gem, 1).key('#', ItemList.heliodor_gem).key('I', Items.STICK).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_heliodor_gems", this.hasItem(ItemList.heliodor_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_amethyst_gem, 1).key('#', ItemList.amethyst_gem).key('I', Items.STICK).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_amethyst_gems", this.hasItem(ItemList.amethyst_gem)).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemList.epidote_block, 1). key('#', ItemList.pure_epidote_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_epidote_gem", this.hasItem(ItemList.pure_epidote_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.fire_opal_block, 1). key('#', ItemList.pure_fire_opal_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_fire_opal_gem", this.hasItem(ItemList.pure_fire_opal_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.green_opal_block, 1). key('#', ItemList.pure_green_opal_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_green_opal_gem", this.hasItem(ItemList.pure_green_opal_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.heliodor_block, 1). key('#', ItemList.pure_heliodor_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_heliodor_gem", this.hasItem(ItemList.pure_heliodor_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.amethyst_block, 1). key('#', ItemList.pure_amethyst_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_amethyst_gem", this.hasItem(ItemList.pure_amethyst_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.azurite_block, 1). key('#', ItemList.pure_azurite_gem).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_pure_azurite_gem", this.hasItem(ItemList.pure_azurite_gem)).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemList.mossy_stick, 4). key('#', WoodsItemTags.MOSSY_PLANKS).patternLine("#").patternLine("#").addCriterion("has_mossy_planks", this.hasItem(WoodsItemTags.MOSSY_PLANKS)).build(consumer);
    }

}
