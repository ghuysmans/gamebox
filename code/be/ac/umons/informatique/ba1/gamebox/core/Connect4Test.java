package be.ac.umons.informatique.ba1.gamebox.core;

import org.junit.Assert;
import org.junit.Test;

public class Connect4Test {

	@Test
	public void legalSmoke() {
		Game g = new Connect4(3, 2, 4); //a small one
		Player p = new HumanPlayer("X", g);
		g.setPlayers(p, null); //with only one player
		Object mv[] = g.getLegalMoves(p).toArray();
		Object exp[] = {new PutMove(g, 0, 1), new PutMove(g, 1, 1), new PutMove(g, 2, 1)};
		Assert.assertArrayEquals("Moves match", exp, mv);
	}

	@Test
	public void posStr() {
		Game g = new Connect4(3, 2, 4); //a small one
		Player p1 = new HumanPlayer("X", g);
		Player p2 = new HumanPlayer("Y", g);
		g.setPlayers(p1, p2);
		for (int x=0; x<g.board.getWidth(); x++) {
			for (int y=g.board.getHeight()-1; y>=0; y--) {
				String s = g.posToStr(x, y);
				int[] a = g.strToPos(s);
				if (y != g.board.getHeight()) {
					//not full (yet)
					Assert.assertArrayEquals("posStr consistency "+s, new int[]{x,y}, a);
					g.createMove(a[0], a[1]).play();
				}
				else {
					Assert.assertNull("posStr full", a);
				}
			}
		}
	}

}
