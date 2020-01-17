package za.co.onlineintelligence.hyforge.chart;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.*;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean Briggs
 */
public class HighchartFrame implements Serializable, DrosteDeflater {

    public HighchartFrame() {
    }

    /**
     * The color of the panel.
     *
     * @since 4.0.0
     */
    private HighchartsColor color;

    /**
     * The thickness of the panel.
     *
     * @since 4.0.0
     */
    private int size;

    /**
     * Whether to display the frame. Possible values are `true`, `false`,
     * `"auto"` to display only the frames behind the data, and `"default"` to
     * display faces behind the data based on the axis layout, ignoring the
     * point of view.
     *
     * @since 5.0.12
     */
    private BooleanStringWrapper visible;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsColor getColor() {
        return this.color = getInstanceOf(HighchartsColor.class, this.color);
    }

    public HighchartFrame setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public HighchartFrame setColor(String colorString) {
        this.color = new HighchartsColorString(colorString);
        return this;
    }

    public int getSize() {
        return this.size = getInstanceOf(int.class, this.size);
    }

    public HighchartFrame setSize(int size) {
        this.size = size;
        return this;
    }

    public BooleanStringWrapper getVisible() {
        return this.visible = getInstanceOf(BooleanStringWrapper.class, this.visible);
    }

    public HighchartFrame setVisible(BooleanStringWrapper visible) {
        this.visible = visible;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.size);
        hash = 17 * hash + Objects.hashCode(this.visible);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "color:" + color
                + ", size:" + size
                + ", visible:" + visible
                + '}';
    }

    /**
     * If the visibile field is up for serialization:
     * If visibile is null return null,
     * If not null check visible.value -> if null return isBool if not return the quoted value
     * If not visible return to super.
     *
     * @param field    A tuple of The field currently being serialized and the owner class,
     *                 in most cases the owner will be simply (this), otherwise it will be the superclass(es)
     * @return
     */
    @Override
    public String deflateField(Field field, int tabLevel) {
        String s = DrosteDeflater.super.delegateFieldDeflation(field, "visible", visible == null,
                () -> this.visible.getVal() == null ?
                        this.visible.isBool() + ""
                        : "'" + this.visible.getVal() + "'");
        return s.equals(RTS) ? DrosteDeflater.super.deflateField(field, tabLevel) : s;
    }
}
