package za.co.onlineintelligence.hyforge.common;

import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsVerticalAlignValue;

import java.io.Serializable;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean
 */
public class HighchartsAlignObject implements Serializable, Exportable {

    public HighchartsAlignObject() {
    }

    private HighchartsAlignValue align;
    private boolean alignByTranslate;
    private HighchartsVerticalAlignValue verticalAlign;
    private int x;
    private int y;

    public HighchartsAlignValue getAlign() {
        return this.align = getInstanceOf(HighchartsAlignValue.class, this.align);
    }

    public void setAlign(HighchartsAlignValue align) {
        this.align = align;
    }

    public boolean isAlignByTranslate() {
        return this.alignByTranslate = getInstanceOf(boolean.class, this.alignByTranslate);
    }

    public void setAlignByTranslate(boolean alignByTranslate) {
        this.alignByTranslate = alignByTranslate;
    }

    public HighchartsVerticalAlignValue getVerticalAlign() {
        return this.verticalAlign = getInstanceOf(HighchartsVerticalAlignValue.class, this.verticalAlign);
    }

    public void setVerticalAlign(HighchartsVerticalAlignValue verticalAlign) {
        this.verticalAlign = verticalAlign;
    }

    public int getX() {
        return this.x = getInstanceOf(int.class, this.x);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y = getInstanceOf(int.class, this.y);
    }

    public void setY(int y) {
        this.y = y;
    }

}
