/* 
   
 */


abstract class Move {

    protected Player player;
    public final boolean conseq=false;

    public abstract void undo();
    public abstract String toString();


}
