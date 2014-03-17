package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Move consisting of a piece moving from a position to another
 */

class RealMove extends Move {

	public final int x1;
	public final int y1;
	public final int x2;
	public final int y2;
	
	public RealMove(Game g, Player p, int x1, int y1, int x2, int y2) {
		super(g, p, false);
		this.x1 = x1; this.x2 = x2;
		this.y1 = y1; this.y2 = y2;
	}

	@Override
	public String toString() {
		return "RealMove by "+player.name+" from "+game.getPosStr(x1, y1)+" to "+game.getPosStr(x2, y2);
	}

	@Override
	public void play() {
		//TODO
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void undo() {
		//TODO
		throw new UnsupportedOperationException();
	}


}
