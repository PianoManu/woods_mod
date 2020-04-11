package com.pianomanu.woods.util;

import net.minecraft.inventory.container.*;
import net.minecraftforge.fml.network.IContainerFactory;

public class WoodsContainerType <T extends Container> extends ContainerType<T> {

    //Thanks to HyCraftHD
    public WoodsContainerType(IContainerFactory<T> factory) {
        super(factory);
    }

}
