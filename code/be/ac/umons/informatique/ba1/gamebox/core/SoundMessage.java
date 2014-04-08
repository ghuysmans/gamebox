package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.Observable;

/** 
 * Plays a sound  
 */

class SoundMessage extends TextMessage {

	/**
	 * Creates a sound message without conditions.
	 * The filename is determined from the name parameter.
	 * @param obs  Observable object
	 * @param desc User-readable description
	 * @param msg  Message displayed on screen
	 * @param nm   Name (to be used in Game's subclasses)
	 * @param thr  Threshold
	 * @param rst  Auto-reset
	 */
	public SoundMessage(Observable obs, String msg, String desc, String nm, int thr, boolean rst) {
		super(obs, msg, desc, nm, thr, rst);
	}

	/**
	 * Creates a sound message with conditions.
	 * The filename is determined from the name parameter.
	 * @param obs  Observable object
	 * @param desc User-readable description
	 * @param msg  Message displayed on screen
	 * @param nm   Name (to be used in Game's subclasses)
	 * @param thr  Threshold
	 * @param rst  Auto-reset
	 * @param cond Conditions
	 */
	public SoundMessage(Observable obs, String msg, String desc, String nm, int thr, boolean rst, Condition... cond) {
		super(obs, msg, desc, nm, thr, rst, cond);
	}

}
