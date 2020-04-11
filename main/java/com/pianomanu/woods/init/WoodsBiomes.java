package com.pianomanu.woods.init;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.list.BiomesList;
import com.pianomanu.woods.world.biome.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WoodsBiomes {

    private static final Logger logger = LogManager.getLogger(WoodsMain.MOD_ID);

    @Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
    @ObjectHolder(WoodsMain.MOD_ID)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void registerBiomes(final RegistryEvent.Register<Biome> event) {

            event.getRegistry().registerAll(
                    BiomesList.WET_FOREST_BIOME = new WetForestBiome().setRegistryName(location("wet_forest_biome"))
                    //BiomesList.SHARP_MOUNTAINS_BIOME = new SharpMountainsBiome().setRegistryName(location("sharp_mountains_biome"))
            );

            com.pianomanu.woods.world.biome.WoodsBiomes.registerBiomes();

            logger.info("Registered all biomes from woods_mod.");

        }

        private static ResourceLocation location(String name) {
            return new ResourceLocation(WoodsMain.MOD_ID, name);
        }
    }
}
