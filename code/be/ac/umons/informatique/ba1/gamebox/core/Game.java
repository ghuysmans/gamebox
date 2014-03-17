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
	public final ArrayList<Player> players;
	public final Board board;
	public final History history;

	public Game(int width, int height) {
		board = new Board(width, height);
		players = new ArrayList<Player>();
		history = new History();
	}

	/**
	 * Converts a given (x,y) position to a human-readable string
	 * It should be overridden by subclasses...
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @return A string corresponding to the game
	 */
	public String getPosStr(int x, int y) {
		if (board.getWidth() <= 26)
			return Character.toString((char)('a'+x)) + y;
		else
			return x+","+y;
	}
	
	/**
	 * Determines whether the game has finished
	 * @return true if the game has finished (can't play OR somebody has won)
	 */
	public abstract boolean hasFinished();
	
	/**
	 * Evaluates the score of a given player. Returns :
	 * - a negative value if he loses
	 * - zero if draw (or there's nothing special)
	 * - a positive value if he wins
	 * This function is needed for real AI to work.
	 * @param p	Player
	 * @return numeric score
	 */
	public abstract int getScore(Player p);
	
	/**
	 * Gets a set of legal moves be played by p
	 * @param p Player
	 * @return ArrayList with new instances of Move
	 */
	public abstract ArrayList<Move> getLegalMoves(Player p);

}
