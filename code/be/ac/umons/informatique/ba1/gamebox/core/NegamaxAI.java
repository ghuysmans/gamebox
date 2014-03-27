package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.ArrayList;

/** 
 * Negamax algorithm implementation.
 * Much inspired from http://chessprogramming.wikispaces.com/Negamax (2014-02-13).
 */

public class NegamaxAI extends AI {
	
	protected final int max_recursion;

	public NegamaxAI(int max_rec) {
		super("Negamax AI");
		max_recursion = max_rec;
	}
	
	/**
	 * @param p Current player
	 * @param rec Recursion level
	 * @see AI#computeNode(Player)
	 */
	private int computeNode(Player p, int rec) {
		//leaf? did someone win?
		int score = p.game.getScore(p);
		if (score==Game.SCORE_LOST || score==Game.SCORE_WON || rec==max_recursion)
			//no need to compute further, we're done
			return score;
		//test possible moves...
		ArrayList<Move> mvs = p.game.getLegalMoves(p);
		if (mvs.size() == 0)
			return score;
		else
		{
			int M = Integer.MIN_VALUE; //fake value which will be overwritten
			int v; //score for current move
			Player otherPlayer = (p.game.players[0]==p ? p.game.players[1] : p.game.players[0]);
			for (Move mv: mvs)
			{
				mv.play();
				v = -computeNode(otherPlayer, rec+1);
				p.game.history.undo();
				if (v > M)
					M = v; //keep the max
			}
			return M;
		}
	}
	
	/**
	 * Wrapper to an internal method.
	 * @see #computeNode(Player, int)
	 */
	@Override
	public int computeNode(Player p) {
		return computeNode(p, 0);
	}

	@Override
	public Move getBest(Player p) {
		ArrayList<Move> mvs = p.game.getLegalMoves(p);
		Move bm = null; //best move (to be returned)
		if (mvs.size() != 0) //can we do something?
		{
			int bs = Integer.MIN_VALUE; //fake value which will be overwritten
			int v; //score for current move
			Player otherPlayer = (p.game.players[0]==p ? p.game.players[1] : p.game.players[0]);
			for (Move mv: mvs)
			{
				mv.play();
				v = -computeNode(otherPlayer);
				p.game.history.undo();
				if (v > bs)
				{
					bs = v; //keep the best move 
					bm = mv; //... and the associated score
				}
			}
		}
		return bm;
	}

}
