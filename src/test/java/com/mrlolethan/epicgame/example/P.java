package com.mrlolethan.epicgame.example;

import org.bukkit.plugin.java.JavaPlugin;

import com.mrlolethan.epicgame.EpicGame;

public class P extends JavaPlugin {

	private static P p;


	public void onLoad() {
		p = this;
	}

	public void onEnable() {
		// Register MyGame.
		EpicGame.getGameManager().registerGame(new MyGame());
	}

	public void onDisable() {
		p = null;
	}


	public static P getInstance() {
		return p;
	}

}
