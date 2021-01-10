package com.RandomModders.CarbonFiber;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CarbonFiber implements ModInitializer {
    //Items
    public static final Item CARBON_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    //Blocks

    @Override
    public void onInitialize() {
        //ItemsRegister
        Registry.register(Registry.ITEM, new Identifier("carbon", "carbon_ingot"), CARBON_INGOT);
        //BlocksRegister

        //BlockItemRegisters
    }
}