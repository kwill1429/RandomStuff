package com.kwill.mlm.items;

import com.kwill.mlm.Main;
import com.kwill.mlm.library.Vars;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemBlob extends Item {

	public itemBlob(int par1) {
		super(par1);
		this.setIconCoord(0, 0);
		this.setItemName(Vars.blobName);
		this.setCreativeTab(Main.tabMTM);
	}

}
