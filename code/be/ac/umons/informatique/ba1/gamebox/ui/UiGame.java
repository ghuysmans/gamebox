package be.ac.umons.informatique.ba1.gamebox.ui;

import java.io.IOException;
<<<<<<< HEAD
import java.lang.reflect.Constructor;
import java.net.URISyntaxException;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.net.URISyntaxException;
>>>>>>> Created UiGame to establish a link between the core and the UI parts
=======
>>>>>>> Rebased my work

import be.ac.umons.informatique.ba1.gamebox.core.Game;

/**
 * Link between the UI and the core Game classes.
 * Stores information about:
 * - a game and how to construct one (used in menus)
 * - textures used by the associated BoardPanel
 */

public class UiGame {
	
	public final String desc;
	public final int defaultX, defaultY;
	
<<<<<<< HEAD
<<<<<<< HEAD
	protected final Class<? extends Game> cls;
=======
	protected final Class<Game> cls;
>>>>>>> Created UiGame to establish a link between the core and the UI parts
=======
	protected final Class<? extends Game> cls;
>>>>>>> Rebased my work
	protected final String txBoard;
	protected final String txP1;
	protected final String txP2;
	protected final boolean txRev;
	
	/**
	 * Creates a descriptor
	 * @param d User-readable Description
	 * @param c Class to be instantiated
	 * @param x Default width
	 * @param y Default height
	 * @param tb Board texture
	 * @param t1 Texture for player 1's pieces
	 * @param t2 Texture for player 2's pieces
	 * @param tr Reversed layers?
	 */
<<<<<<< HEAD
<<<<<<< HEAD
	public UiGame(String d, Class<? extends Game> c, int x, int y, String tb, String t1, String t2, boolean tr) {
=======
	public UiGame(String d, Class<Game> c, int x, int y, String tb, String t1, String t2, boolean tr) {
>>>>>>> Created UiGame to establish a link between the core and the UI parts
=======
	public UiGame(String d, Class<? extends Game> c, int x, int y, String tb, String t1, String t2, boolean tr) {
>>>>>>> Rebased my work
		desc = d;
		cls = c;
		defaultX = x;
		defaultY = y;
		txBoard = tb;
		txP1 = t1;
		txP2 = t2;
		txRev = tr;
	}
	
<<<<<<< HEAD
	/**
	 * @see #createGame(int, int)
	 */
	public Game createGame() throws Exception {
		return createGame(defaultX, defaultY);
	}
	
	/**
	 * Creates an instance of cls with default dimensions using Java Reflection!
	 * @param  x Board width
	 * @param  y Board height
	 * @return A ready-to-use Game object
	 * @throws Exception Invalid dimensions, non-existing constructor...
	 */
	public Game createGame(int x, int y) throws Exception {
		//arguments: width, height
		Class<?>[] argTypes = {int.class, int.class};
		Object[] argValues = {new Integer(x), new Integer(y)};
		//get a reference to it
		Constructor<?> cons = cls.getConstructor(argTypes);
		//use it!
		return (Game)cons.newInstance(argValues);
=======
	public Game createGame() {
<<<<<<< HEAD
		Class<?>[] argTypes = {};
		return cls.newInstance(42);
>>>>>>> Created UiGame to establish a link between the core and the UI parts
=======
		//Class<?>[] argTypes = {};
		//return cls.newInstance(42);
		return null;
>>>>>>> Rebased my work
	}
	
	/**
	 * Creates a panel object associated to the given context.
<<<<<<< HEAD
<<<<<<< HEAD
	 * @param  ug  List of possible UiGame
	 * @param  ctx Game context
=======
	 * @param ctx Game context
>>>>>>> Created UiGame to establish a link between the core and the UI parts
=======
	 * @param  ug  List of possible UiGame
	 * @param  ctx Game context
>>>>>>> Rebased my work
	 * @return A Panel to be used in {@link Main}
	 * @throws URISyntaxException Invalid texture path
	 * @throws IOException        Can't read a texture
	 */
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> Rebased my work
	public static BoardPanel createPanel(ArrayList<UiGame> ug, GameContext ctx) throws URISyntaxException, IOException {
		for (UiGame g: ug)
			if (g.cls == ctx.game.getClass())
				return new BoardPanel(ctx, g.txBoard, g.txP1, g.txP2, g.txRev);
		return null; //not found
<<<<<<< HEAD
=======
	public BoardPanel createPanel(GameContext ctx) throws URISyntaxException, IOException {
		return new BoardPanel(ctx, txBoard, txP1, txP2, txRev);
>>>>>>> Created UiGame to establish a link between the core and the UI parts
=======
>>>>>>> Rebased my work
	}
	
}
