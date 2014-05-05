package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;

/** 
 * Generic move  
 */

public abstract class Move implements Serializable {

	private static final long serialVersionUID = -966257986224879076L;
	protected Game game;
	protected Player player;
	protected Player lastPlayer;
	public final boolean conseq;
	
	public Move(Game g, boolean csq) {
		game = g;
		conseq = csq;
		player = g.getCurrentPlayer();
	}
	
	/**
	 * Compares two moves. Fails if obj isn't a move
	 * @param obj Another move
	 * @return true if moves are the same
	 */
	@Override
	public boolean equals(Object obj) {
		Move other = (Move)obj;
		return (other.game==game) && (other.player==player) && (other.conseq==conseq);
	}

	/**
	 * Plays the move and pushes it to the history
	 * @param notify Fires conditions for achievements
	 */
	public final void play(boolean notify) {
		if (game.currentPlayer != player)
			throw new RuntimeException("Trying to cheat? You've been caught...");
		game.history.push(this); //must be done first for OthelloMove's consequences!
		if (notify)
			game.notifyEvent("mv");
		internalPlay();
		if (notify)
			game.notifyEvent("chg");
	}
	
	/**
	 * Undoes the move, checking the history without modifying it
	 * Never call this method from the outside!
	 * @param notify Fires conditions for achievements
	 * @see History#undo()
	 */
	public final void undo(boolean notify) {
		if (game.history.peek() != this)
			throw new RuntimeException("Trying to undo something else than the last move!");
		internalUndo();
		game.setCurrentPlayer(player);
		if (!conseq && notify)
			game.notifyEvent("ud");
	}
	
	/**
	 * Plays the move (on the board)
	 */
	protected abstract void internalPlay();
	
	/**
	 * Undoes the move (on the board)
	 */
	protected abstract void internalUndo();
	
	
	public abstract String toString();


}
