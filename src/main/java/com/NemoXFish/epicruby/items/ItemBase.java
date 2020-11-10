package com.NemoXFish.epicruby.items;

import com.NemoXFish.epicruby.EpicRuby;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(EpicRuby.TAB));
    }
}