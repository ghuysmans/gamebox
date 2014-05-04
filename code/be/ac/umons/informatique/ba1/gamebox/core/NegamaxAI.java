package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.ArrayList;

/** 
 * Negamax algorithm implementation.
 * Much inspired from http://chessprogramming.wikispaces.com/Negamax (2014-02-13).
 */

public class NegamaxAI extends AI {
	
	private static final long serialVersionUID = 3102809303323977852L;
	protected final int maxRecursion;

	public NegamaxAI(Game g, int rec) {
		super(g, "Negamax AI");
		maxRecursion = rec;
	}
	
	/**
	 * @param rec Recursion level
	 * @see AI#computeNode()
	 */
	private int computeNode(int rec) {
		int score = game.getScore();
		//leaf? did someone win?
		int result = game.getResult();
		if (result==Game.RESULT_LOST || result==Game.RESULT_WON || rec==maxRecursion)
			//no need to compute further, we're done
			return score;
		//test possible moves...
		ArrayList<Move> mvs = game.getLegalMoves();
		if (mvs.size() == 0)
			return score;
		else
		{
			int M = Integer.MIN_VALUE; //fake value which will be overwritten
			int v; //score for current move
			for (Move mv: mvs)
			{
				mv.play(false);
				v = -computeNode(rec+1);
				game.history.undo(false);
				if (v > M)
					M = v; //keep the max
			}
			return M;
		}
	}
	
	/**
	 * Wrapper to an internal method.
	 * @see #computeNode(int)
	 */
	@Override
	public int computeNode() {
		return computeNode(0);
	}

	@Override
	public Move getBest() {
		ArrayList<Move> mvs = game.getLegalMoves();
		Move bm = null; //best move (to be returned)
		if (mvs.size() != 0) { //can we do something?
			int bs = Integer.MIN_VALUE; //fake value which will be overwritten
			int v; //score for current move
			ArrayList<Move> bms = new ArrayList<Move>();
			for (Move mv: mvs) {
				mv.play(false);
				v = -computeNode(0);
				game.history.undo(false);
				if (v > bs) {
					bs = v; //keep the best move
					//create a new list of best moves
					bms.clear();
					bms.add(mv);
				}
				else if (v == bs)
					//yet a possible best move
					bms.add(mv);
			}
			if (bms.isEmpty())
				return null;
			else {
				int rand = (int)(Math.random()*bms.size());
				return bms.get(rand);
			}
		}
		return bm;
	}

}
