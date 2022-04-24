
package net.mcreator.remakingeverything.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;

import net.mcreator.remakingeverything.procedures.ArsonCommitting101RightClickedOnBlockProcedure;

public class ArsonCommitting101Item extends Item {
	public ArsonCommitting101Item() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("arson_committing_101");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		ArsonCommitting101RightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ());
		return retval;
	}
}
