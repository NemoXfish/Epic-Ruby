package com.NemoXFish.epicruby.blocks;

import com.NemoXFish.epicruby.EpicRuby;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

// Puts blocks into creative tab
public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(EpicRuby.TAB));
    }
}