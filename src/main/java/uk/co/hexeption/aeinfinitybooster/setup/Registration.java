package uk.co.hexeption.aeinfinitybooster.setup;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import uk.co.hexeption.aeinfinitybooster.AEInfinityBooster;

/**
 * Registration
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 22/12/2021 - 08:50 am
 */
public class Registration {

    public static Item register(String id, Item item) {
        ResourceLocation itemid = new ResourceLocation(AEInfinityBooster.ID, id);
        return Registry.register(BuiltInRegistries.ITEM, itemid, item);
    }

}
