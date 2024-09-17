package cookietogo97.diamondtippedtools;

import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;

public class StonePickaxe extends ItemToolPickaxe {
	public StonePickaxe(String name, int id) {
		super(name, id, (new ToolMaterial()).setDurability(192).setEfficiency(6.0F, 9.0F).setMiningLevel(1));
	}
}
