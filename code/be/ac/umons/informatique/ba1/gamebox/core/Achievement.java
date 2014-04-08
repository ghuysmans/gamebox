package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.Observable;

/** 
 * Like classical achievements, displays a message when a particular action is done.
 * These are saved for each player, independently. 
 */

public class Achievement extends TextMessage {

	public final boolean icon;
	
	/**
	 * Creates an achievement without conditions
	 * @param o Observable object
	 * @param d User-readable description
	 * @param m Message displayed on screen
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 */
	public Achievement(Observable o, String d, String m, String n, int t, boolean r, boolean i) {
		super(o, d, m, n, t, r);
		icon = i;
	}
	
	/**
	 * Creates an achievement with conditions
	 * @param o Observable object
	 * @param d User-readable description
	 * @param m Message displayed on screen
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 * @param c Conditions
	 */
	public Achievement(Observable o, String d, String m, String n, int t, boolean r, boolean i, Condition... c) {
		super(o, d, m, n, t, r, c);
		icon = i;
	}
	
	@Override
	protected void performAction() {
		System.out.println("Achievement unlocked: "+this.toString());
	}
	
	@Override
	public String toString() {
		return fullString();
	}

}
