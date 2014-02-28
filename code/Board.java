/* 
   
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


}
