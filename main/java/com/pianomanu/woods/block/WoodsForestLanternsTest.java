package com.pianomanu.woods.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;


public class WoodsForestLanternsTest extends Block{
    private static final VoxelShape BASE_SHAPE = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D);
    private static final VoxelShape TOP_LINE1_SHAPE = Block.makeCuboidShape(4.0D, 7.0D, 5.0D, 12.0D, 8.0D, 6.0D);
    private static final VoxelShape TOP_LINE2_SHAPE = Block.makeCuboidShape(5.0D, 7.0D, 4.0D, 6.0D, 8.0D, 12.0D);
    private static final VoxelShape TOP_LINE3_SHAPE = Block.makeCuboidShape(10.0D, 7.0D, 4.0D, 11.0D, 8.0D, 12.0D);
    private static final VoxelShape TOP_LINE4_SHAPE = Block.makeCuboidShape(4.0D, 7.0D, 10.0D, 12.0D, 8.0D, 11.0D);
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

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return func_220055_a(worldIn, pos.down(), Direction.UP);
    }

    @SuppressWarnings("deprecation")
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        double d0 = (double)pos.getX() + 0.5D;
        double d1 = (double)pos.getY() + 0.7D;
        double d2 = (double)pos.getZ() + 0.5D;
        worldIn.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
        //worldIn.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
    }

}
