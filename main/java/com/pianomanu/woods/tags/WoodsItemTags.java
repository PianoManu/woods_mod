package com.pianomanu.woods.tags;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagCollection;
import net.minecraft.util.ResourceLocation;

import java.util.Optional;

public class WoodsItemTags extends ItemTags {

    private static TagCollection<Item> collection = new TagCollection<>((p_203643_0_) -> {
        return Optional.empty();
    }, "", false, "");

    public static final Tag<Item> MOSSY_PLANKS = makeWrapperTag("mossy_planks");

    private static Tag<Item> makeWrapperTag(String p_199901_0_) {
        return new ItemTags.Wrapper(new ResourceLocation(p_199901_0_));
    }
}
