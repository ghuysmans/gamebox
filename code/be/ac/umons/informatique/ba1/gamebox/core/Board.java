package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;

/** 
 * Rectangle which contains all pieces. Its state shouldn't be manipulated without 
 * using the Move class (and its derived classes) to avoid game corruption.
 */

public class Board implements Serializable {

	private static final long serialVersionUID = -7488430075749452263L;

	/**
	 * Minimum board width (for all Games)
	 */
	public static final int MINIMUM_WIDTH = 3;
	
	/**
	 * Minimum board height (for all Games)
	 */
	public static final int MINIMUM_HEIGHT = 3;

	/**
	 * Internal array holding pieces, accessed using dedicated methods.
	 * @see Board#getPiece(int, int)
	 * @see Board#setPiece(Piece, int, int)
	 */
	protected Piece[][] arr;
	
	/**
	 * Direction vectors, starting from the North, clockwise.
	 */
	public static final int[][] vectors = {{0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}};

	
	/**
	 * Creates a new rectangular board.
	 * @param width Width (x)
	 * @param height Height (y)
	 */
	public Board(int width, int height) {
		if (!isValidSize(width, height))
			throw new IllegalArgumentException(MessageUtil.getMessage("MINIMUM_SIZE", getClass(), MINIMUM_WIDTH, MINIMUM_HEIGHT));
		arr = new Piece[height][width];
		
	}

	/**
	 * Gets the board's width
	 * @return Width
	 */
	public int getWidth() {
		return arr[0].length;
	}

	/**
	 * Gets the board's height
	 * @return Height
	 */
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
	
	/**
	 * Validates a board size
	 * @param w Width
	 * @param h Height
	 * @return	true means it's valid
	 */
	public static boolean isValidSize(int w, int h) {
		return (w>=MINIMUM_WIDTH) && (h>=MINIMUM_HEIGHT);
	}
	
}
