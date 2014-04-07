package be.ac.umons.informatique.ba1.gamebox.core;

import java.util.Observable;
import java.util.Observer;

/** 
 * Conditions triggered by subclasses of Game using their name.
 */

abstract class Condition implements Observer {

	protected int count;
	protected Event parent;
	public final boolean autoreset;
	public final int maximum;
	public final String name;
	public final String description;
	
	/**
	 * Creates a named condition.
	 * @param g Game to subscribe to
	 * @param p Parent to notify when completed
	 * @param d User-readable description
	 * @param n Name (to be used in Game's subclasses)
	 * @param m Maximum count
	 * @param a Automatic reset flag
	 */
	public Condition(Game g, Event p, String d, String n, int m, boolean a) {
		count = 0;
		parent = p;
		description = d;
		name = n;
		maximum = m;
		autoreset = a;
		g.addObserver(this);
	}

	/**
	 * Resets the internal counter
	 */
	public void reset() {
		count = 0;
	}
	
	/**
	 * Computes the completion of the condition
	 * @return A percentage (max 1)
	 */
	public float getCompletion() {
		return (float)count/maximum;
	}
	
	public void update(Observable g, Object param) {
		if (name.equals(param)) {
			if (count < maximum) {
				count++;
				if (count==maximum && parent!=null)
					parent.update(g, param);
			}
		}
	}
	
	public String toString() {
		String cpl = (maximum==1 ? "" : " ("+count+"/"+maximum+")");
		if (count<maximum)
			return "NOT COMPLETED - "+description+cpl;
		else
			return description+cpl;
	}

}
