package be.ac.umons.informatique.ba1.gamebox.ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import be.ac.umons.informatique.ba1.gamebox.core.Connect4;
import be.ac.umons.informatique.ba1.gamebox.core.Game;
import be.ac.umons.informatique.ba1.gamebox.core.Othello;
import be.ac.umons.informatique.ba1.gamebox.core.TicTacToe;

/**
 * Link between the UI and the core Game classes.
 * Stores information about:
 * - a game and how to construct one (used in menus)
 * - textures used by the associated BoardPanel
 */

public enum UiGame {

	C4("Puissance 4", Connect4.class, "fiar/board", "fiar/yellow", "fiar/red", true),
	TTT("Tic-tac-toe", TicTacToe.class, "ttt/board", "ttt/o", "ttt/x", false),
	OTH("Othello", Othello.class, "oth/board", "oth/black", "oth/white", false);
	
	
	/**
	 * User-friendly name
	 */
	public final String name;
	public final Class<? extends Game> cls;
	public final String txBoard;
	public final String txP1;
	public final String txP2;
	public final boolean txRev;
	
	
	/**
	 * Creates a descriptor
	 * @param n User-readable name
	 * @param c Class to be instantiated
	 * @param tb Board texture
	 * @param t1 Texture for player 1's pieces
	 * @param t2 Texture for player 2's pieces
	 * @param tr Reversed layers?
	 */
	private UiGame(String n, Class<? extends Game> c, String tb, String t1, String t2, boolean tr) {
		name = n;
		cls = c;
		txBoard = tb;
		txP1 = t1;
		txP2 = t2;
		txRev = tr;
	}
	
	/**
	 * Creates an instance of cls with default dimensions using Java Reflection!
	 * @see #createGame(int, int)
	 */
	public Game createGame() throws InvocationTargetException, Exception {
		return cls.newInstance();
	}
	
	/**
	 * Creates an instance of cls with given dimensions using Java Reflection!
	 * @param  x Board width
	 * @param  y Board height
	 * @return A ready-to-use Game object
	 * @throws InvocationTargetException Invalid dimensions, etc.
	 * @throws Exception                 Non-existing constructor...
	 */
	public Game createGame(int x, int y) throws InvocationTargetException, Exception {
		//arguments: width, height
		Class<?>[] argTypes = {int.class, int.class};
		Object[] argValues = {new Integer(x), new Integer(y)};
		//get a reference to the needed constructor
		Constructor<?> cons = cls.getConstructor(argTypes);
		//use it!
		return (Game)cons.newInstance(argValues);
	}
	
}
