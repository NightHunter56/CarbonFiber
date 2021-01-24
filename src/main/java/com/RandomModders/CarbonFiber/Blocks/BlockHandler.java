package com.RandomModders.CarbonFiber.Blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockHandler {

    public static final Block CARBON_BLOCK = new CarbonBlock();

    public static void register(){

        //Register
        Registry.register(Registry.BLOCK, new Identifier("carbonfiber", "carbon_block"), CARBON_BLOCK);
        //ItemRegister
        Registry.register(Registry.ITEM, new Identifier("carbonfiber", "carbon_block"), new BlockItem(CARBON_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

    }

}
