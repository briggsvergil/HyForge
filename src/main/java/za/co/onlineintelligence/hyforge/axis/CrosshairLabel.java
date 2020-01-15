/*
 */
package za.co.onlineintelligence.hyforge.axis;
//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * CrosshairLabel HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class CrosshairLabel implements Serializable, DrosteDeflater {

    public CrosshairLabel() {
    }

    /**
     * Alignment of the label compared to the axis. Defaults to `"left"` for
     * right-side axes, `"right"` for left-side axes and `"center"` for
     * horizontal axes.
     *
     * @since 4.1.0
     */
    private HighchartsAlignValue align;

    /**
     * The background color for the label. Defaults to the related series color,
     * or `#666666` if that is not available.
     *
     * @since 4.1.0
     */
    private HighchartsColor backgroundColor;

    /**
     * The border color for the crosshair label
     *
     * @since 4.1.0
     */
    private HighchartsColor borderColor;

    /**
     * The border corner radius of the crosshair label.
     *
     * @since 4.1.0
     */
    private int borderRadius;

    /**
     * The border width for the crosshair label.
     *
     * @since 4.1.0
     */
    private int borderWidth;

    /**
     * Flag to enable crosshair's label.
     *
     * @since 4.1.0
     */
    private boolean enabled;

    /**
     * A format string for the crosshair label. Defaults to `{value}` for
     * numeric axes and `{value:%b %d, %Y}` for datetime axes.
     *
     * @since 4.1.0
     */
    private String format;

    /**
     * Formatter function for the label text.
     *
     * @since 4.1.0
     */
    private HighchartsCallbackFunction formatter;

    /**
     * Padding inside the crosshair label.
     *
     * @since 4.1.0
     */
    private int padding;

    /**
     * The shape to use for the label box.
     *
     * @since 4.1.0
     */
    private String shape;

    /**
     * Text styles for the crosshair label.
     *
     * @since 4.1.0
     */
    private HighchartsCSS style;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsAlignValue getAlign() {
        return this.align = getInstanceOf(HighchartsAlignValue.class, this.align);
    }

    public CrosshairLabel setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public HighchartsColor getBackgroundColor() {
        return this.backgroundColor = getInstanceOf(HighchartsColor.class, this.backgroundColor);
    }

    public CrosshairLabel setBackgroundColor(HighchartsColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public HighchartsColor getBorderColor() {
        return this.borderColor = getInstanceOf(HighchartsColor.class, this.borderColor);
    }

    public CrosshairLabel setBorderColor(HighchartsColor borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public int getBorderRadius() {
        return this.borderRadius = getInstanceOf(int.class, this.borderRadius);
    }

    public CrosshairLabel setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public int getBorderWidth() {
        return this.borderWidth = getInstanceOf(int.class, this.borderWidth);
    }

    public CrosshairLabel setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public boolean getEnabled() {
        return this.enabled = getInstanceOf(boolean.class, this.enabled);
    }

    public CrosshairLabel setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getFormat() {
        return this.format = getInstanceOf(String.class, this.format);
    }

    public CrosshairLabel setFormat(String format) {
        this.format = format;
        return this;
    }

    public HighchartsCallbackFunction getFormatter() {
        return this.formatter = getInstanceOf(HighchartsCallbackFunction.class, this.formatter);
    }

    public CrosshairLabel setFormatter(HighchartsCallbackFunction formatter) {
        this.formatter = formatter;
        return this;
    }

    public int getPadding() {
        return this.padding = getInstanceOf(int.class, this.padding);
    }

    public CrosshairLabel setPadding(int padding) {
        this.padding = padding;
        return this;
    }

    public String getShape() {
        return this.shape = getInstanceOf(String.class, this.shape);
    }

    public CrosshairLabel setShape(String shape) {
        this.shape = shape;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public CrosshairLabel setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.backgroundColor);
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.borderRadius);
        hash = 17 * hash + Objects.hashCode(this.borderWidth);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.format);
        hash = 17 * hash + Objects.hashCode(this.formatter);
        hash = 17 * hash + Objects.hashCode(this.padding);
        hash = 17 * hash + Objects.hashCode(this.shape);
        hash = 17 * hash + Objects.hashCode(this.style);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "align:" + align
                + ", backgroundColor:" + backgroundColor
                + ", borderColor:" + borderColor
                + ", borderRadius:" + borderRadius
                + ", borderWidth:" + borderWidth
                + ", enabled:" + enabled
                + ", format:" + format
                + ", formatter:" + formatter
                + ", padding:" + padding
                + ", shape:" + shape
                + ", style:" + style
                + '}';
    }

}
