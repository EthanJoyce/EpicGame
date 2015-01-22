package com.mrlolethan.epicgame.gamemanager;

import com.mrlolethan.epicgame.framework.Game;

public abstract class GameManager {

	/**
	 * The registered {@link Game} instance. Null if no instance has been registered.
	 */
	protected Game game;

	/**
	 * Registers the given {@link Game} object.
	 * 
	 * @param game The {@link Game} instance to register.
	 * @throws NullPointerException If the input {@link Game} is null.
	 * @throws GameInitializationException If the input {@link Game} encounters an error during initialization.
	 * @return True if the {@link Game} was loaded successfully, false if an issue occured.
	 */
	public abstract boolean registerGame(Game game);

	/**
	 * Unregisters and terminates the current {@link Game} object.
	 * 
	 * @throws NullPointerException If the input {@link Game} is null.
	 * @throws GameTerminationException If the input {@link Game} encounters an error during termination.
	 * @return True if the {@link Game} was terminated successfully, false if an issue occured.
	 */
	public abstract boolean unregisterGame();

	/**
	 * Get the registered {@link Game} instance.
	 * 
	 * @return The registered {@link Game} instance.
	 */
	public abstract Game getGame();

	/**
	 * Checks if a {@link Game} has already been registered.
	 * 
	 * @return True if a {@link Game} has already been registered, false otherwise.
	 */
	public abstract boolean isGameRegistered();

}
