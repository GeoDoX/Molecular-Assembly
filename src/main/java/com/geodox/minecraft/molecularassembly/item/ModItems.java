package com.geodox.minecraft.molecularassembly.item;

import com.geodox.minecraft.molecularassembly.reference.Names;
import com.geodox.minecraft.molecularassembly.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.ID)
public class ModItems
{

    public static final ItemMA molecularAnalyzer = new ItemMolecularAnalyzer();
    public static final ItemMA enderBucket = new ItemEnderBucket();

    public static void init()
    {
        //Register Items
        GameRegistry.registerItem(molecularAnalyzer, Names.unlocalizedItemMolecularAnalyzer);
        GameRegistry.registerItem(enderBucket, Names.unlocalizedItemEnderBucket);
    }

}
