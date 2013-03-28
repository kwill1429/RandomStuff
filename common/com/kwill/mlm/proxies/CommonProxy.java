package com.kwill.mlm.proxies;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * User: kwill
 * Date: 3/25/13
 * Time: 10:21 PM
 */
public class CommonProxy implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    public void registerTiles() {

    }

    public void registerBlocks() {

    }

    public void addNames() {

    }

    public void addRecipes() {

    }

	public void initRenderAndTextures() {
		
		
	}
}
