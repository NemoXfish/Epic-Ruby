package com.NemoXFish.cumlord.items;

import com.NemoXFish.cumlord.Cumlord;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(Cumlord.TAB));
    }
}