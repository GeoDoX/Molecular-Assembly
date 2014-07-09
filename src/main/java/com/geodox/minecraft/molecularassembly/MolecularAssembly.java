package com.geodox.minecraft.molecularassembly;

import com.geodox.minecraft.molecularassembly.block.ModBlocks;
import com.geodox.minecraft.molecularassembly.client.configuration.ConfigurationHandler;
import com.geodox.minecraft.molecularassembly.item.ModItems;
import com.geodox.minecraft.molecularassembly.proxy.IProxy;
import com.geodox.minecraft.molecularassembly.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MolecularAssembly
{
	@Mod.Instance(Reference.ID)
	public static MolecularAssembly instance;

    @SidedProxy(clientSide = Reference.PROXY_CLIENT_CLASS, serverSide = Reference.PROXY_SERVER_CLASS)
    public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
        // Initialize Configuration
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        // Initialize PacketHandler

        // Initialize Items
        ModItems.init();

        // Initialize Blocks
        ModBlocks.init();
    }
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		// Initialize GUI Handler

        // Initialize Tile Entities
        proxy.registerTileEntities();

        // Initialize Recipes
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
