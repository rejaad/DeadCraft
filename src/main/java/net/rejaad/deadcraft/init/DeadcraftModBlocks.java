
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rejaad.deadcraft.init;

import net.rejaad.deadcraft.block.BloodSplatterBlock;
import net.rejaad.deadcraft.block.BloodBlockBlock;
import net.rejaad.deadcraft.block.BarricadeOakBlock;
import net.rejaad.deadcraft.block.BarricadeBirchBlock;
import net.rejaad.deadcraft.block.BaricadeSpruceBlock;
import net.rejaad.deadcraft.block.BaricadeMangroveBlock;
import net.rejaad.deadcraft.block.BaricadeJungleBlock;
import net.rejaad.deadcraft.block.BaricadeDarkOakBlock;
import net.rejaad.deadcraft.block.BaricadeCherryBlock;
import net.rejaad.deadcraft.block.BaricadeAcaciaBlock;
import net.rejaad.deadcraft.DeadcraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class DeadcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DeadcraftMod.MODID);
	public static final RegistryObject<Block> BLOOD_SPLATTER = REGISTRY.register("blood_splatter", () -> new BloodSplatterBlock());
	public static final RegistryObject<Block> BARRICADE_OAK = REGISTRY.register("barricade_oak", () -> new BarricadeOakBlock());
	public static final RegistryObject<Block> BARRICADE_BIRCH = REGISTRY.register("barricade_birch", () -> new BarricadeBirchBlock());
	public static final RegistryObject<Block> BARICADE_ACACIA = REGISTRY.register("baricade_acacia", () -> new BaricadeAcaciaBlock());
	public static final RegistryObject<Block> BARICADE_CHERRY = REGISTRY.register("baricade_cherry", () -> new BaricadeCherryBlock());
	public static final RegistryObject<Block> BARICADE_DARK_OAK = REGISTRY.register("baricade_dark_oak", () -> new BaricadeDarkOakBlock());
	public static final RegistryObject<Block> BARICADE_JUNGLE = REGISTRY.register("baricade_jungle", () -> new BaricadeJungleBlock());
	public static final RegistryObject<Block> BARICADE_MANGROVE = REGISTRY.register("baricade_mangrove", () -> new BaricadeMangroveBlock());
	public static final RegistryObject<Block> BARICADE_SPRUCE = REGISTRY.register("baricade_spruce", () -> new BaricadeSpruceBlock());
	public static final RegistryObject<Block> BLOOD_BLOCK = REGISTRY.register("blood_block", () -> new BloodBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
