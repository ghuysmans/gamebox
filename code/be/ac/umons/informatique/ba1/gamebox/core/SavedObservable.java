package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * <p>An Observable-like class with two features:</p>
 * <ul>
 * <li>classic observers are saved (for Conditions, Achievements, etc.)</li>
 * <li>temporary observers aren't (for UI components, which are volatile)</li>
 * </ul>  
 */
public class SavedObservable implements Serializable {
	
	private static final long serialVersionUID = -8152887616190177032L;
	
	/**
	 * Internal list of temporary observers
	 */
	protected transient ArrayList<SavedObserver> tmpObservers;
	
	/**
	 * Internal list of saved observers
	 */
	protected ArrayList<SavedObserver> observers = new ArrayList<SavedObserver>();
	
	/**
	 * Flag to enable {@link #notifyObservers(Object)}
	 */
	private boolean changed;
	
	
	/**
	 * Sets the {@link #changed} flag
	 */
	protected void setChanged() {
		changed = true;
	}
	
	/**
	 * Adds a saved observer
	 * @param obs Observer
	 */
	public void addObserver(SavedObserver obs) {
		observers.add(obs);
	}
	
	/**
	 * Adds a temporary observer
	 * @param obs Observer
	 */
	public void addTmpObserver(SavedObserver obs) {
		if (tmpObservers == null)
			tmpObservers = new ArrayList<SavedObserver>();
		tmpObservers.add(obs);
	}
	
	/**
	 * Notifies saved and temporary observers if {@link #changed} is set 
	 * @param obj Object to be passed to observers
	 */
	protected void notifyObservers(Object obj) {
		if (changed) {
			for (SavedObserver o: observers)
				o.update(this, obj);
			//maybe a UI (or something else) is connected...
			if (tmpObservers != null)
				for (SavedObserver o: tmpObservers)
					o.update(this, obj);
		}
	}

}
