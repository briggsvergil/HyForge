package za.co.onlineintelligence.hyforge.navigation;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsVerticalAlignValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;


/**
 * ButtonOptions HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ButtonOptions implements Serializable, DrosteDeflater {


    public ButtonOptions() {
    }

    /**
     * Alignment for the buttons.
     *
     * @since 2.0.0
     */
    private HighchartsAlignValue align;

    /**
     * The pixel spacing between buttons.
     *
     * @since 2.0.0
     */
    private Integer buttonSpacing;

    /**
     * Whether to enable buttons.
     *
     * @since 2.0.0
     */
    private Boolean enabled;

    /**
     * Pixel height of the buttons.
     *
     * @since 2.0.0
     */
    private Integer height;

    /**
     * Fill color for the symbol within the button.
     *
     * @since 2.0.0
     */
    private HighchartsColor symbolFill;

    /**
     * The pixel size of the symbol on the button.
     *
     * @since 2.0.0
     */
    private Integer symbolSize;

    /**
     * The color of the symbol's stroke or line.
     *
     * @since 2.0.0
     */
    private HighchartsColorString symbolStroke;

    /**
     * The pixel stroke width of the symbol on the button.
     *
     * @since 2.0.0
     */
    private Integer symbolStrokeWidth;

    /**
     * The x position of the center of the symbol inside the button.
     *
     * @since 2.0.0
     */
    private Integer symbolX;

    /**
     * The y position of the center of the symbol inside the button.
     *
     * @since 2.0.0
     */
    private Integer symbolY;

    /**
     * A text string to add to the individual button.
     *
     * @since 3.0.0
     */
    private String text;

    /**
     * A configuration object for the button theme. The object accepts
     * SVG properties like `stroke-width`, `stroke` and `fill`.
     * Tri-state button styles are supported by the `states.hover` and
     * `states.select` objects.
     *
     * @since 3.0.0
     */
    private Theme theme;

    /**
     * The vertical alignment of the buttons. Can be one of `"top"`,
     * `"middle"` or `"bottom"`.
     *
     * @since 2.0.0
     */
    private HighchartsVerticalAlignValue verticalAlign;

    /**
     * The pixel width of the button.
     *
     * @since 2.0.0
     */
    private Integer width;

    /**
     * The vertical offset of the button's position relative to its
     * `verticalAlign`.
     *
     * @since 2.0.0
     */
    private Integer y;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsAlignValue getAlign() {
        return this.align;
    }

    public ButtonOptions setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public Integer getButtonSpacing() {
        return this.buttonSpacing;
    }

    public ButtonOptions setButtonSpacing(Integer buttonSpacing) {
        this.buttonSpacing = buttonSpacing;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ButtonOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    public ButtonOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public HighchartsColor getSymbolFill() {
        return this.symbolFill;
    }

    public ButtonOptions setSymbolFill(HighchartsColor symbolFill) {
        this.symbolFill = symbolFill;
        return this;
    }

    public Integer getSymbolSize() {
        return this.symbolSize;
    }

    public ButtonOptions setSymbolSize(Integer symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public HighchartsColorString getSymbolStroke() {
        return this.symbolStroke;
    }

    public ButtonOptions setSymbolStroke(HighchartsColorString symbolStroke) {
        this.symbolStroke = symbolStroke;
        return this;
    }

    public Integer getSymbolStrokeWidth() {
        return this.symbolStrokeWidth;
    }

    public ButtonOptions setSymbolStrokeWidth(Integer symbolStrokeWidth) {
        this.symbolStrokeWidth = symbolStrokeWidth;
        return this;
    }

    public Integer getSymbolX() {
        return this.symbolX;
    }

    public ButtonOptions setSymbolX(Integer symbolX) {
        this.symbolX = symbolX;
        return this;
    }

    public Integer getSymbolY() {
        return this.symbolY;
    }

    public ButtonOptions setSymbolY(Integer symbolY) {
        this.symbolY = symbolY;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public ButtonOptions setText(String text) {
        this.text = text;
        return this;
    }

    public Theme getTheme() {
        return this.theme;
    }

    public ButtonOptions setTheme(Theme theme) {
        this.theme = theme;
        return this;
    }

    public HighchartsVerticalAlignValue getVerticalAlign() {
        return this.verticalAlign;
    }

    public ButtonOptions setVerticalAlign(HighchartsVerticalAlignValue verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public ButtonOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    public ButtonOptions setY(Integer y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.buttonSpacing);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.height);
        hash = 17 * hash + Objects.hashCode(this.symbolFill);
        hash = 17 * hash + Objects.hashCode(this.symbolSize);
        hash = 17 * hash + Objects.hashCode(this.symbolStroke);
        hash = 17 * hash + Objects.hashCode(this.symbolStrokeWidth);
        hash = 17 * hash + Objects.hashCode(this.symbolX);
        hash = 17 * hash + Objects.hashCode(this.symbolY);
        hash = 17 * hash + Objects.hashCode(this.text);
        hash = 17 * hash + Objects.hashCode(this.theme);
        hash = 17 * hash + Objects.hashCode(this.verticalAlign);
        hash = 17 * hash + Objects.hashCode(this.width);
        hash = 17 * hash + Objects.hashCode(this.y);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "align:" + align
                + ", buttonSpacing:" + buttonSpacing
                + ", enabled:" + enabled
                + ", height:" + height
                + ", symbolFill:" + symbolFill
                + ", symbolSize:" + symbolSize
                + ", symbolStroke:" + symbolStroke
                + ", symbolStrokeWidth:" + symbolStrokeWidth
                + ", symbolX:" + symbolX
                + ", symbolY:" + symbolY
                + ", text:" + text
                + ", theme:" + theme
                + ", verticalAlign:" + verticalAlign
                + ", width:" + width
                + ", y:" + y
                + '}';
    }


}