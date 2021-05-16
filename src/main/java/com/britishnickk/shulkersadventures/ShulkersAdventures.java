package com.britishnickk.shulkersadventures;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.britishnickk.shulkersadventures.Config.ConfigValues;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("shulkersadventures")
public class ShulkersAdventures
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "shulkersadventures";
    public static ConfigValues Config = null;

    public ShulkersAdventures() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }
}