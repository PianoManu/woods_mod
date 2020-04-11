package com.pianomanu.woods.init;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.container.InventoryBlockContainer;
import com.pianomanu.woods.util.WoodsContainerType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = WoodsMain.MOD_ID, bus = Bus.MOD)
public class WoodsContainerTypes {

        public static final ContainerType<InventoryBlockContainer> wooden_box = new WoodsContainerType<>(InventoryBlockContainer::new);

        @SubscribeEvent
        public static void register(Register<ContainerType<?>> event) {
        final IForgeRegistry<ContainerType<?>> registry = event.getRegistry();

        registry.register(wooden_box.setRegistryName(WoodsMain.MOD_ID, "wooden_box"));

    }
}
