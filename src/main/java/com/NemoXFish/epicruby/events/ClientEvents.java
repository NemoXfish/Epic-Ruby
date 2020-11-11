package com.NemoXFish.epicruby.events;

import com.NemoXFish.epicruby.EpicRuby;
import com.NemoXFish.epicruby.init.EpicRubyItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// This poisons the sheep if it is hit with a poison apple
@Mod.EventBusSubscriber(modid = EpicRuby.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void onDamageSheep(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == EpicRubyItems.POISON_APPLE.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof SheepEntity) {
                    PlayerEntity player = event.getPlayer();
                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10 * 20, 1));
                    target.setGlowing(true);
                    if (!event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.RED + "That sheep isn't feeling so well...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }
}