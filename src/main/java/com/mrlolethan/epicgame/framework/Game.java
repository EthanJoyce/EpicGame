package com.mrlolethan.epicgame.framework;

import com.mrlolethan.epicgame.gamemanager.GameInitializationException;

public abstract class Game {

	/**
	 * Initialize the {@link Game} instance. Equivalent to Bukkit's JavaPlugin::onEnable() method.
	 */
	public abstract void initialize() throws GameInitializationException;

	/**
	 * Terminate the (@link Game) instance. Equivalent to Bukkit's JavaPlugin::onDisable() method.
	 */
	public abstract void terminate();

}
