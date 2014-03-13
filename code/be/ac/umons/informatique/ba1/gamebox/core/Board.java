package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Contains all pieces  
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
	
	public Piece getPiece(int x, int y) {
		return arr[y][x];
	}
	
	public void setPiece(Piece pc, int x, int y) {
		arr[y][x] = pc;
	}
	
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
