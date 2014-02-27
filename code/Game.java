/* 
   
 */

import java.util.Observable;
import java.util.ArrayList;

abstract class Game extends Observable {

    public Player currentPlayer;
    public ArrayList<Player> players;

    public abstract int getScore();
    public abstract ArrayList<IMove> getLegalMoves();
    public abstract String getPosStr(int x, int y);


}
