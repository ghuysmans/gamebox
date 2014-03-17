package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Traditional tic tac toe game  
 */

public class TicTacToe extends Game {
	
	protected final int required;

	public TicTacToe(int width, int height, int req) {
		super(width, height);
		required = req;
	}
	
	/**
	 * Evaluates the score of a given player. Returns :
	 * - a negative value if he loses
	 * - zero if draw (or there's nothing special)
	 * - a positive value if he wins
	 * @param p	Player
	 * @return numeric score
	 * @author ghs
	 */
	@Override
	public int getScore(Player p) {
		//horizontal
		for (int r=0; r<board.getHeight(); r++) {
			//for each start cell,
			for (int x=0; x<=board.getWidth()-required; x++) {
				Piece v = board.getPiece(x, r);
				if (v != null)
				{
					boolean skip = false;
					for (int y=x+1; y<x+required; y++) {
						Piece cur = board.getPiece(y, x);
						if (cur==null || v.owner!=cur.owner) {
							skip = true;
							break;
						}
					}
					if (!skip) //found!
						return (v.owner == p ? SCORE_WON : SCORE_LOST);
				}
			}
		}
		//vertical
		for (int x=0; x<board.getWidth(); x++) {
			//for each start cell,
			for (int y=0; y<=board.getHeight()-required; y++) {
				Piece v = board.getPiece(x, y);
				if (v != null)
				{
					boolean skip = false;
					for (int z=y+1; z<y+required; z++) {
						Piece cur = board.getPiece(x, z);
						if (cur==null || v.owner!=cur.owner) {
							skip = true;
							break;
						}
					}
					if (!skip) //found!
						return (v.owner == p ? SCORE_WON : SCORE_LOST);
				}
			}
		}
		//diagonal, down
		for (int y=0; y<=board.getHeight()-required; y++) {
			//for each start cell,
			for (int x=0; x<=board.getWidth()-required; x++) {
				Piece v = board.getPiece(x, y);
				if (v != null)
				{
					boolean skip = false;
					for (int o=1; o<required; o++) {
						Piece cur = board.getPiece(x+o, y+o);
						if (cur==null || v.owner!=cur.owner) {
							skip = true;
							break;
						}
					}
					if (!skip) //found!
						return (v.owner == p ? SCORE_WON : SCORE_LOST);
				}
			}
		}
		//diagonal, up
		for (int y=required-1; y<board.getHeight(); y++) {
			//for each start cell,
			for (int x=0; x<=board.getWidth()-required; x++) {
				Piece v = board.getPiece(x, y);
				if (v != null)
				{
					boolean skip = false;
					for (int o=1; o<required; o++) {
						Piece cur = board.getPiece(x+o, y-o);
						if (cur==null || v.owner!=cur.owner) {
							skip = true;
							break;
						}
					}
					if (!skip) //found!
						return (v.owner == p ? SCORE_WON : SCORE_LOST);
				}
			}
		}
		//nobody has won: draw
		return SCORE_DRAW;
	}

	@Override
	public boolean hasFinished() {
		int score = getScore(this.players.get(0));
		//if any player has won (the first one, for example), it's finished.
		if (score != SCORE_DRAW)
			return true;
		//else, let's see whether the board is full
		for (int y=0; y<board.getHeight(); y++) {
			for (int x=0; x<board.getWidth(); x++) { 
				if (this.board.getPiece(x, y) == null)
					return false;
			}
		}
		return true;
	}
	
	@Override
	public ArrayList<Move> getLegalMoves(Player p) {
		ArrayList<Move> al = new ArrayList<Move>();
		for (int y=0; y<board.getHeight(); y++) {
			for (int x=0; x<board.getWidth(); x++) {
				if (board.getPiece(x, y) == null)
					al.add(new PutMove(this, p, x, y));
			}
		}
		return al;
	}


}
