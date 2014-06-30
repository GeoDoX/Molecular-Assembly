package com.geodox.minecraft.molecularassembly.utility;

import com.geodox.minecraft.molecularassembly.reference.Reference;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper
{

    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.ID.toLowerCase(), path);
    }

}
