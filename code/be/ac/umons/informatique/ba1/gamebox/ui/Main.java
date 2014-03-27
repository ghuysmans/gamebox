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
		//Game g = new TicTacToe(3, 3, 3);
		Player p1 = new HumanPlayer("H", g);
		Player p2 = new ComputerPlayer("A", g, 2);
		g.setPlayers(p1, p2);
		
		do {
			if (g.getCurrentPlayer() instanceof HumanPlayer) {
				ArrayList<Move> mvs = g.getLegalMoves(g.getCurrentPlayer());
				System.out.println(g.board);
				if (!g.history.empty())
					System.out.println("Last move: "+g.history.peek());
				boolean undo = false;
				Move sel = null;
				String typed;
				do {
					System.out.print("@"+g.getCurrentPlayer().name+": your move (u for undo)? ");
					typed = sc.nextLine();
					if (typed.equals("u"))
						undo = true;
					else
					{
						sel = g.createMove(typed);
						if (!mvs.contains(sel))
							sel = null;
					}
				} while (!undo && sel==null);
				if (undo)
				{
					g.history.undo(); //current player
					g.history.undo(); //other player
				}
				else
					//a legal move has been selected
					sel.play();	
			}
			else
				//it should work (there are no other classes than ComputerPlayer and HumanPlayer)
				((ComputerPlayer)(g.getCurrentPlayer())).play();
		} while (!g.hasFinished());
		
		switch (g.getScore(p1)) {
		case Game.SCORE_DRAW:
			System.out.println("Draw.");
			break;
		case Game.SCORE_LOST:
			System.out.println(p2.name+" won.");
			break;
		case Game.SCORE_WON:
			System.out.println(p1.name+" won.");
		}
		System.out.println("Last move: "+g.history.peek());
		System.out.println(g.board);
		
		sc.close();
	}

}
