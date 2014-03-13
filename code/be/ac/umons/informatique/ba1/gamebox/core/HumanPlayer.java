package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Usable player (from the UI). It also saves achievements...  
 */

public class HumanPlayer extends Player {

	public ArrayList<Event> events;
	
	public HumanPlayer(String n, Game g) {
		super(n, g);
	}

	public final void saveProfile() {
		//TODO
	}


}
