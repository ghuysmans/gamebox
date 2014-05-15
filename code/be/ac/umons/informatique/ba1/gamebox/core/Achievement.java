package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Classical achievements, saved for each player, independently. 
 */

public class Achievement extends TextMessage {
	private static final long serialVersionUID = -830995388511588828L;
	
	/**
	 * Is there an icon to represent it?
	 */
	public final boolean icon;
	
	/**
	 * Creates an achievement without conditions
	 * @param obs  Observable object
	 * @param desc User-readable description
	 * @param msg  Message displayed on screen
	 * @param nm   Name (to be used in Game's subclasses)
	 * @param thr  Threshold
	 * @param rst  Auto-reset
	 * @param ico  Icon?
	 */
	public Achievement(SavedObservable obs, String desc, String msg, String nm, int thr, boolean rst, boolean ico) {
		super(obs, desc, msg, nm, thr, rst);
		icon = ico;
		//TODO translate this (pass a key instead of two Strings)
	}
	
	/**
	 * Creates an achievement with conditions
	 * @param obs  Observable object
	 * @param desc User-readable description
	 * @param msg  Message displayed on screen
	 * @param nm   Name (to be used in Game's subclasses)
	 * @param thr  Threshold
	 * @param rst  Auto-reset
	 * @param ico  Icon?
	 * @param cond Conditions
	 */
	public Achievement(SavedObservable obs, String desc, String msg, String nm, int thr, boolean rst, boolean ico, Condition... cond) {
		super(obs, desc, msg, nm, thr, rst, cond);
		icon = ico;
	}
	
	@Override
	protected void performAction() {
		Logging.getLogger(getClass()).fine("Achievement unlocked: "+this.message);
	}
	
	@Override
	public String toString() {
		return fullString();
	}

}
