package manueh.magic_powders_mod.events;

import manueh.magic_powders_mod.Main;
import manueh.magic_powders_mod.init.ItemInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonEvents {

    @SubscribeEvent
    public static void syringeUse(LivingDamageEvent event) {
       LivingEntity entity = (LivingEntity)event.getEntity();
        if(event.getSource().getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getSource().getEntity();
            if(player.getMainHandItem().getItem().equals(ItemInit.FULL_SYRINGE.get())) {
                entity.addEffect(new EffectInstance(Effects.WITHER, 2400, 3));
                entity.addEffect(new EffectInstance(Effects.LEVITATION, 2400, 3));
                entity.addEffect(new EffectInstance(Effects.CONFUSION, 2400, 3));
                entity.addEffect(new EffectInstance(Effects.WEAKNESS, 2400, 3));
                entity.addEffect(new EffectInstance(Effects.INVISIBILITY, 2400, 3));
                player.setItemSlot(EquipmentSlotType.MAINHAND, ItemInit.SYRINGE.get().getDefaultInstance());
            }

        }

    }
}


