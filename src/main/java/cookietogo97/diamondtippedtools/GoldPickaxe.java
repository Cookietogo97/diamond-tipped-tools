package cookietogo97.diamondtippedtools;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;

public class GoldPickaxe extends ItemToolPickaxe {
	public GoldPickaxe(String name, int id) {
		super(name, id, ToolMaterial.gold);
	}

	@Override
	public float getStrVsBlock(ItemStack itemstack, Block block) {
		return super.getStrVsBlock(itemstack, block) * (float)2;
	}
}
