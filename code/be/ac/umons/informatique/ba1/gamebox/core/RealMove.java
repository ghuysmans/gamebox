package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Move consisting of a piece moving from a position to another
 */

class RealMove extends Move {

	public final int x1;
	public final int y1;
	public final int x2;
	public final int y2;
	
	public RealMove(Game g, int x1, int y1, int x2, int y2) {
		super(g, false);
		this.x1 = x1; this.x2 = x2;
		this.y1 = y1; this.y2 = y2;
	}
	
	@Override
	public boolean equals(Object obj) {
		RealMove other = (RealMove)obj;
		return super.equals(obj) && (other.x1==x1) && (other.y1==y1) && (other.x2==x2) && (other.y2==y2);
	}

	@Override
	public String toString() {
		return "RealMove by "+player.name+" from "+game.getPosStr(x1, y1)+" to "+game.getPosStr(x2, y2);
	}

	@Override
	protected void internalPlay() {
		//TODO
		game.nextPlayer();
		throw new UnsupportedOperationException();
	}
	
	@Override
	protected void internalUndo() {
		//TODO
		game.nextPlayer();
		throw new UnsupportedOperationException();
	}


}
