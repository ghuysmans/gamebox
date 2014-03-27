package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.ArrayList;

/** 
 * Absent AI (always plays the first possible move)
 */

public class AbsentAI extends AI {
	
	public AbsentAI(Game g) {
		super(g, "Absent AI (always plays the first possible move)");
	}
	
	@Override
	public int computeNode() {
		return Game.SCORE_DRAW;
	}
	
	@Override
	public Move getBest() {
		ArrayList<Move> mv = game.getLegalMoves();
		if (mv.size() == 0)
			return null;
		else
			return mv.get(0);
	}


}
