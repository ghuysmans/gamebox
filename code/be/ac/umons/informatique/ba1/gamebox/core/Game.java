package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.Observable;
import java.util.ArrayList;

/** 
 * Generic game  
 */

public abstract class Game extends Observable {

    public Player currentPlayer;
    public ArrayList<Player> players;
    public final Board board;

    public abstract int getScore();
    public abstract ArrayList<Move> getLegalMoves();

    public Game(int width, int height) {
        board = new Board(width, height);
        players = new ArrayList<Player>();
    }

    public String getPosStr(int x, int y) {
        if (board.getWidth() <= 26)
            return Character.toString((char)('a'+x)) + y;
        else
            return x+","+y;
    }


}
