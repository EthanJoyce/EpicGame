package com.mrlolethan.epicgame.gamemanager;

import org.apache.commons.lang.Validate;

import com.mrlolethan.epicgame.framework.Game;

public class MemoryGameManager extends GameManager {

	public boolean registerGame(Game game) {
		Validate.notNull(game, "Game cannot be null");

		// Attempt the initialization of the Game instance.
		try {
			game.initialize();
		} catch (GameInitializationException ex) {
			ex.printStackTrace();
			return false; // Error initializing the Game instance.
		}

		this.game = game;
		return true;
	}

	public boolean unregisterGame() {
		Validate.notNull(game, "Game cannot be null");

		// Attempt the termination of the Game instance.
		try {
			game.terminate();
		} catch (GameTerminationException ex) {
			ex.printStackTrace();
			return false; // Error terminating the Game instance.
		}

		this.game = null;
		return true;
	}


	public Game getGame() {
		return this.game;
	}

	public boolean isGameRegistered() {
		return this.game != null;
	}

}
