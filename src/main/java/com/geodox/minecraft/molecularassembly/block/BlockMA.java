package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTabMA;
import com.geodox.minecraft.molecularassembly.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockMA extends Block
{
    //TODO: Comment Class

    public BlockMA()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabMA.TAB_MA);
    }

    public BlockMA(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabMA.TAB_MA);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
