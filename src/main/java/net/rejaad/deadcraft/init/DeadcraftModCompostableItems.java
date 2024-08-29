
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rejaad.deadcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DeadcraftModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(DeadcraftModItems.BLOOD_BOTTLE.get(), 0.2f);
	}
}
