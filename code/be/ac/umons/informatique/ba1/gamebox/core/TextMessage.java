package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Displays a text message  
 */

class TextMessage extends Event {

	private static final long serialVersionUID = -4923366138731817906L;
	public final String message;
	
	/**
	 * Creates an event without conditions
	 * @param obs  Observable object
	 * @param desc User-readable description
	 * @param msg  Message displayed on screen
	 * @param nm   Name (to be used in Game's subclasses)
	 * @param thr  Threshold
	 * @param rst  Auto-reset
	 */
	public TextMessage(SavedObservable obs, String desc, String msg, String nm, int thr, boolean rst) {
		super(obs, desc, nm, thr, rst);
		message = msg;
	}
	
	/**
	 * Creates an event with conditions
	 * @param obs  Observable object
	 * @param desc User-readable description
	 * @param msg  Message displayed on screen
	 * @param nm   Name (to be used in Game's subclasses)
	 * @param thr  Threshold
	 * @param rst  Auto-reset
	 * @param cond Conditions
	 */
	public TextMessage(SavedObservable obs, String desc, String msg, String nm, int thr, boolean rst, Condition... cond) {
		super(obs, desc, nm, thr, rst, cond);
		message = msg;
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
