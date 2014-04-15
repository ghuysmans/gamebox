package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;


/** 
 * Always plays a random move among possible moves
 */

public class RandomAI extends AI {
	
	private static final long serialVersionUID = 1244871909804694383L;

	public RandomAI(Game g) {
		super(g, "Random AI");
	}

	@Override
	public int computeNode() {
		return Game.SCORE_DRAW;
	}
		
	@Override
	public Move getBest() {
		ArrayList<Move> mv = game.getLegalMoves();
		if (mv.isEmpty())
			return null;
		else {
			int rand = (int)(Math.random()*mv.size());
			return mv.get(rand);
		}
	}
	

}
