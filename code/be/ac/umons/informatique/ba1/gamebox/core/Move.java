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

	public final void play() {
		internalPlay();
		game.history.push(this);
	}
	
	public final void undo() {
		internalUndo();
		if (game.history.peek() != this)
			throw new RuntimeException("Trying to undo something else than the last move !");
	}
	
	protected abstract void internalPlay();
	protected abstract void internalUndo();
	public abstract String toString();


}
