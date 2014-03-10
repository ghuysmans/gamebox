package be.ac.umons.informatique.ba1.gamebox.core;

/** 
 * Displays a text message  
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
