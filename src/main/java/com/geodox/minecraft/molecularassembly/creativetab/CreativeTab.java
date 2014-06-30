package com.geodox.minecraft.molecularassembly.creativetab;

import com.geodox.minecraft.molecularassembly.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTab
{

    public static final CreativeTabs TAB_MA = new CreativeTabs(Reference.ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(Blocks.furnace);
        }
    };

}
