package com.NemoXFish.epicruby.util;

import com.NemoXFish.epicruby.EpicRuby;
import com.NemoXFish.epicruby.armor.ModArmorMaterial;
import com.NemoXFish.epicruby.blocks.BlockItemBase;
import com.NemoXFish.epicruby.blocks.RubyBlock;
import com.NemoXFish.epicruby.blocks.RubyOre;
import com.NemoXFish.epicruby.items.ItemBase;
import com.NemoXFish.epicruby.items.PoisonApple;
import com.NemoXFish.epicruby.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.FoodStats;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EpicRuby.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EpicRuby.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<PoisonApple> POISON_APPLE = ITEMS.register("poison_apple", PoisonApple::new);

    // Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 4, -2.4f, new Item.Properties().group(EpicRuby.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.8f, new Item.Properties().group(EpicRuby.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 5, -3.1f, new Item.Properties().group(EpicRuby.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 0.5f, -3.8f, new Item.Properties().group(EpicRuby.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, 1, -1.0f, new Item.Properties().group(EpicRuby.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(EpicRuby.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(EpicRuby.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(EpicRuby.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(EpicRuby.TAB)));


    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
}