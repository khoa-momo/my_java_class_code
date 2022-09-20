package Ob;

/**
 *
 * @author quynm
 */
public class Lending {
    
    private String bcode;
    private String rcode;
    private int state; 
    /*
    0 - the book is not given to the reader; 
    1-the book is still at the reader, not given back.
    2: the book is given back to the library.
    */

    public Lending() {
    }

    public Lending(String bcode, String rcode, int state) {
        this.bcode = bcode;
        this.rcode = rcode;
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }
    
}
