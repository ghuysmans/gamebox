/* 
   
 */


class Achievement extends Event {

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
