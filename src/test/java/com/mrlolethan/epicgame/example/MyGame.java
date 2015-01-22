package com.mrlolethan.epicgame.example;

import org.bukkit.Bukkit;

import com.mrlolethan.epicgame.framework.Game;

public class MyGame extends Game {

	public void initialize() {
		Bukkit.getLogger().info("MyGame was initialized!");
	}

	public void terminate() {
		Bukkit.getLogger().info("MyGame was terminated!");
	}

}
