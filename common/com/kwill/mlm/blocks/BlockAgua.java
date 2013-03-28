package com.kwill.mlm.blocks;

import com.kwill.mlm.Main;
import com.kwill.mlm.library.Vars;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAgua extends Block {

	public BlockAgua(int par1) {
		super(par1, Material.water);
		this.setBlockName(Vars.aguaName);
		this.setCreativeTab(Main.tabMTM);
	}
	
	
	
	
}
