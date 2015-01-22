package com.mrlolethan.epicgame;

import com.mrlolethan.epicgame.gamemanager.GameManager;
import com.mrlolethan.epicgame.gamemanager.MemoryGameManager;

public class EpicGame {

	private static GameManager gameManager = new MemoryGameManager();


	public static GameManager getGameManager() {
		return gameManager;
	}

}
