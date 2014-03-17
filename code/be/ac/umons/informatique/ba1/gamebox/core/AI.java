package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic Artificial Intelligence class.  
 */

public abstract class AI {

	public final String desc;

	public AI(String d) {
		desc = d;
	}

	/**
	 * Computes a numeric score for the current node.
	 * @param p Current player
	 * @return Score associated to the current node
	 */
	public abstract int computeNode(Player p);
	
	/**
	 * Computes the best move to play for player p
	 * @param p Current player
	 * @return Best move to play
	 */
	public abstract Move getBest(Player p);

}
