package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Rectangle which contains all pieces. It state shouldn't be manipulated without 
 * using the Move class (and its derived classes) to avoid game corruption.
 */

class Board {

	protected Piece[][] arr;

	/**
	 * Creates a new rectangular board.
	 * @param width Width (x)
	 * @param height Height (y)
	 */
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
	 * @return The requested piece (null = empty)
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
	 * Determines whether the board is empty (full of null)
	 * @return true if the board is empty.
	 */
	public boolean isEmpty() {
		for (int y=0; y<arr.length; y++)
			for (int x=0; x<arr[0].length; x++)
				if (arr[y][x] != null) return false;
		return true;
	}
	
	/**
	 * Returns a string representation of the board (for debugging purposes)
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int y=0; y<arr.length; y++) {
			for (int x=0; x<arr[0].length; x++)
			{
				if (arr[y][x] == null)
					sb.append("+");
				else
					sb.append(arr[y][x].owner.name);
					//sb.append(Integer.toHexString(arr[y][x].owner.hashCode()));
				sb.append(" ");
			}
			sb.append("\n");
		}
		for (int x=0; x<arr[0].length; x++) {
			//sb.append(Character.toString((char)(x+'a')));
			sb.append(x);
			sb.append(" ");
		}
		sb.append("\n");
		return sb.toString();
	}


}
