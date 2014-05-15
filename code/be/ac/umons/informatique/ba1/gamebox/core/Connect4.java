package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Traditional connect four (four in a row) game  
 */

public class Connect4 extends TicTacToe {

	private static final long serialVersionUID = 8899500704858942663L;
	
	public Connect4() {
		this(7, 6);
	}

	public Connect4(int width, int height) {
		this(width, height, 4);
	}
	
	public Connect4(int width, int height, int req) {
		super(width, height, req);
	}

	@Override
	public String posToStr(int x, int y) {
		return Integer.toString(x);
	}
	
	@Override
	public int[] strToPos(String s) {
		int x=Integer.parseInt(s), y;
		for (y=board.getHeight()-1; y>=0; y--)
			if (board.getPiece(x, y)==null)
				//found
				return new int[]{x, y};
		return null; //invalid column
	}
	
	/**
	 * Creates a move, ignoring the Y coordinate.
	 * @param x X coordinate
	 * @param y This could be anything you like, it will be ignored anyway.
	 */
	@Override
	public Move createUserMove(int x, int y) {
		for (int real_y=board.getHeight()-1; real_y>=0; real_y--)
			if (board.getPiece(x, real_y) == null)
				return new PutMove(this, x, real_y);
		return null; //not found
	}
	
	@Override
	public ArrayList<Move> computeLegalMoves() {
		ArrayList<Move> al = new ArrayList<Move>();
		for (int x=0; x<board.getWidth(); x++) {
			for (int y=board.getHeight()-1; y>=0; y--) {
				if (board.getPiece(x, y) == null) {
					al.add(new PutMove(this, x, y));
					break; //next column
				}
			}
		}
		return al;
	}

}
