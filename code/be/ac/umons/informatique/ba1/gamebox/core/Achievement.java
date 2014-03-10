package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Like classical achievements, displays a message when a particular action is done.
 * These are saved for each player, independently. 
 */

public class Achievement extends Event {

    protected int threshold;

    public String toString() {
        //FIXME initial count
        if (threshold == 1)
            return name;
        else
            return name+" ("+  "1"  +"/"+threshold+")";
    }

    public Achievement(String n, int thr) {
        super(n);
        threshold = thr;
        //FIXME initial count
    }

}
