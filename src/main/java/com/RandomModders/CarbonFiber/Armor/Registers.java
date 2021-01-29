package com.RandomModders.CarbonFiber.Armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Registers {


    public static final ArmorMaterial customArmorMaterial = new ArmorClass();
    public static final Item CUSTOM_MATERIAL = new CustomMaterialItem(new Item.Settings().group(ItemGroup.COMBAT));
    // If you made a new material, this is where you would note it.
    public static final Item CUSTOM_MATERIAL_HELMET = new ArmorItem(ArmorClass, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUSTOM_MATERIAL_CHESTPLATE = new ArmorItem(ArmorClass, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUSTOM_MATERIAL_LEGGINGS = new ArmorItem(ArmorClass, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item CUSTOM_MATERIAL_BOOTS = new ArmorItem(ArmorClass, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));


}
