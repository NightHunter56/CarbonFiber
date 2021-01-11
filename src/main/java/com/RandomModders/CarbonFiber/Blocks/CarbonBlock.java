package com.RandomModders.CarbonFiber.Blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class CarbonBlock extends Block {


    public CarbonBlock() {
        super(FabricBlockSettings.of(Material.METAL)
                .hardness(4.0f)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES,4));
    }

}
