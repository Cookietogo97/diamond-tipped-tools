package cookietogo97.diamondtippedtools;

import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;

public class SteelPickaxe extends ItemToolPickaxe {
	public SteelPickaxe(String name, int id) {
		super(name, id, (new ToolMaterial()).setDurability(6912).setEfficiency(10.5F, 21.0F).setMiningLevel(3));
	}
}
