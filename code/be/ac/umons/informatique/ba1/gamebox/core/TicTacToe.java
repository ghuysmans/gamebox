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

	public int getScore() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Move> getLegalMoves() {
		throw new UnsupportedOperationException();
	}


}
