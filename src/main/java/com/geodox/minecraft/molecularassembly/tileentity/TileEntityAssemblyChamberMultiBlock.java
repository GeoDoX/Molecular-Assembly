package com.geodox.minecraft.molecularassembly.tileentity;

import com.geodox.minecraft.molecularassembly.block.BlockAssemblyChamberWindow;
import com.geodox.minecraft.molecularassembly.block.BlockMA;
import com.geodox.minecraft.molecularassembly.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityAssemblyChamberMultiBlock extends TileEntity
{

    public TileEntityAssemblyChamberMultiBlock()
    {

    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock)
    {
        updateMultiBlockStructure(world, x, y, z);
    }

    public void onBlockAdded(World world, int x, int y, int z)
    {
        updateMultiBlockStructure(world, x, y, z);
    }

    public void updateMultiBlockStructure(World world, int x, int y, int z)
    {
        isMultiBlockStructure(world, x, y, z);
    }

    public boolean isMultiBlockStructure(World world, int x, int y, int z)
    {
        boolean mStructure = false;

        boolean currentCheckStructure = true;

        Block glassBlock = checkGlassPos(world, x, y, z);
        if(glassBlock instanceof BlockAssemblyChamberWindow)
        {
            checkMultiBlockFormed(glassBlock, world, x, y, z);
        }
        else
        {
            return false;
        }

        return mStructure;
    }

    private boolean checkMultiBlockFormed(Block glassBlock, World world, int x, int y, int z)
    {
        for(int y1 = -2; y1 < 2; y1++)
        {
            for(int x1 = -2; x1 < 2; x1++)
            {
                for(int z1 = -2; z1 < 2; z1++)
                {

                }
            }
        }

        return false;
    }

    private Block checkGlassPos(World world, int x, int y, int z)
    {
        Block blockChecked = world.getBlock(x, y, z);
        int xMod = 0;
        int zMod = 0;

        for(int i = 0; i < 4; i++)
        {
            switch(i)
            {
                case 0: //North
                    xMod = 0;
                    zMod = 2;
                    break;
                case 1: //East
                    xMod = 2;
                    zMod = 0;
                    break;
                case 2: //South
                    xMod = 0;
                    zMod = -2;
                    break;
                case 3: //West
                    xMod = -2;
                    zMod = 0;
                    break;
            }

            blockChecked = world.getBlock(x + xMod, y + 2, z + zMod);

            if(blockChecked.equals(ModBlocks.assemblyChamberWindow))
            {
                break;
            }

        }

        return blockChecked;
    }

}
