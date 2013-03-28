package com.kwill.mlm.helper;

import net.minecraft.creativetab.CreativeTabs;

import com.kwill.mlm.library.Vars;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class tabMTM extends CreativeTabs {

	public tabMTM(int par1, String par2Str) {
		super(par1, par2Str);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return Vars.itemBlob;
	}

}
