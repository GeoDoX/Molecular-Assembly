package com.geodox.minecraft.molecularassembly.utility;

import com.geodox.minecraft.molecularassembly.block.BlockMA;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TextureHelper
{

    public static int setDirection(BlockMA block, World world, int x, int y, int z, EntityLivingBase entityLiving)
    {
        world.scheduleBlockUpdate(x, y, z, block, 1);

        int direction = 0;
        int facing = MathHelper.floor_double(entityLiving.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;

        if (facing == 0)
        {
            direction = ForgeDirection.NORTH.ordinal();
        } else if (facing == 1)
        {
            direction = ForgeDirection.EAST.ordinal();
        } else if (facing == 2)
        {
            direction = ForgeDirection.SOUTH.ordinal();
        } else if (facing == 3)
        {
            direction = ForgeDirection.WEST.ordinal();
        }

        return direction;
    }

    public static int getBack(int meta)
    {
        int back;

        switch(meta)
        {
            case 5:
                back = ForgeDirection.WEST.ordinal();
                break;
            case 4:
                back = ForgeDirection.EAST.ordinal();
                break;
            case 2:
                back = ForgeDirection.SOUTH.ordinal();
                break;
            case 3:
                back = ForgeDirection.NORTH.ordinal();
                break;
            default:
                back = ForgeDirection.NORTH.ordinal();
                break;
        }

        return back;
    }

}
