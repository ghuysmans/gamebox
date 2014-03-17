package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic rule for victory and draw  
 */

abstract class Rule {

	/**
	 * Determines whether m matches the rule
	 * @param m Move
	 * @return true if it matches
	 */
	public abstract boolean match(Move m);

}
