/* 
   
 */

package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

class Othello extends Game {

    public Othello(int width, int height) {
        //FIXME parity check!
        super(width, height);
    }

    public int getScore() {
        throw new UnsupportedOperationException();
    }

    public ArrayList<Move> getLegalMoves() {
        throw new UnsupportedOperationException();
    }


}
