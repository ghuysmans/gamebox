package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Move consisting of a piece taken (replaced) by another one  
 */

class TakeMove extends Move {

	public final int x;
	public final int y;
	protected Player old_player;

	public String toString() {
		return "TakeMove by "+player.name+"@"+game.getPosStr(x, y);
	}

	public TakeMove(Game g, Player p, boolean csq, int x, int y) {
		super(g, p, csq);
		this.x = x;
		this.y = y;
	}

	public void play() {
		Piece pc = game.board.getPiece(x, y);
		old_player = pc.getOwner();
		assert (player != old_player): "Can't play the same move twice";
		pc.setOwner(player);
	}
	
	public void undo() {
		Piece pc = game.board.getPiece(x, y);
		assert (pc.getOwner() != old_player): "Can't undo the same move twice";
		pc.setOwner(old_player);
	}


}
