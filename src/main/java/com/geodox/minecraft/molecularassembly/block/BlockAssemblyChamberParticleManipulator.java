package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTab;
import com.geodox.minecraft.molecularassembly.tileentity.TileEntityAssemblyChamberMultiBlock;
import com.geodox.minecraft.molecularassembly.utility.LogHelper;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAssemblyChamberParticleManipulator extends BlockMA
{

    public BlockAssemblyChamberParticleManipulator()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTab.TAB_MA);
        this.setBlockName("assemblyChamberParticleManipulator");
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return new TileEntityAssemblyChamberMultiBlock();
    }

}
