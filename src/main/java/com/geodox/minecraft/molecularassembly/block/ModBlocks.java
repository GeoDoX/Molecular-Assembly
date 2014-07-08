package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.ID)
public class ModBlocks
{

    public static final BlockMA assemblyChamberWall = new BlockAssemblyChamberWall();

    public static void init()
    {
        //Register Blocks
        GameRegistry.registerBlock(assemblyChamberWall, "assemblyChamberWall");
    }

}
