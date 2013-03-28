package com.kwill.mlm.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.kwill.mlm.library.Vars;

import cpw.mods.fml.common.FMLLog;

public class ModLogger {

	private static Logger logger = Logger.getLogger(Vars.mod_modid);
	
	public static void init() {
		logger.setParent(FMLLog.getLogger());
		ModLogger.log(Level.INFO, "ModLogger initialized.");
	}
	
	/**
	 * Used to send logs to chat with a certain emergency level.
	 * @param
	 * @author kwill1429
	 */
	public static void log(Level level, String message) {
		
		if (Vars.debug) {logger.log(level, message);}
	}
	
	/**
	 * Used to send logs to chat with a certain emergency level.
	 * @param
	 * @author kwill1429
	 */
	public static void log(String message) {
		
		if (Vars.debug) {logger.log(Level.INFO, message);}
	}
	
}
