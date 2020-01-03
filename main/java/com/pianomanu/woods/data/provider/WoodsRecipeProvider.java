package com.pianomanu.woods.data.provider;

import com.pianomanu.woods.list.ItemList;
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

        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_epidote_gem, 1).key('#', ItemList.epidote_gem).key('I', Items.STICK).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_epidote_gems", this.hasItem(ItemList.epidote_gem)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ItemList.pure_fire_opal_gem, 1).key('#', ItemList.fire_opal_gem).key('I', Items.STICK).patternLine("###").patternLine("#I#").patternLine("###").addCriterion("has_fire_opal_gems", this.hasItem(ItemList.fire_opal_gem)).build(consumer);

    }

}
