package za.co.onlineintelligence.hyforge.annotations;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsVerticalAlignValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;


/**
 * LabelOptions  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class LabelOptions implements Serializable, DrosteDeflater {


    public LabelOptions() {
    }

    /**
     * The alignment of the annotation's label. If right,
     * the right side of the label should be touching the point.
     *
     * @since 6.0.0
     */
    private HighchartsAlignValue align;

    /**
     * Whether to allow the annotation's labels to overlap.
     * To make the labels less sensitive for overlapping,
     * the can be set to 0.
     *
     * @since 6.0.0
     */
    private Boolean allowOverlap;

    /**
     * The background color or gradient for the annotation's label.
     *
     * @since 6.0.0
     */
    private HighchartsColor backgroundColor;

    /**
     * The border color for the annotation's label.
     *
     * @since 6.0.0
     */
    private HighchartsColorString borderColor;

    /**
     * The border radius in pixels for the annotaiton's label.
     *
     * @since 6.0.0
     */
    private Integer borderRadius;

    /**
     * The border width in pixels for the annotation's label
     *
     * @since 6.0.0
     */
    private Integer borderWidth;

    /**
     * A class name for styling by CSS.
     *
     * @since 6.0.5
     */
    private String className;

    /**
     * Whether to hide the annotation's label
     * that is outside the plot area.
     *
     * @since 6.0.0
     */
    private Boolean crop;

    /**
     * The label's pixel distance from the point.
     *
     * @since 6.0.0
     */
    private Integer distance;

    /**
     * A
     * [format](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting)
     * string for the data label.
     *
     * @since 6.0.0
     */
    private String format;

    /**
     * Callback JavaScript function to format the annotation's
     * label. Note that if a `format` or `text` are defined, the
     * format or text take precedence and the formatter is ignored.
     * `This` refers to a point object.
     *
     * @since 6.0.0
     */
    private HighchartsCallbackFunction formatter;

    /**
     * How to handle the annotation's label that flow outside the
     * plot area. The justify option aligns the label inside the
     * plot area.
     *
     * @since 6.0.0
     */
    private String overflow;

    /**
     * When either the borderWidth or the backgroundColor is set,
     * this    is the padding within the box.
     *
     * @since 6.0.0
     */
    private Integer padding;

    /**
     * The shadow of the box. The shadow can be an object
     * configuration containing `color`, `offsetX`, `offsetY`,
     * `opacity` and `width`.
     *
     * @since 6.0.0
     */
    private HighchartsShadowOptionsObject shadow;

    /**
     * The name of a symbol to use for the border around the label.
     * Symbols are predefined functions on the Renderer object.
     *
     * @since 6.0.0
     */
    private String shape;

    /**
     * Styles for the annotation's label.
     *
     * @since 6.0.0
     */
    private HighchartsCSS style;

    /**
     * Alias for the format option.
     *
     * @since 6.0.0
     */
    private String text;

    /**
     * Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
     * to render the annotation's label.
     *
     * @since 6.0.0
     */
    private Boolean useHTML;

    /**
     * The vertical alignment of the annotation's label.
     *
     * @since 6.0.0
     */
    private HighchartsVerticalAlignValue verticalAlign;

    /**
     * The x position offset of the label relative to the point.
     * Note that if a `distance` is defined, the distance takes
     * precedence over `x` and `y` options.
     *
     * @since 6.0.0
     */
    private Integer x;

    /**
     * The y position offset of the label relative to the point.
     * Note that if a `distance` is defined, the distance takes
     * precedence over `x` and `y` options.
     *
     * @since 6.0.0
     */
    private Integer y;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsAlignValue getAlign() {
        return this.align;
    }

    public LabelOptions setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public Boolean getAllowOverlap() {
        return this.allowOverlap;
    }

    public LabelOptions setAllowOverlap(Boolean allowOverlap) {
        this.allowOverlap = allowOverlap;
        return this;
    }

    public HighchartsColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public LabelOptions setBackgroundColor(HighchartsColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public HighchartsColorString getBorderColor() {
        return this.borderColor;
    }

    public LabelOptions setBorderColor(HighchartsColorString borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return this.borderRadius;
    }

    public LabelOptions setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return this.borderWidth;
    }

    public LabelOptions setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public LabelOptions setClassName(String className) {
        this.className = className;
        return this;
    }

    public Boolean getCrop() {
        return this.crop;
    }

    public LabelOptions setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public LabelOptions setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }

    public String getFormat() {
        return this.format;
    }

    public LabelOptions setFormat(String format) {
        this.format = format;
        return this;
    }

    public HighchartsCallbackFunction getFormatter() {
        return this.formatter;
    }

    public LabelOptions setFormatter(HighchartsCallbackFunction formatter) {
        this.formatter = formatter;
        return this;
    }

    public String getOverflow() {
        return this.overflow;
    }

    public LabelOptions setOverflow(String overflow) {
        this.overflow = overflow;
        return this;
    }

    public Integer getPadding() {
        return this.padding;
    }

    public LabelOptions setPadding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public HighchartsShadowOptionsObject getShadow() {
        return this.shadow;
    }

    public LabelOptions setShadow(HighchartsShadowOptionsObject shadow) {
        this.shadow = shadow;
        return this;
    }

    public String getShape() {
        return this.shape;
    }

    public LabelOptions setShape(String shape) {
        this.shape = shape;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style;
    }

    public LabelOptions setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public LabelOptions setText(String text) {
        this.text = text;
        return this;
    }

    public Boolean getUseHTML() {
        return this.useHTML;
    }

    public LabelOptions setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public HighchartsVerticalAlignValue getVerticalAlign() {
        return this.verticalAlign;
    }

    public LabelOptions setVerticalAlign(HighchartsVerticalAlignValue verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public LabelOptions setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    public LabelOptions setY(Integer y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.allowOverlap);
        hash = 17 * hash + Objects.hashCode(this.backgroundColor);
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.borderRadius);
        hash = 17 * hash + Objects.hashCode(this.borderWidth);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.crop);
        hash = 17 * hash + Objects.hashCode(this.distance);
        hash = 17 * hash + Objects.hashCode(this.format);
        hash = 17 * hash + Objects.hashCode(this.formatter);
        hash = 17 * hash + Objects.hashCode(this.overflow);
        hash = 17 * hash + Objects.hashCode(this.padding);
        hash = 17 * hash + Objects.hashCode(this.shadow);
        hash = 17 * hash + Objects.hashCode(this.shape);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.text);
        hash = 17 * hash + Objects.hashCode(this.useHTML);
        hash = 17 * hash + Objects.hashCode(this.verticalAlign);
        hash = 17 * hash + Objects.hashCode(this.x);
        hash = 17 * hash + Objects.hashCode(this.y);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "align:" + align
                + ", allowOverlap:" + allowOverlap
                + ", backgroundColor:" + backgroundColor
                + ", borderColor:" + borderColor
                + ", borderRadius:" + borderRadius
                + ", borderWidth:" + borderWidth
                + ", className:" + className
                + ", crop:" + crop
                + ", distance:" + distance
                + ", format:" + format
                + ", formatter:" + formatter
                + ", overflow:" + overflow
                + ", padding:" + padding
                + ", shadow:" + shadow
                + ", shape:" + shape
                + ", style:" + style
                + ", text:" + text
                + ", useHTML:" + useHTML
                + ", verticalAlign:" + verticalAlign
                + ", x:" + x
                + ", y:" + y
                + '}';
    }


}
