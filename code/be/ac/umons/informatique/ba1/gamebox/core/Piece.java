package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic piece which only contains an owner.
 * One more attribute (type) would be needed for checkers. 
 */

public class Piece {

	protected Player owner;

	public Piece(Player owner) {
		this.owner = owner;
	}
	
	public final Player getOwner() {
		return owner;
	}

	public final void setOwner(Player p) {
		owner = p;
	}


}
