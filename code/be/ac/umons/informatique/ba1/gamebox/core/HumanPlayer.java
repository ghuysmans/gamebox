package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Usable player (from the UI). It also saves achievements...  
 */

public class HumanPlayer extends Player {

	private static final long serialVersionUID = -7712335606322413655L;

	public HumanPlayer(String n) {
		super(n);
		
		events.add(new Achievement(this, "Vous avez joué votre premier coup !", "Ma première fois", "1stmv", 1, false, true, 
			new Condition(this, "Mouvement joué", "mv", 1)));
		events.add(new Achievement(this, "Vous avez gagné votre première partie !", "Le début de la gloire", "1stwin", 1, false, true, 
			new Condition(this, "Victoire", "won", 1)));
		events.add(new Achievement(this, "Vous avez défait un de vos mouvements...", "Manque de confiance en soi", "1stud", 1, false, true, 
			new Condition(this, "Mouvement joué", "ud", 1)));
		events.add(new Achievement(this, "Vous avez gagné 10 parties d'othello", "Othellier fou", "croth", 1, false, true, 
			new Condition(this, "Victoire à Othello", "won-oth", 10)));
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
