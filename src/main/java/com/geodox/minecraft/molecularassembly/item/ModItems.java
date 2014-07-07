package com.geodox.minecraft.molecularassembly.item;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{

    public static final ItemMA molecularAnalyzer = new ItemMolecularAnalyzer();

    public static void init()
    {
        GameRegistry.registerItem(molecularAnalyzer, "molecularAnalyzer");
    }

}
