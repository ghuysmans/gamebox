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
		p1 = new HumanPlayer("X");
		p2 = new HumanPlayer("Y");
		g.setPlayers(p1, p2);
	}

	@Test
	public void legalSmoke() {
		Object mv [] = g.getLegalMoves().toArray();
		Object exp[] = {new OthelloMove(g, 1, 0), new OthelloMove(g, 0, 1), new OthelloMove(g, 3, 2), new OthelloMove(g, 2, 3)};
		Assert.assertArrayEquals("Moves match", exp, mv);
	}

	@Test
	public void scoreFull() {
		fillBoard(g, new Player[][]{new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}});
		Assert.assertEquals("P1 won", 16, g.getScore(p1));
		Assert.assertEquals("P2 lost", 0, g.getScore(p2));
	}
	
	@Test
	public void scoreEmpty() {
		fillBoard(g, new Player[][]{new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}, new Player[]{p1, p1, p1, p1}, new Player[]{null, null, null, null}});
		Assert.assertTrue(g.hasFinished());
		Assert.assertEquals("Score p1", 16, g.getScore(p1));
		Assert.assertEquals("Score p2", 0, g.getScore(p2));
	
		fillBoard(g, new Player[][]{new Player[]{p1, p1, null, null}, new Player[]{p2, p1, p2, p2}, new Player[]{p1, p2, p2, p2}, new Player[]{p2, p2, p2, p2}});
		Assert.assertTrue(g.hasFinished());
		Assert.assertEquals("Score p1", 4, g.getScore(p1));
		Assert.assertEquals("Score p2", 12, g.getScore(p2));
	}
	
	@Test
	public void doubleFlip () {
		fillBoard(g, new Player[][]{new Player[]{null, p1, p2, null}, new Player[]{null, p1, p2, null}, new Player[]{null, p1, p2, null}, new Player[]{null, null, null, null}});
		g.createMove(3, 2).play();
		Assert.assertEquals("Has flipped 1", p1, g.board.getPiece(2, 1).getOwner());
		Assert.assertEquals("Has flipped 2", p1, g.board.getPiece(2, 2).getOwner());
	}
	
	@Test
	public void moveSmoke () {
		g.createMove(1, 0).play();
		Assert.assertEquals("Has flipped", p1, g.board.getPiece(1, 1).getOwner());
	}
	
	@Test
	public void enemyNeighbors() {
		int[][] data = {{0,0,16}, {1,0,8}, {2,0,4}, {3,0,0}, {0,1,32}, {3,1,4}, 
						{0,2,64}, {3,2,2}, {0,3,0}, {1,3,64}, {2,3,128}, {3,3,1}};
		for (int i=0; i<data.length; i++) {
			int pack = 0;
			boolean[] res = g.getEnemyNeighbors(data[i][0], data[i][1]);
			for (int j=7, k=1; j>=0; j--, k<<=1)
				if (res[j]) pack += k;
			Assert.assertEquals("Enemy neighbours for "+g.posToStr(data[i][0], data[i][1]), data[i][2], pack);
		}
	}
	
}
