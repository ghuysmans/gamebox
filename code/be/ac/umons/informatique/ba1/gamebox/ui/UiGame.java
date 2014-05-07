package be.ac.umons.informatique.ba1.gamebox.ui;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import be.ac.umons.informatique.ba1.gamebox.core.Game;

/**
 * Link between the UI and the core Game classes.
 * Stores information about:
 * - a game and how to construct one (used in menus)
 * - textures used by the associated BoardPanel
 */

public class UiGame {
	
	public final String desc;
	
	protected final Class<? extends Game> cls;
	protected final String txBoard;
	protected final String txP1;
	protected final String txP2;
	protected final boolean txRev;
	
	/**
	 * Creates a descriptor
	 * @param d User-readable Description
	 * @param c Class to be instantiated
	 * @param tb Board texture
	 * @param t1 Texture for player 1's pieces
	 * @param t2 Texture for player 2's pieces
	 * @param tr Reversed layers?
	 */
	public UiGame(String d, Class<? extends Game> c, String tb, String t1, String t2, boolean tr) {
		desc = d;
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
	
	/**
	 * Creates a panel object associated to the given context.
	 * @param  ug  List of possible UiGame
	 * @param  ctx Game context
	 * @param  d   Debug mode
	 * @return A Panel to be used in {@link Main}
	 * @throws URISyntaxException Invalid texture path
	 * @throws IOException        Can't read a texture
	 */
	public static BoardPanel createPanel(ArrayList<UiGame> ug, GameContext ctx, boolean d) throws URISyntaxException, IOException {
		for (UiGame g: ug)
			if (g.cls == ctx.game.getClass())
				return new BoardPanel(ctx, g.txBoard, g.txP1, g.txP2, g.txRev, d);
		return null; //not found
	}
	
}
