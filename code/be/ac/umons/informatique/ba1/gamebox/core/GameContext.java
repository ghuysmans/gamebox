package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Represents a saved game: this object will be saved when the application is closed.
 * There's no need to care about encapsulation: this object is just a load/saved structure! 
 */

public class GameContext implements Serializable {

	private static final long serialVersionUID = -1014168708599274042L;
	
	public Game game;
	public ArrayList<HumanPlayer> humans = new ArrayList<HumanPlayer>();
	public transient Player[] selPlayers;
	
	public void saveContext(String fileName) throws Exception {
		FileOutputStream fl = new FileOutputStream(fileName);
		ObjectOutputStream os = new ObjectOutputStream(fl);
		os.writeObject(this);
		os.close(); fl.close();
		Logging.getLogger(GameContext.class).fine("Context saved successfully.");
	}
	
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
			return ret;
		}
	}

}
