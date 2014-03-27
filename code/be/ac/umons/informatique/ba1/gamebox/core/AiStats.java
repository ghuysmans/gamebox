package be.ac.umons.informatique.ba1.gamebox.core;

/**
 * Allows comparing performances of two ComputerPlayer (AI) 
 * @author mlq
 */
public class AiStats {
	
	protected ComputerPlayer a1;
	protected ComputerPlayer a2;
	protected int ctWon = 0;
	protected int ctLost = 0;
	protected int ctDraw = 0;

	public AiStats (ComputerPlayer a1, ComputerPlayer a2) {
		this.a1 = a1;
		this.a2 = a2;
	}
	
	/**
	 * Runs one test 
	 * @param g Empty game
	 */
	public void playGame(Game g) {
		g.setPlayers(a1, a2);
		do {
			((ComputerPlayer)(g.getCurrentPlayer())).play();
			System.out.println(g.board);
		} while (!g.hasFinished());
		int sc = g.getScore(a1);
		if (sc == Game.SCORE_WON)
			ctWon++;
		else if (sc == Game.SCORE_LOST)
			ctLost++;
		else
			ctDraw++;
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
		Game g = new Connect4(7, 6, 4);
		//Game g = new TicTacToe(3, 3, 3);
		ComputerPlayer p1 = new ComputerPlayer(g, "I", 4);
		ComputerPlayer p2 = new ComputerPlayer(g, "B", 1);		
		AiStats test = new AiStats(p1, p2);
		test.playGame(g);
		System.out.println("gagn�: "+test.getWon());
		System.out.println("egalit�: "+test.getDraw());
		System.out.println("perdu: "+test.getLost());
		
	}
}















