package manueh.magic_powders_mod.init;

import manueh.magic_powders_mod.Main;
import manueh.magic_powders_mod.common.blocks.HookahBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final RegistryObject<Block> HOOKAH = BLOCKS.register("hookah",
            () -> new HookahBlock(BlockBehaviour.Properties.of(Material.GLASS,
                            MaterialColor.TERRACOTTA_RED)
                    .sound(SoundType.FUNGUS)));

}
