package be.ac.umons.informatique.ba1.gamebox.ui;

import java.util.Scanner;
import be.ac.umons.informatique.ba1.gamebox.core.*;

/** 
 * Debug CLI for AI and History. Compatible with virtually any TTY...
 */

public class Debug {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game g = new Othello(4, 4);
		//Game g = new TicTacToe(8, 8, 3);
		Player p1 = new HumanPlayer("H");
		Player p2 = new ComputerPlayer(g, "A", 0);
		g.setPlayers(p1, p2);
		
		do {
			if (g.getCurrentPlayer() instanceof HumanPlayer) {
				System.out.println(g.board);
				if (!g.history.empty())
					System.out.println("Last move: "+g.history.peek());
				boolean undo = false;
				Move sel = null;
				String typed;
				do {
					System.out.print("@"+g.getCurrentPlayer().name+": your move (u=undo, m=moves)? ");
					typed = sc.nextLine();
					if (typed.equals("u"))
						undo = true;
					else if (typed.equals("m"))
						for (Move mv: g.getLegalMoves())
							System.out.println(mv);
					else {
						try {
							sel = g.createMove(typed);
							if (!g.getLegalMoves().contains(sel))
								sel = null;
						}
						catch (Exception e) {
							sel = null;
						}
					}
				} while (!undo && sel==null);
				if (undo) {
					try {
						g.history.undo(true); //current player
						g.history.undo(false); //other player
					}
					catch (Exception e) {
						System.out.println("Undo operation has failed.");
					}
				}
				else
					//a legal move has been selected
					sel.play(true);	
			}
			else
				//it should work (there are no other classes than ComputerPlayer and HumanPlayer)
				((ComputerPlayer)(g.getCurrentPlayer())).play();
		} while (!g.hasFinished());
		
		switch (g.getScore()) {
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
