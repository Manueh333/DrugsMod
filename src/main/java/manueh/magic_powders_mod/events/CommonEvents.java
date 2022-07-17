package manueh.magic_powders_mod.events;

import manueh.magic_powders_mod.Main;
import manueh.magic_powders_mod.init.ItemInit;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonEvents {

    @SubscribeEvent
    public static void syringeUse(LivingDamageEvent event) {
       LivingEntity entity = (LivingEntity)event.getEntity();
        if(event.getSource().getEntity() instanceof Player) {
            Player player = (Player) event.getSource().getEntity();
            if(player.getMainHandItem().getItem().equals(ItemInit.FULL_SYRINGE.get())) {
                entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 2400, 3));
                entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2400, 3));
                entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 2400, 3));
                entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 2400, 3));
                entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2400, 3));
                player.setItemSlot(EquipmentSlot.MAINHAND, ItemInit.SYRINGE.get().getDefaultInstance());
            }

        }

    }
}


