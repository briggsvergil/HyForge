package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsVerticalAlignValue;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean
 */
public class HighchartsLabel implements Serializable, Exportable {

    public HighchartsLabel() {
    }

    /**
     * Horizontal alignment of the label. Can be one of "left", "center" or
     * "right".
     *
     * @since 2.1.0
     */
    private HighchartsAlignValue align;

    /**
     * Rotation of the text label in degrees .
     *
     * @since 2.1.0
     */
    private Integer rotation;

    /**
     * CSS styles for the text label.
     * <p>
     * In styled mode, the labels are styled by the
     * `.highcharts-plot-band-label` class.
     *
     * @since 2.1.0
     */
    private HighchartsCSS style;

    /**
     * The string text itself. A subset of HTML is supported.
     *
     * @since 2.1.0
     */
    private String text;

    /**
     * The text alignment for the label. While `align` determines where the
     * texts anchor point is placed within the plot band, `textAlign` determines
     * how the text is aligned against its anchor point. Possible values are
     * "left", "center" and "right". Defaults to the same as the `align` option.
     *
     * @since 2.1.0
     */
    private HighchartsAlignValue textAlign;

    /**
     * Whether to [use
     * HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
     * to render the labels.
     *
     * @since 3.0.3
     */
    private Boolean useHTML;

    /**
     * Vertical alignment of the label relative to the plot band. Can be one of
     * "top", "middle" or "bottom".
     *
     * @since 2.1.0
     */
    private HighchartsVerticalAlignValue verticalAlign;

    /**
     * Horizontal position relative the alignment. Default varies by
     * orientation.
     *
     * @since 2.1.0
     */
    private Integer x;

    /**
     * Vertical position of the text baseline relative to the alignment. Default
     * varies by orientation.
     *
     * @since 2.1.0
     */
    private Integer y;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsAlignValue getAlign() {
        return this.align = getInstanceOf(HighchartsAlignValue.class, this.align);
    }

    public HighchartsLabel setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public int getRotation() {
        return this.rotation = getInstanceOf(int.class, this.rotation);
    }

    public HighchartsLabel setRotation(int rotation) {
        this.rotation = rotation;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public HighchartsLabel setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public String getText() {
        return this.text = getInstanceOf(String.class, this.text);
    }

    public HighchartsLabel setText(String text) {
        this.text = text;
        return this;
    }

    public HighchartsAlignValue getTextAlign() {
        return this.textAlign = getInstanceOf(HighchartsAlignValue.class, this.textAlign);
    }

    public HighchartsLabel setTextAlign(HighchartsAlignValue textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public boolean getUseHTML() {
        return this.useHTML = getInstanceOf(boolean.class, this.useHTML);
    }

    public HighchartsLabel setUseHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public HighchartsVerticalAlignValue getVerticalAlign() {
        return this.verticalAlign = getInstanceOf(HighchartsVerticalAlignValue.class, this.verticalAlign);
    }

    public HighchartsLabel setVerticalAlign(HighchartsVerticalAlignValue verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public int getX() {
        return this.x = getInstanceOf(int.class, this.x);
    }

    public HighchartsLabel setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return this.y = getInstanceOf(int.class, this.y);
    }

    public HighchartsLabel setY(int y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.rotation);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.text);
        hash = 17 * hash + Objects.hashCode(this.textAlign);
        hash = 17 * hash + Objects.hashCode(this.useHTML);
        hash = 17 * hash + Objects.hashCode(this.verticalAlign);
        hash = 17 * hash + Objects.hashCode(this.x);
        hash = 17 * hash + Objects.hashCode(this.y);

        return hash;
    }

    @Override
    public String toString() {
        return "align:" + align
                + ", rotation:" + rotation
                + ", style:" + style
                + ", text:" + text
                + ", textAlign:" + textAlign
                + ", useHTML:" + useHTML
                + ", verticalAlign:" + verticalAlign
                + ", x:" + x
                + ", y:" + y;
    }

}
