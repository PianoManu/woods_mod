package com.pianomanu.woods.list;

import com.pianomanu.woods.tileentity.InventoryBlockTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class TileEntityList {

    //public static TileEntityType<InventoryBlockTileEntity> wooden_box_tile_entity = null;
    public static TileEntityType<InventoryBlockTileEntity> wooden_box_tile_entity = TileEntityType.Builder.create(InventoryBlockTileEntity::new, BlockList.wooden_box).build(null);
}
