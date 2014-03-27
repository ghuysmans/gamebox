package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Traditional Othello game
 */

public class Othello extends Game {

	public Othello(int width, int height) {
		//FIXME parity check!
		super(width, height);
	}

	@Override
	public int getScore(Player p) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ArrayList<Move> getLegalMoves(Player p) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasFinished() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Move createMove(String desc) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Move createMove(int x, int y) {
		throw new UnsupportedOperationException();
	}

}
