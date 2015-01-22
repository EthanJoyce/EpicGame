package com.mrlolethan.epicgame.gamemanager;

import org.apache.commons.lang.Validate;

import com.mrlolethan.epicgame.framework.Game;

public class MemoryGameManager extends GameManager {

	public boolean registerGame(Game game) {
		Validate.notNull(game, "EpicGame cannot be null");

		// Attempt the initialization of the EpicGame instance.
		try {
			game.initialize();
		} catch (GameInitializationException ex) {
			ex.printStackTrace();
			return false; // Error initializing the Game instance.
		}

		this.game = game;
		return true;
	}

	public Game getGame() {
		return this.game;
	}

	public boolean isGameRegistered() {
		return this.game != null;
	}

}
