package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;


/** 
 * Always plays a random move among possible moves
 */

public class RandomAI extends AI {
	
	public RandomAI() {
		super("Random AI");
	}

	@Override
	public int computeNode(Player p) {
		return Game.SCORE_DRAW;
	}
		
	@Override
	public Move getBest(Player p) {
		ArrayList<Move> mv = p.game.getLegalMoves(p);
		int rand = (int)(Math.random()*mv.size());
		return mv.get(rand);
	}
	

}
