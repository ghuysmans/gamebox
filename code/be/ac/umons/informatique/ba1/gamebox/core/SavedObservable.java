package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * An Observable-like class with two features:
 * - classic observers are saved (for Conditions, Achievements, etc.)
 * - temporary observers aren't (for UI components, which are volatile)  
 */
public class SavedObservable implements Serializable {
	
	private static final long serialVersionUID = -8152887616190177032L;
	protected transient ArrayList<SavedObserver> tmpObservers;
	protected ArrayList<SavedObserver> observers = new ArrayList<SavedObserver>();
	private boolean changed;
	
	protected void setChanged() {
		changed = true;
	}
	
	public void addObserver(SavedObserver obs) {
		observers.add(obs);
	}
	
	public void addTmpObserver(SavedObserver obs) {
		if (tmpObservers == null)
			tmpObservers = new ArrayList<SavedObserver>();
		tmpObservers.add(obs);
	}
	
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
