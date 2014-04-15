package be.ac.umons.informatique.ba1.gamebox.core;

public abstract class GameTestAbstract {

	/**
	 * Fills g's board with pieces at given positions.
	 * They will all belong to currentPlayer (use nextPlayer() if needed).
	 * Absolutely no checks are done on positions: an exception will be thrown 
	 * by board.setPiece() if one of them is invalid. 
	 * @param g Game object instance
	 * @param posX X coordinates
	 * @param posY Y coordinates
	 */
	protected void fillBoard(Game g, int posX[], int posY[]) {
		assert(posX.length == posY.length): "Incomplete coordinate(s)!";
		Player p = g.getCurrentPlayer();
		for (int i=0; i<posX.length; i++)
			g.board.setPiece(new Piece(p), posX[i], posY[i]);
	}
	
	/**
	 * Fills g's board with pieces corresponding to v[][].
	 * Absolutely no checks are done on positions: an exception will be thrown 
	 * by board.setPiece() if one of them is invalid. 
	 * @param g Game object instance
	 * @param pl Array containing references to players (first dimension = row)
	 */
	protected void fillBoard(Game g, Player pl[][]) {
		for (int y=0; y<pl.length; y++)
			for (int x=0; x<pl[0].length; x++)
				if (pl[y][x] == null)
					g.board.setPiece(null, x, y);
				else
					g.board.setPiece(new Piece(pl[y][x]), x, y);
		g.setCurrentPlayer(g.getCurrentPlayer());
	}

}
