package com.RandomModders.CarbonFiber.Items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CarbonIngot extends Item {



    public CarbonIngot() {
        super(new FabricItemSettings().group(ItemGroup.MISC).fireproof());

    }

}
