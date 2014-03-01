/* 
   
 */

package be.ac.umons.informatique.ba1.gamebox.core;

class AbsentAI extends AI {

    public AbsentAI() {
        super("Absent AI (always plays the first possible move");
    }

    public int computeNode(Player p) {
        throw new UnsupportedOperationException(); //FIXME
    }

    public Move getBest() {
        throw new UnsupportedOperationException(); //FIXME
    }


}
