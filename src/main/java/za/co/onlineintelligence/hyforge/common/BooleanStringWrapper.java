package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;

/**
 * @author Sean Briggs
 */
public class BooleanStringWrapper implements Serializable {

    public BooleanStringWrapper() {
    }

    private Boolean bool = null;
    private String val = null;

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.val = null;
        this.bool = bool;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        if (val == null) {
            this.bool = Boolean.FALSE;
        }
        this.val = val;
    }

    @Override
    public String toString() {
        return this.bool != null
                ? this.bool.toString()
                : this.val != null
                ? this.val
                : "false";
    }

}
