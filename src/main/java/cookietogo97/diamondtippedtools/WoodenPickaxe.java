package cookietogo97.diamondtippedtools;

import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;

public class WoodenPickaxe extends ItemToolPickaxe {
	public WoodenPickaxe(String name, int id) {
		super(name, id, (new ToolMaterial()).setDurability(96).setEfficiency(3.0F, 6.0F).setMiningLevel(0));
	}
}
