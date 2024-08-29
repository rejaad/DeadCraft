package net.rejaad.deadcraft.procedures;

import net.rejaad.deadcraft.init.DeadcraftModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class BarricadeCollideProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(DeadcraftModMobEffects.BLEEDING_EFFECT.get(), 60, 1, false, false));
	}
}
