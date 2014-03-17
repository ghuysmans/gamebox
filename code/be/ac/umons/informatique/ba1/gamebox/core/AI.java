package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic Artificial Intelligence class.  
 */

public abstract class AI {

	public final String desc;

	public AI(String d) {
		desc = d;
	}

	public abstract int computeNode(Player p);
	public abstract Move getBest(Player p);


}
