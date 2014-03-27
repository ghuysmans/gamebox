package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Non-playable player
 */

public class ComputerPlayer extends Player {

	protected final AI ai;
	
	/**
	 * Selects an AI corresponding to the given level
	 * @param lvl Difficulty level (0-anything)
	 */
	public ComputerPlayer(Game g, String n, int lvl) {
		super(n, g);
		if (lvl==0)
			ai = new AbsentAI(g);
		else if (lvl==1)
			ai = new RandomAI(g);
		else
			ai = new NegamaxAI(g, lvl-1);
	}

	/**
	 * Plays the best move for the current player
	 */
	public void play() {
		Move mv = ai.getBest();
		mv.play();
	}

	@Override
	public void setGame(Game g) {
		super.setGame(g);
		ai.setGame(g);
	}

}
