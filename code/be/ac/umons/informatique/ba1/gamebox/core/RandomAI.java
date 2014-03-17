package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Always plays a random move among possible moves
 */

public class RandomAI extends AI {

	public RandomAI() {
		super("Random AI");
	}

	@Override
	public int computeNode(Player p) {
		throw new UnsupportedOperationException(); //FIXME
	}

	@Override
	public Move getBest() {
		throw new UnsupportedOperationException(); //FIXME
	}


}
