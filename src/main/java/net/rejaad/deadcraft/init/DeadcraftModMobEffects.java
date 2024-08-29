
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rejaad.deadcraft.init;

import net.rejaad.deadcraft.potion.BleedingEffectMobEffect;
import net.rejaad.deadcraft.DeadcraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class DeadcraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DeadcraftMod.MODID);
	public static final RegistryObject<MobEffect> BLEEDING_EFFECT = REGISTRY.register("bleeding_effect", () -> new BleedingEffectMobEffect());
}
