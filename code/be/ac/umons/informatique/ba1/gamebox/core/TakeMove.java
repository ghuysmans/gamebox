package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Move consisting of a piece taken (replaced) by another one
 * currentPlayer isn't altered by this kind of move.
 */

class TakeMove extends Move {

	private static final long serialVersionUID = 5249874706758381550L;
	public final int x;
	public final int y;
	protected Player old_player;
	
	public TakeMove(Game g, boolean csq, int x, int y) {
		super(g, csq);
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
		return "TakeMove by "+player.name+"@"+game.posToStr(x, y);
	}

	@Override
	protected void internalPlay() {
		Piece pc = game.board.getPiece(x, y);
		old_player = pc.getOwner();
		assert (player != old_player): "Can't play the same move twice";
		game.board.getPiece(x, y).owner = player;
	}
	
	@Override
	protected void internalUndo() {
		Piece pc = game.board.getPiece(x, y);
		assert (pc.getOwner() != old_player): "Can't undo the same move twice";
		pc.setOwner(old_player);
		game.nextPlayer();
	}


}
