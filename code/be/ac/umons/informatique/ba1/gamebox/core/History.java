package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.Stack;

/** 
 * Stores all played moves  
 */

public class History extends Stack<Move> {
	private static final long serialVersionUID = 7376467524592531262L;
	

	/**
	 * Undoes the last move and its consequences.
	 */
	public final void undo(boolean notify) {
		//undo consequences
		while (!empty() && peek().conseq) {
			peek().undo(notify);
			pop();
		}
		//real undo
		peek().undo(notify);
		pop();
	}

}
