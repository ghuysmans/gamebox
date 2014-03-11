package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Move consisting of a piece directly placed on the board
 */

class PutMove extends Move {

	public final int x;
	public final int y;

	public void undo() {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public PutMove(Player p, int x, int y) {
		super(p, false);
		this.x = x;
		this.y = y;
	}


}
