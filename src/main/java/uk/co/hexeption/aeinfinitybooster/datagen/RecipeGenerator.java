
package uk.co.hexeption.aeinfinitybooster.datagen;

import appeng.core.definitions.AEItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import uk.co.hexeption.aeinfinitybooster.AEInfinityBooster;
import uk.co.hexeption.aeinfinitybooster.setup.ModItems;

import java.util.function.Consumer;

/**
 * RecipeGenerator
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 14/02/2021 - 06:35 pm
 */
public class RecipeGenerator extends FabricRecipeProvider {

    public RecipeGenerator(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> p_251297_) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INFINITY_CARD)
                .pattern("ERE").pattern("RSR").pattern("NNN")
                .define('E', Items.ENDER_EYE)
                .define('R', AEItems.WIRELESS_BOOSTER.asItem())
                .define('S', Items.NETHER_STAR)
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy("has_item", has(Items.NETHERITE_INGOT))
                .save(p_251297_, new ResourceLocation(AEInfinityBooster.ID, "infinity_card"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIMENSION_CARD)
                .pattern("RNR").pattern("NEN").pattern("RNR")
                .define('R', ModItems.INFINITY_CARD)
                .define('E', Items.ENDER_EYE)
                .define('N', Items.NETHER_STAR)
                .unlockedBy("has_item", has(ModItems.INFINITY_CARD))
                .save(p_251297_, new ResourceLocation(AEInfinityBooster.ID, "dimension_card"));
    }

}
