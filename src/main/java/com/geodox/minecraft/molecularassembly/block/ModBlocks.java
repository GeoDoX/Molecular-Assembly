package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.ID)
public class ModBlocks
{
    // TODO: Comment Class

    public static final BlockMA assemblyChamberWall = new BlockAssemblyChamberWall();
    public static final BlockMA assemblyChamberParticleManipulator = new BlockAssemblyChamberParticleManipulator();
    public static final BlockMA assemblyChamberParticleSeparator = new BlockAssemblyChamberParticleSeparator();
    public static final BlockMA assemblyChamberWindow = new BlockAssemblyChamberWindow();

    public static void init()
    {
        //Register Blocks
        GameRegistry.registerBlock(assemblyChamberWall, "assemblyChamberWall");
        GameRegistry.registerBlock(assemblyChamberParticleManipulator, "assemblyChamberParticleManipulator");
        GameRegistry.registerBlock(assemblyChamberParticleSeparator, "assemblyChamberParticleSeparator");
        GameRegistry.registerBlock(assemblyChamberWindow, "assemblyChamberWindow");
    }

}
