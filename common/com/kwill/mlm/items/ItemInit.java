package com.kwill.mlm.items;

import com.kwill.mlm.helper.ModLogger;
import com.kwill.mlm.library.Vars;

import net.minecraft.item.Item;
	
public class ItemInit {
	
	public static Item itemBlob;
	
	public static void itemInit() {
		
		itemBlob = new itemBlob(Vars.itemBlob);
		ModLogger.log("Item: "+ Vars.blobName +" Loaded");
		
		
		if (recipeInit()) { ModLogger.log("Item Recipes Loaded"); }
	}
	
	private static boolean recipeInit() {
		
		return true;
	}
	
}
