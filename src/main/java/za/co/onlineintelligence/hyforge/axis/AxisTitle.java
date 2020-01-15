package za.co.onlineintelligence.hyforge.axis;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.*;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * AxisTitle HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class AxisTitle implements Serializable, DrosteDeflater {

    public AxisTitle() {
    }

    public AxisTitle(String text) {
        this.text = text;
    }

    /**
     * Alignment of the title relative to the axis values. Possible values are
     * "low", "middle" or "high".
     */
    private HighchartsAxisTitleAlignValue align;

    @Deprecated
    /**
     * Enable Title
     * @deprecated
     * Deprecated. Set the `text` to `null` to disable the title.
     */
    private Boolean enabled;

    /**
     * The pixel distance between the axis labels or line and the title.
     * Defaults to 0 for horizontal axes, 10 for vertical
     */
    private Integer margin;

    /**
     * The distance of the axis title from the axis line. By default, this
     * distance is computed from the offset width of the labels, the labels'
     * distance from the axis and the title's margin. However when the offset
     * option is set, it overrides all this.
     *
     * @since 2.2.0
     */
    private Integer offset;

    /**
     * Defines how the title is repositioned according to the 3D chart
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
     * <p>
     * - `undefined`: Will use the config from `labels.position3d`
     *
     * @since 5.0.15
     */
    private Highcharts3DPosition position3d;

    /**
     * Whether to reserve space for the title when laying out the axis.
     *
     * @since 5.0.11
     */
    private Boolean reserveSpace;

    /**
     * The rotation of the text in degrees. 0 is horizontal, 270 is vertical
     * reading from bottom to top.
     */
    private Integer rotation;

    /**
     * If enabled, the axis title will skewed to follow the perspective.
     * <p>
     * This will fix overlapping labels and titles, but texts become less
     * legible due to the distortion.
     * <p>
     * The final appearance depends heavily on `title.position3d`.
     * <p>
     * A `null` value will use the config from `labels.skew3d`.
     *
     * @since 5.0.15
     */
    private Boolean skew3d;

    /**
     * CSS styles for the title. If the title text is longer than the axis
     * length, it will wrap to multiple lines by default. This can be customized
     * by setting `textOverflow: 'ellipsis'`, by setting a specific `width` or
     * by setting `whiteSpace: 'nowrap'`.
     * <p>
     * In styled mode, the stroke width is given in the `.highcharts-axis-title`
     * class.
     */
    private HighchartsCSS style;

    /**
     * The actual text of the axis title. It can contain basic HTML tags like
     * `b`, `i` and `span` with style.
     */
    private String text;

    /**
     * Alignment of the text, can be `"left"`, `"right"` or `"center"`. Default
     * alignment depends on the [title.align](xAxis.title.align):
     * <p>
     * Horizontal axes: - for `align` = `"low"`, `textAlign` is set to `left` -
     * for `align` = `"middle"`, `textAlign` is set to `center` - for `align` =
     * `"high"`, `textAlign` is set to `right`
     * <p>
     * Vertical axes: - for `align` = `"low"` and `opposite` = `true`,
     * `textAlign` is set to `right` - for `align` = `"low"` and `opposite` =
     * `false`, `textAlign` is set to `left` - for `align` = `"middle"`,
     * `textAlign` is set to `center` - for `align` = `"high"` and `opposite` =
     * `true` `textAlign` is set to `left` - for `align` = `"high"` and
     * `opposite` = `false` `textAlign` is set to `right`
     */
    private HighchartsAlignValue textAlign;

    /**
     * Whether to [use
     * HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
     * to render the axis title.
     */
    private Boolean useHTML;

    /**
     * Horizontal pixel offset of the title position.
     *
     * @since 4.1.6
     */
    private Integer x;

    /**
     * Vertical pixel offset of the title position.
     */
    private Integer y;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsAxisTitleAlignValue getAlign() {
        return getInstanceOf(HighchartsAxisTitleAlignValue.class, this.align);
    }

    public AxisTitle setAlign(HighchartsAxisTitleAlignValue align) {
        this.align = align;
        return this;
    }

    public boolean getEnabled() {
        return getInstanceOf(boolean.class, this.enabled);
    }

    public AxisTitle setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public int getMargin() {
        return getInstanceOf(int.class, this.margin);
    }

    public AxisTitle setMargin(int margin) {
        this.margin = margin;
        return this;
    }

    public int getOffset() {
        return getInstanceOf(int.class, this.offset);
    }

    public AxisTitle setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    public Highcharts3DPosition getPosition3d() {
        return getInstanceOf(Highcharts3DPosition.class, this.position3d);
    }

    public AxisTitle setPosition3d(Highcharts3DPosition position3d) {
        this.position3d = position3d;
        return this;
    }

    public boolean getReserveSpace() {
        return getInstanceOf(boolean.class, this.reserveSpace);
    }

    public AxisTitle setReserveSpace(boolean reserveSpace) {
        this.reserveSpace = reserveSpace;
        return this;
    }

    public int getRotation() {
        return getInstanceOf(int.class, this.rotation);
    }

    public AxisTitle setRotation(int rotation) {
        this.rotation = rotation;
        return this;
    }

    public Boolean getSkew3d() {
        return getInstanceOf(Boolean.class, this.skew3d);
    }

    public AxisTitle setSkew3d(Boolean skew3d) {
        this.skew3d = skew3d;
        return this;
    }

    public HighchartsCSS getStyle() {
        return getInstanceOf(HighchartsCSS.class, this.style);
    }

    public AxisTitle setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public String getText() {
        return getInstanceOf(String.class, this.text);
    }

    public AxisTitle setText(String text) {
        this.text = text;
        if(this.text == null) {
            this.enabled = false;
        }
        return this;
    }

    public HighchartsAlignValue getTextAlign() {
        return getInstanceOf(HighchartsAlignValue.class, this.textAlign);
    }

    public AxisTitle setTextAlign(HighchartsAlignValue textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public boolean getUseHTML() {
        return getInstanceOf(boolean.class, this.useHTML);
    }

    public AxisTitle setUseHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public int getX() {
        return getInstanceOf(int.class, this.x);
    }

    public AxisTitle setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return getInstanceOf(int.class, this.y);
    }

    public AxisTitle setY(int y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.margin);
        hash = 17 * hash + Objects.hashCode(this.offset);
        hash = 17 * hash + Objects.hashCode(this.position3d);
        hash = 17 * hash + Objects.hashCode(this.reserveSpace);
        hash = 17 * hash + Objects.hashCode(this.rotation);
        hash = 17 * hash + Objects.hashCode(this.skew3d);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.text);
        hash = 17 * hash + Objects.hashCode(this.textAlign);
        hash = 17 * hash + Objects.hashCode(this.useHTML);
        hash = 17 * hash + Objects.hashCode(this.x);
        hash = 17 * hash + Objects.hashCode(this.y);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "align:" + align
                + ", enabled:" + enabled
                + ", margin:" + margin
                + ", offset:" + offset
                + ", position3d:" + position3d
                + ", reserveSpace:" + reserveSpace
                + ", rotation:" + rotation
                + ", skew3d:" + skew3d
                + ", style:" + style
                + ", text:" + text
                + ", textAlign:" + textAlign
                + ", useHTML:" + useHTML
                + ", x:" + x
                + ", y:" + y
                + '}';
    }

}
