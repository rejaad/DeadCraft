package net.rejaad.deadcraft.procedures;

import net.rejaad.deadcraft.init.DeadcraftModBlocks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class BleedingEffectTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double playerX = x;
		double playerY = y;
		double playerZ = z;

		// Apply bleed damage to the player
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE)
				.getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("deadcraft:bleed_damage")))), 
				(float) 0.25);
		world.setBlock(BlockPos.containing(x, y, z), DeadcraftModBlocks.BLOOD_SPLATTER.get().defaultBlockState(), 3);

		// Only apply to players
		if (entity instanceof Player) {
			// Define the area to search for mobs
			final Vec3 _center = new Vec3(playerX, playerY, playerZ);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
					.toList();

			// Loop through the entities found and check if they are undead mobs
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Mob _mob) {
					if (_mob.getMobType() == MobType.UNDEAD) {
						// Move undead mobs towards the player's position
						_mob.getNavigation().moveTo(playerX, playerY, playerZ, 1.5);
					}
				}
			}
		}
	}
}