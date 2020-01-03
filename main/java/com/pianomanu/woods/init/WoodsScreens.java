package com.pianomanu.woods.init;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.screen.InventoryBlockScreen;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = WoodsMain.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class WoodsScreens {

    @SubscribeEvent
    public static void register(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(WoodsContainerTypes.wooden_box, InventoryBlockScreen::new);
    }

}