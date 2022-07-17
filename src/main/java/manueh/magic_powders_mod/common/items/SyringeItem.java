package manueh.magic_powders_mod.common.items;

import manueh.magic_powders_mod.init.ItemInit;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SyringeItem extends Item {


    public SyringeItem(Item.Properties p_i48487_1_) {

        super(p_i48487_1_);

    }

    public ItemStack finishUsingItem(ItemStack p_40684_, Level p_40685_, LivingEntity p_40686_) {
        ItemStack itemstack = super.finishUsingItem(p_40684_, p_40685_, p_40686_);
        return p_40686_ instanceof Player && ((Player)p_40686_).getAbilities().instabuild ? itemstack : new ItemStack(ItemInit.SYRINGE.get());
    }

}
