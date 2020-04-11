package com.pianomanu.woods;

import com.pianomanu.woods.block.*;
//import com.pianomanu.woods.world.WetForestWorldType;
import com.pianomanu.woods.init.WoodsBlocks;
import com.pianomanu.woods.init.WoodsItems;
import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.list.ItemList;
import com.pianomanu.woods.util.WoodsItemGroup;
import com.pianomanu.woods.world.WoodsWorldType;
import com.pianomanu.woods.world.gen.WoodsFeaturesInVanillaBiomes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
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
    public static final ItemGroup WOODS_ITEMGROUP= new WoodsItemGroup("woods_item_group_blocks");
    public static final ItemGroup WOODS_ITEMGROUPITEMS= new WoodsItemGroup("woods_item_group_items");
    //public static final WorldType WOODS_WORLD_TYPE = new WoodsWorldType(); //TODO Fix Worldtype
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
        WoodsFeaturesInVanillaBiomes.setup();
        logger.info("ClientRegistries method for woods_mod registered");
    }
}
