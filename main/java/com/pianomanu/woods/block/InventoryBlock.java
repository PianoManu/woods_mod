package com.pianomanu.woods.block;

import com.pianomanu.woods.init.WoodsTileEntityTypes;
import com.pianomanu.woods.list.TileEntityList;
import com.pianomanu.woods.tileentity.InventoryBlockTileEntity;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

import java.util.stream.IntStream;

public class InventoryBlock extends Block {

    //Thanks to HyCraftHD
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public InventoryBlock() {
        super(Properties.create(Material.WOOD).hardnessAndResistance(3).harvestTool(ToolType.AXE).sound(SoundType.WOOD));
        setDefaultState(getDefaultState().with(FACING, Direction.NORTH));
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if (world.isRemote() || !(player instanceof ServerPlayerEntity)) {
            return true;
        }
        final TileEntity tileEntity = world.getTileEntity(pos);
        if (!(tileEntity instanceof InventoryBlockTileEntity)) {
            return false;
        }
        NetworkHooks.openGui((ServerPlayerEntity) player, (InventoryBlockTileEntity) tileEntity, pos);
        return true;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            TileEntity tileEntity = world.getTileEntity(pos);
            if (tileEntity instanceof InventoryBlockTileEntity) {
                ((InventoryBlockTileEntity) tileEntity).getInventory() //
                        .ifPresent(handler -> IntStream.range(0, handler.getSlots()).forEach(index -> {
                            InventoryHelper.spawnItemStack(world, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, handler.getStackInSlot(index));
                        }));
                world.updateComparatorOutputLevel(pos, this);
            }
            super.onReplaced(state, world, pos, newState, isMoving);
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return getDefaultState().with(FACING, context.getNearestLookingDirection().getOpposite());
    }

    @Override
    protected void fillStateContainer(Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityList.wooden_box_tile_entity.create();
    }
}