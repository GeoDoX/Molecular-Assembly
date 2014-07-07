package com.geodox.minecraft.molecularassembly.utility;

import com.geodox.minecraft.molecularassembly.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper
{

    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.NAME, logLevel, String.valueOf(object));
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }

    public static void info(Object object) { log(Level.INFO, object); }

}
