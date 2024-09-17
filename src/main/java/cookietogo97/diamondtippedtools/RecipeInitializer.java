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
	}
}
