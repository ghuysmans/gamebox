package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Traditional Othello game (variant of Reversi).
 * First player is black, just in case you don't remember ;)
 */

public class Othello extends Game {

	private static final long serialVersionUID = 3817939786028484436L;

	public Othello() {
		this(8, 8);
	}
	
	public Othello(int width, int height) {
		super(width, height);
		if (width != height)
			throw new IllegalArgumentException(MessageUtil.getMessage("BOARD_SQUARE", getClass()));
		//dimensions are the same... let's check the parity of one of them!
		else if ((width & 1) == 1)
			throw new IllegalArgumentException(MessageUtil.getMessage("BOARD_EVEN", getClass()));
	}
	
	@Override
	public void setup() {
		int hh=board.getHeight()/2, hw=board.getWidth()/2;
		board.setPiece(new Piece(players[0]), hw, hh-1); //black
		board.setPiece(new Piece(players[0]), hw-1, hh); //black2
		board.setPiece(new Piece(players[1]), hw-1, hh-1); //white
		board.setPiece(new Piece(players[1]), hw, hh); //white2
		notifyEvent("chg");
	}
	
	@Override
	public void nextPlayer() {
		super.nextPlayer();
		if (getLegalMoves().size() == 0)
			super.nextPlayer();
	}
	
	protected int getScore_internal(Player p) {
		int count = 0;
		for (int y=0; y<board.getHeight(); y++) {
			for (int x=0; x<board.getWidth(); x++) {
				Piece v = board.getPiece(x, y);
				if (v!=null && v.getOwner()==p)
					count++;
			}
		}
		return count;
	}
	
	@Override
	public int getScore(Player p) {
		int count = getScore_internal(players[0]);
		int count2 = getScore_internal(players[1]);
		int ct = 0;
		if (hasFinished() && ((p==players[0] && count>=count2) || (p==players[1] && count<=count2))) {
			for (int y=0; y<board.getHeight(); y++) {
				for (int x=0; x<board.getWidth(); x++) {
					Piece v = board.getPiece(x, y);
					if (v == null)
						ct++;
				}
			}
		}
		if (p==players[0])
			return count+ct;
		else
			return count2+ct;
	}
	
	@Override
	public int getResult(Player p) {
		int count = getScore_internal(players[0]);
		int count2 = getScore_internal(players[1]);
		if (count == count2)
			return RESULT_DRAW;
		else if (count < count2)
			return (p==players[0] ? RESULT_LOST : RESULT_WON);
		else
			return (p==players[0] ? RESULT_WON : RESULT_LOST);
	}
	
	//The other method mustn't be overloaded (it calls this one)
	@Override
	public Move createMove(int x, int y) {
		return new OthelloMove(this, x, y);
	}

	@Override
	protected ArrayList<Move> computeLegalMoves() {
		ArrayList<Move> al = new ArrayList<Move>();
		for (int y=0; y<board.getHeight(); y++) {
			for (int x=0; x<board.getWidth(); x++) {
				if (board.getPiece(x, y) == null) {
					boolean[] dirs = getEnemyNeighbors(x, y);
					//getEnemyNeighbors's result is always the same size
					for (int i=0; i<8; i++) {
						if (dirs[i]) {
							if (detectOther(x, y, Board.vectors[i][0], Board.vectors[i][1])) {
								OthelloMove tmp = new OthelloMove(this, x, y);
								//avoid duplicates!
								if (!al.contains(tmp))
									al.add(tmp);
							}
						}
					}
				}
			}
		}
		return al;
	}
	
	/**
	 * Checks whether another piece exists in the given direction
	 * @param x Start X coordinate
	 * @param y Start Y coordinate
	 * @param stepX X step (increment)
	 * @param stepY Y step (increment)
	 * @return true if another piece exists
	 */
	public boolean detectOther(int x, int y, int stepX, int stepY) {
		x += stepX; y += stepY;
		while (x>=0 && x<board.getWidth() && y>=0 && y<board.getHeight()) {
			if (board.getPiece(x, y) == null)
				return false;
			else if (board.getPiece(x, y).owner == currentPlayer)
				return true;
			x += stepX; y += stepY;
		}
		return false;
	}

	/**
	 * Computes a list of enemy neighbors (true means there's one)
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @see Board#vectors
	 * @return A simple boolean array
	 */
	protected boolean[] getEnemyNeighbors(int x, int y) {
		boolean ret[] = new boolean[8];
		for (int i=0; i<8; i++) {
			int[] pos = Board.vectors[i].clone();
			pos[0] += x; pos[1] += y;
			Piece pc = (board.isValid(pos) ? board.getPiece(pos[0], pos[1]) : null);
			ret[i] = (pc!=null && pc.owner!=currentPlayer);
		}
		return ret;
	}

	@Override
	public boolean hasFinished() {
		int scoreP1 = getScore_internal(this.players[0]);
		int scoreP2 = getScore_internal(this.players[1]);
		if (scoreP1==0 || scoreP2==0 || board.isFull() )
			return true;
		else {
			//Has the current player any legal move?
			if (getLegalMoves().isEmpty()) {
				//No. Same question for the next one...
				//We need to restore currentPlayer afterwards!
				nextPlayer();
				if (getLegalMoves().isEmpty()) {
					nextPlayer();
					return true;
				}
				else {
					nextPlayer();
					return false;
				}
			}
			else
				//Yes? The game hasn't finished!
				return false;
		}
	}
	
	/**
	 * Each piece in the borders is worth 1 point
	 */
	@Override
	public int getPositionalBonus(Player p) {
		Piece pc;
		int ct=0, l=board.getHeight()-1;
		for (int i=0; i<board.getHeight(); i++) {
			//up
			pc = board.getPiece(i, 0);
			if (pc!=null && pc.owner==p) ct++;
			//down
			pc = board.getPiece(i, l);
			if (pc!=null && pc.owner==p) ct++;
			//other directions
			if (i!=0 && i!=l) {
				//right
				pc = board.getPiece(l, i);
				if (pc!=null && pc.owner==p) ct++;
				//left
				pc = board.getPiece(0, i);
				if (pc!=null && pc.owner==p) ct++;
			}
		}
		return ct;
	}
}