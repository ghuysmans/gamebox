package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Traditional connect four (four in a row) game  
 */

public class Connect4 extends TicTacToe {

	public Connect4(int width, int height, int req) {
		super(width, height, req);
	}

	public String getPosStr(int x, int y) {
		return Integer.toString(x);
	}
	
	@Override
	public ArrayList<Move> getLegalMoves(Player p) {
		ArrayList<Move> al = new ArrayList<Move>();
		for (int x=0; x<board.getHeight(); x++) {
			for (int y=0; y<board.getWidth(); y++) {
				if (board.getPiece(x, y)!=null && y>0)
				{
					al.add(new PutMove(this, p, x, y-1));
					break; //next column
				}
			}
		}
		return al;
	}


}
