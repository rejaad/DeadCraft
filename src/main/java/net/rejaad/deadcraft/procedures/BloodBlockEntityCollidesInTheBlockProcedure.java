package net.rejaad.deadcraft.procedures;

import net.minecraft.world.entity.Entity;

public class BloodBlockEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isAlive()) {
			entity.fallDistance = (float) 0.05;
		}
	}
}
