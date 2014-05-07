package be.ac.umons.informatique.ba1.gamebox.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Connect4Test {

	Game g;
	Player p1, p2;
	
	@Before
	/**
	 * Mini Connect4 settings (3x2)
	 */
	public void init() {
		g = new Connect4(3, 2);
		p1 = new HumanPlayer("X");
		p2 = new HumanPlayer("Y");
		g.setPlayers(p1, p2);
	}
	
	@Test
	public void legalSmoke() {
		Object mv[] = g.getLegalMoves().toArray();
		Object exp[] = {new PutMove(g, 0, 1), new PutMove(g, 1, 1), new PutMove(g, 2, 1)};
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
	
	@Test
	public void posBonusOdd() {
		g.createMove(1, 0).play(false); //p1
		g.createMove(2, 0).play(false); //p2
		Assert.assertEquals("Positional bonus odd p1", 1, g.getPositionalBonus(p1));
		Assert.assertEquals("Positional bonus odd p2", 0, g.getPositionalBonus(p2));
		g.createMove(2, 1).play(false); //p1
		g.createMove(1, 1).play(false); //p2
		Assert.assertEquals("Positional bonus odd p1", 1, g.getPositionalBonus(p1));
		Assert.assertEquals("Positional bonus odd p2", 1, g.getPositionalBonus(p2));
	}
	
	@Test
	public void posBonusEven() {
		g = new Connect4(4, 2);
		g.setPlayers(p1, p2);
		g.createMove(1, 0).play(false); //p1
		g.createMove(2, 0).play(false); //p2
		Assert.assertEquals("Positional bonus even p1", 1, g.getPositionalBonus(p1));
		Assert.assertEquals("Positional bonus even p2", 1, g.getPositionalBonus(p2));
		g.createMove(0, 0).play(false); //p1
		g.createMove(1, 1).play(false); //p2
		Assert.assertEquals("Positional bonus even p1", 1, g.getPositionalBonus(p1));
		Assert.assertEquals("Positional bonus even p2", 2, g.getPositionalBonus(p2));
	}

}
