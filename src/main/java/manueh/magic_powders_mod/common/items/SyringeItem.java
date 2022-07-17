package manueh.magic_powders_mod.common.items;

import manueh.magic_powders_mod.init.ItemInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SyringeItem extends Item {


    public SyringeItem(Item.Properties p_i48487_1_) {

        super(p_i48487_1_);

    }

    public ItemStack finishUsingItem(ItemStack p_77654_1_, World p_77654_2_, LivingEntity p_77654_3_) {
        ItemStack itemstack = super.finishUsingItem(p_77654_1_, p_77654_2_, p_77654_3_);
        return p_77654_3_ instanceof PlayerEntity && ((PlayerEntity)p_77654_3_).abilities.instabuild ? itemstack : new ItemStack(ItemInit.SYRINGE.get());
    }



}
