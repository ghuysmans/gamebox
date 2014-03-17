package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.ArrayList;

/** 
 * Traditional checker game  
 */

public class Checker extends Game {

	public Checker(int width, int height) {
		super(width, height);
	}

	public int getScore(Player p) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ArrayList<Move> getLegalMoves(Player p) {
		throw new UnsupportedOperationException();
	}
	
	public boolean hasFinished() {
		throw new UnsupportedOperationException();
	}
}
