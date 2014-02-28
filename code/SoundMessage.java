/* 
   
 */


class SoundMessage extends TextMessage {

    protected final String file;

    public SoundMessage(String n, String msg, String f) {
        super(n, msg);
        file = f;
    }


}
