package cookietogo97.diamondtippedtools;

import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;

public class DiamondTippedToolsRecipeRegistries extends RecipeRegistry {
	public static final RecipeNamespace DIAMONDTIPPEDTOOLS = new RecipeNamespace();

	public DiamondTippedToolsRecipeRegistries() {
		RecipeInitializer.initialize();
	}
}
