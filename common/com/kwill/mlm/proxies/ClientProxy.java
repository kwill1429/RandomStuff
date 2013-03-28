package com.kwill.mlm.proxies;

import net.minecraftforge.client.MinecraftForgeClient;

import com.kwill.mlm.helper.ModLogger;
import com.kwill.mlm.library.Vars;

/**
 * User: kwill
 * Date: 3/25/13
 * Time: 10:20 PM
 */
public class ClientProxy extends CommonProxy {
    public void registerRenderInformation() {
    	
    }
    
    @Override
    public void initRenderAndTextures() {
    	MinecraftForgeClient.preloadTexture("/com/kwill/mlm/textures/Blocks.png");
    	ModLogger.log("Texture Loaded: Blocks");
    	
    	MinecraftForgeClient.preloadTexture("/com/kwill/mlm/textures/Items.png");
    	ModLogger.log("Texture Loaded: Items");
    }
}
