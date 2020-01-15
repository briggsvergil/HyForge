package za.co.onlineintelligence.hyforge.common;

import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsVerticalAlignValue;

import java.io.Serializable;

/**
 * @author Sean
 */
public class HighchartsAlignObject implements Serializable, DrosteDeflater {

    public HighchartsAlignObject() {
    }

    private HighchartsAlignValue align;
    private boolean alignByTranslate;
    private HighchartsVerticalAlignValue verticalAlign;
    private int x;
    private int y;

    public HighchartsAlignValue getAlign() {
        return align;
    }

    public void setAlign(HighchartsAlignValue align) {
        this.align = align;
    }

    public boolean isAlignByTranslate() {
        return alignByTranslate;
    }

    public void setAlignByTranslate(boolean alignByTranslate) {
        this.alignByTranslate = alignByTranslate;
    }

    public HighchartsVerticalAlignValue getVerticalAlign() {
        return verticalAlign;
    }

    public void setVerticalAlign(HighchartsVerticalAlignValue verticalAlign) {
        this.verticalAlign = verticalAlign;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
