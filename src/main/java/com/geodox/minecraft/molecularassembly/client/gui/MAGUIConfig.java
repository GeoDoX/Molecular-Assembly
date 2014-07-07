package com.geodox.minecraft.molecularassembly.client.gui;

import com.geodox.minecraft.molecularassembly.client.configuration.ConfigurationHandler;
import com.geodox.minecraft.molecularassembly.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class MAGUIConfig extends GuiConfig
{

    public MAGUIConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
            new ConfigElement(
                ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()
            )
        );
    }

}
