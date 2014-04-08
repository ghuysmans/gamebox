package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.Observable;

/** 
 * Plays a sound  
 */

class SoundMessage extends TextMessage {

	/**
	 * Creates a sound message without conditions.
	 * The filename is determined from the name parameter.
	 * @param o Observable object
	 * @param m Message displayed on screen
	 * @param d User-readable description
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 */
	public SoundMessage(Observable o, String m, String d, String n, int t, boolean r) {
		super(o, m, d, n, t, r);
	}

	/**
	 * Creates a sound message with conditions.
	 * The filename is determined from the name parameter.
	 * @param o Observable object
	 * @param m Message displayed on screen
	 * @param d User-readable description
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 * @param c Conditions
	 */
	public SoundMessage(Observable o, String m, String d, String n, int t, boolean r, Condition... c) {
		super(o, m, d, n, t, r, c);
	}

}
