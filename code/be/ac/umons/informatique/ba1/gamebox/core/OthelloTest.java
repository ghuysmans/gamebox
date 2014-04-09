package be.ac.umons.informatique.ba1.gamebox.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OthelloTest extends GameTestAbstract {

	Othello g;
	Player p1, p2;

	@Before
	/**
	 * Classical Othello settings (4x4)
	 */
	public void init() {
		g = new Othello(4, 4);
		p1 = new HumanPlayer(g, "X");
		p2 = new HumanPlayer(g, "Y");
		g.setPlayers(p1, p2);
	}

	@Test
	public void legalSmoke() {
		Object mv [] = g.getLegalMoves().toArray();
		Object exp[] = {new OthelloMove(g, 0, 1), new OthelloMove(g, 1, 0), new OthelloMove(g, 2, 3), new OthelloMove(g, 3, 2)};
		Assert.assertArrayEquals("Moves match", exp, mv);
	}

	@Test
	public void scoreFull() {
		fillBoard(g, new Player[][]{new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}});
		Assert.assertEquals("p1 won", 16, g.getScore(p1));
		Assert.assertEquals("p2 lost", 0, g.getScore(p2));
	}
	
	@Test
	public void scoreEmpty() {
		fillBoard(g, new Player[][]{new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}, new Player[]{null, null, null, null}});
		Assert.assertTrue(g.hasFinished());
		Assert.assertEquals("score p1", 16, g.getScore(p1));
		Assert.assertEquals("score p2", 0, g.getScore(p2));
	
		fillBoard(g, new Player[][]{new Player[]{p1, p1, null, null}, new Player[]{p2, p1, p2, p2}, new Player[]{p1, p2, p2, p2}, new Player[]{p2, p2, p2, p2}});
		Assert.assertTrue(g.hasFinished());
		Assert.assertEquals("score p1", 4, g.getScore(p1));
		Assert.assertEquals("score p2", 12, g.getScore(p2));
	}
	
	@Test
	public void moveSmoke () {
		System.out.println(g.board);
		g.createMove(1, 0).play();
		System.out.println(g.board);
		Assert.assertEquals("Has flipped", p1, g.board.getPiece(1, 1).getOwner());
	}
	
}
