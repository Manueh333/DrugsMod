package manueh.magic_powders_mod.common.blocks;


import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HookahBlock extends Block {




    public VoxelShape makeShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.3125, 0, 0.3125, 0.6875, 0.125, 0.6875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.34375, 0.125, 0.34375, 0.65625, 0.1875, 0.65625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.40625, 0.1875, 0.40625, 0.59375, 0.609375, 0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.609375, 0.375, 0.625, 0.671875, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.671875, 0.4375, 0.5625, 1.046875, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.3125, 1.046875, 0.3125, 0.6875, 1.09375, 0.6875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.28125, 1.09375, 0.28125, 0.71875, 1.109375, 0.71875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.13618326175840778, 0.703125, 0.46875, 0.3169417382415922, 0.765625, 0.53125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.359375, 0.4018082617584078, 0.46875, 0.421875, 0.5513167382415922, 0.53125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.02680826175840778, 0.71875, 0.46875, 0.14506673824159222, 0.75, 0.53125), BooleanOp.OR);

        return shape;
    }


    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return makeShape();
    }

    public HookahBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }


    @Override
    public InteractionResult use(BlockState p_60503_, Level p_60504_, BlockPos p_60505_, Player player, InteractionHand p_60507_, BlockHitResult p_60508_) {
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60));
        player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 40));
        player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 40));
        player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 40));

        return super.use(p_60503_, p_60504_, p_60505_, player, p_60507_, p_60508_);
    }



}
