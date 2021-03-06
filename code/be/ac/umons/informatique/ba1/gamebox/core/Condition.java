package be.ac.umons.informatique.ba1.gamebox.core;

import java.io.Serializable;

/** 
 * Conditions triggered by subclasses of Game using their name.
 */

public class Condition implements SavedObserver, Serializable {

	private static final long serialVersionUID = -6277076554051997918L;
	
	/**
	 * Event to notify when count==maximum
	 */
	protected Event parent;
	
	/**
	 * Counts how many times the message was received
	 */
	protected int count;
	
	/**
	 * How many times the message must be received for this condition to be met.
	 */
	public final int maximum;
	
	/**
	 * Name used to filter messages
	 */
	public final String name;
	
	/**
	 * User-friendly description 
	 */
	public final String description;
	
	
	/**
	 * Creates a named condition.
	 * @param obs Observable object
	 * @param desc User-readable description
	 * @param nm Name (to be used in Game's subclasses)
	 * @param max Maximum count
	 */
	public Condition(SavedObservable obs, String desc, String nm, int max) {
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
	 * Checks if a message matches a name.
	 * Examples:
	 * - match("won", "won-xxx")==true
	 * - match("won", "won")==true
	 * - match("won", "wontwork")==false  
	 * @param  msg Message
	 * @return true if it matches
	 */
	public static boolean match(String name, String msg) {
		int ln=name.length(), lm=msg.length();
		if (ln > lm)
			return false;
		else if (ln == lm)
			return name.equals(msg);
		else
			return msg.startsWith(name+"-");
	}
	
	/**
	 * Updates the counter and notifies the parent Event when needed.
	 * @param g     Game object
	 * @param param String identifier
	 */
	public void update(SavedObservable g, Object param) {
		if (match(name, (String)param)) {
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
		String key = "REPR";
		if (maximum == 1)
			key += "_UNIQUE";
		if (count < maximum)
			key += "_NOTCOMP";
		return MessageUtil.getMessage(key, getClass(), description, count, maximum);
	}
	
	/**
	 * Performs the action triggered by the condition's completion.
	 * @see Condition#update(SavedObservable, Object)
	 */
	protected void performAction() {
		return;
	}

}
