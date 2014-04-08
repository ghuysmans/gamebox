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
	 * @param obs Observable object
	 * @param desc User-readable description
	 * @param nm Name (to be used in Game's subclasses)
	 * @param thr Threshold
	 * @param rst Auto-reset
	 */
	public Event(Observable obs, String desc, String nm, int thr, boolean rst) {
		super(obs, null, desc, nm, thr, rst);
		conditions = new ArrayList<Condition>();
	}
	
	/**
	 * Creates an event with conditions
	 * @param obs Observable object
	 * @param desc User-readable description
	 * @param nm Name (to be used in Game's subclasses)
	 * @param thr Threshold
	 * @param rst Auto-reset
	 * @param cond Conditions
	 */
	public Event(Observable obs, String desc, String nm, int thr, boolean rst, Condition... cond) {
		this(obs, desc, nm, thr, rst);
		for (Condition x: cond) {
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
