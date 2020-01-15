package za.co.onlineintelligence.hyforge.tooltip;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.axis.Crosshair;
import za.co.onlineintelligence.hyforge.axis.DateTimeLabelFormats;
import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsTooltipShapeValue;


/**
 * Tooltip HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Tooltip implements Serializable, DrosteDeflater {


    public Tooltip() {
    }

    /**
     * Enable or disable animation of the tooltip.
     *
     * @since 2.3.0
     */
    private Boolean animation;

    /**
     * The background color or gradient for the tooltip.
     * <p>
     * In styled mode, the stroke width is set in the
     * `.highcharts-tooltip-box` class.
     */
    private HighchartsColor backgroundColor;

    /**
     * The color of the tooltip border. When `undefined`, the border takes
     * the color of the corresponding series or point.
     */
    private HighchartsColor borderColor;

    /**
     * The radius of the rounded border corners.
     */
    private Integer borderRadius;

    /**
     * The pixel width of the tooltip border.
     * <p>
     * In styled mode, the stroke width is set in the
     * `.highcharts-tooltip-box` class.
     */
    private Integer borderWidth;

    /**
     * How many decimals to show for the `point.change` value when the
     * `series.compare` option is set. This is overridable in each series'
     * tooltip options object. The default is to preserve all decimals.
     *
     * @since 1.0.1
     */
    private Integer changeDecimals;

    /**
     * A CSS class name to apply to the tooltip's container div,
     * allowing unique CSS styling for each chart.
     */
    private String className;

    /**
     * The HTML of the cluster point's in the tooltip. Works only with
     * marker-clusters module and analogously to
     * [pointFormat](#tooltip.pointFormat).
     * <p>
     * The cluster tooltip can be also formatted using
     * `tooltip.formatter` callback function and `point.isCluster` flag.
     */
    private Object clusterFormat;

    /**
     * Since 4.1, the crosshair definitions are moved to the axis object
     * in order for a better separation from the tooltip. See
     * [xAxis.crosshair](#xAxis.crosshair).
     */
    private Crosshair crosshairs;

    /**
     * For series on a datetime axes, the date format in the tooltip's
     * header will by default be guessed based on the closest data points.
     * This member gives the default string representations used for
     * each unit. For an overview of the replacement codes, see
     * [dateFormat](/class-reference/Highcharts#dateFormat).
     */
    private DateTimeLabelFormats dateTimeLabelFormats;

    /**
     * Distance from point to tooltip in pixels.
     */
    private Integer distance;

    /**
     * Enable or disable the tooltip.
     */
    private Boolean enabled;

    /**
     * Whether the tooltip should follow the mouse as it moves across
     * columns, pie slices and other point types with an extent.
     * By default it behaves this way for pie, polygon, map, sankey
     * and wordcloud series by override in the `plotOptions`
     * for those series types.
     * <p>
     * For touch moves to behave the same way, [followTouchMove](#tooltip.followTouchMove) must be `true` also.
     *
     * @since 3.0.0
     */
    private Boolean followPointer;

    /**
     * Whether the tooltip should update as the finger moves on a touch
     * device. If this is `true` and [chart.panning](#chart.panning) is
     * set,`followTouchMove` will take over one-finger touches, so the user
     * needs to use two fingers for zooming and panning.
     * <p>
     * Note the difference to [followPointer](#tooltip.followPointer) that
     * only defines the _position_ of the tooltip. If `followPointer` is
     * false in for example a column series, the tooltip will show above or
     * below the column, but as `followTouchMove` is true, the tooltip will
     * jump from column to column as the user swipes across the plot area.
     *
     * @since 3.0.1
     */
    private Boolean followTouchMove;

    /**
     * A string to append to the tooltip format.
     *
     * @since 2.2.0
     */
    private String footerFormat;

    /**
     * Callback function to format the text of the tooltip from scratch. In
     * case of single or [shared](#tooltip.shared) tooltips, a string should
     * be returned. In case of [split](#tooltip.split) tooltips, it should
     * return an array where the first item is the header, and subsequent
     * items are mapped to the points. Return `false` to disable tooltip for
     * a specific point on series.
     * <p>
     * A subset of HTML is supported. Unless `useHTML` is true, the HTML of
     * the tooltip is parsed and converted to SVG, therefore this isn't a
     * complete HTML renderer. The following HTML tags are supported: `b`,
     * `br`, `em`, `i`, `span`, `strong`. Spans can be styled with a `style`
     * attribute, but only text-related CSS, that is shared with SVG, is
     * handled.
     * <p>
     * The available data in the formatter differ a bit depending on whether
     * the tooltip is shared or split, or belongs to a single point. In a
     * shared/split tooltip, all properties except `x`, which is common for
     * all points, are kept in an array, `this.points`.
     * <p>
     * Available data are:
     * <p>
     * - **this.percentage (not shared) /**
     * *this.points[i].percentage (shared)**:
     * Stacked series and pies only. The point's percentage of the total.
     * <p>
     * - **this.point (not shared) / this.points[i].point (shared)**:
     * The point object. The point name, if defined, is available through
     * `this.point.name`.
     * <p>
     * - **this.points**:
     * In a shared tooltip, this is an array containing all other
     * properties for each point.
     * <p>
     * - **this.series (not shared) / this.points[i].series (shared)**:
     * The series object. The series name is available through
     * `this.series.name`.
     * <p>
     * - **this.total (not shared) / this.points[i].total (shared)**:
     * Stacked series only. The total value at this point's x value.
     * <p>
     * - **this.x**:
     * The x value. This property is the same regardless of the tooltip
     * being shared or not.
     * <p>
     * - **this.y (not shared) / this.points[i].y (shared)**:
     * The y value.
     */
    private HighchartsCallbackFunction formatter;

    /**
     * The HTML of the tooltip header line. Variables are enclosed by
     * curly brackets. Available variables are `point.key`, `series.name`,
     * `series.color` and other members from the `point` and `series`
     * objects. The `point.key` variable contains the category name, x
     * value or datetime string depending on the type of axis. For datetime
     * axes, the `point.key` date format can be set using
     * `tooltip.xDateFormat`.
     */
    private String headerFormat;

    /**
     * The name of a symbol to use for the border around the tooltip
     * header. Applies only when [tooltip.split](#tooltip.split) is
     * enabled.
     * <p>
     * Custom callbacks for symbol path generation can also be added to
     * `Highcharts.SVGRenderer.prototype.symbols` the same way as for
     * [series.marker.symbol](plotOptions.line.marker.symbol).
     *
     * @since 7.0.0
     */
    private HighchartsTooltipShapeValue headerShape;

    /**
     * The number of milliseconds to wait until the tooltip is hidden when
     * mouse out from a point or chart.
     *
     * @since 3.0.0
     */
    private Integer hideDelay;

    /**
     * The HTML of the null point's line in the tooltip. Works analogously
     * to [pointFormat](#tooltip.pointFormat).
     */
    private String nullFormat;

    /**
     * Callback function to format the text of the tooltip for
     * visible null points.
     * Works analogously to [formatter](#tooltip.formatter).
     */
    private HighchartsCallbackFunction nullFormatter;

    /**
     * Whether to allow the tooltip to render outside the chart's SVG
     * element box. By default (`false`), the tooltip is rendered within the
     * chart's SVG element, which results in the tooltip being aligned
     * inside the chart area. For small charts, this may result in clipping
     * or overlapping. When `true`, a separate SVG element is created and
     * overlaid on the page, allowing the tooltip to be aligned inside the
     * page itself.
     * <p>
     * Defaults to `true` if `chart.scrollablePlotArea` is activated,
     * otherwise `false`.
     *
     * @since 6.1.1
     */
    private Boolean outside;

    /**
     * Padding inside the tooltip, in pixels.
     *
     * @since 5.0.0
     */
    private Integer padding;

    /**
     * The HTML of the point's line in the tooltip. Variables are enclosed
     * by curly brackets. Available variables are point.x, point.y, series.
     * name and series.color and other properties on the same form.
     * Furthermore, `point.y` can be extended by the `tooltip.valuePrefix`
     * and `tooltip.valueSuffix` variables. This can also be overridden for
     * each series, which makes it a good hook for displaying units.
     * <p>
     * In styled mode, the dot is colored by a class name rather
     * than the point color.
     *
     * @since 2.2.0
     */
    private String pointFormat;

    /**
     * A callback function for formatting the HTML output for a single point
     * in the tooltip. Like the `pointFormat` string, but with more
     * flexibility.
     *
     * @since 4.1.0
     */
    private HighchartsCallbackFunction pointFormatter;

    /**
     * A callback function to place the tooltip in a default position. The
     * callback receives three parameters: `labelWidth`, `labelHeight` and
     * `point`, where point contains values for `plotX` and `plotY` telling
     * where the reference point is in the plot area. Add `chart.plotLeft`
     * and `chart.plotTop` to get the full coordinates.
     * <p>
     * Since v7, when [tooltip.split](#tooltip.split) option is enabled,
     * positioner is called for each of the boxes separately, including
     * xAxis header. xAxis header is not a point, instead `point` argument
     * contains info:
     * `{ plotX: Number, plotY: Number, isHeader: Boolean }`
     * <p>
     * <p>
     * The return should be an object containing x and y values, for example
     * `{ x: 100, y: 100 }`.
     *
     * @since 2.2.4
     */
    private HighchartsCallbackFunction positioner;

    /**
     * Whether to apply a drop shadow to the tooltip.
     */
    private HighchartsShadowOptionsObject shadow;

    /**
     * The name of a symbol to use for the border around the tooltip. Can
     * be one of: `"callout"`, `"circle"`, or `"square"`. When
     * [tooltip.split](#tooltip.split)
     * option is enabled, shape is applied to all boxes except header, which
     * is controlled by
     * [tooltip.headerShape](#tooltip.headerShape).
     * <p>
     * Custom callbacks for symbol path generation can also be added to
     * `Highcharts.SVGRenderer.prototype.symbols` the same way as for
     * [series.marker.symbol](plotOptions.line.marker.symbol).
     *
     * @since 4.0.0
     */
    private HighchartsTooltipShapeValue shape;

    /**
     * When the tooltip is shared, the entire plot area will capture mouse
     * movement or touch events. Tooltip texts for series types with ordered
     * data (not pie, scatter, flags etc) will be shown in a single bubble.
     * This is recommended for single series charts and for tablet/mobile
     * optimized charts.
     * <p>
     * See also [tooltip.split](#tooltip.split), that is better suited for
     * charts with many series, especially line-type series. The
     * `tooltip.split` option takes precedence over `tooltip.shared`.
     *
     * @since 2.1.0
     */
    private Boolean shared;

    /**
     * Proximity snap for graphs or single points. It defaults to 10 for
     * mouse-powered devices and 25 for touch devices.
     * <p>
     * Note that in most cases the whole plot area captures the mouse
     * movement, and in these cases `tooltip.snap` doesn't make sense. This
     * applies when [stickyTracking](#plotOptions.series.stickyTracking)
     * is `true` (default) and when the tooltip is [shared](#tooltip.shared)
     * or [split](#tooltip.split).
     *
     * @since 1.2.0
     */
    private Integer snap;

    /**
     * Split the tooltip into one label per series, with the header close
     * to the axis. This is recommended over [shared](#tooltip.shared)
     * tooltips for charts with multiple line series, generally making them
     * easier to read. This option takes precedence over `tooltip.shared`.
     *
     * @since 5.0.0
     */
    private Boolean split;

    /**
     * CSS styles for the tooltip. The tooltip can also be styled through
     * the CSS class `.highcharts-tooltip`.
     * <p>
     * Note that the default `pointerEvents` style makes the tooltip ignore
     * mouse events, so in order to use clickable tooltips, this value must
     * be set to `auto`.
     */
    private HighchartsCSS style;

    /**
     * Use HTML to render the contents of the tooltip instead of SVG. Using
     * HTML allows advanced formatting like tables and images in the
     * tooltip. It is also recommended for rtl languages as it works around
     * rtl bugs in early Firefox.
     *
     * @since 2.2.0
     */
    private Boolean useHTML;

    /**
     * How many decimals to show in each series' y value. This is
     * overridable in each series' tooltip options object. The default is to
     * preserve all decimals.
     *
     * @since 2.2.0
     */
    private Integer valueDecimals;

    /**
     * A string to prepend to each series' y value. Overridable in each
     * series' tooltip options object.
     *
     * @since 2.2.0
     */
    private String valuePrefix;

    /**
     * A string to append to each series' y value. Overridable in each
     * series' tooltip options object.
     *
     * @since 2.2.0
     */
    private String valueSuffix;

    /**
     * The format for the date in the tooltip header if the X axis is a
     * datetime axis. The default is a best guess based on the smallest
     * distance between points in the chart.
     */
    private String xDateFormat;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public boolean getAnimation() {
        return this.animation;
    }

    public Tooltip setAnimation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public HighchartsColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public Tooltip setBackgroundColor(HighchartsColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public HighchartsColor getBorderColor() {
        return this.borderColor;
    }

    public Tooltip setBorderColor(HighchartsColor borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public int getBorderRadius() {
        return this.borderRadius;
    }

    public Tooltip setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public int getBorderWidth() {
        return this.borderWidth;
    }

    public Tooltip setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public int getChangeDecimals() {
        return this.changeDecimals;
    }

    public Tooltip setChangeDecimals(int changeDecimals) {
        this.changeDecimals = changeDecimals;
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public Tooltip setClassName(String className) {
        this.className = className;
        return this;
    }

    public Object getClusterFormat() {
        return this.clusterFormat;
    }

    public Tooltip setClusterFormat(Object clusterFormat) {
        this.clusterFormat = clusterFormat;
        return this;
    }

    public Crosshair getCrosshairs() {
        return this.crosshairs;
    }

    public Tooltip setCrosshairs(Crosshair crosshairs) {
        this.crosshairs = crosshairs;
        return this;
    }

    public DateTimeLabelFormats getDateTimeLabelFormats() {
        return this.dateTimeLabelFormats;
    }

    public Tooltip setDateTimeLabelFormats(DateTimeLabelFormats dateTimeLabelFormats) {
        this.dateTimeLabelFormats = dateTimeLabelFormats;
        return this;
    }

    public int getDistance() {
        return this.distance;
    }

    public Tooltip setDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public Tooltip setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public boolean getFollowPointer() {
        return this.followPointer;
    }

    public Tooltip setFollowPointer(boolean followPointer) {
        this.followPointer = followPointer;
        return this;
    }

    public boolean getFollowTouchMove() {
        return this.followTouchMove;
    }

    public Tooltip setFollowTouchMove(boolean followTouchMove) {
        this.followTouchMove = followTouchMove;
        return this;
    }

    public String getFooterFormat() {
        return this.footerFormat;
    }

    public Tooltip setFooterFormat(String footerFormat) {
        this.footerFormat = footerFormat;
        return this;
    }

    public HighchartsCallbackFunction getFormatter() {
        return this.formatter;
    }

    public Tooltip setFormatter(HighchartsCallbackFunction formatter) {
        this.formatter = formatter;
        return this;
    }

    public String getHeaderFormat() {
        return this.headerFormat;
    }

    public Tooltip setHeaderFormat(String headerFormat) {
        this.headerFormat = headerFormat;
        return this;
    }

    public HighchartsTooltipShapeValue getHeaderShape() {
        return this.headerShape;
    }

    public Tooltip setHeaderShape(HighchartsTooltipShapeValue headerShape) {
        this.headerShape = headerShape;
        return this;
    }

    public int getHideDelay() {
        return this.hideDelay;
    }

    public Tooltip setHideDelay(int hideDelay) {
        this.hideDelay = hideDelay;
        return this;
    }

    public String getNullFormat() {
        return this.nullFormat;
    }

    public Tooltip setNullFormat(String nullFormat) {
        this.nullFormat = nullFormat;
        return this;
    }

    public HighchartsCallbackFunction getNullFormatter() {
        return this.nullFormatter;
    }

    public Tooltip setNullFormatter(HighchartsCallbackFunction nullFormatter) {
        this.nullFormatter = nullFormatter;
        return this;
    }

    public Boolean getOutside() {
        return this.outside;
    }

    public Tooltip setOutside(Boolean outside) {
        this.outside = outside;
        return this;
    }

    public int getPadding() {
        return this.padding;
    }

    public Tooltip setPadding(int padding) {
        this.padding = padding;
        return this;
    }

    public String getPointFormat() {
        return this.pointFormat;
    }

    public Tooltip setPointFormat(String pointFormat) {
        this.pointFormat = pointFormat;
        return this;
    }

    public HighchartsCallbackFunction getPointFormatter() {
        return this.pointFormatter;
    }

    public Tooltip setPointFormatter(HighchartsCallbackFunction pointFormatter) {
        this.pointFormatter = pointFormatter;
        return this;
    }

    public HighchartsCallbackFunction getPositioner() {
        return this.positioner;
    }

    public Tooltip setPositioner(HighchartsCallbackFunction positioner) {
        this.positioner = positioner;
        return this;
    }

    public HighchartsShadowOptionsObject getShadow() {
        return this.shadow;
    }

    public Tooltip setShadow(HighchartsShadowOptionsObject shadow) {
        this.shadow = shadow;
        return this;
    }

    public HighchartsTooltipShapeValue getShape() {
        return this.shape;
    }

    public Tooltip setShape(HighchartsTooltipShapeValue shape) {
        this.shape = shape;
        return this;
    }

    public boolean getShared() {
        return this.shared;
    }

    public Tooltip setShared(boolean shared) {
        this.shared = shared;
        return this;
    }

    public int getSnap() {
        return this.snap;
    }

    public Tooltip setSnap(int snap) {
        this.snap = snap;
        return this;
    }

    public boolean getSplit() {
        return this.split;
    }

    public Tooltip setSplit(boolean split) {
        this.split = split;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style;
    }

    public Tooltip setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public boolean getUseHTML() {
        return this.useHTML;
    }

    public Tooltip setUseHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public int getValueDecimals() {
        return this.valueDecimals;
    }

    public Tooltip setValueDecimals(int valueDecimals) {
        this.valueDecimals = valueDecimals;
        return this;
    }

    public String getValuePrefix() {
        return this.valuePrefix;
    }

    public Tooltip setValuePrefix(String valuePrefix) {
        this.valuePrefix = valuePrefix;
        return this;
    }

    public String getValueSuffix() {
        return this.valueSuffix;
    }

    public Tooltip setValueSuffix(String valueSuffix) {
        this.valueSuffix = valueSuffix;
        return this;
    }

    public String getXDateFormat() {
        return this.xDateFormat;
    }

    public Tooltip setXDateFormat(String xDateFormat) {
        this.xDateFormat = xDateFormat;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.animation);
        hash = 17 * hash + Objects.hashCode(this.backgroundColor);
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.borderRadius);
        hash = 17 * hash + Objects.hashCode(this.borderWidth);
        hash = 17 * hash + Objects.hashCode(this.changeDecimals);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.clusterFormat);
        hash = 17 * hash + Objects.hashCode(this.crosshairs);
        hash = 17 * hash + Objects.hashCode(this.dateTimeLabelFormats);
        hash = 17 * hash + Objects.hashCode(this.distance);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.followPointer);
        hash = 17 * hash + Objects.hashCode(this.followTouchMove);
        hash = 17 * hash + Objects.hashCode(this.footerFormat);
        hash = 17 * hash + Objects.hashCode(this.formatter);
        hash = 17 * hash + Objects.hashCode(this.headerFormat);
        hash = 17 * hash + Objects.hashCode(this.headerShape);
        hash = 17 * hash + Objects.hashCode(this.hideDelay);
        hash = 17 * hash + Objects.hashCode(this.nullFormat);
        hash = 17 * hash + Objects.hashCode(this.nullFormatter);
        hash = 17 * hash + Objects.hashCode(this.outside);
        hash = 17 * hash + Objects.hashCode(this.padding);
        hash = 17 * hash + Objects.hashCode(this.pointFormat);
        hash = 17 * hash + Objects.hashCode(this.pointFormatter);
        hash = 17 * hash + Objects.hashCode(this.positioner);
        hash = 17 * hash + Objects.hashCode(this.shadow);
        hash = 17 * hash + Objects.hashCode(this.shape);
        hash = 17 * hash + Objects.hashCode(this.shared);
        hash = 17 * hash + Objects.hashCode(this.snap);
        hash = 17 * hash + Objects.hashCode(this.split);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.useHTML);
        hash = 17 * hash + Objects.hashCode(this.valueDecimals);
        hash = 17 * hash + Objects.hashCode(this.valuePrefix);
        hash = 17 * hash + Objects.hashCode(this.valueSuffix);
        hash = 17 * hash + Objects.hashCode(this.xDateFormat);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "animation:" + animation
                + ", backgroundColor:" + backgroundColor
                + ", borderColor:" + borderColor
                + ", borderRadius:" + borderRadius
                + ", borderWidth:" + borderWidth
                + ", changeDecimals:" + changeDecimals
                + ", className:" + className
                + ", clusterFormat:" + clusterFormat
                + ", crosshairs:" + crosshairs
                + ", dateTimeLabelFormats:" + dateTimeLabelFormats
                + ", distance:" + distance
                + ", enabled:" + enabled
                + ", followPointer:" + followPointer
                + ", followTouchMove:" + followTouchMove
                + ", footerFormat:" + footerFormat
                + ", formatter:" + formatter
                + ", headerFormat:" + headerFormat
                + ", headerShape:" + headerShape
                + ", hideDelay:" + hideDelay
                + ", nullFormat:" + nullFormat
                + ", nullFormatter:" + nullFormatter
                + ", outside:" + outside
                + ", padding:" + padding
                + ", pointFormat:" + pointFormat
                + ", pointFormatter:" + pointFormatter
                + ", positioner:" + positioner
                + ", shadow:" + shadow
                + ", shape:" + shape
                + ", shared:" + shared
                + ", snap:" + snap
                + ", split:" + split
                + ", style:" + style
                + ", useHTML:" + useHTML
                + ", valueDecimals:" + valueDecimals
                + ", valuePrefix:" + valuePrefix
                + ", valueSuffix:" + valueSuffix
                + ", xDateFormat:" + xDateFormat
                + '}';
    }


}
