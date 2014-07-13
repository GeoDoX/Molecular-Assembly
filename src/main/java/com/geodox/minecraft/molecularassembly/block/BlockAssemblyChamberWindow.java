package com.geodox.minecraft.molecularassembly.block;

import com.geodox.minecraft.molecularassembly.creativetab.CreativeTabMA;
import com.geodox.minecraft.molecularassembly.reference.Names;
import com.geodox.minecraft.molecularassembly.utility.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockAssemblyChamberWindow extends BlockMA
{
    // TODO: Comment Class

    public BlockAssemblyChamberWindow()
    {
        super(Material.glass);
        this.setBlockName("assemblyChamberWindow");
        this.setLightOpacity(0);
    }

    @SideOnly(Side.CLIENT)
    public static IIcon defaultIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon frontIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        defaultIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(Names.getUnlocalizedBlockName(Names.unlocalizedBlockAssemblyChamberWall)));
        frontIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(Names.getUnlocalizedBlockName(Names.unlocalizedBlockAssemblyChamberWindow)));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        int back = TextureHelper.getBack(meta);

        if(side == meta)
        {
            return frontIcon;
        }
        else if(side == back)
        {
            return frontIcon;
        }
        else
        {
            return defaultIcon;
        }
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack)
    {
        int dir = TextureHelper.setDirection(this, world, x, y, z, entityLiving);

        System.out.println(this.getUnlocalizedName());
        System.out.println(this.getUnwrappedUnlocalizedName(this.getUnlocalizedName()));

        world.setBlockMetadataWithNotify(x, y, z, dir, 0);
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

}
