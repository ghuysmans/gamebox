package be.ac.umons.informatique.ba1.gamebox.core;
import java.io.Serializable;
import java.util.ArrayList;

/** 
 * Generic game  
 */

public abstract class Game extends MyObservable implements Serializable {

	private static final long serialVersionUID = -535116433524494964L;
	public static final int RESULT_WON 	= 42;
	public static final int RESULT_LOST = -42;
	public static final int RESULT_DRAW = 0;
	
	protected Player currentPlayer;
	public final Player[] players;
	public final Board board;
	public final History history;
	public final ArrayList<Event> events;
	public ArrayList<Move> legalMoves;

	public Game(int width, int height) {
		board = new Board(width, height);
		history = new History(); //empty
		players = new Player[2];
		events = new ArrayList<Event>();
	}
	
	/**
	 * Initializes players and currentPlayer
	 * @param p1 First player
	 * @param p2 Second player
	 */
	public final void setPlayers(Player p1, Player p2) {
		players[0] = p1; p1.setGame(this);
		players[1] = p2; p2.setGame(this);
		setup(); //must be here for Othello
		setCurrentPlayer(p1);
	}
	
	/**
	 * Creates the initial game state.
	 */
	public void setup() {
		return;
	}
	
	/**
	 * Selects the other player as current one.
	 */
	public final void nextPlayer() {
		assert(currentPlayer!=null): "Trying to use an uninitialized Game";
		if (currentPlayer == players[0])
			setCurrentPlayer(players[1]);
		else
			setCurrentPlayer(players[0]);
	}
	
	/**
	 * Forces a new current player (used in {@link Move#undo()}).
	 * @param p New current player
	 */
	public final void setCurrentPlayer(Player p) {
		currentPlayer = p;
		legalMoves = computeLegalMoves();
	}
	
	/**
	 * Returns the player who has to play.
	 * @return Current player
	 */
	public final Player getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 * Converts a given (x,y) position to a human-readable string.
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @return A string corresponding to the game
	 */
	public String posToStr(int x, int y) {
		if (board.getWidth() <= 26)
			return Character.toString((char)('a'+x)) + y;
		else
			return x+","+y;
	}
	
	/**
	 * Converts a given human-readable string to an (x,y) position.
	 * @param s String to be converted
	 * @return Array containing x and y coordinates
	 */
	public int[] strToPos(String s) {
		int pos = s.indexOf(",");
		if (pos == -1)
			//not found : short format
			return new int[]{s.toCharArray()[0]-'a', Integer.parseInt(s.substring(1))};
		else
			//found : raw format
			return new int[]{Integer.parseInt(s.substring(0, pos)), Integer.parseInt(s.substring(pos+1))};
	}
	
	/**
	 * Evaluates the score of the given player.
	 * @see #getScore(Player)
	 */
	public final int getScore() {
		return getScore(currentPlayer);
	}
	
	/**
	 * Evaluates the result of the given player and categorizes it.
	 * @param p Player
	 * @return {@link #RESULT_DRAW}, {@link #RESULT_LOST}, {@link #RESULT_WON}
	 */
	public int getResult(Player p) {
		return getScore(p); //default behavior: passthrough
	}
	
	/**
	 * Evaluates the result of the current player and categorizes it.
	 * @return {@link #RESULT_DRAW}, {@link #RESULT_LOST}, {@link #RESULT_WON}
	 */
	public int getResult() {
		return getResult(currentPlayer);
	}
	
	/**
	 * Creates a move from the given description.
	 * @param desc Move description
	 * @return Move to be compared to legalMoves, not used directly
	 */
	public Move createMove(String desc) {
		int ret[] = strToPos(desc);
		if (ret == null)
			return null;
		else
			return createMove(ret[0], ret[1]);
	}
	
	/**
	 * Creates a move from the given coordinates
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @return Move to be compared to legalMoves, not used directly
	 */
	public Move createMove(int x, int y) {
		return new PutMove(this, x, y);
	}
	
	/**
	 * Notifies all events corresponding to name.
	 * Only the current player will be notified.
	 * @param name Event name
	 */
	public final void notifyEvent(String name) {
		Logging.getLogger(getClass()).fine("notifyEvent: "+name+" to "+currentPlayer.name);
		setChanged();
		notifyObservers(name);
		currentPlayer.notifyEvent(name);
	}
	
	/**
	 * Returns a set of legal moves to be played by the current player.
	 * Note: this method will return moves even isFinished()==true!
	 * @return ArrayList with new instances of Move
	 */
	public final ArrayList<Move> getLegalMoves() {
		return legalMoves;
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
	 * Computes legal moves; called internally.
	 * @see getLegalMoves()
	 */
	protected abstract ArrayList<Move> computeLegalMoves();

}
