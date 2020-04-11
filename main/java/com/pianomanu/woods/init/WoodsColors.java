package com.pianomanu.woods.init;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.list.BlockList;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WoodsColors {

    private static final Logger logger = LogManager.getLogger(WoodsMain.MOD_ID);

    @Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
    @ObjectHolder(WoodsMain.MOD_ID)
    public static class RegistryEvents {

        @OnlyIn(Dist.CLIENT)
        @SubscribeEvent
        public static void registerBlockColorHandlers(final ColorHandlerEvent.Block event) {
            event.getBlockColors().register((x, reader, pos, u) -> reader != null
                    && pos != null ? BiomeColors.getGrassColor(reader, pos)
                    : GrassColors.get(0.5D, 1.0D), BlockList.grass_block);
            event.getBlockColors().register((x, reader, pos, u) -> reader != null
                    && pos != null ? BiomeColors.getGrassColor(reader, pos)
                    : GrassColors.get(0.5D, 1.0D), BlockList.grass_slab);
            event.getBlockColors().register((x, reader, pos, u) -> reader != null
                    && pos != null ? BiomeColors.getGrassColor(reader, pos)
                    : GrassColors.get(0.5D, 1.0D), BlockList.grass_stairs);
        }

    }

}
