package com.mrlolethan.epicgame;

import org.bukkit.plugin.java.JavaPlugin;

public class P extends JavaPlugin {

	private static P p;


	public void onLoad() {
		p = this;
	}

	public void onEnable() {
		// Method stub; do nothing as of now.
	}

	public void onDisable() {
		EpicGame.getGameManager().unregisterGame();
		p = null;
	}


	public P getInstance() {
		return p;
	}

}
