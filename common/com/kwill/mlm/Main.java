package com.kwill.mlm;

import net.minecraft.creativetab.CreativeTabs;

import com.kwill.mlm.blocks.BlockInit;
import com.kwill.mlm.helper.ModLogger;
import com.kwill.mlm.helper.tabMTM;
import com.kwill.mlm.items.ItemInit;
import com.kwill.mlm.library.Vars;
import com.kwill.mlm.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * User: kwill
 * Date: 3/25/13
 * Time: 9:49 PM
 */

@Mod(name = Vars.mod_name, modid = Vars.mod_modid, version = Vars.mod_version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, versionBounds = Vars.mod_name)

public class Main {
    @Mod.Instance(Vars.main_instance)
    public static Main instance = new Main();

    @SidedProxy(clientSide = "com.kwill.mlm.proxies.ClientProxy", serverSide = "com.kwill.mlm.proxies.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabMTM = new tabMTM(CreativeTabs.getNextID(), Vars.mod_modid);
    
    @Mod.PreInit
    public void preload(FMLPreInitializationEvent e) {
        ModLogger.init();
        ModLogger.log("Preload");
    }

    @Mod.Init
    public void load(FMLInitializationEvent e) {
        ModLogger.log("Load");
    	BlockInit.blockinit();
    	ItemInit.itemInit();
    	
    	proxy.initRenderAndTextures();
    	
    }

    @Mod.PostInit
    public void postload(FMLPostInitializationEvent e) {
        ModLogger.log("PostLoad");
    }


}
