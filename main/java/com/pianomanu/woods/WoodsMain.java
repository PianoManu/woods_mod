package com.pianomanu.woods;

import com.pianomanu.woods.block.*;
//import com.pianomanu.woods.world.WetForestWorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(WoodsMain.MOD_ID)
public class WoodsMain {

    public static WoodsMain instance;
    public static final String MOD_ID = "woods_mod";
    private static final Logger logger = LogManager.getLogger(MOD_ID);

    //public static final WorldType WET_FOREST_TYPE = new WetForestWorldType();

    public WoodsMain() {
        instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {
        WoodsVanillaCompatibility.setup();
        logger.info("Setup method for woods_mod registered");
    }
    private void clientRegistries(final FMLClientSetupEvent event) {
        logger.info("ClientRegistries method for woods_mod registered");
    }
}
