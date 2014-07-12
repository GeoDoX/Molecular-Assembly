package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTab;
import net.minecraft.block.material.Material;

public class BlockAssemblyChamberParticleManipulator extends BlockMA
{

    public BlockAssemblyChamberParticleManipulator()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTab.TAB_MA);
        this.setBlockName("assemblyChamberParticleManipulator");
    }

}
