package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Traditional Othello game
 */

public class Othello extends Game {

	public Othello(int width, int height) {
		super(width, height);
		if (width != height)
			throw new IllegalArgumentException("The board must be a square!");
		else if (width%2 !=0 || height%2 != 0 )
			throw new IllegalArgumentException("Dimensions must be even!");
	}

	@Override
	public int getScore(Player p) {
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
	public ArrayList<Move> getLegalMoves() {
		ArrayList<Move> al = new ArrayList<Move>();
		for (int y=0; y<board.getHeight(); y++) {
			for (int x=0; x<=board.getWidth(); x++) {
				if (board.getPiece(x, y) == null) {
					boolean[] dirs = getEnemyNeighbors(x, y);
					for (int i=0; i<dirs.length; i++) {
						if (dirs[i]) {
							int[] v = board.getVector(i);
							if (detectOther(x, y, v[0], v[1]))
								al.add(new PutMove(this, x, y));
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
	private boolean detectOther(int x, int y, int stepX, int stepY) {
		while (x>0 && x<board.getHeight()-1 && y>0 && y<board.getHeight()-1) {
			x += stepX;
			y += stepY;
			if (board.getPiece(x, y) == null)
				return false;
			else if (board.getPiece(x, y).owner == currentPlayer)
				return true;
		}
		return false;
	}

	/**
	 * Computes a list of enemy neighbors (true means there's one)
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @see Board#getVector(int)
	 * @return A simple boolean array
	 */
	protected boolean[] getEnemyNeighbors(int x, int y) {
		//Bounds check
		boolean north, south, east, west;
		north = (y > 0);
		south = (y < board.getHeight()-1);
		east = (x < board.getWidth()-1);
		west = (x > 0);
		//Real work (faster than calling getVector and checking bounds...)
		boolean ret[] = new boolean[8];
		ret[0] = (north && board.getPiece(x, y-1).owner!=currentPlayer && board.getPiece(x, y-1).owner!=null);
		ret[1] = (north && east && board.getPiece(x+1, y-1).owner!=currentPlayer && board.getPiece(x+1, y-1).owner!=null);
		ret[2] = (east && board.getPiece(x+1, y).owner!=currentPlayer && board.getPiece(x+1, y).owner!=null);
		ret[3] = (south && east && board.getPiece(x+1, y+1).owner!=currentPlayer && board.getPiece(x+1, y+1).owner!=null);
		ret[4] = (south && board.getPiece(x, y+1).owner!=currentPlayer && board.getPiece(x, y+1).owner!=null);	
		ret[5] = (south && west && board.getPiece(x-1, y+1).owner!=currentPlayer && board.getPiece(x-1, y+1).owner!=null);
		ret[6] = (west && board.getPiece(x-1, y).owner!=currentPlayer && board.getPiece(x-1, y).owner!=null);
		ret[7] = (north && west && board.getPiece(x-1, y-1).owner!=currentPlayer && board.getPiece(x-1, y-1).owner!=null);
		//Done!
		return ret;
	}

	@Override
	public boolean hasFinished() {
		int scoreP1 = getScore(this.players[0]);
		int scoreP2 = getScore(this.players[1]);
		if (scoreP1==0 || scoreP2==0 || board.isFull() )
			return true;
		else
			return false;
	}
}