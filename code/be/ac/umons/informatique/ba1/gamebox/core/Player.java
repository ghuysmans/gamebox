package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

/** 
 * Generic player 
 */

public abstract class Player extends Observable implements Serializable {

	private static final long serialVersionUID = -2969901121702177313L;
	public final String name;
	public final ArrayList<Event> events;
	
	public Player(String n) {
		name = n;
		events = new ArrayList<Event>();
	}
	
	/**
	 * Notifies all events corresponding to name.
	 * By default, does nothing.
	 * @param name Event name
	 */
	public void notifyEvent(String name) {
		return;
	}

}
