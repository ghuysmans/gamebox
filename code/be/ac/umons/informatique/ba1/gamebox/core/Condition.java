package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic condition for events
 */

abstract class Condition {

	protected int count;

	public final void reset() {
		count = 0;
	}
	
	public abstract boolean isMet();

}
