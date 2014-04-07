package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Like classical achievements, displays a message when a particular action is done.
 * These are saved for each player, independently. 
 */

public class Achievement extends TextMessage {

	public final boolean icon;
	
	/**
	 * Creates an achievement
	 * @param g Game to subscribe to
	 * @param m Message displayed on screen
	 * @param d User-readable description
	 * @param i Icon?
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 */
	public Achievement(Game g, String m, String d, boolean i, String n, int t) {
		super(g, m, d, n, t, false);
		icon = i;
	}

}
