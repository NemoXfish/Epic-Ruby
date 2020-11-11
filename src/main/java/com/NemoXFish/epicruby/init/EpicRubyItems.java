package com.NemoXFish.epicruby.init;

import com.NemoXFish.epicruby.EpicRuby;
import com.NemoXFish.epicruby.util.enums.ArmorMaterial;
import com.NemoXFish.epicruby.blocks.BlockItemBase;
import com.NemoXFish.epicruby.items.ItemBase;
import com.NemoXFish.epicruby.items.PoisonApple;
import com.NemoXFish.epicruby.util.enums.ItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


// Registers items
public class EpicRubyItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EpicRuby.MOD_ID);

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<PoisonApple> POISON_APPLE = ITEMS.register("poison_apple", PoisonApple::new);

    // Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ItemTier.RUBY, 3, -2.4f, new Item.Properties().group(EpicRuby.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ItemTier.RUBY, -1, -2.8f, new Item.Properties().group(EpicRuby.TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ItemTier.RUBY, 4, -3.1f, new Item.Properties().group(EpicRuby.TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ItemTier.RUBY, -0.5f, -3.8f, new Item.Properties().group(EpicRuby.TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ItemTier.RUBY, 0, -1.0f, new Item.Properties().group(EpicRuby.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(EpicRuby.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(EpicRuby.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(EpicRuby.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(EpicRuby.TAB)));

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItemBase(EpicRubyBlocks.RUBY_BLOCK.get()));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",
            () -> new BlockItemBase(EpicRubyBlocks.RUBY_ORE.get()));
}
