package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;

/** 
 * Generic piece which only contains a reference to its owner.
 */

public class Piece implements Serializable {

	private static final long serialVersionUID = -6098480530792767275L;
	
	/**
	 * Owner player
	 */
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
