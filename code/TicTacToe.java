/* 
   
 */

import java.util.ArrayList;

class TicTacToe extends Game {
    
    protected final int required;

    public TicTacToe(int width, int height, int req) {
        super(width, height);
        required = req;
    }

    public int getScore() {
        throw new UnsupportedOperationException();
    }

    public ArrayList<Move> getLegalMoves() {
        throw new UnsupportedOperationException();
    }


}
