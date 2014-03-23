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
	
	protected Player currentPlayer;
	public final Player[] players;
	public final Board board;
	public final History history;

	public Game(int width, int height) {
		board = new Board(width, height);
		history = new History(); //empty
		players = new Player[2];
	}
	
	/**
	 * Initializes players and currentPlayer
	 * @param p1 First player
	 * @param p2 Second player
	 */
	public void setPlayers(Player p1, Player p2) {
		players[0] = p1;
		players[1] = p2;
		//the following behavior could be changed...
		currentPlayer = p1;
	}
	
	/**
	 * Select the other player as current one.
	 */
	public void nextPlayer() {
		assert(currentPlayer!=null): "Trying to use an uninitialized Game";
		if (currentPlayer == players[0])
			currentPlayer = players[1];
		else
			currentPlayer = players[0];
	}
	
	/**
	 * Returns the player who has to play
	 * @return Current player
	 */
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 * Converts a given (x,y) position to a human-readable string.
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
	 * Evaluates the score of a given player. Returns (using SCORE_* constants):
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
