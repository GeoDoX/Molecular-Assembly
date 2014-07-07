package com.geodox.minecraft.molecularassembly.client.configuration;

import com.geodox.minecraft.molecularassembly.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static boolean testValue = false;

    public static void init(File configFile)
    {
        //Create a new Configuration from the configuration file
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.ID))
        {
            //Resync Configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        //Load Values from config
        testValue = configuration.getBoolean("testValue", Configuration.CATEGORY_GENERAL, false, "Example Value");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }

}
