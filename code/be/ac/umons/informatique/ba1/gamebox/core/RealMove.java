package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Move consisting of a piece moving from a position to another
 */

class RealMove extends Move {

	public final int x1;
	public final int y1;
	public final int x2;
	public final int y2;

	public void undo() {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public RealMove(Player p, int x1, int y1, int x2, int y2) {
		super(p, false);
		this.x1 = x1; this.x2 = x2;
		this.y1 = y1; this.y2 = y2;
	}


}
