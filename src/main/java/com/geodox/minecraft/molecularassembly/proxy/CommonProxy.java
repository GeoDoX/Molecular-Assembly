package com.geodox.minecraft.molecularassembly.proxy;

import com.geodox.minecraft.molecularassembly.tileentity.TileEntityAssemblyChamberMultiBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy
{

    @Override
    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityAssemblyChamberMultiBlock.class, "tile.multiBlockAssemblyChamber");
    }
}
