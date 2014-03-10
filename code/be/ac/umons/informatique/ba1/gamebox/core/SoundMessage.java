/* 
   
 */

package be.ac.umons.informatique.ba1.gamebox.core;


class SoundMessage extends TextMessage {

    protected final String file;

    public SoundMessage(String n, String msg, String f) {
        super(n, msg);
        file = f;
    }


}
