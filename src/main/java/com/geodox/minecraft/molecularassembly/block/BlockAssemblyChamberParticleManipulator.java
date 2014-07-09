package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTab;
import com.geodox.minecraft.molecularassembly.tileentity.TileEntityAssemblyChamberParticleManipulator;
import com.geodox.minecraft.molecularassembly.utility.LogHelper;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
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
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        TileEntityAssemblyChamberParticleManipulator manipulator = (TileEntityAssemblyChamberParticleManipulator) world.getTileEntity(x, y, z);
        manipulator.isFormed();
        LogHelper.info("Activated!");
        return true;
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return new TileEntityAssemblyChamberParticleManipulator();
    }

}
