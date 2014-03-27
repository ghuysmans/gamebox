package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic player 
 */

public abstract class Player {

	public final String name;
	protected Game game;
	
	public Player(String n, Game g) {
		name = n;
		setGame(g);
	}
	
	public void setGame(Game g) {
		game = g;
	}

}
