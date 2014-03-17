package be.ac.umons.informatique.ba1.gamebox.ui;
import java.util.ArrayList;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/** 
 * Main class launched by the JVM  
 */

public class Main {

	public static void main(String[] args) {
		Game g = new Connect4(7, 6, 4);
		Player p1 = new HumanPlayer("Guillaume", g);
		//Player p2 = new HumanPlayer("Mathieu", g);
		g.players.add(p1);
		//g.players.add(p2);
		System.out.print(g.board);
		ArrayList<Move> mv = g.getLegalMoves(p1);
		System.out.println("before");
		for (int k=0; k<mv.size(); k++){
			System.out.println(mv.get(k));
			//mv.get(k).play();
		}
		//System.out.println(g.hasFinished());
	}

}
