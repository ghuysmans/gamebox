package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic condition for events
 */

abstract class Condition {

    protected int count;

    public abstract boolean isMet();

    public final void reset() {
    	count = 0;
    }

}
