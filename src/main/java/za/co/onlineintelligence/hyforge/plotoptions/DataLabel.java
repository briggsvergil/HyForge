/*
 */
package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.*;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * DataLabels HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class DataLabel implements Serializable, DrosteDeflater {

    public DataLabel() {
    }

    /**
     * The alignment of the data label compared to the point. If `right`, the
     * right side of the label should be touching the point. For points with an
     * extent, like columns, the alignments also dictates how to align it inside
     * the box, as given with the
     * [inside](#plotOptions.column.dataLabels.inside) option. Can be one of
     * `left`, `center` or `right`.
     */
    private HighchartsAlignValue align;

    /**
     * Whether to allow data labels to overlap. To make the labels less
     * sensitive for overlapping, the
     * [dataLabels.padding](#plotOptions.series.dataLabels.padding) can be set
     * to 0.
     *
     * @since 4.1.0
     */
    private Boolean allowOverlap;

    /**
     * The background color or gradient for the data label.
     *
     * @since 2.2.1
     */
    private HighchartsColor backgroundColor;

    /**
     * The border color for the data label. Defaults to `undefined`.
     *
     * @since 2.2.1
     */
    private HighchartsColor borderColor;

    /**
     * The border radius in pixels for the data label.
     *
     * @since 2.2.1
     */
    private Integer borderRadius;

    /**
     * The border width in pixels for the data label.
     *
     * @since 2.2.1
     */
    private Integer borderWidth;

    /**
     * A class name for the data label. Particularly in styled mode, this can be
     * used to give each series' or point's data label unique styling. In
     * addition to this option, a default color class name is added so that we
     * can give the labels a contrast text shadow.
     *
     * @since 5.0.0
     */
    private String className;

    /**
     * The text color for the data labels. Defaults to `undefined`. For certain
     * series types, like column or map, the data labels can be drawn inside the
     * points. In this case the data label will be drawn with maximum contrast
     * by default. Additionally, it will be given a `text-outline` style with
     * the opposite color, to further increase the contrast. This can be
     * overridden by setting the `text-outline` style to `none` in the
     * `dataLabels.style` option.
     */
    private HighchartsColor color;

    /**
     * Whether to hide data labels that are outside the plot area. By default,
     * the data label is moved inside the plot area according to the
     * [overflow](#plotOptions.series.dataLabels.overflow) option.
     *
     * @since 2.3.3
     */
    private Boolean crop;

    /**
     * Whether to defer displaying the data labels until the initial series
     * animation has finished.
     *
     * @since 4.0.0
     */
    private Boolean defer;

    /**
     * Enable or disable the data labels.
     */
    private Boolean enabled;

    /**
     * A declarative filter to control of which data labels to display. The
     * declarative filter is designed for use when callback functions are not
     * available, like when the chart options require a pure JSON structure or
     * for use with graphical editors. For programmatic control, use the
     * `formatter` instead, and return `undefined` to disable a single data
     * label.
     *
     * @since 6.0.3
     */
    private Filter filter;

    /**
     * A
     * [format
     * string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting)
     * for the data label. Available variables are the same as for `formatter`.
     *
     * @since 3.0.0
     */
    private String format;

    /**
     * Callback JavaScript function to format the data label. Note that if a
     * `format` is defined, the format takes precedence and the formatter is
     * ignored.
     */
    private HighchartsCallbackFunction formatter;

    /**
     * For points with an extent, like columns or map areas, whether to align
     * the data label inside the box or to the actual value point. Defaults to
     * `false` in most cases, `true` in stacked columns.
     *
     * @since 3.0.0
     */
    private Boolean inside;

    /**
     * Format for points with the value of null. Works analogously to
     * [format](#plotOptions.series.dataLabels.format). `nullFormat` can be
     * applied only to series which support displaying null points.
     *
     * @since 7.1.0
     */
    private String nullFormat;

    /**
     * Callback JavaScript function that defines formatting for points with the
     * value of null. Works analogously to
     * [formatter](#plotOptions.series.dataLabels.formatter).
     * `nullPointFormatter` can be applied only to series which support
     * displaying null points.
     *
     * @since 7.1.0
     */
    private HighchartsCallbackFunction nullFormatter;

    /**
     * How to handle data labels that flow outside the plot area. The default is
     * `"justify"`, which aligns them inside the plot area. For columns and
     * bars, this means it will be moved inside the bar. To display data labels
     * outside the plot area, set `crop` to `false` and `overflow` to `"allow"`.
     *
     * @since 3.0.6
     */
    private HighchartsDataLabelsOverflowValue overflow;

    /**
     * When either the `borderWidth` or the `backgroundColor` is set, this is
     * the padding within the box.
     *
     * @since 2.2.1
     */
    private Integer padding;

    /**
     * Aligns data labels relative to points. If `center` alignment is not
     * possible, it defaults to `right`.
     */
    private HighchartsAlignValue position;

    /**
     * Text rotation in degrees. Note that due to a more complex structure,
     * backgrounds, borders and padding will be lost on a rotated data label.
     */
    private Integer rotation;

    /**
     * The shadow of the box. Works best with `borderWidth` or
     * `backgroundColor`. Since 2.3 the shadow can be an object configuration
     * containing `color`, `offsetX`, `offsetY`, `opacity` and `width`.
     *
     * @since 2.2.1
     */
    private HighchartsShadowOptionsObject shadow;

    /**
     * The name of a symbol to use for the border around the label. Symbols are
     * predefined functions on the Renderer object.
     *
     * @since 4.1.2
     */
    private String shape;

    /**
     * Styles for the label. The default `color` setting is `"contrast"`, which
     * is a pseudo color that Highcharts picks up and applies the maximum
     * contrast to the underlying point item, for example the bar in a bar
     * chart.
     * <p>
     * The `textOutline` is a pseudo property that applies an outline of the
     * given width with the given color, which by default is the maximum
     * contrast to the text. So a bright text color will result in a black text
     * outline for maximum readability on a mixed background. In some cases,
     * especially with grayscale text, the text outline doesn't work well, in
     * which cases it can be disabled by setting it to `"none"`. When `useHTML`
     * is true, the `textOutline` will not be picked up. In this, case, the same
     * effect can be acheived through the `text-shadow` CSS property.
     * <p>
     * For some series types, where each point has an extent, like for example
     * tree maps, the data label may overflow the point. There are two
     * strategies for handling overflow. By default, the text will wrap to
     * multiple lines. The other strategy is to set `style.textOverflow` to
     * `ellipsis`, which will keep the text on one line plus it will break
     * inside long words.
     *
     * @since 4.1.0
     */
    private HighchartsCSS style;

    /**
     * Options for a label text which should follow marker's shape. Border and
     * background are disabled for a label that follows a path.
     * <p>
     * *Note:** Only SVG-based renderer supports this option. Setting `useHTML`
     * to true will disable this option.
     *
     * @since 7.1.0
     */
    private TextPath textPath;

    /**
     * Whether to [use
     * HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
     * to render the labels.
     */
    private Boolean useHTML;

    /**
     * The vertical alignment of a data label. Can be one of `top`, `middle` or
     * `bottom`. The default value depends on the data, for instance in a column
     * chart, the label is above positive values and below negative values.
     *
     * @since 2.3.3
     */
    private HighchartsVerticalAlignValue verticalAlign;

    /**
     * The x position offset of the label relative to the point in pixels.
     */
    private Integer x;

    /**
     * The y position offset of the label relative to the point in pixels.
     */
    private Integer y;

    /**
     * The Z index of the data labels. The default Z index puts it above the
     * series. Use a Z index of 2 to display it behind the series.
     *
     * @since 2.3.5
     */
    private Integer z;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsAlignValue getAlign() {
        return this.align = getInstanceOf(HighchartsAlignValue.class, this.align);
    }

    public DataLabel setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public boolean getAllowOverlap() {
        return this.allowOverlap = getInstanceOf(boolean.class, this.allowOverlap);
    }

    public DataLabel setAllowOverlap(boolean allowOverlap) {
        this.allowOverlap = allowOverlap;
        return this;
    }

    public HighchartsColor getBackgroundColor() {
        return this.backgroundColor = getInstanceOf(HighchartsColor.class, this.backgroundColor);
    }

    public DataLabel setBackgroundColor(HighchartsColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public HighchartsColor getBorderColor() {
        return this.borderColor = getInstanceOf(HighchartsColor.class, this.borderColor);
    }

    public DataLabel setBorderColor(HighchartsColor borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public int getBorderRadius() {
        return this.borderRadius = getInstanceOf(int.class, this.borderRadius);
    }

    public DataLabel setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public int getBorderWidth() {
        return this.borderWidth = getInstanceOf(int.class, this.borderWidth);
    }

    public DataLabel setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String getClassName() {
        return this.className = getInstanceOf(String.class, this.className);
    }

    public DataLabel setClassName(String className) {
        this.className = className;
        return this;
    }

    public HighchartsColor getColor() {
        return this.color = getInstanceOf(HighchartsColor.class, this.color);
    }

    public DataLabel setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public boolean getCrop() {
        return this.crop = getInstanceOf(boolean.class, this.crop);
    }

    public DataLabel setCrop(boolean crop) {
        this.crop = crop;
        return this;
    }

    public boolean getDefer() {
        return this.defer = getInstanceOf(boolean.class, this.defer);
    }

    public DataLabel setDefer(boolean defer) {
        this.defer = defer;
        return this;
    }

    public boolean getEnabled() {
        return this.enabled = getInstanceOf(boolean.class, this.enabled);
    }

    public DataLabel setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Filter getFilter() {
        return this.filter = getInstanceOf(Filter.class, this.filter);
    }

    public DataLabel setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public String getFormat() {
        return this.format = getInstanceOf(String.class, this.format);
    }

    public DataLabel setFormat(String format) {
        this.format = format;
        return this;
    }

    public HighchartsCallbackFunction getFormatter() {
        return this.formatter = getInstanceOf(HighchartsCallbackFunction.class, this.formatter);
    }

    public DataLabel setFormatter(HighchartsCallbackFunction formatter) {
        this.formatter = formatter;
        return this;
    }

    public boolean getInside() {
        return this.inside = getInstanceOf(boolean.class, this.inside);
    }

    public DataLabel setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    public String getNullFormat() {
        return this.nullFormat = getInstanceOf(String.class, this.nullFormat);
    }

    public DataLabel setNullFormat(String nullFormat) {
        this.nullFormat = nullFormat;
        return this;
    }

    public HighchartsCallbackFunction getNullFormatter() {
        return this.nullFormatter = getInstanceOf(HighchartsCallbackFunction.class, this.nullFormatter);
    }

    public DataLabel setNullFormatter(HighchartsCallbackFunction nullFormatter) {
        this.nullFormatter = nullFormatter;
        return this;
    }

    public HighchartsDataLabelsOverflowValue getOverflow() {
        return this.overflow = getInstanceOf(HighchartsDataLabelsOverflowValue.class, this.overflow);
    }

    public DataLabel setOverflow(HighchartsDataLabelsOverflowValue overflow) {
        this.overflow = overflow;
        return this;
    }

    public int getPadding() {
        return this.padding = getInstanceOf(int.class, this.padding);
    }

    public DataLabel setPadding(int padding) {
        this.padding = padding;
        return this;
    }

    public HighchartsAlignValue getPosition() {
        return this.position = getInstanceOf(HighchartsAlignValue.class, this.position);
    }

    public DataLabel setPosition(HighchartsAlignValue position) {
        this.position = position;
        return this;
    }

    public int getRotation() {
        return this.rotation = getInstanceOf(int.class, this.rotation);
    }

    public DataLabel setRotation(int rotation) {
        this.rotation = rotation;
        return this;
    }

    public HighchartsShadowOptionsObject getShadow() {
        return this.shadow = getInstanceOf(HighchartsShadowOptionsObject.class, this.shadow);
    }

    public DataLabel setShadow(HighchartsShadowOptionsObject shadow) {
        this.shadow = shadow;
        return this;
    }

    public String getShape() {
        return this.shape = getInstanceOf(String.class, this.shape);
    }

    public DataLabel setShape(String shape) {
        this.shape = shape;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public DataLabel setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public TextPath getTextPath() {
        return this.textPath = getInstanceOf(TextPath.class, this.textPath);
    }

    public DataLabel setTextPath(TextPath textPath) {
        this.textPath = textPath;
        return this;
    }

    public boolean getUseHTML() {
        return this.useHTML = getInstanceOf(boolean.class, this.useHTML);
    }

    public DataLabel setUseHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public HighchartsVerticalAlignValue getVerticalAlign() {
        return this.verticalAlign = getInstanceOf(HighchartsVerticalAlignValue.class, this.verticalAlign);
    }

    public DataLabel setVerticalAlign(HighchartsVerticalAlignValue verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public int getX() {
        return this.x = getInstanceOf(int.class, this.x);
    }

    public DataLabel setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return this.y = getInstanceOf(int.class, this.y);
    }

    public DataLabel setY(int y) {
        this.y = y;
        return this;
    }

    public int getZ() {
        return this.z = getInstanceOf(int.class, this.z);
    }

    public DataLabel setZ(int z) {
        this.z = z;
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
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.crop);
        hash = 17 * hash + Objects.hashCode(this.defer);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.filter);
        hash = 17 * hash + Objects.hashCode(this.format);
        hash = 17 * hash + Objects.hashCode(this.formatter);
        hash = 17 * hash + Objects.hashCode(this.inside);
        hash = 17 * hash + Objects.hashCode(this.nullFormat);
        hash = 17 * hash + Objects.hashCode(this.nullFormatter);
        hash = 17 * hash + Objects.hashCode(this.overflow);
        hash = 17 * hash + Objects.hashCode(this.padding);
        hash = 17 * hash + Objects.hashCode(this.position);
        hash = 17 * hash + Objects.hashCode(this.rotation);
        hash = 17 * hash + Objects.hashCode(this.shadow);
        hash = 17 * hash + Objects.hashCode(this.shape);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.textPath);
        hash = 17 * hash + Objects.hashCode(this.useHTML);
        hash = 17 * hash + Objects.hashCode(this.verticalAlign);
        hash = 17 * hash + Objects.hashCode(this.x);
        hash = 17 * hash + Objects.hashCode(this.y);
        hash = 17 * hash + Objects.hashCode(this.z);

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
                + ", color:" + color
                + ", crop:" + crop
                + ", defer:" + defer
                + ", enabled:" + enabled
                + ", filter:" + filter
                + ", format:" + format
                + ", formatter:" + formatter
                + ", inside:" + inside
                + ", nullFormat:" + nullFormat
                + ", nullFormatter:" + nullFormatter
                + ", overflow:" + overflow
                + ", padding:" + padding
                + ", position:" + position
                + ", rotation:" + rotation
                + ", shadow:" + shadow
                + ", shape:" + shape
                + ", style:" + style
                + ", textPath:" + textPath
                + ", useHTML:" + useHTML
                + ", verticalAlign:" + verticalAlign
                + ", x:" + x
                + ", y:" + y
                + ", z:" + z
                + '}';
    }

}
