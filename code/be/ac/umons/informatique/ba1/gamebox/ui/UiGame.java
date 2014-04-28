package be.ac.umons.informatique.ba1.gamebox.ui;

import java.io.IOException;
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
	public final int defaultX, defaultY;
	
	protected final Class<? extends Game> cls;
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
	public UiGame(String d, Class<? extends Game> c, int x, int y, String tb, String t1, String t2, boolean tr) {
		desc = d;
		cls = c;
		defaultX = x;
		defaultY = y;
		txBoard = tb;
		txP1 = t1;
		txP2 = t2;
		txRev = tr;
	}
	
	public Game createGame() {
		//Class<?>[] argTypes = {};
		//return cls.newInstance(42);
		return null;
	}
	
	/**
	 * Creates a panel object associated to the given context.
	 * @param  ug  List of possible UiGame
	 * @param  ctx Game context
	 * @return A Panel to be used in {@link Main}
	 * @throws URISyntaxException Invalid texture path
	 * @throws IOException        Can't read a texture
	 */
	public static BoardPanel createPanel(ArrayList<UiGame> ug, GameContext ctx) throws URISyntaxException, IOException {
		for (UiGame g: ug)
			if (g.cls == ctx.game.getClass())
				return new BoardPanel(ctx, g.txBoard, g.txP1, g.txP2, g.txRev);
		return null; //not found
	}
	
}
