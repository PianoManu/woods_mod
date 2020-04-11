package com.pianomanu.woods.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

import java.util.Map;

public class WoodsUpBranchBlock extends WoodsBranchBlock {

    public WoodsUpBranchBlock(Properties properties) {
        super(properties);
    }

    public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;
    private static final Map<Direction, VoxelShape> SHAPE = Maps.newEnumMap(ImmutableMap.of(Direction.NORTH, Block.makeCuboidShape(4.0D, 8.0D, 0.0D, 12.0D, 16.0D, 16.0D), Direction.SOUTH, Block.makeCuboidShape(4.0D, 8.0D, 0.0D, 12.0D, 16.0D, 16.0D), Direction.WEST, Block.makeCuboidShape(0.0D, 8.0D, 4.0D, 16.0D, 16.0D, 12.0D), Direction.EAST, Block.makeCuboidShape(0.0D, 8.0D, 4.0D, 16.0D, 16.0D, 12.0D)));

    @SuppressWarnings("deprecation")
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return getState(state);
    }

    public static VoxelShape getState(BlockState blockstate) {
        return SHAPE.get(blockstate.get(HORIZONTAL_FACING));
    }

    /*public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }*/

    /*@SuppressWarnings("deprecation")
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return facing == Direction.UP && !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }*/

    @SuppressWarnings("deprecation")
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return hasEnoughSolidSide(worldIn, pos.up(), Direction.DOWN);
    }
}
