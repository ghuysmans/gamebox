package be.ac.umons.informatique.ba1.gamebox.core;

/**
 * Special PutMove for Othello (with TakeMove consequences)
 */

public class OthelloMove extends PutMove {

	public OthelloMove(Othello g, int x, int y) {
		super(g, x, y);
	}
	
	@Override
	protected void internalPlay() {
		super.internalPlay();
		game.nextPlayer(); //still the same player!
		//Play TakeMove consequences
		for (int i=0; i<7; i++) {
			int[] vect = Board.vectors[i];
			if (((Othello)game).detectOther(x, y, vect[0], vect[1])) {
				int pX=x+vect[0], pY=y+vect[1];
				//no need to check for null!
				while (game.board.getPiece(pX, pY).owner != game.currentPlayer) {
					Move csq = new TakeMove(game, true, pX, pY);
					csq.play();
					pX += vect[0]; pY += vect[1];
				}
			}
		}
		//We can now select the other player
		game.nextPlayer();
	}
	
	@Override
	public String toString() {
		return "OthelloMove by "+player.name+"@"+game.posToStr(x, y);
	}

}
