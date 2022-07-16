package manueh.drugs_mod.init;

import manueh.drugs_mod.Main;
import manueh.drugs_mod.common.blocks.HookahBlock;

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
