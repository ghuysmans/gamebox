package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;
import java.util.Observable;

/** 
 * Generic event doing something after a specific (set of) conditions is met  
 */

public abstract class Event extends Condition {

	public final ArrayList<Condition> conditions;
	
	/**
	 * Creates an event without conditions
	 * @param o Observable object
	 * @param d User-readable description
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 */
	public Event(Observable o, String d, String n, int t, boolean r) {
		super(o, null, d, n, t, r);
		conditions = new ArrayList<Condition>();
	}
	
	/**
	 * Creates an event with conditions
	 * @param o Observable object
	 * @param d User-readable description
	 * @param n Name (to be used in Game's subclasses)
	 * @param t Threshold
	 * @param r Auto-reset
	 * @param c Conditions
	 */
	public Event(Observable o, String d, String n, int t, boolean r, Condition... c) {
		this(o, d, n, t, r);
		for (Condition x: c) {
			x.setParent(this);
			conditions.add(x);
		}
	}
	
	public void update(Observable g, Object param) {
		for (Condition c: conditions) {
			if (!c.isMet())
				//all conditions aren't met
				return;
		}
		//all conditions are met
		super.update(g, name);
	}

}
