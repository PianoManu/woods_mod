package com.pianomanu.woods.tileentity;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.tileentity.TileEntityType;
import javax.annotation.Nullable;
import net.minecraft.util.ResourceLocation;

public abstract class WoodsLootTileEntity extends LockableTileEntity {

    @Nullable
    protected ResourceLocation lootTable;
    protected long lootTableSeed;

    protected WoodsLootTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    protected boolean checkLootAndWrite(CompoundNBT compound) {
        if (this.lootTable == null) {
            return false;
        } else {
            compound.putString("LootTable", this.lootTable.toString());
            if (this.lootTableSeed != 0L) {
                compound.putLong("LootTableSeed", this.lootTableSeed);
            }

            return true;
        }
    }
}
