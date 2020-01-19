package za.co.onlineintelligence.hyforge.legend;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * LegendLabelOptions HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class LegendLabelOptions implements Serializable, Exportable {


    public LegendLabelOptions() {
    }

    /**
     * The alignment of the labels compared to the bubble
     * legend. Can be one of `left`, `center` or `right`.
     *
     * @since 7.0.0
     */
    private HighchartsAlignValue align;

    /**
     * Whether to allow data labels to overlap.
     *
     * @since 7.0.0
     */
    private Boolean allowOverlap;

    /**
     * An additional class name to apply to the bubble legend
     * label graphical elements. This option does not replace
     * default class names of the graphical element.
     *
     * @since 7.0.0
     */
    private String className;

    /**
     * A [format string](http://docs.highcharts.com/#formatting)
     * for the bubble legend labels. Available variables are the
     * same as for `formatter`.
     *
     * @since 7.0.0
     */
    private String format;

    /**
     * Available `this` properties are:
     * <p>
     * - `this.value`: The bubble value.
     * <p>
     * - `this.radius`: The radius of the bubble range.
     * <p>
     * - `this.center`: The center y position of the range.
     *
     * @since 7.0.0
     */
    private HighchartsCallbackFunction formatter;

    /**
     * CSS styles for the labels.
     *
     * @since 7.0.0
     */
    private HighchartsCSS style;

    /**
     * The x position offset of the label relative to the
     * connector.
     *
     * @since 7.0.0
     */
    private Integer x;

    /**
     * The y position offset of the label relative to the
     * connector.
     *
     * @since 7.0.0
     */
    private Integer y;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsAlignValue getAlign() {
        return this.align = getInstanceOf(HighchartsAlignValue.class, this.align);
    }

    public LegendLabelOptions setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public Boolean getAllowOverlap() {
        return this.allowOverlap = getInstanceOf(Boolean.class, this.allowOverlap);
    }

    public LegendLabelOptions setAllowOverlap(Boolean allowOverlap) {
        this.allowOverlap = allowOverlap;
        return this;
    }

    public String getClassName() {
        return this.className = getInstanceOf(String.class, this.className);
    }

    public LegendLabelOptions setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getFormat() {
        return this.format = getInstanceOf(String.class, this.format);
    }

    public LegendLabelOptions setFormat(String format) {
        this.format = format;
        return this;
    }

    public HighchartsCallbackFunction getFormatter() {
        return this.formatter = getInstanceOf(HighchartsCallbackFunction.class, this.formatter);
    }

    public LegendLabelOptions setFormatter(HighchartsCallbackFunction formatter) {
        this.formatter = formatter;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public LegendLabelOptions setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public Integer getX() {
        return this.x = getInstanceOf(Integer.class, this.x);
    }

    public LegendLabelOptions setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return this.y = getInstanceOf(Integer.class, this.y);
    }

    public LegendLabelOptions setY(Integer y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.allowOverlap);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.format);
        hash = 17 * hash + Objects.hashCode(this.formatter);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.x);
        hash = 17 * hash + Objects.hashCode(this.y);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "align:" + align
                + ", allowOverlap:" + allowOverlap
                + ", className:" + className
                + ", format:" + format
                + ", formatter:" + formatter
                + ", style:" + style
                + ", x:" + x
                + ", y:" + y
                + '}';
    }


}