package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Traditional tic-tac-toe game  
 */

public class TicTacToe extends Game {
	
	private static final long serialVersionUID = 7629735041191059405L;
	
	/**
	 * Number of aligned pieces required for a player to win
	 */
	protected final int required;
	
	
	public TicTacToe() {
		this(3, 3);
	}

	public TicTacToe(int width, int height) {
		this(width, height, 3);
	}
	
	public TicTacToe(int width, int height, int req) {
		this("TTT", width, height, req);
	}
	
	public TicTacToe(String sn, int width, int height, int req) {
		super(sn, width, height);
		required = req;
	}
	
	@Override
	public int getResult(Player p) {
		//horizontal
		for (int y=0; y<board.getHeight(); y++) {
			//for each start cell,
			for (int x=0; x<=board.getWidth()-required; x++) {
				Piece v = board.getPiece(x, y);
				if (v != null)
				{
					boolean skip = false;
					for (int z=x+1; z<x+required; z++) {
						Piece cur = board.getPiece(z, y);
						if (cur==null || v.owner!=cur.owner) {
							skip = true;
							break;
						}
					}
					if (!skip)
						//found a sequence of the required size!
						//p has either won or lost (there's no draw)
						return (v.owner == p ? RESULT_WON : RESULT_LOST);
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
						return (v.owner == p ? RESULT_WON : RESULT_LOST);
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
						return (v.owner == p ? RESULT_WON : RESULT_LOST);
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
						return (v.owner == p ? RESULT_WON : RESULT_LOST);
				}
			}
		}
		//nobody has won: draw
		return RESULT_DRAW;
	}
	
	@Override
	public int getScore(int depth) {
		return getScore() >> depth;
	}

	@Override
	public boolean hasFinished() {
		int score = getResult(this.players[0]); //arbitrary choice (could be players[1])
		//anyway, if any player has won (the first one, for example), it's finished.
		if (score==RESULT_WON || score==RESULT_LOST)
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
	public ArrayList<Move> computeLegalMoves() {
		ArrayList<Move> al = new ArrayList<Move>();
		for (int y=0; y<board.getHeight(); y++) {
			for (int x=0; x<board.getWidth(); x++) {
				if (board.getPiece(x, y) == null)
					al.add(new PutMove(this, x, y));
			}
		}
		return al;
	}
	
}
