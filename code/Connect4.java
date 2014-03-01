/* 
   
 */

package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

class Connect4 extends TicTacToe {

    public Connect4(int width, int height, int req) {
        super(width, height, req);
    }

    public ArrayList<Move> getLegalMoves() {
        throw new UnsupportedOperationException();
    }

    public String getPosStr(int x, int y) {
        return Integer.toString(x);
    }


}
