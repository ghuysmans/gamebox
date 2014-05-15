package be.ac.umons.informatique.ba1.gamebox.ui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import be.ac.umons.informatique.ba1.gamebox.core.*;

/**
 * Represents a saved game: this object will be saved when the application is closed.
 * There's no need to care about encapsulation: this object is just a loaded/saved structure! 
 */

public class GameContext implements Serializable {

	private static final long serialVersionUID = -1014168708599274042L;
	
	public Game game;
	public GameMode mode;
	public ArrayList<HumanPlayer> humans = new ArrayList<HumanPlayer>();
	public transient boolean firstLaunch;
	public transient Player[] selPlayers;
	
	/**
	 * Checks whether p is selected
	 * @param p Player
	 * @return True if p is selected
	 */
	public boolean isPlayerSelected(Player p) {
		return (selPlayers[0]==p || selPlayers[1]==p);
	}
	
	/**
	 * Checks if the players selection is valid (different, non-null references)
	 * @return True if the selection is valid
	 */
	public boolean isPlayerSelectionValid() {
		return (selPlayers[0]!=selPlayers[1] && selPlayers[0]!=null && selPlayers[1]!=null);
	}
	
	/**
	 * Saves the context to a file.
	 * @param fileName File name (relative or absolute)
	 * @throws Exception Raised by the Java API
	 */
	public void saveContext(String fileName) throws Exception {
		//don't save uninitialized games
		if (game!=null && !game.isInitialized())
			game = null; //discard it
		//now save the objects
		FileOutputStream fl = new FileOutputStream(fileName);
		ObjectOutputStream os = new ObjectOutputStream(fl);
		os.writeObject(this);
		os.close(); fl.close();
		//log
		Logging.getLogger(GameContext.class).fine("Context saved successfully.");
	}
	
	/**
	 * Loads a context from a file. If no context can be loaded, it will be empty (but usable).
	 * @param fileName File name (relative or absolute)
	 */
	public static GameContext loadContext(String fileName) {
		try {
			FileInputStream fl = new FileInputStream(fileName);
			ObjectInputStream os = new ObjectInputStream(fl);
			GameContext ret = (GameContext)os.readObject();
			os.close(); fl.close();
			ret.selPlayers = new Player[2];
			Logging.getLogger(GameContext.class).fine("Context loaded successfully.");
			return ret;
		}
		catch (Exception e) {
			Logging.getLogger(GameContext.class).fine("Couldn't load a saved context, creating a default one...");
			GameContext ret = new GameContext();
			ret.selPlayers = new Player[2];
			ret.mode = GameMode.NORMAL;
			ret.firstLaunch = true;
			return ret;
		}
	}

}
