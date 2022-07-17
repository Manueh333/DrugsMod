package manueh.magic_powders_mod.init;

import manueh.magic_powders_mod.Main;
import manueh.magic_powders_mod.common.blocks.HookahBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final RegistryObject<Block> HOOKAH = BLOCKS.register("hookah",
            () -> new HookahBlock(AbstractBlock.Properties.of(Material.GLASS,
                            MaterialColor.TERRACOTTA_RED)
                    .sound(SoundType.FUNGUS)));

}
