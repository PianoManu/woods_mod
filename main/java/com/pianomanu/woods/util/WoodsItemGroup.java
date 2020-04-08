package com.pianomanu.woods.util;

import com.pianomanu.woods.list.BlockList;
import com.pianomanu.woods.list.ItemList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WoodsItemGroup extends ItemGroup {
    private String name;

    public WoodsItemGroup(String label) {
        super(label);
        this.name = label;
    }

    @Override
    public ItemStack createIcon() {
        if (name == "woods_item_group_items")
        return new ItemStack(ItemList.moss_item);
        else
            return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockList.mossy_oak_planks));
    }
}
