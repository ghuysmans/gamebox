package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic move  
 */

public abstract class Move {

	protected Player player;
	public final boolean conseq;
	
	public Move(Player p, boolean csq) {
		player = p;
		conseq = csq;
	}

	public abstract void undo();
	public abstract String toString();


}
