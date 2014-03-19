package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Move consisting of a piece directly placed on the board
 */

class PutMove extends Move {

	public final int x;
	public final int y;
	
	public PutMove(Game g, Player p, int x, int y) {
		super(g, p, false);
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		PutMove other = (PutMove)obj;
		return super.equals(obj) && (other.x==x) && (other.y==y);
	}

	@Override
	public String toString() {
		return "PutMove by "+player.name+"@"+game.getPosStr(x, y);
	}

	@Override
	protected void internalPlay() {
		assert (game.board.getPiece(x, y) != null): "Can't replace a piece with PutMove";
		game.board.setPiece(new Piece(player), x, y);
		game.nextPlayer();
	}

	@Override
	protected void internalUndo() {
		assert (game.board.getPiece(x, y) != null): "Can't undo a PutMove on an empty cell";
		game.board.setPiece(null, x, y);
		game.nextPlayer();
	}

}
