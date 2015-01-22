package com.mrlolethan.epicgame.gamemanager;

import com.mrlolethan.epicgame.framework.Game;
import com.mrlolethan.epicgame.framework.exception.GameException;

public class GameTerminationException extends GameException {
	private static final long serialVersionUID = 1L;


	public GameTerminationException(Game game) {
		super(game, "Couldn't terminate the Game instance");
	}

}
