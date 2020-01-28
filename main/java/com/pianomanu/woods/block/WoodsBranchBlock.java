package com.pianomanu.woods.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

import java.util.Map;

public class WoodsBranchBlock extends Block {

    public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;
    private static final Map<Direction, VoxelShape> SHAPE = Maps.newEnumMap(ImmutableMap.of(Direction.NORTH, Block.makeCuboidShape(4.0D, 0.0D, 0.0D, 12.0D, 8.0D, 16.0D), Direction.SOUTH, Block.makeCuboidShape(4.0D, 0.0D, 0.0D, 12.0D, 8.0D, 16.0D), Direction.WEST, Block.makeCuboidShape(0.0D, 0.0D, 4.0D, 16.0D, 8.0D, 12.0D), Direction.EAST, Block.makeCuboidShape(0.0D, 0.0D, 4.0D, 16.0D, 8.0D, 12.0D)));
    //private static final VoxelShape SHAPE = Block.makeCuboidShape(4.0D, 0.0D, 0.0D, 12.0D, 8.0D, 16.0D);


    public WoodsBranchBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState());
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing());

    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.HORIZONTAL_FACING);
    }

    @SuppressWarnings("deprecation")
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return getState(state);
    }

    public static VoxelShape getState(BlockState blockstate) {
        return SHAPE.get(blockstate.get(HORIZONTAL_FACING));
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    /*@SuppressWarnings("deprecation")
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }*/

    @SuppressWarnings("deprecation")
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return func_220055_a(worldIn, pos.down(), Direction.UP);
    }

}
