package com.pianomanu.woods.init;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.list.TileEntityList;
import com.pianomanu.woods.tileentity.InventoryBlockTileEntity;
import com.pianomanu.woods.tileentity.WoodsLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = WoodsMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WoodsTileEntityTypes {

    //public static final TileEntityType<InventoryBlockTileEntity> wooden_box = TileEntityType.Builder.create(InventoryBlockTileEntity::new, BlockList.wooden_box).build(null);

    @SubscribeEvent
    public static void register(Register<TileEntityType<?>> event) {
        final IForgeRegistry<TileEntityType<?>> registry = event.getRegistry();

        registry.register(TileEntityList.wooden_box_tile_entity.setRegistryName(WoodsMain.MOD_ID, "wooden_box"));
    }

}
