package com.NemoXFish.epicruby.init;

import com.NemoXFish.epicruby.EpicRuby;
import com.NemoXFish.epicruby.blocks.RubyBlock;
import com.NemoXFish.epicruby.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// Registers blocks
public class EpicRubyBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EpicRuby.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
}
