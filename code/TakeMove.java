/* 
   
 */

package be.ac.umons.informatique.ba1.gamebox.core;

class TakeMove extends Move {

    public final int x;
    public final int y;

    public void undo() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

    public TakeMove(Player p, boolean csq, int x, int y) {
        super(p, csq);
        this.x = x;
        this.y = y;
    }


}
