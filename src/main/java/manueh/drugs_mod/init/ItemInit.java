package manueh.drugs_mod.init;

import manueh.drugs_mod.Main;
import manueh.drugs_mod.common.items.SyringeItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    //BLOCK
    public static final RegistryObject<BlockItem> HOOKAH = ITEMS.register("hookah",
            () -> new BlockItem(BlockInit.HOOKAH.get(), new Item.Properties().tab(Main.GROUP)));


    public static final FoodProperties GOOD_BLUNT = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.CONFUSION, 350, 1), 1.0F).effect(new MobEffectInstance(MobEffects.GLOWING, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 0), 1.0F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).alwaysEat().build();

    public static final FoodProperties BAD_BLUNT = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.CONFUSION, 350, 1), 1.0F).effect(new MobEffectInstance(MobEffects.GLOWING, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 0), 1.0F).effect(new MobEffectInstance(MobEffects.POISON, 100, 0), 1.0F).alwaysEat().build();

    public static final FoodProperties SYRINGE_FOOD = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.CONFUSION, 2400, 3), 1.0F).effect(new MobEffectInstance(MobEffects.INVISIBILITY, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.WEAKNESS, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.WITHER, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.LEVITATION, 2400, 0), 1.0F).alwaysEat().build();


    public static final RegistryObject<Item> GOOD_BLUNT_ITEM = ITEMS.register("good_blunt",
            () -> new Item((new Item.Properties()).tab(Main.GROUP).rarity(Rarity.RARE).food(GOOD_BLUNT)));

    public static final RegistryObject<Item> BAD_BLUNT_ITEM = ITEMS.register("bad_blunt",
            () -> new Item((new Item.Properties()).tab(Main.GROUP).rarity(Rarity.RARE).food(BAD_BLUNT)));

    public static final RegistryObject<Item> FULL_SYRINGE = ITEMS.register("full_syringe",
            () -> new SyringeItem((new Item.Properties()).tab(Main.GROUP).rarity(Rarity.RARE).food(SYRINGE_FOOD).stacksTo(1)));
    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item((new Item.Properties()).tab(Main.GROUP).rarity(Rarity.RARE).stacksTo(1)));


}
