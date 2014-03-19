
package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mlq, ghs
 */
public class Connect4Test {

	@Test
	public void legalSmoke() {
		Game g = new Connect4(7, 6, 4);
		Player p1 = new HumanPlayer("X", g);
		
		ArrayList<Move> mv = g.getLegalMoves(p1);
		String[] strs = {"PutMove by X@0", "PutMove by X@1", 
						"PutMove by X@2","PutMove by X@3", 
						"PutMove by X@4", "PutMove by X@5",
						"PutMove by X@6"};
		for (int i=0; i<mv.size(); i++)
			Assert.assertTrue("Moves match", strs[i].equals(mv.get(i).toString()));
		Assert.assertEquals("Same length for legal moves", strs.length, mv.size());
	}


}
