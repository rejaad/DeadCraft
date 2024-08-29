
package net.rejaad.deadcraft.potion;

import net.rejaad.deadcraft.procedures.BleedingEffectTickProcedure;
import net.rejaad.deadcraft.procedures.BleedingEffectActiveTickConditionProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BleedingEffectMobEffect extends MobEffect {
	public BleedingEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -6750208);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BleedingEffectTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return BleedingEffectActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
