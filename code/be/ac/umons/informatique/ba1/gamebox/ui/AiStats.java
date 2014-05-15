package be.ac.umons.informatique.ba1.gamebox.ui;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * Allows comparison between two ComputerPlayer of (optionally) different levels.
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
	 * Runs one test, updating counters
	 * @param g Empty game
	 */
	public void playGame(Game g, boolean dbg) {
		g.setPlayers(a1, a2);
		do {
			((ComputerPlayer)(g.getCurrentPlayer())).play();
			if (dbg)
				System.out.println(g.board); 
		} while (!g.hasFinished());
		int sc = g.getResult(realA1);
		if (sc == Game.RESULT_WON)
			ctWon++;
		else if (sc == Game.RESULT_LOST)
			ctLost++;
		else
			ctDraw++;
		//swap a1 <-> a2
		ComputerPlayer cp = a2;
		a2 = a1; 
		a1 = cp;
	}
	
	/**
	 * Computes the number of played games
	 * @return Count
	 */
	public int getCount() {
		return ctWon + ctDraw + ctLost;
	}
	/**
	 * Computes the percentage of won games for the first player
	 * @return Value in [0;1]
	 */
	public double getWon() {
		int t = getCount();
		if (t==0)
			return -1;
		else
			return (double)ctWon/t;
	}
	
	/**
	 * Computes the percentage of lost games for the first player
	 * @return Value in [0;1]
	 */
	public double getLost() {
		int t = getCount();
		if (t==0)
			return -1;
		else
			return (double)ctLost/t;
	}		
	
	/**
	 * Computes the percentage of draw games for the first player
	 * @return Value in [0;1]
	 */	
	public double getDraw() {
		int t = getCount();
		if (t==0)
			return -1;
		else
			return (double)ctDraw/t;
	}
	
	
	/**
	 * Basic command-line interface
	 * @param args Parameters
	 */
	public static void main(String[] args) {
		if (args.length!=4 && args.length!=5) {
			System.out.println("Usage: AiStats [-d|-g] game levelA levelB count");
			System.out.print("Available games: ");
			for (UiGame ug: UiGame.values())
				System.out.print(ug.name()+" ");
			System.out.println("");
		}
		else {
			UiGame sg; //selected game
			ComputerPlayer pA, pB;
			int lvlA, lvlB; //IA difficulty levels
			int f=0; //first required parameter
			int count; //tests count
			boolean dbg = false; //debug mode?
			boolean gnuplot = false; //gnuplot-compatible output?
			
			//Parse arguments
			try {
				if (args[0].equals("-d")) {
					f = 1;
					dbg = true;
				}
				else if (args[0].equals("-g")) {
					f = 1;
					gnuplot = true;
				}
				sg = UiGame.valueOf(args[f]);
				lvlA = Integer.parseInt(args[f+1]);
				lvlB = Integer.parseInt(args[f+2]);
				count = Integer.parseInt(args[f+3]);
				pA = new ComputerPlayer(null, "A", lvlA);
				pB = new ComputerPlayer(null, "B", lvlB);
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
				return;
			}
			
			//Play a few games
			AiStats test = new AiStats(pA, pB);
			for (int k=1; k<=count; k++) {
				Game g;
				try {
					g = sg.createGame();
				} catch (Exception e) {
					//this should never happen
					e.printStackTrace();
					return;
				} 
				pA.setGame(g);
				pB.setGame(g);
				if (!gnuplot)
					System.out.println("Test #"+k);
				test.playGame(g, dbg);
			}
			if (!gnuplot)
				System.out.println("");
			
			//Display results
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
