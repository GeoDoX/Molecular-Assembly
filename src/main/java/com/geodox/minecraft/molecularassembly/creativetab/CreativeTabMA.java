package com.geodox.minecraft.molecularassembly.creativetab;

import com.geodox.minecraft.molecularassembly.block.ModBlocks;
import com.geodox.minecraft.molecularassembly.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabMA
{

    // Create a new Creative Tab for Molecular Assembly
    public static final CreativeTabs TAB_MA = new CreativeTabs(Reference.ID)
    {
        // TODO: Change Icon to a Molecular Assembly Block
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.assemblyChamberParticleManipulator);
        }
    };

}
