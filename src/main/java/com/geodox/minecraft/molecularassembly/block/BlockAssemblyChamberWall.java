package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTab;
import net.minecraft.block.material.Material;

public class BlockAssemblyChamberWall extends BlockMA
{

    public BlockAssemblyChamberWall()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTab.TAB_MA);
        this.setBlockName("assemblyChamberWall");
    }

}
