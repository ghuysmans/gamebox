package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;

/** 
 * Generic Artificial Intelligence class.
 * This is not meant to be used directly (only through a ComputerPlayer instance).
 */

public abstract class AI implements Serializable {

	private static final long serialVersionUID = 2932487869213658719L;
	
	/**
	 * Minimum AI level (used in the UI)
	 */
	public static final int LEVEL_MIN = 0;

	/**
	 * Medium AI level (used in the UI)
	 */
	public static final int LEVEL_MID = 5;

	/**
	 * Maximum AI level (used in the UI)
	 */
	public static final int LEVEL_MAX = 8;
	
	/**
	 * User-friendly AI description
	 */
	public final String desc;
	
	/**
	 * Currently attached Game
	 */
	protected Game game;

	
	public AI(Game g, String d) {
		desc = d;
		game = g;
	}
	
	/**
	 * Attaches the AI to another Game
	 * @param g New game
	 */
	public void setGame(Game g) {
		game = g;
	}

	/**
	 * Computes a numeric score for the current node and player.
	 * @return Score associated to the current node
	 */
	public abstract int computeNode();
	
	/**
	 * Computes the best move to play for the current player
	 * @return Best move to play
	 */
	public abstract Move getBest();

}
