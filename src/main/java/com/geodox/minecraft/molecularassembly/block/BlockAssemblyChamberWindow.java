package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTab;
import com.geodox.minecraft.molecularassembly.multiblock.MultiBlockAssemblyChamber;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockAssemblyChamberWindow extends BlockMA
{
    // TODO: Comment Class

    public BlockAssemblyChamberWindow()
    {
        super(Material.glass);
        this.setCreativeTab(CreativeTab.TAB_MA);
        this.setBlockName("assemblyChamberWindow");
        this.setLightOpacity(0);
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

}
