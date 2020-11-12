package com.NemoXFish.epicruby.items;

import com.NemoXFish.epicruby.EpicRuby;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

// Properties for poison apple
public class PoisonApple extends Item {
    public PoisonApple() {
        super(new Properties()
                .group(EpicRuby.TAB)
                .food(new Food.Builder()
                    .hunger(4)
                    .saturation(1.2f)
                    .effect(() -> new EffectInstance(Effects.POISON, 10 * 20, 1), 0.2f)
                    .effect(() -> new EffectInstance(Effects.NAUSEA, 15 * 20, 1), 1)
                    .setAlwaysEdible()
                    .build())
        );
    }
}