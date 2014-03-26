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


}
