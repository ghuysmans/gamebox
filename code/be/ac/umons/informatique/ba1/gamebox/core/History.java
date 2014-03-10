package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.Stack;

/** 
 * Stores all played moves  
 */

public class History extends Stack<Move> {
	private static final long serialVersionUID = 7376467524592531262L;

	public final void undo() {
        //undo consequences
        while (!empty() && peek().conseq)
            pop().undo();
        //real undo
        pop().undo();
    }


}
