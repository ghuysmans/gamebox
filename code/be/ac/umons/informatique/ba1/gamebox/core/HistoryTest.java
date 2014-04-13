package be.ac.umons.informatique.ba1.gamebox.core;

import org.junit.Assert;
import org.junit.Test;

public class HistoryTest extends GameTestAbstract {

	@Test
	public void undoOthello() {
		Game g = new Othello(4, 4);
		Player p1 = new HumanPlayer("X");
		Player p2 = new HumanPlayer("Y");
		g.setPlayers(p1, p2);
		fillBoard(g, new Player[][]{new Player[]{null, p1, p2, null}, new Player[]{null, p1, p2, null}, new Player[]{null, p1, p2, null}, new Player[]{null, null, null, null}});
		g.createMove(3, 2).play();
		g.history.undo();
		Assert.assertEquals("Hasn't flipped 1", p2, g.board.getPiece(2, 1).getOwner());
		Assert.assertEquals("Hasn't flipped 2", p2, g.board.getPiece(2, 2).getOwner());
	}

	@Test
	public void undoSmoke() {
		Game g = new TicTacToe(3, 3, 3);
		Player p1 = new HumanPlayer("X");
		Player p2 = new HumanPlayer("Y");
		g.setPlayers(p1, p2);
		g.createMove("a0").play();
		g.createMove("a1").play();
		g.history.undo();
		g.history.undo();
		Assert.assertTrue(g.board.isEmpty());
	}

}
