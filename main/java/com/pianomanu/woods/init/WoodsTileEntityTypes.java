package com.pianomanu.woods.init;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.tileentity.InventoryBlockTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class WoodsTileEntityTypes {

    public static TileEntityType<InventoryBlockTileEntity> wooden_box = TileEntityType.Builder.create(InventoryBlockTileEntity::new, BlockList.wooden_box).build(null);

    @SubscribeEvent
    public static void register(Register<TileEntityType<?>> event) {
        final IForgeRegistry<TileEntityType<?>> registry = event.getRegistry();

        registry.register(wooden_box.setRegistryName(WoodsMain.MOD_ID, "inventory_block"));
    }

}
