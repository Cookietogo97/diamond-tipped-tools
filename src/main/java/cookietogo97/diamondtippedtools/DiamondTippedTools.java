package cookietogo97.diamondtippedtools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class DiamondTippedTools implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "diamondtippedtools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Diamond Tipped Tools initialized.");
    }

	@Override
	public void beforeGameStart() {
		new DiamondTippedToolsItems().Initialize();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {
		new DiamondTippedToolsRecipeRegistries();
		final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.workbench)));
		DiamondTippedToolsRecipeRegistries.DIAMONDTIPPEDTOOLS.register("workbench", WORKBENCH);
		Registries.RECIPES.register("diamondtippedtools", DiamondTippedToolsRecipeRegistries.DIAMONDTIPPEDTOOLS);
	}
}
