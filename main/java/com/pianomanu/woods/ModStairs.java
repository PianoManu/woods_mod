package com.pianomanu.woods;


import net.minecraft.block.*;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nullable;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = WoodsMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(WoodsMain.MOD_ID)

public class ModStairs extends StairsBlock {

    //public static final EnumProperty<StairsShape> SHAPE = BlockStateProperties.STAIRS_SHAPE;

    public static Block mossy_oak_stairs;

    public ModStairs(BlockState state, Properties properties) {
        super(state, properties);
        setRegistryName("mossy_oak_stairs");
    }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //all block instances
        event.getRegistry().registerAll(

                //mossy_oak_stairs = registerBlock(new StairsBlock(mossy_oak_stairs.getDefaultState(), Properties.create(Material.WOOD))),

        );
    }


    public static Block registerBlock(Block block, BlockItem itemBlock, String name) {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        if (itemBlock != null) {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }
}
