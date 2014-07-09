package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTab;
import com.geodox.minecraft.molecularassembly.multiblock.MultiBlockAssemblyChamber;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockAssemblyChamberParticleSeparator extends BlockMA
{

    public BlockAssemblyChamberParticleSeparator()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTab.TAB_MA);
        this.setBlockName("assemblyChamberParticleSeparator");
    }

}
