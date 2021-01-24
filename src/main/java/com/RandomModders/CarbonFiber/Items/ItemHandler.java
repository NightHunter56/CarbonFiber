package com.RandomModders.CarbonFiber.Items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemHandler {

    public static final Item CARBON_INGOT = new CarbonIngot();

    public static void register(){

        Registry.register(Registry.ITEM, new Identifier("carbonfiber", "carbon_ingot"), CARBON_INGOT);

    }
}
