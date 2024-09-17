package cookietogo97.diamondtippedtools;

import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;

public class IronPickaxe extends ItemToolPickaxe {
	public IronPickaxe(String name, int id) {
		super(name, id, (new ToolMaterial()).setDurability(576).setEfficiency(9.0F, 12.0F).setMiningLevel(2));
	}
}
