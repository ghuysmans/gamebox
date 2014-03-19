package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Move consisting of a piece taken (replaced) by another one  
 */

class TakeMove extends Move {

	public final int x;
	public final int y;
	protected Player old_player;
	
	public TakeMove(Game g, Player p, boolean csq, int x, int y) {
		super(g, p, csq);
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
		return "TakeMove by "+player.name+"@"+game.getPosStr(x, y);
	}

	@Override
	protected void internalPlay() {
		Piece pc = game.board.getPiece(x, y);
		old_player = pc.getOwner();
		assert (player != old_player): "Can't play the same move twice";
		pc.setOwner(player);
		game.nextPlayer();
	}
	
	@Override
	protected void internalUndo() {
		Piece pc = game.board.getPiece(x, y);
		assert (pc.getOwner() != old_player): "Can't undo the same move twice";
		pc.setOwner(old_player);
		game.nextPlayer();
	}


}
