package manueh.magic_powders_mod;

import manueh.magic_powders_mod.init.BlockInit;
import manueh.magic_powders_mod.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MODID)
public class Main
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "magic_powders_mod";
    public static final ItemGroup GROUP = new MainTab("magic_powders_mod");


    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

    }




    public static class MainTab extends ItemGroup {

        public MainTab(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.HOOKAH.get().getDefaultInstance();
        }
    }


}