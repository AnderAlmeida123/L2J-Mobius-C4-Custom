/*
 * Copyright (c) 2013 L2jMobius
 */
package org.l2jmobius.gameserver.config.custom;

import org.l2jmobius.commons.util.ConfigReader;

/**
 * Loads custom starter item configurations.
 */
public class CustomStarterItemsConfig
{
    // File
    private static final String STARTER_ITEMS_CONFIG_FILE = "./config/Custom/CustomStarterItems.ini";

    // Constants
    public static boolean ENABLE_CUSTOM_STARTER_ITEMS;
    public static String STARTING_CUSTOM_ITEMS_FIGHTER;
    public static String STARTING_CUSTOM_ITEMS_MAGE;

    public static void load()
    {
        final ConfigReader config = new ConfigReader(STARTER_ITEMS_CONFIG_FILE);

        ENABLE_CUSTOM_STARTER_ITEMS = config.getBoolean("CustomStarterItemsEnabled", false);
        STARTING_CUSTOM_ITEMS_FIGHTER = config.getString("StartingCustomItemsFighter", "");
        STARTING_CUSTOM_ITEMS_MAGE = config.getString("StartingCustomItemsMage", "");
    }
}