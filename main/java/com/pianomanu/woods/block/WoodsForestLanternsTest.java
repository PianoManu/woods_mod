package com.pianomanu.woods.block;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.pianomanu.woods.util.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.ArrayList;
import java.util.List;



public class WoodsForestLanternsTest extends Block{
    private static final VoxelShape BASE_SHAPE = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 8.0D, 11.0D);
    private static final VoxelShape TOP_LINE1_SHAPE = Block.makeCuboidShape(4.0D, 8.0D, 5.0D, 12.0D, 9.0D, 6.0D);
    private static final VoxelShape TOP_LINE2_SHAPE = Block.makeCuboidShape(5.0D, 8.0D, 4.0D, 6.0D, 9.0D, 12.0D);
    private static final VoxelShape TOP_LINE3_SHAPE = Block.makeCuboidShape(10.0D, 8.0D, 4.0D, 11.0D, 9.0D, 12.0D);
    private static final VoxelShape TOP_LINE4_SHAPE = Block.makeCuboidShape(4.0D, 8.0D, 10.0D, 12.0D, 9.0D, 11.0D);
    private static final VoxelShape SHAPE_OR1 = VoxelShapes.or(TOP_LINE1_SHAPE, TOP_LINE2_SHAPE);
    private static final VoxelShape SHAPE_OR2 = VoxelShapes.or(TOP_LINE3_SHAPE, TOP_LINE4_SHAPE);
    private static final VoxelShape SHAPE_OR = VoxelShapes.or(SHAPE_OR1, SHAPE_OR2);
    private static final VoxelShape SHAPE = VoxelShapes.or(BASE_SHAPE, SHAPE_OR);

    public WoodsForestLanternsTest(Properties properties) {
        super(properties);
    }

    @SuppressWarnings("deprecation")
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return  SHAPE;
    }


}
