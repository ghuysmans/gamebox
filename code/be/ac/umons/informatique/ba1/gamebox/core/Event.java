package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.Observer;
import java.util.Observable;

/** 
 * Generic event doing something after a specific (set of) conditions is met  
 */

public abstract class Event extends Condition {

	/**
	 * Creates an achievement
	 * @param g Game to subscribe to
	 * @param d User-readable description
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 */
	public Event(Game g, String d, String n, int t, boolean r) {
		super(g, null, d, n, t, r);
	}
	
	public void update(Observable g, Object param) {
		//TODO check conditions
		throw new UnsupportedOperationException();
	}

}
