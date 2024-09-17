package cookietogo97.diamondtippedtools;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;

public class SteelPickaxe extends ItemToolPickaxe {
	public SteelPickaxe(String name, int id) {
		super(name, id, ToolMaterial.steel);
	}

	@Override
	public float getStrVsBlock(ItemStack itemstack, Block block) {
		return super.getStrVsBlock(itemstack, block) * (float)2;
	}
}
