package com.NemoXFish.epicruby;

import com.NemoXFish.epicruby.init.EpicRubyBlocks;
import com.NemoXFish.epicruby.init.EpicRubyItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("epicruby")
public class EpicRuby {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "epicruby";

    public EpicRuby() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        EpicRubyBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        EpicRubyItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    // Creative Tab
    public static final ItemGroup TAB = new ItemGroup("epicRubyTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(EpicRubyItems.RUBY.get());
        }
    };
}