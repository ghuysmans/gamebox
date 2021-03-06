package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Non-playable player
 */

public class ComputerPlayer extends Player {

	private static final long serialVersionUID = 2817118917278891230L;
	
	/**
	 * Current AI level. Has to be stored here and not in an AI object,
	 * because its class is selected dynamically by {@link ComputerPlayer}
	 */
	public final int level;
	
	/**
	 * Current Game
	 */
	protected Game game;
	
	/**
	 * AI used to actually play moves
	 */
	protected final AI ai;
	
	
	/**
	 * Selects an AI corresponding to the given level
	 * @param lvl Difficulty level (0-anything)
	 */
	public ComputerPlayer(Game g, String n, int lvl) {
		super(n);
		game = g;
		level = lvl;
		
		if (lvl<0)
			throw new IllegalArgumentException(MessageUtil.getMessage("NEGATIVE_DIFF", getClass()));
		else if (lvl==0)
			ai = new AbsentAI(g);
		else if (lvl==1)
			ai = new RandomAI(g);
		else
			ai = new NegamaxAI(g, lvl-2);
	}

	/**
	 * Plays the best move for the current player
	 */
	public void play() {
		Move mv = ai.getBest();
		mv.play(true);
	}

	@Override
	public void setGame(Game g) {
		game = g;
		ai.setGame(g);
	}

}
