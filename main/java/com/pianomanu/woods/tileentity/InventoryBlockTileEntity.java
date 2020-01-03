package com.pianomanu.woods.tileentity;

import com.pianomanu.woods.container.InventoryBlockContainer;
import com.pianomanu.woods.init.WoodsTileEntityTypes;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.container.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.text.*;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.*;

public class InventoryBlockTileEntity extends TileEntity implements INamedContainerProvider {

    private final LazyOptional<ItemStackHandler> inventory = LazyOptional.of(() -> new ItemStackHandler(54));

    public InventoryBlockTileEntity() {
        super(WoodsTileEntityTypes.wooden_box);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        inventory.ifPresent(handler -> compound.put("inventory", handler.serializeNBT()));
        return compound;
    }

    @Override
    public void read(CompoundNBT compound) {
        super.read(compound);
        inventory.ifPresent(handler -> handler.deserializeNBT(compound.getCompound("inventory")));
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> capability, Direction side) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return inventory.cast();
        }
        return super.getCapability(capability, side);
    }

    public LazyOptional<ItemStackHandler> getInventory() {
        return inventory;
    }

    @Override
    public Container createMenu(int id, PlayerInventory playerInventory, PlayerEntity player) {
        return new InventoryBlockContainer(id, playerInventory, this);
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("container.woods_mod.wooden_box");
    }
}
