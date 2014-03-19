package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Non-playable player
 */

public class ComputerPlayer {

	protected final AI ai;
	
	/**
	 * Selects an AI corresponding to the given level
	 * @param lvl Difficulty level (0-anything)
	 */
	public ComputerPlayer(int lvl) {
		if (lvl==0)
			ai = new AbsentAI();
		else if (lvl==1)
			ai = new RandomAI();
		else
			ai = new NegamaxAI(lvl-1);
	}


}
