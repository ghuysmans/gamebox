package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.Observer;
import java.util.Observable;

/** 
 * Generic event doing something after a specific (set of) conditions is met  
 */

public abstract class Event implements Observer {

	public final String name;

	public Event(String n) {
		name = n;
	}
	
	public void update(Observable g, Object param) {
		//TODO check conditions
		throw new UnsupportedOperationException();
	}

	public abstract String toString();

}
