package cookietogo97.diamondtippedtools;

import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;

public class GoldPickaxe extends ItemToolPickaxe {
	public GoldPickaxe(String name, int id) {
		super(name, id, (new ToolMaterial()).setDurability(384).setEfficiency(10.5F, 18.0F).setMiningLevel(2).setSilkTouch(true));
	}
}
