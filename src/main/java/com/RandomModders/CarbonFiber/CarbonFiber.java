package com.RandomModders.CarbonFiber;

import com.RandomModders.CarbonFiber.Blocks.BlockHandler;
import com.RandomModders.CarbonFiber.Items.ItemHandler;
import net.fabricmc.api.ModInitializer;

public class CarbonFiber implements ModInitializer {
    //Blocks


    @Override
    public void onInitialize() {
        ItemHandler.register();
        BlockHandler.register();
    }
}