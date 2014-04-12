package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;
import java.util.Observable;

/** 
 * Generic event doing something after a specific (set of) conditions is met  
 */

public abstract class Event extends Condition {

	private static final long serialVersionUID = -2874813841580806619L;
	public final boolean autoreset;
	public final ArrayList<Condition> conditions;
	
	/**
	 * Creates an event without conditions
	 * @param obs  Observable object
	 * @param desc User-readable description
	 * @param nm   Name (to be used in Game's subclasses)
	 * @param thr  Threshold
	 * @param rst  Auto-reset
	 */
	public Event(Observable obs, String desc, String nm, int thr, boolean rst) {
		super(obs, desc, nm, thr);
		autoreset = rst;
		conditions = new ArrayList<Condition>();
	}
	
	/**
	 * Creates an event with conditions
	 * @param obs  Observable object
	 * @param desc User-readable description
	 * @param nm   Name (to be used in Game's subclasses)
	 * @param thr  Threshold
	 * @param rst  Auto-reset
	 * @param cond Conditions
	 */
	public Event(Observable obs, String desc, String nm, int thr, boolean rst, Condition... cond) {
		this(obs, desc, nm, thr, rst);
		for (Condition x: cond) {
			x.setParent(this);
			conditions.add(x);
		}
	}
	
	@Override
	public void update(Observable g, Object param) {
		if (name.equals(param)) {
			for (Condition c: conditions) {
				if (!c.isMet()) 
					//all conditions aren't met
					return;
			}
			//all conditions are met... update the global counter.
			//this will also trigger performAction() if it's required.
			super.update(g, name);
			//reset conditions counters
			for (Condition c: conditions)
				c.reset();
			//handle auto-reset
			if (count==maximum && autoreset)
				count = 0;
		}
	}
	
	@Override
	public float getCompletion() {
		//Let's avoid a division by zero...
		if (isMet()) return 1;
		//Compute conditions completion
		float acc = 0;
		for (Condition c: conditions)
			acc += c.getCompletion();
		//Return the global completion plus the rest 
		return super.getCompletion() + acc/conditions.size()/(maximum-count);
	}

}
