package uk.co.hexeption.aeinfinitybooster.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * RSInfinityBoosterDataGen
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 14/02/2021 - 06:48 pm
 */

public final class DataGenerators implements DataGeneratorEntrypoint {

    public void onInitializeDataGenerator(FabricDataGenerator generator){
        generator.createPack().addProvider(RecipeGenerator::new);
    }

    private DataGenerators() {
    }

}
