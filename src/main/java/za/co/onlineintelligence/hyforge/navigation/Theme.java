package za.co.onlineintelligence.hyforge.navigation;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Theme HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Theme implements Serializable, Exportable {


    public Theme() {
    }

    /**
     * The default fill exists only to capture hover events.
     *
     * @since 3.0.0
     */
    private HighchartsColor fill;

    /**
     * Padding for the button.
     *
     * @since 3.0.0
     */
    private Integer padding;

    /**
     * Default stroke for the buttons.
     *
     * @since 3.0.0
     */
    private HighchartsColorString stroke;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsColor getFill() {
        return this.fill = getInstanceOf(HighchartsColor.class, this.fill);
    }

    public Theme setFill(HighchartsColor fill) {
        this.fill = fill;
        return this;
    }

    public Integer getPadding() {
        return this.padding = getInstanceOf(Integer.class, this.padding);
    }

    public Theme setPadding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public HighchartsColorString getStroke() {
        return this.stroke = getInstanceOf(HighchartsColorString.class, this.stroke);
    }

    public Theme setStroke(HighchartsColorString stroke) {
        this.stroke = stroke;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.fill);
        hash = 17 * hash + Objects.hashCode(this.padding);
        hash = 17 * hash + Objects.hashCode(this.stroke);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "fill:" + fill
                + ", padding:" + padding
                + ", stroke:" + stroke
                + '}';
    }


}
