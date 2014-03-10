package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Generic rule for victory and draw  
 */

abstract class Rule {

    public abstract boolean match(Move move);

}
