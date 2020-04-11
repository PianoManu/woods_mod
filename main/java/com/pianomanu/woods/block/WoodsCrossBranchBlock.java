package com.pianomanu.woods.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.pianomanu.woods.block.WoodsBranchBlock;
import com.pianomanu.woods.enums.BranchCrossShape;
import com.sun.org.apache.xpath.internal.operations.Bool;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;
import java.util.Map;

public class WoodsCrossBranchBlock extends WoodsBranchBlock {
    public static final DirectionProperty HORIZONTAL_FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final EnumProperty<BranchCrossShape> LEVEL = EnumProperty.create("level", BranchCrossShape.class);
    private static final VoxelShape X_FLOOR_1 = Block.makeCuboidShape(4.0D, 0.0D, 0.0D, 12.0D, 8.0D, 16.0D);
    private static final VoxelShape X_FLOOR_2 = Block.makeCuboidShape(0.0D, 0.0D, 4.0D, 16.0D, 8.0D, 12.0D);
    private static final VoxelShape X_MID_1 = Block.makeCuboidShape(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 16.0D);
    private static final VoxelShape X_MID_2 = Block.makeCuboidShape(0.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D);
    private static final VoxelShape X_TOP_1 = Block.makeCuboidShape(4.0D, 8.0D, 0.0D, 12.0D, 16.0D, 16.0D);
    private static final VoxelShape X_TOP_2 = Block.makeCuboidShape(0.0D, 8.0D, 4.0D, 16.0D, 16.0D, 12.0D);
    private static final VoxelShape SHAPE_FLOOR = VoxelShapes.combine(X_FLOOR_1, X_FLOOR_2, IBooleanFunction.OR);
    private static final VoxelShape SHAPE_MID = VoxelShapes.combine(X_MID_1, X_MID_2, IBooleanFunction.OR);
    private static final VoxelShape SHAPE_TOP = VoxelShapes.combine(X_TOP_1, X_TOP_2, IBooleanFunction.OR);

    public WoodsCrossBranchBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(LEVEL, BranchCrossShape.BOTTOM));
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        /*Direction direction = state.get(HORIZONTAL_FACING);
        BlockPos blockpos = pos.offset(direction.getOpposite());
        BlockState blockstate = worldIn.getBlockState(blockpos);
        return blockstate != Blocks.AIR.getDefaultState();*/
        return true;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos blockpos = context.getPos();
        BlockState blockstate = this.getDefaultState();
        Direction[] adirection = context.getNearestLookingDirections();
        for(Direction direction : adirection) {
            /*if (direction.getAxis().isHorizontal()) {
                Direction direction1 = direction.getOpposite();
                blockstate = blockstate.with(HORIZONTAL_FACING, direction1);
            }*/
            if (direction == Direction.DOWN) {
                blockstate = this.getDefaultState().with(LEVEL, BranchCrossShape.BOTTOM);
                break;
            }
            if (direction == Direction.UP) {
                blockstate = this.getDefaultState().with(LEVEL, BranchCrossShape.TOP);
                break;
            }
            if (direction.getAxis().isHorizontal()) {
                blockstate = this.getDefaultState().with(LEVEL, BranchCrossShape.MID);
                break;
            }
        }
        /*if (direction == Direction.DOWN) {
            blockstate = this.getDefaultState().with(LEVEL, BranchCrossShape.BOTTOM);
        }
        else if (direction == Direction.UP) {
            blockstate = this.getDefaultState().with(LEVEL, BranchCrossShape.TOP);
        }
        else {
            blockstate = this.getDefaultState().with(LEVEL, BranchCrossShape.MID);
        }*/
        return blockstate;
        //return blockstate.with(LEVEL, getShapeProperty(blockstate, context.getWorld(), blockpos));

    }

    private static BranchCrossShape getShapeProperty(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Direction direction = state.get(HORIZONTAL_FACING);
        BlockState blockstate = worldIn.getBlockState(pos.offset(direction));

        BlockState blockstate1 = worldIn.getBlockState(pos.offset(direction.getOpposite()));
        if (state.get(HORIZONTAL_FACING) == Direction.UP) {
            return BranchCrossShape.TOP;
        }
        if (state.get(HORIZONTAL_FACING) == Direction.DOWN) {
            return BranchCrossShape.BOTTOM;
        }
        return BranchCrossShape.MID;
    }

    /*public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }*/

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        if (state.get(LEVEL) == BranchCrossShape.TOP) {
            return SHAPE_TOP;
        }
        if (state.get(LEVEL) == BranchCrossShape.BOTTOM) {
            return SHAPE_FLOOR;
        }
        return SHAPE_MID;
    }

    @SuppressWarnings("deprecation")
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(HORIZONTAL_FACING, rot.rotate(state.get(HORIZONTAL_FACING)));
    }

    @SuppressWarnings("deprecation")
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(HORIZONTAL_FACING)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, LEVEL);
    }
}
