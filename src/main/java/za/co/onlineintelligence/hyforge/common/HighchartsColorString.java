package za.co.onlineintelligence.hyforge.common;

import org.javatuples.Pair;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @author Sean
 */
public class HighchartsColorString implements Serializable, HighchartsColor, DrosteDeflater {

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

    @Override
    public String deflateField(Field field, int tabLevel) {
        String s = DrosteDeflater.super.delegateFieldDeflation(field, "color", color==null,
                () -> color);
        return s!=null && s.equals(RTS)? DrosteDeflater.super.deflateField(field, tabLevel) : s;
    }
}
