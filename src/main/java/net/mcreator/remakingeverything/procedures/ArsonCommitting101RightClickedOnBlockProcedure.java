package net.mcreator.remakingeverything.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ArsonCommitting101RightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), Blocks.FIRE.defaultBlockState(), 3);
	}
}
