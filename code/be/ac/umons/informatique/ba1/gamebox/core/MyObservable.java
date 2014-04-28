package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * An Observable-like class with two features:
 * - classic observers are saved (for Conditions, Achievements, etc.)
 * - temporary observers aren't (for UI components, which are volatile)  
 */
public class MyObservable implements Serializable {
	
	private static final long serialVersionUID = -8152887616190177032L;
	protected transient ArrayList<MyObserver> tmpObservers;
	protected ArrayList<MyObserver> observers = new ArrayList<MyObserver>();
	private boolean changed;
	
	protected void setChanged() {
		changed = true;
	}
	
	public void addObserver(MyObserver obs) {
		observers.add(obs);
	}
	
	public void addTmpObserver(MyObserver obs) {
		if (tmpObservers == null)
			tmpObservers = new ArrayList<MyObserver>();
		tmpObservers.add(obs);
	}
	
	protected void notifyObservers(Object obj) {
		if (changed) {
			for (MyObserver o: observers)
				o.update(this, obj);
			//maybe a UI (or something else) is connected...
			if (tmpObservers != null)
				for (MyObserver o: tmpObservers)
					o.update(this, obj);
		}
	}

}
