package be.ac.umons.informatique.ba1.gamebox.ui;
import java.util.ArrayList;
import java.util.Scanner;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/** 
 * Main class launched by the JVM  
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game g = new Connect4(7, 6, 4);
		Player p1 = new HumanPlayer("Guillaume", g);
		Player p2 = new ComputerPlayer("Mathieu", g, 1);
		g.setPlayers(p1, p2);
		do {
			if (g.getCurrentPlayer() instanceof HumanPlayer) {
				ArrayList<Move> mv = g.getLegalMoves(g.getCurrentPlayer());
				for (int k=0; k<mv.size(); k++)
					System.out.println(mv.get(k));
				System.out.println(g.history);
				int sel;
				do {
					System.out.print("Move (-1 for undo)? ");
					sel = sc.nextInt();	
				} while (sel<-1 || sel>mv.size()-1);
				if (sel == -1)
					g.history.undo();
				else
					mv.get(sel).play();	
			}
			else
				((ComputerPlayer)(g.getCurrentPlayer())).play();
			System.out.println(g.board);
		} while (!g.hasFinished());
		switch (g.getScore(p1)) {
		case Game.SCORE_DRAW:
			System.out.println("Draw.");
			break;
		case Game.SCORE_LOST:
			System.out.println("P2 won.");
			break;
		case Game.SCORE_WON:
			System.out.println("P1 won.");
		}
		sc.close();
		
	}

}
