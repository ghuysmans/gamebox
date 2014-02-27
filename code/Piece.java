/* 
   
 */


abstract class Piece {

    protected Player owner;

    public Piece(Player owner) {
        this.owner = owner;
    }

    public final Player getOwner() {
        return owner;
    }

    public final void setOwner(Player p) {
        owner = p;
    }


}
