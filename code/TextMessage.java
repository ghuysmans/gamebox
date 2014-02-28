/* 
   
 */


class TextMessage extends Event {

    protected final String message;

    public String toString() {
        return name;
    }

    public TextMessage(String n, String msg) {
        super(n);
        message = msg;
    }


}
