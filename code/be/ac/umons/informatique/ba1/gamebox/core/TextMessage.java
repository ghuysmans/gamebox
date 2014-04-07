package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Displays a text message  
 */

class TextMessage extends Event {

	protected final String message;
	
	/**
	 * Creates a text message
	 * @param g Game to subscribe to
	 * @param m Message displayed on screen
	 * @param d User-readable description
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 */
	public TextMessage(Game g, String m, String d, String n, int t, boolean r) {
		super(g, d, n, t, r);
		message = m;
	}

	@Override
	public String toString() {
		return name;
	}

}
