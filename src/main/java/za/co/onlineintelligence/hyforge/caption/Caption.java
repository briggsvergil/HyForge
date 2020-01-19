package za.co.onlineintelligence.hyforge.caption;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsVerticalAlignValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Caption  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Caption implements Serializable, Exportable {


    public Caption() {
    }

    /**
     * The horizontal alignment of the caption. Can be one of "left",
     * "center" and "right".
     *
     * @since 7.2.0
     */
    private HighchartsAlignValue align;

    /**
     * When the caption is floating, the plot area will not move to make
     * space for it.
     *
     * @since 7.2.0
     */
    private Boolean floating;

    /**
     * The margin between the caption and the plot area.
     *
     * @since 7.2.0
     */
    private Integer margin;

    /**
     * CSS styles for the caption.
     * <p>
     * In styled mode, the caption style is given in the
     * `.highcharts-caption` class.
     *
     * @since 7.2.0
     */
    private HighchartsCSS style;

    /**
     * The caption text of the chart.
     *
     * @since 7.2.0
     */
    private String text;

    /**
     * Whether to
     * [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
     * to render the text.
     *
     * @since 7.2.0
     */
    private Boolean useHTML;

    /**
     * The vertical alignment of the caption. Can be one of `"top"`,
     * `"middle"` and `"bottom"`. When middle, the caption behaves as
     * floating.
     *
     * @since 7.2.0
     */
    private HighchartsVerticalAlignValue verticalAlign;

    /**
     * The x position of the caption relative to the alignment within
     * `chart.spacingLeft` and `chart.spacingRight`.
     *
     * @since 7.2.0
     */
    private Integer x;

    /**
     * The y position of the caption relative to the alignment within
     * `chart.spacingTop` and `chart.spacingBottom`.
     *
     * @since 7.2.0
     */
    private Integer y;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsAlignValue getAlign() {
        return this.align = getInstanceOf(HighchartsAlignValue.class, this.align);
    }

    public Caption setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public Boolean getFloating() {
        return this.floating = getInstanceOf(Boolean.class, this.floating);
    }

    public Caption setFloating(Boolean floating) {
        this.floating = floating;
        return this;
    }

    public Integer getMargin() {
        return this.margin = getInstanceOf(Integer.class, this.margin);
    }

    public Caption setMargin(Integer margin) {
        this.margin = margin;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public Caption setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public String getText() {
        return this.text = getInstanceOf(String.class, this.text);
    }

    public Caption setText(String text) {
        this.text = text;
        return this;
    }

    public Boolean getUseHTML() {
        return this.useHTML = getInstanceOf(Boolean.class, this.useHTML);
    }

    public Caption setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public HighchartsVerticalAlignValue getVerticalAlign() {
        return this.verticalAlign = getInstanceOf(HighchartsVerticalAlignValue.class, this.verticalAlign);
    }

    public Caption setVerticalAlign(HighchartsVerticalAlignValue verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public Integer getX() {
        return this.x = getInstanceOf(Integer.class, this.x);
    }

    public Caption setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return this.y = getInstanceOf(Integer.class, this.y);
    }

    public Caption setY(Integer y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.floating);
        hash = 17 * hash + Objects.hashCode(this.margin);
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
                + ", floating:" + floating
                + ", margin:" + margin
                + ", style:" + style
                + ", text:" + text
                + ", useHTML:" + useHTML
                + ", verticalAlign:" + verticalAlign
                + ", x:" + x
                + ", y:" + y
                + '}';
    }


}