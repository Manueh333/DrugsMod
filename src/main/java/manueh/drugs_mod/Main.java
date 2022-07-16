package manueh.drugs_mod;

import manueh.drugs_mod.init.BlockInit;
import manueh.drugs_mod.init.ItemInit;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MODID)
public class Main
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "drugs_mod";
    public static final CreativeModeTab GROUP = new MainTab("drugs_mod");


    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

    }




    public static class MainTab extends CreativeModeTab {

        public MainTab(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.HOOKAH.get().getDefaultInstance();
        }
    }


}