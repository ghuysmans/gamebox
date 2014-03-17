package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Displays a text message  
 */

class TextMessage extends Event {

	protected final String message;
	
	public TextMessage(String n, String msg) {
		super(n);
		message = msg;
	}

	@Override
	public String toString() {
		return name;
	}



}
