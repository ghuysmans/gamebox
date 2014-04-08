package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.Observable;

/** 
 * Displays a text message  
 */

class TextMessage extends Event {

	protected final String message;
	
	/**
	 * Creates an event without conditions
	 * @param o Observable object
	 * @param d User-readable description
	 * @param m Message displayed on screen
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 */
	public TextMessage(Observable o, String d, String m, String n, int t, boolean r) {
		super(o, d, n, t, r);
		message = m;
	}
	
	/**
	 * Creates an event with conditions
	 * @param o Observable object
	 * @param d User-readable description
	 * @param m Message displayed on screen
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 * @param c Conditions
	 */
	public TextMessage(Observable o, String d, String m, String n, int t, boolean r, Condition... c) {
		super(o, d, n, t, r, c);
		message = m;
	}
	
	/**
	 * A way to keep a full String description
	 * @return Full description
	 * @see Event#toString()
	 */
	protected String fullString() {
		return super.toString();
	}
	
	@Override
	public String toString() {
		return message;
	}

}
