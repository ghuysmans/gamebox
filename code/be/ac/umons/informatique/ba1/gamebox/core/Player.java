package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;
import java.util.ArrayList;

/** 
 * Generic player 
 */

public abstract class Player extends SavedObservable implements Serializable {

	private static final long serialVersionUID = -2969901121702177313L;
	
	/**
	 * Nickname
	 */
	public String name;
	
	/**
	 * Associated Events (Achievements, etc.)
	 */
	public final ArrayList<Event> events;
	
	
	public Player(String n) {
		name = n;
		events = new ArrayList<Event>();
	}
	
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * Notifies all events corresponding to name.
	 * By default, does nothing.
	 * @param name Event name
	 */
	public void notifyEvent(String name) {
		return;
	}

	/**
	 * Stores (if needed) a reference to the Game object this player is playing on.
	 * @param g Game object
	 */
	public void setGame(Game g) {
		return;
	}

}
