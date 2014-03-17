package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Rectangle which contains all pieces
 */

class Board {

	protected Piece[][] arr;

	public Board(int width, int height) {
		arr = new Piece[height][width];
	}

	public int getWidth() {
		return arr[0].length;
	}

	public int getHeight() {
		return arr.length;
	}
	
	/**
	 * Gets the piece using its (X,Y) coordinates.
	 * @param x X coordinate (0 = left)
	 * @param y Y coordinate (0 = top)
	 * @return Piece object
	 */
	public Piece getPiece(int x, int y) {
		return arr[y][x];
	}
	
	/**
	 * Stores a piece on the board.
	 * @param pc Piece to be stored
	 * @param x X coordinate (0 = left)
	 * @param y Y coordinate (0 = top)
	 */
	public void setPiece(Piece pc, int x, int y) {
		arr[y][x] = pc;
	}
	
	/**
	 * Returns a string representation of the board (for debugging purposes)
	 */
	public String toString() {
		String res = "";
		for (int y=0; y<arr.length; y++) {
			for (int x=0; x<arr[0].length; x++)
			{
				if (arr[y][x] == null)
					res += "null\t";
				else
					res += Integer.toHexString(arr[y][x].owner.hashCode())+"\t";
			}
			res += "\n";
		}
		return res;
	}


}
