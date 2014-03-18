package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.ArrayList;

/** 
 * Absent AI (always plays the first possible move)
 */

public class AbsentAI extends AI {
	
	public AbsentAI() {
		super("Absent AI (always plays the first possible move)");
	}
	
	@Override
	public int computeNode(Player p) {
		return Game.SCORE_DRAW;
	}
	
	@Override
	public Move getBest(Player p) {
		ArrayList<Move> mv = p.game.getLegalMoves(p);
		if (mv.size() == 0)
			return null;
		else
			return mv.get(0);
	}


}
