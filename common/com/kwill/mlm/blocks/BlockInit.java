package com.kwill.mlm.blocks;

import net.minecraft.block.Block;

import com.kwill.mlm.helper.ModLogger;
import com.kwill.mlm.library.Vars;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockInit {
	
	/*
	 * Set Mod Block Instance 
	 */
	public static Block blockAgua;
		
	/*
	 * Load Blocks
	 */
	public static void blockinit() {
		
		blockAgua = new BlockAgua(Vars.blockagua);
		GameRegistry.registerBlock(blockAgua, "Agua");
		ModLogger.log("Block: "+ Vars.aguaName +" Loaded");
		
		
		
		if (recipeInit()) { ModLogger.log("Bock Recipes Loaded"); }
		
	}
	
	/*
	 * Load Block Recipes
	 */
	private static boolean recipeInit() {
		return true;
	}
}
