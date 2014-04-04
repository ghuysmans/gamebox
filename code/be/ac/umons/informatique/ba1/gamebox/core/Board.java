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
		if (width == 0 || height == 0)
			throw new IllegalArgumentException("Both dimensions must be non-zero!");
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
	 * Determines whether the board is full
	 * @return true if the board is full.
	 */
	public boolean isFull() {
		for (int y=0; y<arr.length; y++)
			for (int x=0; x<arr[0].length; x++)
				if (arr[y][x] == null) return false;
		return true;
	}
	
	/**
	 * Computes a vector corresponding to a direction
	 * @param dir North=0... clockwise.
	 * @return An integer vector
	 */
	protected int[] getVector(int dir) {
		switch (dir) {
			case 0: //NORTH
				return new int[]{0, -1};
			case 1: //NORTH-EAST
				return new int[]{1, -1};
			case 2: //EAST
				return new int[]{1, 0};
			case 3: //SOUTH-EAST
				return new int[]{1, 1};
			case 4: //SOUTH
				return new int[]{0, 1};
			case 5: //SOUTH-WEST
				return new int[]{-1, 1};
			case 6: //WEST
				return new int[]{-1, 0};
			case 7: //NORTH-WEST
				return new int[]{-1, -1};
			default:
				return null;
		}
	}
	
	/**
	 * Returns a string representation of the board (for debugging purposes)
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int y=0; y<arr.length; y++) {
			sb.append(y);
			sb.append("| ");
			for (int x=0; x<arr[0].length; x++)
			{
				if (arr[y][x] == null)
					sb.append("+");
				else
					sb.append(arr[y][x].owner.name);
				sb.append(" ");
			}
			sb.append("\n");
		}
		sb.append(" | ");
		for (int x=0; x<arr[0].length; x++) {
			//sb.append(Character.toString((char)(x+'a')));
			sb.append(Character.toString((char)('a'+x)));
			sb.append(" ");
		}
		sb.append("\n");
		return sb.toString();
	}

	/**
	 * Checks coordinates against bounds
	 * @param pos (X,Y) coordinates
	 * @return true means they're valid
	 */
	public boolean isValid(int[] pos) {
		return (pos[0]>=0 && pos[0]<arr[0].length && pos[1]>=0 && pos[1]<arr.length);
	}


}
