package za.co.onlineintelligence.hyforge.subtitle;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;
import za.co.onlineintelligence.hyforge.common.enums.*;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean Briggs
 */
public class Subtitle implements Serializable, Exportable {

    public Subtitle() {
    }

    public Subtitle(String text) {
        this.text = text;
    }

    /**
     * The horizontal alignment of the subtitle. Can be one of "left", "center"
     * and "right".
     *
     * @since 2.0.0
     */
    private HighchartsAlignValue align;

    /**
     * When the subtitle is floating, the plot area will not move to make space
     * for it.
     *
     * @since 2.1.0
     */
    private Boolean floating;

    /**
     * CSS styles for the title.
     * <p>
     * In styled mode, the subtitle style is given in the `.highcharts-subtitle`
     * class.
     */
    private HighchartsCSS style;

    /**
     * The subtitle of the chart.
     */
    private String text;

    /**
     * Whether to [use
     * HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
     * to render the text.
     */
    private Boolean useHTML;

    /**
     * The vertical alignment of the title. Can be one of `"top"`, `"middle"`
     * and `"bottom"`. When middle, the subtitle behaves as floating.
     *
     * @since 2.1.0
     */
    private HighchartsVerticalAlignValue verticalAlign;

    /**
     * Adjustment made to the subtitle width, normally to reserve space for the
     * exporting burger menu.
     *
     * @since 4.2.5
     */
    private Integer widthAdjust;

    /**
     * The x position of the subtitle relative to the alignment within
     * `chart.spacingLeft` and `chart.spacingRight`.
     *
     * @since 2.0.0
     */
    private Integer x;

    /**
     * The y position of the subtitle relative to the alignment within
     * `chart.spacingTop` and `chart.spacingBottom`. By default the subtitle is
     * laid out below the title unless the title is floating.
     *
     * @since 2.0.0
     */
    private Integer y;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsAlignValue getAlign() {
        return this.align = getInstanceOf(HighchartsAlignValue.class, this.align);
    }

    public Subtitle setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public boolean getFloating() {
        return this.floating = getInstanceOf(boolean.class, this.floating);
    }

    public Subtitle setFloating(boolean floating) {
        this.floating = floating;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public Subtitle setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public String getText() {
        return this.text = getInstanceOf(String.class, this.text);
    }

    public Subtitle setText(String text) {
        this.text = text;
        return this;
    }

    public boolean getUseHTML() {
        return this.useHTML = getInstanceOf(boolean.class, this.useHTML);
    }

    public Subtitle setUseHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public HighchartsVerticalAlignValue getVerticalAlign() {
        return this.verticalAlign = getInstanceOf(HighchartsVerticalAlignValue.class, this.verticalAlign);
    }

    public Subtitle setVerticalAlign(HighchartsVerticalAlignValue verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public int getWidthAdjust() {
        return this.widthAdjust = getInstanceOf(int.class, this.widthAdjust);
    }

    public Subtitle setWidthAdjust(int widthAdjust) {
        this.widthAdjust = widthAdjust;
        return this;
    }

    public int getX() {
        return this.x = getInstanceOf(int.class, this.x);
    }

    public Subtitle setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return this.y = getInstanceOf(int.class, this.y);
    }

    public Subtitle setY(int y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.floating);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.text);
        hash = 17 * hash + Objects.hashCode(this.useHTML);
        hash = 17 * hash + Objects.hashCode(this.verticalAlign);
        hash = 17 * hash + Objects.hashCode(this.widthAdjust);
        hash = 17 * hash + Objects.hashCode(this.x);
        hash = 17 * hash + Objects.hashCode(this.y);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "align:" + align
                + ", floating:" + floating
                + ", style:" + style
                + ", text:" + text
                + ", useHTML:" + useHTML
                + ", verticalAlign:" + verticalAlign
                + ", widthAdjust:" + widthAdjust
                + ", x:" + x
                + ", y:" + y
                + '}';
    }

}
