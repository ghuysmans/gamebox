package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Assert;

public class RandomAITest {

	@Test
	public void randomSmoke() {
		Game g = new Connect4(7, 6, 4);
		Player p = new HumanPlayer("X");
		Player p2 = new HumanPlayer("Y");
		g.setPlayers(p, p2);
		AI ai = new RandomAI(g); 
		ArrayList<Move> mv = g.getLegalMoves();
		for (int k=0; k<10; k++){
			Move rand = ai.getBest();
			if (rand == null)
				Assert.assertEquals("There should be no legalMove", mv.size(), 0);
			else {
				boolean found = false;
				for (int i=0; i<mv.size(); i++) {
					if (mv.get(i).equals(rand)) {
						found = true;
						break;
					}
				}
				Assert.assertTrue("A legalMove should be returned", found);
			}
		}

	}
	
}