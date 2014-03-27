package be.ac.umons.informatique.ba1.gamebox.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest extends GameTestAbstract {
	
	Game g;
	Player p1, p2;
	
	@Before
	/**
	 * Classical tic-tac-toe settings (3x3, 3 aligned pieces)
	 */
	public void init() {
		g = new TicTacToe(3, 3, 3);
		p1 = new HumanPlayer(g, "X");
		p2 = new HumanPlayer(g, "Y");
		g.setPlayers(p1, p2);
	}

	@Test
	public void finishedSmoke() {
		Assert.assertFalse("Empty not finished", g.hasFinished());
	}
	
	@Test
	public void scoreRows() {
		fillBoard(g, new Player[][]{new Player[]{p1, p1, p1}, new Player[]{null, null, null}, new Player[]{null, null, null}});
		Assert.assertEquals("First row won by 1", Game.SCORE_WON, g.getScore(p1));
		Assert.assertEquals("First row lost by 2", Game.SCORE_LOST, g.getScore(p2));
		
		fillBoard(g, new Player[][]{new Player[]{p2, p2, null}, new Player[]{p1, p1, p1}, new Player[]{null, p2, p2}});
		Assert.assertEquals("Second row won by 1", Game.SCORE_WON, g.getScore(p1));
		Assert.assertEquals("Second row lost by 2", Game.SCORE_LOST, g.getScore(p2));
		
		fillBoard(g, new Player[][]{new Player[]{null, null, null}, new Player[]{null, null, null}, new Player[]{p1, p1, p1}});
		Assert.assertEquals("Third row won by 1", Game.SCORE_WON, g.getScore(p1));
		Assert.assertEquals("Third row lost by 2", Game.SCORE_LOST, g.getScore(p2));
	}
	
	@Test
	public void scoreColumns() {
		fillBoard(g, new Player[][]{new Player[]{p1, null, null}, new Player[]{p1, null, null}, new Player[]{p1, null, null}});
		Assert.assertEquals("First column won by 1", Game.SCORE_WON, g.getScore(p1));
		Assert.assertEquals("First column lost by 2", Game.SCORE_LOST, g.getScore(p2));
		
		fillBoard(g, new Player[][]{new Player[]{p1, p1, null}, new Player[]{p1, p1, null}, new Player[]{p2, p1, null}});
		Assert.assertEquals("Second column won by 1", Game.SCORE_WON, g.getScore(p1));
		Assert.assertEquals("Second column lost by 2", Game.SCORE_LOST, g.getScore(p2));
		
		fillBoard(g, new Player[][]{new Player[]{p1, p1, p2}, new Player[]{p2, p1, p2}, new Player[]{p1, p2, p2}});
		Assert.assertEquals("Third column won by 2", Game.SCORE_WON, g.getScore(p2));
		Assert.assertEquals("Third column lost by 1", Game.SCORE_LOST, g.getScore(p1));
	}
	
	/**
	 * Quite comprehensive test case for getScore() with diagonals...
	 */
	@Test
	public void scoreDiagonals() {
		fillBoard(g, new Player[][]{new Player[]{p1, null, null}, new Player[]{null, p1, null}, new Player[]{null, null, p1}});
		Assert.assertEquals("Down diagonal won by 1", Game.SCORE_WON, g.getScore(p1));
		Assert.assertEquals("Down diagonal lost by 2", Game.SCORE_LOST, g.getScore(p2));
		
		fillBoard(g, new Player[][]{new Player[]{p1, null, null}, new Player[]{null, p1, null}, new Player[]{null, null, p2}});
		Assert.assertEquals("Failed down diagonal by 1", Game.SCORE_DRAW, g.getScore(p1));
		Assert.assertEquals("Denied down diagonal by 2", Game.SCORE_DRAW, g.getScore(p2));
		
		fillBoard(g, new Player[][]{new Player[]{null, null, p1}, new Player[]{null, p2, null}, new Player[]{p1, null, p1}});
		Assert.assertEquals("Failed up diagonal by 1", Game.SCORE_DRAW, g.getScore(p1));
		Assert.assertEquals("Denied up diagonal by 2", Game.SCORE_DRAW, g.getScore(p2));
		
		fillBoard(g, new Player[][]{new Player[]{null, null, null}, new Player[]{null, p1, null}, new Player[]{null, null, p1}});
		Assert.assertEquals("Incomplete down diagonal by 1", Game.SCORE_DRAW, g.getScore(p1));
		Assert.assertEquals("Dangerous down diagonal for 2", Game.SCORE_DRAW, g.getScore(p2));
		
		fillBoard(g, new Player[][]{new Player[]{null, null, p1}, new Player[]{null, p1, null}, new Player[]{p1, null, p1}});
		Assert.assertEquals("Up diagonal won by 1", Game.SCORE_WON, g.getScore(p1));
		Assert.assertEquals("Up diagonal lost by 2", Game.SCORE_LOST, g.getScore(p2));

		fillBoard(g, new Player[][]{new Player[]{p1, p1, p2}, new Player[]{p1, p2, p2}, new Player[]{null, null, p1}});
		Assert.assertEquals("Dangerous column for 1", Game.SCORE_DRAW, g.getScore(p1));
		Assert.assertEquals("Dangerous diagonal for 2", Game.SCORE_DRAW, g.getScore(p2));
	}
	
	@Test
	public void posStr() {
		for (int x=0; x<g.board.getWidth(); x++) {
			for (int y=0; y<g.board.getHeight(); y++) {
				String s = g.posToStr(x, y);
				int[] a = g.strToPos(s);
				Assert.assertArrayEquals("posStr consistency "+s, new int[]{x,y}, a);
			}
		}
	}
}
