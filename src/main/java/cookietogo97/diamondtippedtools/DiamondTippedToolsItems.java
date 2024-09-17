package cookietogo97.diamondtippedtools;

import turniplabs.halplibe.helper.ItemBuilder;

public class DiamondTippedToolsItems {

	public static WoodenPickaxe woodenPickaxe;
	public static StonePickaxe stonePickaxe;
	public static IronPickaxe ironPickaxe;
	public static GoldPickaxe goldPickaxe;
	public static SteelPickaxe steelPickaxe;
	public static WoodHoe woodHoe;
	public static StoneHoe stoneHoe;
	public static IronHoe ironHoe;
	public static GoldHoe goldHoe;
	public static SteelHoe steelHoe;
	public static WoodShovel woodShovel;
	public static StoneShovel stoneShovel;
	public static IronShovel ironShovel;
	public static GoldShovel goldShovel;
	public static SteelShovel steelShovel;
	public static WoodAxe woodAxe;
	public static StoneAxe stoneAxe;
	public static IronAxe ironAxe;
	public static GoldAxe goldAxe;
	public static SteelAxe steelAxe;

	ItemBuilder itemBuilder = new ItemBuilder("diamondtippedtools");

	public void Initialize() {
		woodenPickaxe = itemBuilder.build((new WoodenPickaxe("tool.pickaxe.wood.tipped", 20000)));
		stonePickaxe = itemBuilder.build(new StonePickaxe("tool.pickaxe.stone.tipped", 20001));
		ironPickaxe = itemBuilder.build(new IronPickaxe("tool.pickaxe.iron.tipped", 20002));
		goldPickaxe = itemBuilder.build(new GoldPickaxe("tool.pickaxe.gold.tipped", 20003));
		steelPickaxe = itemBuilder.build(new SteelPickaxe("tool.pickaxe.steel.tipped", 20004));
		woodHoe = itemBuilder.build((new WoodHoe("tool.hoe.wood.tipped", 20005)));
		stoneHoe = itemBuilder.build(new StoneHoe("tool.hoe.stone.tipped", 20006));
		ironHoe = itemBuilder.build(new IronHoe("tool.hoe.iron.tipped", 20007));
		goldHoe = itemBuilder.build(new GoldHoe("tool.hoe.gold.tipped", 20008));
		steelHoe = itemBuilder.build(new SteelHoe("tool.hoe.steel.tipped", 20009));
		woodShovel = itemBuilder.build((new WoodShovel("tool.shovel.wood.tipped", 20010)));
		stoneShovel = itemBuilder.build(new StoneShovel("tool.shovel.stone.tipped", 20011));
		ironShovel = itemBuilder.build(new IronShovel("tool.shovel.iron.tipped", 20012));
		goldShovel = itemBuilder.build(new GoldShovel("tool.shovel.gold.tipped", 20013));
		steelShovel = itemBuilder.build(new SteelShovel("tool.shovel.steel.tipped", 20014));
		woodAxe = itemBuilder.build((new WoodAxe("tool.axe.wood.tipped", 20015)));
		stoneAxe = itemBuilder.build(new StoneAxe("tool.axe.stone.tipped", 20016));
		ironAxe = itemBuilder.build(new IronAxe("tool.axe.iron.tipped", 20017));
		goldAxe = itemBuilder.build(new GoldAxe("tool.axe.gold.tipped", 20018));
		steelAxe = itemBuilder.build(new SteelAxe("tool.axe.steel.tipped", 20019));
	}
}
