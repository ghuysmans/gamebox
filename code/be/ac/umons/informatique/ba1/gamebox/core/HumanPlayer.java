package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Usable player (from the UI). It also saves achievements...  
 */

public class HumanPlayer extends Player {

	public ArrayList<Event> events;
	
	public HumanPlayer(Game g, String n) {
		super(n, g);
		events = new ArrayList<Event>();
		//TODO add Achievements here
	}

	/**
	 * Saves achievements, etc.
	 */
	public final void saveProfile() {
		//TODO
	}


}
