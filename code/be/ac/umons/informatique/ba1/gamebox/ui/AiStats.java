package be.ac.umons.informatique.ba1.gamebox.ui;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * CLI tool allowing comparison between two ComputerPlayer of (optionally) different levels.
 */

public class AiStats {
	
	protected ComputerPlayer realA1;
	protected ComputerPlayer a1;
	protected ComputerPlayer a2;
	protected int ctWon = 0;
	protected int ctLost = 0;
	protected int ctDraw = 0;

	public AiStats (ComputerPlayer a1, ComputerPlayer a2) {
		this.a1 = realA1 = a1;
		this.a2 = a2;
	}
	
	/**
	 * Runs one test 
	 * @param g Empty game
	 */
	public void playGame(Game g, boolean dbg) {
		g.setPlayers(a1, a2);
		do {
			((ComputerPlayer)(g.getCurrentPlayer())).play();
			if (dbg)
				System.out.println(g.board); 
		} while (!g.hasFinished());
		int sc = g.getScore(realA1);
		if (sc == Game.SCORE_WON)
			ctWon++;
		else if (sc == Game.SCORE_LOST)
			ctLost++;
		else
			ctDraw++;
		//swap a1 <-> a2
		ComputerPlayer cp = a2;
		a2 = a1; 
		a1 = cp;
	}
	
	/**
	 * @return Number of played games
	 */
	public int getCount() {
		return ctWon + ctDraw + ctLost;
	}
	/**
	 * @return Percentage of won games for the first player
	 */
	public double getWon() {
		int t = getCount();
		if (t==0)
			return -1;
		else
			return (double)ctWon/t;
	}
	
	/**
	 * @return Percentage of lost games for the first player
	 */
	public double getLost() {
		int t = getCount();
		if (t==0)
			return -1;
		else
			return (double)ctLost/t;
	}		
	
	/**
	 * @return Percentage of draw games for the first player
	 */	
	public double getDraw() {
		int t = getCount();
		if (t==0)
			return -1;
		else
			return (double)ctDraw/t;
	}
	
	public static void main(String[] args) {
		
		if (args.length!=4 && args.length!=5) {
			System.out.println("Usage: AiStats [-d|-g] game levelA levelB count");
			System.out.println("Available games: 0=tic-tac-toe; 1=four in a row; 2=othello");
		}
		else {
			int gn; //selected game
			int lvlA, lvlB; //IA difficulty levels
			int f=0; //first required parameter
			int count; //tests count
			boolean dbg = false; //debug mode?
			boolean gnuplot = false; //gnuplot-compatible output?
			if (args[0].equals("-d")) {
				f = 1;
				dbg = true;
			}
			else if (args[0].equals("-g")) {
				f = 1;
				gnuplot = true;
			}
			gn = Integer.parseInt(args[f]);
			lvlA = Integer.parseInt(args[f+1]);
			lvlB = Integer.parseInt(args[f+2]);
			count = Integer.parseInt(args[f+3]);
			ComputerPlayer pA = new ComputerPlayer(null, "A", lvlA);
			ComputerPlayer pB = new ComputerPlayer(null, "B", lvlB);		
			AiStats test = new AiStats(pA, pB);
			for (int k=1; k<=count; k++) {
				Game g;
				switch (gn) {
					case 0:
						g = new TicTacToe(3, 3, 3);
						break;
					case 1:
						g = new Connect4(7, 6, 4);
						break;
					case 2:
						g = new Othello(8, 8);
						break;
					default:
						g = null;
						break;
				}
				pA.setGame(g);
				pB.setGame(g);
				if (!gnuplot)
					System.out.println("Test #"+k);
				test.playGame(g, dbg);
			}
			if (gnuplot) {
				System.out.println("1 "+test.getWon());
				System.out.println("0 "+test.getDraw());
				System.out.println("-1 "+test.getLost());
			}
			else {
				System.out.println("Won: "+test.getWon()*100+"%");
				System.out.println("Draw: "+test.getDraw()*100+"%");
				System.out.println("Lost: "+test.getLost()*100+"%");
			}
		}
	}
}
