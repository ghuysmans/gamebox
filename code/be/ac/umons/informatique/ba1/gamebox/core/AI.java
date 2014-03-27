package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic Artificial Intelligence class.
 * This can't be used directly (only through a ComputerPlayer instance).
 */

public abstract class AI {

	public final String desc;
	protected Game game;

	public AI(Game g, String d) {
		desc = d;
		game = g;
	}
	
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
