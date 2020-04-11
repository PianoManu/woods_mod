package com.pianomanu.woods.block;

import com.google.common.collect.Maps;
import com.pianomanu.woods.enums.BranchCrossShape;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SixWayBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

import java.util.Map;

public class WoodsBaseBranchBlock extends SixWayBlock {
    private static final Direction[] FACING_VALUES = Direction.values();
    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty UP = BlockStateProperties.UP;
    public static final BooleanProperty DOWN = BlockStateProperties.DOWN;
    public static final Map<Direction, BooleanProperty> FACING_TO_PROPERTY_MAP = Util.make(Maps.newEnumMap(Direction.class), (p_203421_0_) -> {
        p_203421_0_.put(Direction.NORTH, NORTH);
        p_203421_0_.put(Direction.EAST, EAST);
        p_203421_0_.put(Direction.SOUTH, SOUTH);
        p_203421_0_.put(Direction.WEST, WEST);
        p_203421_0_.put(Direction.UP, UP);
        p_203421_0_.put(Direction.DOWN, DOWN);
    });
    public static final VoxelShape BASE = Block.makeCuboidShape(4.0D, 4.0D, 4.0D, 12.0D, 12.0D, 12.0D);
    public static final VoxelShape P1 = Block.makeCuboidShape(0.0D, 4.0D, 4.0D, 4.0D, 12.0D, 12.0D);
    public static final VoxelShape P2 = Block.makeCuboidShape(12.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D);
    public static final VoxelShape P3 = Block.makeCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 4.0D, 12.0D);
    public static final VoxelShape P4 = Block.makeCuboidShape(4.0D, 12.0D, 4.0D, 12.0D, 16.0D, 12.0D);
    public static final VoxelShape P5 = Block.makeCuboidShape(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 4.0D);
    public static final VoxelShape P6 = Block.makeCuboidShape(4.0D, 4.0D, 12.0D, 12.0D, 12.0D, 16.0D);

    protected final VoxelShape[] shapes;

    public WoodsBaseBranchBlock(Block.Properties properties) {
        super(0.25F, properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, false).with(EAST, false).with(SOUTH, false).with(WEST, false).with(UP, false).with(DOWN, false));
        this.shapes = this.makeShapes(0.25F);
    }


    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, WEST, SOUTH, UP, DOWN);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.makeConnections(context.getWorld(), context.getPos());
    }

    public BlockState makeConnections(IBlockReader p_196497_1_, BlockPos p_196497_2_) {
        Block block = p_196497_1_.getBlockState(p_196497_2_.down()).getBlock();
        Block block1 = p_196497_1_.getBlockState(p_196497_2_.up()).getBlock();
        Block block2 = p_196497_1_.getBlockState(p_196497_2_.north()).getBlock();
        Block block3 = p_196497_1_.getBlockState(p_196497_2_.east()).getBlock();
        Block block4 = p_196497_1_.getBlockState(p_196497_2_.south()).getBlock();
        Block block5 = p_196497_1_.getBlockState(p_196497_2_.west()).getBlock();
        return this.getDefaultState().with(DOWN, block != Blocks.AIR).with(UP, block1 != Blocks.AIR).with(NORTH, block2 != Blocks.AIR).with(EAST, block3 != Blocks.AIR).with(SOUTH, block4 != Blocks.AIR).with(WEST, block5 != Blocks.AIR);
    }

    private VoxelShape[] makeShapes(float apothem) {
        float f = 0.5F - apothem;
        float f1 = 0.5F + apothem;
        VoxelShape voxelshape = Block.makeCuboidShape((double)(f * 16.0F), (double)(f * 16.0F), (double)(f * 16.0F), (double)(f1 * 16.0F), (double)(f1 * 16.0F), (double)(f1 * 16.0F));
        VoxelShape[] avoxelshape = new VoxelShape[FACING_VALUES.length];

        for(int i = 0; i < FACING_VALUES.length; ++i) {
            Direction direction = FACING_VALUES[i];
            avoxelshape[i] = VoxelShapes.create(0.5D + Math.min((double)(-apothem), (double)direction.getXOffset() * 0.5D), 0.5D + Math.min((double)(-apothem), (double)direction.getYOffset() * 0.5D), 0.5D + Math.min((double)(-apothem), (double)direction.getZOffset() * 0.5D), 0.5D + Math.max((double)apothem, (double)direction.getXOffset() * 0.5D), 0.5D + Math.max((double)apothem, (double)direction.getYOffset() * 0.5D), 0.5D + Math.max((double)apothem, (double)direction.getZOffset() * 0.5D));
        }

        VoxelShape[] avoxelshape1 = new VoxelShape[64];

        for(int k = 0; k < 64; ++k) {
            VoxelShape voxelshape1 = voxelshape;

            for(int j = 0; j < FACING_VALUES.length; ++j) {
                if ((k & 1 << j) != 0) {
                    voxelshape1 = VoxelShapes.or(voxelshape1, avoxelshape[j]);
                }
            }

            avoxelshape1[k] = voxelshape1;
        }

        return avoxelshape1;
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return this.shapes[this.getShapeIndex(state)];
    }

    protected int getShapeIndex(BlockState state) {
        int i = 0;

        for(int j = 0; j < FACING_VALUES.length; ++j) {
            if (state.get(FACING_TO_PROPERTY_MAP.get(FACING_VALUES[j]))) {
                i |= 1 << j;
            }
        }

        return i;
    }

    /*public BlockRenderLayer getRenderLayer() { //not working in 1.15
        return BlockRenderLayer.CUTOUT;
    }*/

    @SuppressWarnings("deprecation")
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return true;
    }

    @SuppressWarnings("deprecation")
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (!stateIn.isValidPosition(worldIn, currentPos)) {
            worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, 1);
            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        } else {
            Block block = facingState.getBlock();
            boolean flag = block != Blocks.AIR;
            return stateIn.with(FACING_TO_PROPERTY_MAP.get(facing), Boolean.valueOf(flag));
        }
    }
}
