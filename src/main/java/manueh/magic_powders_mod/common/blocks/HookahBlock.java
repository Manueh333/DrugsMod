package manueh.magic_powders_mod.common.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class HookahBlock extends Block {




    public VoxelShape makeShape(){
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.3125, 0, 0.3125, 0.6875, 0.125, 0.6875), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.34375, 0.125, 0.34375, 0.65625, 0.1875, 0.65625), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.40625, 0.1875, 0.40625, 0.59375, 0.609375, 0.59375), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.375, 0.609375, 0.375, 0.625, 0.671875, 0.625), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.4375, 0.671875, 0.4375, 0.5625, 1.046875, 0.5625), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.3125, 1.046875, 0.3125, 0.6875, 1.09375, 0.6875), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.28125, 1.09375, 0.28125, 0.71875, 1.109375, 0.71875), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.13618326175840778, 0.703125, 0.46875, 0.3169417382415922, 0.765625, 0.53125), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.359375, 0.4018082617584078, 0.46875, 0.421875, 0.5513167382415922, 0.53125), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.02680826175840778, 0.71875, 0.46875, 0.14506673824159222, 0.75, 0.53125), IBooleanFunction.OR);

        return shape;
    }


    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return makeShape();
    }

    public HookahBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }





    @Override
    public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity player, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 60));
        player.addEffect(new EffectInstance(Effects.LEVITATION, 40));
        player.addEffect(new EffectInstance(Effects.WEAKNESS, 40));
        player.addEffect(new EffectInstance(Effects.BLINDNESS, 40));
        return super.use(p_225533_1_, p_225533_2_, p_225533_3_, player, p_225533_5_, p_225533_6_);
    }
}
