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
		
		events.add(new Achievement(this, "Premier mouvement", "Vous avez joué votre premier coup !   --> "+name, "1stmv", 1, true, true, 
			new Condition(this, null, "Mouvement joué", "mv", 1, false)));
		events.add(new Achievement(this, "Confiance en soi", "Vous avez défait un mouvement...   --> "+name, "1stud", 1, true, true, 
			new Condition(this, null, "Mouvement joué", "ud", 1, false)));
	}

	/**
	 * Notifies all events corresponding to name
	 * @param name Event name
	 */
	@Override
	public void notifyEvent(String name) {
		setChanged();
		notifyObservers(name);
	}

}
