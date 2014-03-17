package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Absent AI (always plays the first possible move)
 */

public class AbsentAI extends AI {
	
	public AbsentAI() {
		super("Absent AI (always plays the first possible move)");
	}
	
	@Override
	public int computeNode(Player p) {
		throw new UnsupportedOperationException(); //FIXME
	}
	
	@Override
	public Move getBest(Player p) {
		throw new UnsupportedOperationException(); //FIXME
	}


}
