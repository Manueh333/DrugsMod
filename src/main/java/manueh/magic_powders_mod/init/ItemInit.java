package manueh.magic_powders_mod.init;

import manueh.magic_powders_mod.Main;
import manueh.magic_powders_mod.common.items.SyringeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    //BLOCK
    public static final RegistryObject<BlockItem> HOOKAH = ITEMS.register("hookah",
            () -> new BlockItem(BlockInit.HOOKAH.get(), new Item.Properties().tab(Main.GROUP)));


    public static final Food GOOD_BLUNT = (new Food.Builder()).nutrition(4).saturationMod(1.2F).effect(new EffectInstance(Effects.CONFUSION, 350, 1), 1.0F).effect(new EffectInstance(Effects.GLOWING, 2400, 0), 1.0F).effect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 2400, 0), 1.0F).effect(new EffectInstance(Effects.BLINDNESS, 100, 0), 1.0F).effect(new EffectInstance(Effects.REGENERATION, 100, 0), 1.0F).alwaysEat().build();

    public static final Food BAD_BLUNT = (new Food.Builder()).nutrition(4).saturationMod(1.2F).effect(new EffectInstance(Effects.CONFUSION, 350, 1), 1.0F).effect(new EffectInstance(Effects.GLOWING, 2400, 0), 1.0F).effect(new EffectInstance(Effects.MOVEMENT_SPEED, 2400, 0), 1.0F).effect(new EffectInstance(Effects.BLINDNESS, 100, 0), 1.0F).effect(new EffectInstance(Effects.POISON, 100, 0), 1.0F).alwaysEat().build();

    public static final Food SYRINGE_FOOD = (new Food.Builder()).nutrition(4).saturationMod(1.2F).effect(new EffectInstance(Effects.CONFUSION, 2400, 3), 1.0F).effect(new EffectInstance(Effects.INVISIBILITY, 2400, 0), 1.0F).effect(new EffectInstance(Effects.WEAKNESS, 2400, 0), 1.0F).effect(new EffectInstance(Effects.WITHER, 2400, 0), 1.0F).effect(new EffectInstance(Effects.LEVITATION, 2400, 0), 1.0F).alwaysEat().build();


    public static final RegistryObject<Item> GOOD_BLUNT_ITEM = ITEMS.register("good_blunt",
            () -> new Item((new Item.Properties()).tab(Main.GROUP).rarity(Rarity.RARE).food(GOOD_BLUNT)));

    public static final RegistryObject<Item> BAD_BLUNT_ITEM = ITEMS.register("bad_blunt",
            () -> new Item((new Item.Properties()).tab(Main.GROUP).rarity(Rarity.RARE).food(BAD_BLUNT)));

    public static final RegistryObject<Item> FULL_SYRINGE = ITEMS.register("full_syringe",
            () -> new SyringeItem((new Item.Properties()).tab(Main.GROUP).rarity(Rarity.RARE).food(SYRINGE_FOOD).stacksTo(1)));
    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item((new Item.Properties()).tab(Main.GROUP).rarity(Rarity.RARE).stacksTo(1)));


}
