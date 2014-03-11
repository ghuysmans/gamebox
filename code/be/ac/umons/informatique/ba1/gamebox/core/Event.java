package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.Observer;
import java.util.Observable;

/** 
 * Generic event doing something after a specific (set of) condition(s) is met  
 */

public abstract class Event implements Observer {

	public final String name;
	public abstract String toString();

	public void update(Observable g, Object param) {
		//TODO check conditions
		throw new UnsupportedOperationException();
	}

	public Event(String n) {
		name = n;
	}



}
