package com.geodox.minecraft.molecularassembly.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{

    public static void init(File configFile)
    {
        //Create a new Configuration passing the configuration file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //Load the configuration
            configuration.load();

            //Read properties from configuration
        }
        catch(Exception e)
        {
            //Log exception
        }
        finally
        {
            //Save the configuration
            configuration.save();
        }
    }

}
