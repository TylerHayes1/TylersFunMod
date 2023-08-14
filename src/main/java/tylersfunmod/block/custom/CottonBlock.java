package tylersfunmod.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import tylersfunmod.item.ModItems;

public class CottonBlock extends CropBlock {
    public CottonBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.COTTON_SEEDS;
    }
}
