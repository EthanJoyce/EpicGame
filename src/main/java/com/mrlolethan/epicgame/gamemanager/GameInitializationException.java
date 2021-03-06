package com.mrlolethan.epicgame.gamemanager;

import com.mrlolethan.epicgame.framework.Game;
import com.mrlolethan.epicgame.framework.exception.GameException;

public class GameInitializationException extends GameException {
	private static final long serialVersionUID = 1L;


	public GameInitializationException(Game game) {
		super(game, "Couldn't initialize the Game instance");
	}

}
