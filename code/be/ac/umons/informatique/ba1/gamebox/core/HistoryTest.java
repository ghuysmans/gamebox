package be.ac.umons.informatique.ba1.gamebox.core;

import org.junit.Assert;
import org.junit.Test;

public class HistoryTest {

	@Test
	public void undoSmoke() {
		Game g = new TicTacToe(3, 3, 3);
		Player p1 = new HumanPlayer(g, "X");
		Player p2 = new HumanPlayer(g, "Y");
		g.setPlayers(p1, p2);
		g.createMove("a0").play();
		g.createMove("a1").play();
		g.history.undo();
		g.history.undo();
		Assert.assertTrue(g.board.isEmpty());
	}

}
