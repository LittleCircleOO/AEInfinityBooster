package uk.co.hexeption.aeinfinitybooster.setup;

import net.minecraft.world.item.Item;
import uk.co.hexeption.aeinfinitybooster.item.DimensionCard;
import uk.co.hexeption.aeinfinitybooster.item.InfinityCard;

/**
 * ModItems
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 22/12/2021 - 08:50 am
 */
public class ModItems {

    public static final Item INFINITY_CARD = Registration.register("infinity_card", new InfinityCard());
    public static final Item DIMENSION_CARD = Registration.register("dimension_card", new DimensionCard());

    public static void register() {

    }

}
