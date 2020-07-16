package me.syes.hologramapi;

import org.bukkit.plugin.java.JavaPlugin;

import me.syes.hologramapi.hologram.HologramManager;

public class HologramApi extends JavaPlugin {

	private static HologramManager hologramManager;
	
	public void onEnable() {
		hologramManager = new HologramManager();
	}
	
	public static HologramManager getManager() {
		return hologramManager;
	}
	
}
