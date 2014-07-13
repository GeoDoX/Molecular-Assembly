package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTabMA;
import com.geodox.minecraft.molecularassembly.reference.Names;
import net.minecraft.block.material.Material;

public class BlockAssemblyChamberWall extends BlockMA
{
    // TODO: Comment Class

    public BlockAssemblyChamberWall()
    {
        super(Material.iron);
        this.setBlockName(Names.unlocalizedBlockAssemblyChamberWall);
    }

}
