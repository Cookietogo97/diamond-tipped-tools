package cookietogo97.diamondtippedtools;

import turniplabs.halplibe.helper.ItemBuilder;

public class DiamondTippedToolsItems {

	public static WoodenPickaxe woodenPickaxe;
	public static StonePickaxe stonePickaxe;
	public static IronPickaxe ironPickaxe;
	public static GoldPickaxe goldPickaxe;
	public static SteelPickaxe steelPickaxe;

	ItemBuilder itemBuilder = new ItemBuilder("diamondtippedtools");

	public void Initialize() {
		woodenPickaxe = itemBuilder.build((new WoodenPickaxe("tool.pickaxe.wood.tipped", 11000)));
		stonePickaxe = itemBuilder.build(new StonePickaxe("tool.pickaxe.stone.tipped", 11001));
		ironPickaxe = itemBuilder.build(new IronPickaxe("tool.pickaxe.iron.tipped", 11002));
		goldPickaxe = itemBuilder.build(new GoldPickaxe("tool.pickaxe.gold.tipped", 11003));
		steelPickaxe = itemBuilder.build(new SteelPickaxe("tool.pickaxe.steel.tipped", 11004));
	}
}
