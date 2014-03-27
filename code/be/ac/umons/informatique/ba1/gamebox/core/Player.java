package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic player 
 */

public abstract class Player {

	public final String name;
	protected Game game;
	
	public Player(String n, Game g) {
		name = n;
		//we can't call setGame() here because of ComputerPlayer:
		//if we do, a NPE will be thrown (the overloaded setGame calls ai.setGame)
		game = g;
	}
	
	public void setGame(Game g) {
		game = g;
	}
	
	public Game getGame() {
		return game;
	}

}
