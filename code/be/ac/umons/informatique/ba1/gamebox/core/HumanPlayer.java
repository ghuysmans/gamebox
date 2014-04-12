package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Usable player (from the UI). It also saves achievements...  
 */

public class HumanPlayer extends Player {

	public HumanPlayer(Game g, String n) {
		super(n, g);
		
		events.add(new Achievement(this, "Vous avez joué votre premier coup !", "Ma première fois", "1stmv", 1, false, true, 
			new Condition(this, null, "Mouvement joué", "mv", 1)));
		events.add(new Achievement(this, "Vous avez défait un de vos mouvements...", "Confiance en soi", "1stud", 1, false, true, 
			new Condition(this, null, "Mouvement joué", "ud", 1)));
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
	
	@Override
	public String toString() {
		return name;
	}

}
