package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMA extends Block
{

    public BlockMA()
    {
        this(Material.rock);
    }

    public BlockMA(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTab.TAB_MA);
    }

}
