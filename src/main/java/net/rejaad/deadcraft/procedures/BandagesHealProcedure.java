package net.rejaad.deadcraft.procedures;

import net.rejaad.deadcraft.init.DeadcraftModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class BandagesHealProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(DeadcraftModMobEffects.BLEEDING_EFFECT.get());
	}
}
