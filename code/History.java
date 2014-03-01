/* 
   
 */

package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.Stack;

class History extends Stack<Move> {

    public final void undo() {
        //undo consequences
        while (!empty() && peek().conseq)
            pop().undo();
        //real undo
        pop().undo();
    }


}
