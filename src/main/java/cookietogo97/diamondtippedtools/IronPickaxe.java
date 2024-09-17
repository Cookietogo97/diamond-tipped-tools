package cookietogo97.diamondtippedtools;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;

public class IronPickaxe extends ItemToolPickaxe {
	public IronPickaxe(String name, int id) {
		super(name, id, ToolMaterial.iron);
	}

	@Override
	public float getStrVsBlock(ItemStack itemstack, Block block) {
		return super.getStrVsBlock(itemstack, block) * (float)2;
	}
}
