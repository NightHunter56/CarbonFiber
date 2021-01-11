package com.RandomModders.CarbonFiber;

import com.RandomModders.CarbonFiber.Blocks.CarbonBlock;
import com.RandomModders.CarbonFiber.Items.CarbonIngot;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CarbonFiber implements ModInitializer {
    //Items
    public static final Item CARBON_INGOT = new CarbonIngot();
    //Blocks
    public static final Block CARBON_BLOCK = new CarbonBlock();

    @Override
    public void onInitialize() {
        //ItemsRegister
        Registry.register(Registry.ITEM, new Identifier("carbonfiber", "carbon_ingot"), CARBON_INGOT);
        //BlocksRegister
        Registry.register(Registry.BLOCK, new Identifier("carbonfiber", "carbon_block"), CARBON_BLOCK);
        //BlockItemRegisters
        Registry.register(Registry.ITEM, new Identifier("carbonfiber", "carbon_block"), new BlockItem(CARBON_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
    }
}