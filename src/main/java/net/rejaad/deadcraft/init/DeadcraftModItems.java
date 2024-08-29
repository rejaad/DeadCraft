
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rejaad.deadcraft.init;

import net.rejaad.deadcraft.item.BloodBottleItem;
import net.rejaad.deadcraft.item.BandagesItem;
import net.rejaad.deadcraft.DeadcraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class DeadcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DeadcraftMod.MODID);
	public static final RegistryObject<Item> BLOOD_SPLATTER = block(DeadcraftModBlocks.BLOOD_SPLATTER);
	public static final RegistryObject<Item> BARRICADE_OAK = block(DeadcraftModBlocks.BARRICADE_OAK);
	public static final RegistryObject<Item> BARRICADE_BIRCH = block(DeadcraftModBlocks.BARRICADE_BIRCH);
	public static final RegistryObject<Item> BARICADE_ACACIA = block(DeadcraftModBlocks.BARICADE_ACACIA);
	public static final RegistryObject<Item> BARICADE_CHERRY = block(DeadcraftModBlocks.BARICADE_CHERRY);
	public static final RegistryObject<Item> BARICADE_DARK_OAK = block(DeadcraftModBlocks.BARICADE_DARK_OAK);
	public static final RegistryObject<Item> BARICADE_JUNGLE = block(DeadcraftModBlocks.BARICADE_JUNGLE);
	public static final RegistryObject<Item> BARICADE_MANGROVE = block(DeadcraftModBlocks.BARICADE_MANGROVE);
	public static final RegistryObject<Item> BARICADE_SPRUCE = block(DeadcraftModBlocks.BARICADE_SPRUCE);
	public static final RegistryObject<Item> BLOOD_BOTTLE = REGISTRY.register("blood_bottle", () -> new BloodBottleItem());
	public static final RegistryObject<Item> BLOOD_BLOCK = block(DeadcraftModBlocks.BLOOD_BLOCK);
	public static final RegistryObject<Item> BANDAGES = REGISTRY.register("bandages", () -> new BandagesItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
