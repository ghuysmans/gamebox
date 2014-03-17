package be.ac.umons.informatique.ba1.gamebox.core;
import java.util.ArrayList;

/** 
 * Rules manager (using Composite pattern)  
 */

class Rules extends Rule {

	protected ArrayList<Rule> rules;

	public Rules() {
		rules = new ArrayList<Rule>();
	}

	/**
	 * Determines whether m matches the rules set
	 * @param m Move
	 * @return true if it matches all of them
	 */
	@Override
	public final boolean match(Move move) {
		for (Rule r: rules)
			if (!r.match(move)) return false;
		return true;
	}

	/**
	 * Adds r to the list
	 * @param r Rule
	 */
	public final void addRule(Rule r) {
		rules.add(r);
	}


}
