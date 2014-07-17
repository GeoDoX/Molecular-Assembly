package com.geodox.minecraft.molecularassembly.reference;

public class Names
{
    // Blocks
    public static final String unlocalizedBlockAssemblyChamberWall = "assemblyChamberWall";
    public static final String unlocalizedBlockAssemblyChamberWindow = "assemblyChamberWindow";
    public static final String unlocalizedBlockAssemblyChamberParticleSeparator = "assemblyChamberParticleSeparator";
    public static final String unlocalizedBlockAssemblyChamberParticleManipulator = "assemblyChamberParticleManipulator";

    // Items
    public static final String unlocalizedItemMolecularAnalyzer = "molecularAnalyzer";
    public static final String unlocalizedItemEnderBucket = "enderBucket";

    public static String getUnlocalizedBlockName(String unlocalizedBlockName)
    {
        return "tile." + Reference.ID.toLowerCase() + ":" + unlocalizedBlockName;
    }

}
