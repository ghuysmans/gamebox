package be.ac.umons.informatique.ba1.gamebox.core;

/**
 * Allows comparing performances of two ComputerPlayer (AI) 
 * @author mlq
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
		
		//Game g = new TicTacToe(3, 3, 3);
		ComputerPlayer pA = new ComputerPlayer(null, "I", 5);
		ComputerPlayer pB = new ComputerPlayer(null, "B", 3);		
		AiStats test = new AiStats(pA, pB);
		int ctTest = 10;
		
		for (int k=1; k<=ctTest; k++) {
			Game g = new Connect4(7, 6, 4);
			pA.setGame(g);
			pB.setGame(g);
			System.out.println("Test #"+k);
			test.playGame(g, true);
		}
		System.out.println("Won: "+test.getWon()*100);
		System.out.println("Draw: "+test.getDraw()*100);
		System.out.println("Lost: "+test.getLost()*100);
		
	}
}















