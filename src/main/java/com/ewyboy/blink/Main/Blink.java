package com.ewyboy.blink.Main;

import com.ewyboy.blink.Blocks.Technical.Block;
import com.ewyboy.blink.Crafting.CraftingRecipes;
import com.ewyboy.blink.CreativeTabs.BlinkCreativeTabs;
import com.ewyboy.blink.Info.ModInfo;
import com.ewyboy.blink.Items.Techical.Item;
import com.ewyboy.blink.Network.Proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = ModInfo.ID, name = ModInfo.Name, version = ModInfo.Version)

public class Blink {

    @Mod.Instance(ModInfo.ID)
    public static Blink instance;

    @SidedProxy(modId = ModInfo.ID, clientSide = "com.ewyboy.blink.Network.Proxies.ClientProxy", serverSide = "com.ewyboy.blink.Network.Proxies.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit (FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void load (FMLInitializationEvent event) {
        BlinkCreativeTabs.AddCreativeTabs();
        Item.Init();
        Block.Init();
        CraftingRecipes.init();
    }

    @Mod.EventHandler
    public void ModsLoaded (FMLPreInitializationEvent event){

    }

}

