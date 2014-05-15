package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Usable player (from the UI). It also saves achievements...  
 */

public class HumanPlayer extends Player {

	private static final long serialVersionUID = -7712335606322413655L;

	public HumanPlayer(String n) {
		super(n);
		
		events.add(new Achievement(this, "Jouez votre premier coup !", "Ma première fois", "1stmv", 1, false, true, 
			new Condition(this, "Mouvement joué", "mv", 1)));
		events.add(new Achievement(this, "Gagnez votre première partie !", "Le début de la gloire", "1stwin", 1, false, true, 
			new Condition(this, "Victoire", "won", 1)));
		events.add(new Achievement(this, "Défaites un de vos mouvements...", "Confiance en soi", "1stud", 1, false, true, 
			new Condition(this, "Mouvement défait", "ud", 1)));
		
		events.add(new Achievement(this, "Terminez 42 parties de Tic-tac-toe", "Il manque toujours la question !", "42ttt", 1, false, true, 
			new Condition(this, "Parties de Tic-tac-toe terminées", "end-TTT", 42)));
		
		events.add(new Achievement(this, "Jouez 10000 coups dans Puissance 4", "Infinity", "infinity", 1, false, true, 
			new Condition(this, "Coups dans Puissance 4", "mv-C4", 10000)));
		
		events.add(new Achievement(this, "Gagnez 10 parties d'Othello", "Othellier fou", "croth", 1, false, true, 
			new Condition(this, "Victoire à Othello", "won-OTH", 10)));
		
		//TODO implement ScoreCondition(boolean finalScore...)
		
		/*events.add(new Achievement(this, "Gagnez à Othello avec un score de 42", "Réponse à tout", "fourytwo", 1, false, true, 
			new Condition(this, "Victoire à Othello", "won-oth", 42)));*/
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
