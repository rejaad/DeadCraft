package net.rejaad.deadcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BloodSplatterDisappearProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		assert Boolean.TRUE; //#dbg:BloodSplatterDisappear:Blood_B_Gone
	}
}
