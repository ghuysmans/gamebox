package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Plays a sound  
 */

class SoundMessage extends TextMessage {

	/**
	 * Creates a sound message.
	 * The filename is determined from the name parameter.
	 * @param g Game to subscribe to
	 * @param m Message displayed on screen
	 * @param d User-readable description
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 */
	public SoundMessage(Game g, String m, String d, String n, int t, boolean r) {
		super(g, m, d, n, t, r);
	}

}
