package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.Observable;
import java.util.ArrayList;

/** 
 * Generic game  
 */

public abstract class Game extends Observable {

	public static final int SCORE_WON 	= 42;
	public static final int SCORE_LOST 	= -42;
	public static final int SCORE_DRAW 	= 0;
	
	public Player currentPlayer;
	public ArrayList<Player> players;
	public final Board board;

	public Game(int width, int height) {
		board = new Board(width, height);
		players = new ArrayList<Player>();
	}

	public String getPosStr(int x, int y) {
		if (board.getWidth() <= 26)
			return Character.toString((char)('a'+x)) + y;
		else
			return x+","+y;
	}
	
	public abstract boolean hasFinished();
	public abstract int getScore(Player p);
	public abstract ArrayList<Move> getLegalMoves(Player p);

}
