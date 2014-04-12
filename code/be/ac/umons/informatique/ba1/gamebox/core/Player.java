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
	protected Game game;
	
	public Player(String n, Game g) {
		name = n;
		events = new ArrayList<Event>();
		//we can't call setGame() here because of ComputerPlayer:
		//if we do, a NPE will be thrown (the overloaded setGame calls ai.setGame)
		game = g;
	}
	
	public void setGame(Game g) {
		game = g;
	}
	
	public Game getGame() {
		return game;
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
