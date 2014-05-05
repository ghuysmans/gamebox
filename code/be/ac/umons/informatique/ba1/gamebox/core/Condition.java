package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;

/** 
 * Conditions triggered by subclasses of Game using their name.
 */

class Condition implements MyObserver, Serializable {

	private static final long serialVersionUID = -6277076554051997918L;
	protected int count;
	protected Event parent;
	public final int maximum;
	public final String name;
	public final String description;
	
	/**
	 * Creates a named condition.
	 * @param obs Observable object
	 * @param desc User-readable description
	 * @param nm Name (to be used in Game's subclasses)
	 * @param max Maximum count
	 */
	public Condition(MyObservable obs, String desc, String nm, int max) {
		count = 0;
		description = desc;
		name = nm;
		maximum = max;
		obs.addObserver(this);
	}

	/**
	 * Resets the internal counter
	 */
	public void reset() {
		count = 0;
	}
	
	/**
	 * Sets the parent (which will be notified upon completion) 
	 * @param p Parent event
	 */
	public void setParent(Event p) {
		parent = p;
	}
	
	/**
	 * Computes the completion of the condition
	 * @return A percentage (max 1)
	 */
	public float getCompletion() {
		return (float)count/maximum;
	}
	
	/**
	 * Determines whether the condition is met 
	 * @return true if the condition is met
	 */
	public boolean isMet() {
		return (count==maximum);
	}
	
	/**
	 * Updates the counter and notifies the parent Event when needed.
	 * @param g     Game object
	 * @param param String identifier
	 */
	public void update(MyObservable g, Object param) {
		if (name.equals(param)) {
			if (count < maximum) {
				count++;
				if (count==maximum) {
					performAction();
					if (parent != null)
						parent.update(g, parent.name); //force
				}
			}
		}
	}
	
	public String toString() {
		String cpl = (maximum==1 ? "" : " ("+count+"/"+maximum+")");
		if (count<maximum)
			return description+cpl+" - NOT COMPLETED";
		else
			return description+cpl;
	}
	
	/**
	 * Performs the action triggered by the condition's completion.
	 * @see Condition#update(MyObservable, Object)
	 */
	protected void performAction() {
		return;
	}

}
