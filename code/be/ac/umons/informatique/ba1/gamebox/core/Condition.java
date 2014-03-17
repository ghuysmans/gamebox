package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic condition for events
 */

abstract class Condition {

	protected int count;

	/**
	 * Resets the internal count attribute
	 */
	public final void reset() {
		count = 0;
	}
	
	/**
	 * Determines whether the condition is met
	 * @return true if the condition is met
	 */
	public abstract boolean isMet();

}
