/* 
   
 */

package be.ac.umons.informatique.ba1.gamebox.core;

abstract class AI {

    public final String desc;

    public AI(String d) {
        desc = d;
    }

    public abstract int computeNode(Player p);
    public abstract Move getBest();


}
