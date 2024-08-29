
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rejaad.deadcraft.init;

import net.rejaad.deadcraft.DeadcraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class DeadcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeadcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> DEADCRAFT_CM = REGISTRY.register("deadcraft_cm",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.deadcraft.deadcraft_cm")).icon(() -> new ItemStack(Blocks.ZOMBIE_WALL_HEAD)).displayItems((parameters, tabData) -> {
				tabData.accept(DeadcraftModBlocks.BARRICADE_OAK.get().asItem());
				tabData.accept(DeadcraftModBlocks.BARRICADE_BIRCH.get().asItem());
				tabData.accept(DeadcraftModBlocks.BARICADE_ACACIA.get().asItem());
				tabData.accept(DeadcraftModBlocks.BARICADE_CHERRY.get().asItem());
				tabData.accept(DeadcraftModBlocks.BARICADE_DARK_OAK.get().asItem());
				tabData.accept(DeadcraftModBlocks.BARICADE_JUNGLE.get().asItem());
				tabData.accept(DeadcraftModBlocks.BARICADE_MANGROVE.get().asItem());
				tabData.accept(DeadcraftModBlocks.BARICADE_SPRUCE.get().asItem());
				tabData.accept(DeadcraftModBlocks.BLOOD_SPLATTER.get().asItem());
				tabData.accept(DeadcraftModItems.BLOOD_BOTTLE.get());
				tabData.accept(DeadcraftModBlocks.BLOOD_BLOCK.get().asItem());
				tabData.accept(DeadcraftModItems.BANDAGES.get());
			})

					.build());
}
