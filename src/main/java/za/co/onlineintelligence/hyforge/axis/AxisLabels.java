package za.co.onlineintelligence.hyforge.axis;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * AxisLabels HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class AxisLabels implements Serializable, Exportable {

    public AxisLabels() {
    }

    /**
     * What part of the string the given position is anchored to. If `left`, the
     * left side of the string is at the axis position. Can be one of `"left"`,
     * `"center"` or `"right"`. Defaults to an intelligent guess based on which
     * side of the chart the axis is on and the rotation of the label.
     */
    private HighchartsAlignValue align;

    /**
     * For horizontal axes, the allowed degrees of label rotation to prevent
     * overlapping labels. If there is enough space, labels are not rotated. As
     * the chart gets narrower, it will start rotating the labels -45 degrees,
     * then remove every second label and try again with rotations 0 and -45
     * etc. Set it to `false` to disable rotation, which will cause the labels
     * to word-wrap if possible.
     *
     * @since 4.1.0
     */
    private HighchartsRotation autoRotation;

    /**
     * When each category width is more than this many pixels, we don't apply
     * auto rotation. Instead, we lay out the axis label with word wrap. A lower
     * limit makes sense when the label contains multiple short words that don't
     * extend the available horizontal space for each label.
     *
     * @since 4.1.5
     */
    private Integer autoRotationLimit;

    /**
     * Polar charts only. The label's pixel distance from the perimeter of the
     * plot area.
     */
    private Integer distance;

    /**
     * Enable or disable the axis labels.
     */
    private Boolean enabled;

    /**
     * A [format
     * string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting)
     * for the axis label.
     *
     * @since 3.0.0
     */
    private String format;

    /**
     * Callback JavaScript function to format the label. The value is given by
     * `this.value`. Additional properties for `this` are `axis`, `chart`,
     * `isFirst` and `isLast`. The value of the default label formatter can be
     * retrieved by calling `this.axis.defaultLabelFormatter.call(this)` within
     * the function.
     * <p>
     * Defaults .value; = to:>.class,  ```js function() { return getInstanceOf(this.value; } ``)`
     */
    private HighchartsCallbackFunction formatter;

    /**
     * The number of pixels to indent the labels per level in a treegrid axis.
     */
    private Integer indentation;

    /**
     * Horizontal axis only. When `staggerLines` is not set, `maxStaggerLines`
     * defines how many lines the axis is allowed to add to automatically avoid
     * overlapping X labels. Set to `1` to disable overlap detection.
     *
     * @since 1.3.3
     */
    private Integer maxStaggerLines;

    /**
     * How to handle overflowing labels on horizontal axis. If set to `"allow"`,
     * it will not be aligned at all. By default it `"justify"` labels inside
     * the chart area. If there is room to move it, it will be aligned to the
     * edge, else it will be removed.
     *
     * @since 2.2.5
     */
    private String overflow;

    /**
     * The pixel padding for axis labels, to ensure white space between them.
     */
    private Integer padding;

    /**
     * Defines how the labels are be repositioned according to the 3D chart
     * orientation.
     * <p>
     * - `'offset'`: Maintain a fixed horizontal/vertical distance from the tick
     * marks, despite the chart orientation. This is the backwards compatible
     * behavior, and causes skewing of X and Z axes.
     * <p>
     * - `'chart'`: Preserve 3D position relative to the chart. This looks nice,
     * but hard to read if the text isn't forward-facing.
     * <p>
     * - `'flap'`: Rotated text along the axis to compensate for the chart
     * orientation. This tries to maintain text as legible as possible on all
     * orientations.
     * <p>
     * - `'ortho'`: Rotated text along the axis direction so that the labels are
     * orthogonal to the axis. This is very similar to `'flap'`, but prevents
     * skewing the labels (X and Y scaling are still present).
     *
     * @since 5.0.15
     */
    private String position3d;

    /**
     * Whether to reserve space for the labels. By default, space is reserved
     * for the labels in these cases:
     * <p>
     * On all horizontal axes. On vertical axes if `label.align` is `right` on a
     * left-side axis or `left` on a right-side axis. On vertical axes if
     * `label.align` is `center`.
     * <p>
     * This can be turned off when for example the labels are rendered inside
     * the plot area instead of outside.
     *
     * @since 4.1.10
     */
    private Boolean reserveSpace;

    /**
     * Rotation of the labels in degrees.
     */
    private Double rotation;

    /**
     * If enabled, the axis labels will skewed to follow the perspective.
     * <p>
     * This will fix overlapping labels and titles, but texts become less
     * legible due to the distortion.
     * <p>
     * The final appearance depends heavily on `labels.position3d`.
     *
     * @since 5.0.15
     */
    private Boolean skew3d;

    /**
     * Horizontal axes only. The number of lines to spread the labels over to
     * make room or tighter labels.
     *
     * @since 2.1.0
     */
    private Integer staggerLines;

    /**
     * To show only every _n_'th label on the axis, set the step to _n_. Setting
     * the step to 2 shows every other label.
     * <p>
     * By default, the step is calculated automatically to avoid overlap. To
     * prevent this, set it to 1\. This usually only happens on a category axis,
     * and is often a sign that you have chosen the wrong axis type.
     * <p>
     * Read more at [axis
     * docs](https://www.highcharts.com/docs/chart-concepts/axes) => What axis
     * should I use?
     *
     * @since 2.1.0
     */
    private Integer step;

    /**
     * CSS styles for the label. Use `whiteSpace: 'nowrap'` to prevent wrapping
     * of category labels. Use `textOverflow: 'none'` to prevent ellipsis
     * (dots).
     * <p>
     * In styled mode, the labels are styled with the `.highcharts-axis-labels`
     * class.
     */
    private HighchartsCSS style;

    /**
     * Whether to [use
     * HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
     * to render the labels.
     */
    private Boolean useHTML;

    /**
     * The x position offset of the label relative to the tick position on the
     * axis.
     */
    private Integer x;

    /**
     * The y position offset of the label relative to the tick position on the
     * axis. The default makes it adapt to the font size on bottom axis.
     */
    private Integer y;

    /**
     * The Z index for the axis labels.
     */
    private Integer zIndex;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsAlignValue getAlign() {
        return this.align = getInstanceOf(HighchartsAlignValue.class, this.align);
    }

    public AxisLabels setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public HighchartsRotation getAutoRotation() {
        return this.autoRotation = getInstanceOf(HighchartsRotation.class, this.autoRotation);
    }

    public AxisLabels setAutoRotation(HighchartsRotation autoRotation) {
        this.autoRotation = autoRotation;
        return this;
    }

    public int getAutoRotationLimit() {
        return this.autoRotationLimit = getInstanceOf(int.class, this.autoRotationLimit);
    }

    public AxisLabels setAutoRotationLimit(int autoRotationLimit) {
        this.autoRotationLimit = autoRotationLimit;
        return this;
    }

    public int getDistance() {
        return this.distance = getInstanceOf(int.class, this.distance);
    }

    public AxisLabels setDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public boolean getEnabled() {
        return this.enabled = getInstanceOf(boolean.class, this.enabled);
    }

    public AxisLabels setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getFormat() {
        return this.format = getInstanceOf(String.class, this.format);
    }

    public AxisLabels setFormat(String format) {
        this.format = format;
        return this;
    }

    public HighchartsCallbackFunction getFormatter() {
        return this.formatter = getInstanceOf(HighchartsCallbackFunction.class, this.formatter);
    }

    public AxisLabels setFormatter(HighchartsCallbackFunction formatter) {
        this.formatter = formatter;
        return this;
    }

    public int getIndentation() {
        return this.indentation = getInstanceOf(int.class, this.indentation);
    }

    public AxisLabels setIndentation(int indentation) {
        this.indentation = indentation;
        return this;
    }

    public int getMaxStaggerLines() {
        return this.maxStaggerLines = getInstanceOf(int.class, this.maxStaggerLines);
    }

    public AxisLabels setMaxStaggerLines(int maxStaggerLines) {
        this.maxStaggerLines = maxStaggerLines;
        return this;
    }

    public String getOverflow() {
        return this.overflow = getInstanceOf(String.class, this.overflow);
    }

    public AxisLabels setOverflow(String overflow) {
        this.overflow = overflow;
        return this;
    }

    public int getPadding() {
        return this.padding = getInstanceOf(int.class, this.padding);
    }

    public AxisLabels setPadding(int padding) {
        this.padding = padding;
        return this;
    }

    public String getPosition3d() {
        return this.position3d = getInstanceOf(String.class, this.position3d);
    }

    public AxisLabels setPosition3d(String position3d) {
        this.position3d = position3d;
        return this;
    }

    public boolean getReserveSpace() {
        return this.reserveSpace = getInstanceOf(boolean.class, this.reserveSpace);
    }

    public AxisLabels setReserveSpace(boolean reserveSpace) {
        this.reserveSpace = reserveSpace;
        return this;
    }

    public double getRotation() {
        return this.rotation = getInstanceOf(double.class, this.rotation);
    }

    public AxisLabels setRotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public boolean getSkew3d() {
        return this.skew3d = getInstanceOf(boolean.class, this.skew3d);
    }

    public AxisLabels setSkew3d(boolean skew3d) {
        this.skew3d = skew3d;
        return this;
    }

    public int getStaggerLines() {
        return this.staggerLines = getInstanceOf(int.class, this.staggerLines);
    }

    public AxisLabels setStaggerLines(int staggerLines) {
        this.staggerLines = staggerLines;
        return this;
    }

    public int getStep() {
        return this.step = getInstanceOf(int.class, this.step);
    }

    public AxisLabels setStep(int step) {
        this.step = step;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public AxisLabels setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public boolean getUseHTML() {
        return this.useHTML = getInstanceOf(boolean.class, this.useHTML);
    }

    public AxisLabels setUseHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public int getX() {
        return this.x = getInstanceOf(int.class, this.x);
    }

    public AxisLabels setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return this.y = getInstanceOf(int.class, this.y);
    }

    public AxisLabels setY(int y) {
        this.y = y;
        return this;
    }

    public int getZIndex() {
        return this.zIndex = getInstanceOf(int.class, this.zIndex);
    }

    public AxisLabels setZIndex(int zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.autoRotation);
        hash = 17 * hash + Objects.hashCode(this.autoRotationLimit);
        hash = 17 * hash + Objects.hashCode(this.distance);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.format);
        hash = 17 * hash + Objects.hashCode(this.formatter);
        hash = 17 * hash + Objects.hashCode(this.indentation);
        hash = 17 * hash + Objects.hashCode(this.maxStaggerLines);
        hash = 17 * hash + Objects.hashCode(this.overflow);
        hash = 17 * hash + Objects.hashCode(this.padding);
        hash = 17 * hash + Objects.hashCode(this.position3d);
        hash = 17 * hash + Objects.hashCode(this.reserveSpace);
        hash = 17 * hash + Objects.hashCode(this.rotation);
        hash = 17 * hash + Objects.hashCode(this.skew3d);
        hash = 17 * hash + Objects.hashCode(this.staggerLines);
        hash = 17 * hash + Objects.hashCode(this.step);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.useHTML);
        hash = 17 * hash + Objects.hashCode(this.x);
        hash = 17 * hash + Objects.hashCode(this.y);
        hash = 17 * hash + Objects.hashCode(this.zIndex);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "align:" + align
                + ", autoRotation:" + autoRotation
                + ", autoRotationLimit:" + autoRotationLimit
                + ", distance:" + distance
                + ", enabled:" + enabled
                + ", format:" + format
                + ", formatter:" + formatter
                + ", indentation:" + indentation
                + ", maxStaggerLines:" + maxStaggerLines
                + ", overflow:" + overflow
                + ", padding:" + padding
                + ", position3d:" + position3d
                + ", reserveSpace:" + reserveSpace
                + ", rotation:" + rotation
                + ", skew3d:" + skew3d
                + ", staggerLines:" + staggerLines
                + ", step:" + step
                + ", style:" + style
                + ", useHTML:" + useHTML
                + ", x:" + x
                + ", y:" + y
                + ", zIndex:" + zIndex
                + '}';
    }
}
