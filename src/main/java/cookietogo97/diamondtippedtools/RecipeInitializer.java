package cookietogo97.diamondtippedtools;

import net.minecraft.core.item.Item;

import turniplabs.halplibe.helper.RecipeBuilder;

public class RecipeInitializer {
	public static void initialize() {
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolPickaxeWood)
			.create("Diamond Tipped Wooden Pickaxe", DiamondTippedToolsItems.woodenPickaxe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolPickaxeStone)
			.create("Diamond Tipped Stone Pickaxe", DiamondTippedToolsItems.stonePickaxe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolPickaxeIron)
			.create("Diamond Tipped Iron Pickaxe", DiamondTippedToolsItems.ironPickaxe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolPickaxeGold)
			.create("Diamond Tipped Gold Pickaxe", DiamondTippedToolsItems.goldPickaxe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolPickaxeSteel)
			.create("Diamond Tipped Steel Pickaxe", DiamondTippedToolsItems.steelPickaxe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolHoeWood)
			.create("Diamond Tipped Wood Hoe", DiamondTippedToolsItems.woodHoe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolHoeStone)
			.create("Diamond Tipped Stone Hoe", DiamondTippedToolsItems.stoneHoe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolHoeIron)
			.create("Diamond Tipped Iron Hoe", DiamondTippedToolsItems.ironHoe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolHoeGold)
			.create("Diamond Tipped Gold Hoe", DiamondTippedToolsItems.goldHoe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolHoeSteel)
			.create("Diamond Tipped Steel Hoe", DiamondTippedToolsItems.steelHoe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolShovelWood)
			.create("Diamond Tipped Wooden Shovel", DiamondTippedToolsItems.woodShovel.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolShovelStone)
			.create("Diamond Tipped Stone Shovel", DiamondTippedToolsItems.stoneShovel.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolShovelIron)
			.create("Diamond Tipped Iron Shovel", DiamondTippedToolsItems.ironShovel.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolShovelGold)
			.create("Diamond Tipped Gold Shovel", DiamondTippedToolsItems.goldShovel.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolShovelSteel)
			.create("Diamond Tipped Steel Shovel", DiamondTippedToolsItems.steelShovel.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolAxeWood)
			.create("Diamond Tipped Wooden Axe", DiamondTippedToolsItems.woodAxe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolAxeStone)
			.create("Diamond Tipped Stone Axe", DiamondTippedToolsItems.stoneAxe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolAxeIron)
			.create("Diamond Tipped Iron Axe", DiamondTippedToolsItems.ironAxe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolAxeGold)
			.create("Diamond Tipped Gold Axe", DiamondTippedToolsItems.goldAxe.getDefaultStack());
		RecipeBuilder.Shapeless("diamondtippedtools")
			.addInput(Item.diamond)
			.addInput(Item.toolAxeSteel)
			.create("Diamond Tipped Steel Axe", DiamondTippedToolsItems.steelAxe.getDefaultStack());
	}
}
