package be.ac.umons.informatique.ba1.gamebox.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mlq, ghs
 */

public class TicTacToeTest {

	/**
	 * simple test cases for hasFinished 
	 */
	@Test
	public void finishedSmoke() {
		Game g = new TicTacToe(3, 3, 3);
		Player p1 = new HumanPlayer("X", g);
		g.players.add(p1);
		Assert.assertFalse("Empty not finished", g.hasFinished());
		
		ArrayList<Move> mv = g.getLegalMoves(p1);
		for (int k=0; k<mv.size(); k++)
			mv.get(k).play();
		Assert.assertTrue("p1 finished", g.hasFinished());
		Assert.assertEquals("p1 won", g.getScore(p1), Game.SCORE_WON);
	}

}
