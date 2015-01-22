package com.mrlolethan.epicgame.gamemanager;

import com.mrlolethan.epicgame.framework.Game;

public class GameInitializationException extends Exception {
	private static final long serialVersionUID = 1L;

	private Game game;


	public GameInitializationException(Game game, String message) {
		super(message);
		
		this.game = game;
	}

	public GameInitializationException(Game game) {
		this(game, "Couldn't initialize the Game instance");
	}


	public Game getGame() {
		return this.game;
	}

}
