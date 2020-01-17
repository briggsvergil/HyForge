package za.co.onlineintelligence.hyforge.common;

import com.google.gson.JsonElement;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @author Sean
 */
public class HighchartsColorString implements Serializable, HighchartsColor {

    private String color;

    public HighchartsColorString() {
    }

    public HighchartsColorString(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\"" + color + "\"";
    }

}
