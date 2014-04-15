package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;
import java.util.ArrayList;

public class MyObservable implements Serializable {
	
	private static final long serialVersionUID = -8152887616190177032L;
	protected ArrayList<MyObserver> observers = new ArrayList<MyObserver>();
	private boolean changed;
	
	protected void setChanged() {
		changed = true;
	}
	
	public void addObserver(MyObserver obs) {
		observers.add(obs);
	}
	
	protected void notifyObservers(Object obj) {
		if (changed)
			for (MyObserver o: observers)
				o.update(this, obj);
	}

}
