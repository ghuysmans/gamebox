package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Traditional connect four (four in a row) game  
 */

public class Connect4 extends TicTacToe {

	public Connect4(int width, int height, int req) {
		super(width, height, req);
	}

	@Override
	public String getPosStr(int x, int y) {
		return Integer.toString(x);
	}
	
	@Override
	public ArrayList<Move> getLegalMoves(Player p) {
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
