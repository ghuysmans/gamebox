package be.ac.umons.informatique.ba1.gamebox.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Provided that {@link Connect4#getResult(Player)} relies exactly on {@link TicTacToe#getResult(Player)},
 * there's no need to test it twice here! It's also true for {@link Connect4#hasFinished()}. 
 */
public class Connect4Test {

	Game g;
	Player p1, p2;
	
	@Before
	/**
	 * Mini Connect4 settings (3x2)
	 */
	public void init() {
		g = new Connect4(3, 3);
		p1 = new HumanPlayer("X");
		p2 = new HumanPlayer("Y");
		g.setPlayers(p1, p2);
	}
	
	@Test
	public void legalSmoke() {
		Object mv[] = g.getLegalMoves().toArray();
		Object exp[] = {new PutMove(g, 0, 2), new PutMove(g, 1, 2), new PutMove(g, 2, 2)};
		Assert.assertArrayEquals("Moves match", exp, mv);
	}

	@Test
	public void posStr() {
		for (int x=0; x<g.board.getWidth(); x++) {
			for (int y=g.board.getHeight()-1; y>=0; y--) {
				String s = g.posToStr(x, y);
				int[] a = g.strToPos(s);
				if (y != g.board.getHeight()) {
					//not full (yet)
					Assert.assertArrayEquals("posStr consistency "+s, new int[]{x,y}, a);
					g.createMove(a[0], a[1]).play(true);
				}
				else {
					Assert.assertNull("posStr full", a);
				}
			}
		}
	}
	
}
