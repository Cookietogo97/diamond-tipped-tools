package cookietogo97.diamondtippedtools;

import net.minecraft.core.item.material.ToolMaterial;

public class ToolMaterialTipped extends ToolMaterial {
	public static final ToolMaterial tipped_wood = (new ToolMaterial()).setDurability(96).setEfficiency(3.0F, 6.0F).setMiningLevel(0);
	public static final ToolMaterial tipped_stone = (new ToolMaterial()).setDurability(192).setEfficiency(6.0F, 9.0F).setMiningLevel(1);
	public static final ToolMaterial tipped_iron = (new ToolMaterial()).setDurability(576).setEfficiency(9.0F, 12.0F).setMiningLevel(2);
	public static final ToolMaterial tipped_steel = (new ToolMaterial()).setDurability(6912).setEfficiency(10.5F, 21.0F).setMiningLevel(3);
	public static final ToolMaterial tipped_gold = (new ToolMaterial()).setDurability(384).setEfficiency(10.5F, 18.0F).setMiningLevel(2).setSilkTouch(true);
}
