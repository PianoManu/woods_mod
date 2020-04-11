package com.pianomanu.woods.data;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.data.provider.WoodsLootTableProvider;
import com.pianomanu.woods.data.provider.WoodsLootTables;
import com.pianomanu.woods.data.provider.WoodsRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = WoodsMain.MOD_ID, bus = Bus.MOD)
public class WoodsDataGenerator {

    @SubscribeEvent
    public static void data(GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new WoodsLootTableProvider(generator));
            generator.addProvider(new WoodsRecipeProvider(generator));
            generator.addProvider(new WoodsLootTables(generator));
        }
    }
}