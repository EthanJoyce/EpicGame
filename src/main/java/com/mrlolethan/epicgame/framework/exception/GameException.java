package com.mrlolethan.epicgame.framework.exception;

import com.mrlolethan.epicgame.framework.Game;

public class GameException extends Exception {
	private static final long serialVersionUID = 1L;

	private Game game;


	public GameException(Game game, String message) {
		super(message);

		this.game = game;
	}

	public GameException(Game game) {
		this(game, "");
	}


	public Game getGame() {
		return this.game;
	}

}
