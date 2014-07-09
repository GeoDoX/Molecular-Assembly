package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.multiblock.MultiBlockAssemblyChamber;
import com.geodox.minecraft.molecularassembly.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockAssemblyChamberWall extends BlockMA
{
    // TODO: Comment Class

    public BlockAssemblyChamberWall()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTab.TAB_MA);
        this.setBlockName("assemblyChamberWall");
    }

}
