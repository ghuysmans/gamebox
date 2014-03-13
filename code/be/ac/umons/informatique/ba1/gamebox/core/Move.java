package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic move  
 */

public abstract class Move {

	protected Game game;
	protected Player player;
	public final boolean conseq;
	
	public Move(Game g, Player p, boolean csq) {
		game = g;
		player = p;
		conseq = csq;
	}

	public abstract void play();
	public abstract void undo();
	public abstract String toString();


}
