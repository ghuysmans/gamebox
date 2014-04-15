package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;
import java.util.ArrayList;

/** 
 * Generic player 
 */

public abstract class Player extends MyObservable implements Serializable {

	private static final long serialVersionUID = -2969901121702177313L;
	public String name;
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

}
