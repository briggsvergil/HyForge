package za.co.onlineintelligence.hyforge.plotoptions;

import za.co.onlineintelligence.hyforge.coloraxis.ColorAxis;
import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsCursorValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsDashStyleValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsSeriesLinecapValue;
import za.co.onlineintelligence.hyforge.tooltip.Tooltip;

import java.io.Serializable;
import java.lang.reflect.Field;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean
 */
public class HighchartsSeriesPlotOptions implements Serializable, DrosteDeflater {
    /**
     * Accessibility options for a series.
     *
     * @since 7.1.0
     */
    private SeriesAccessibility accessibility;
    /**
     * Allow this series' points to be selected by clicking on the graphic
     * (columns, point markers, pie slices, map areas etc).
     * <p>
     * The selected points can be handled by point select and unselect
     * events, or collectively by the [getSelectedPoints](Highcharts.Chart#getSelectedPoints) function.
     * <p>
     * And alternative way of selecting points is through dragging.
     *
     * @since 1.2.0
     */
    private Boolean allowPointSelect;
    /**
     * Enable or disable the initial animation when a series is displayed.
     * The animation can also be set as a configuration object. Please
     * note that this option only applies to the initial animation of the
     * series itself. For other animations, see [chart.animation](#chart.animation) and the animation parameter under the API methods.
     * The following properties are supported:
     * <p>
     * - `duration`: The duration of the animation in milliseconds.
     * <p>
     * - `easing`: Can be a string reference to an easing function set on
     * the `Math` object or a function. See the _Custom easing function_
     * demo below.
     * <p>
     * Due to poor performance, animation is disabled in old IE browsers
     * for several chart types.
     */
    private Integer animation;
    /**
     * For some series, there is a limit that shuts down initial animation
     * by default when the total number of points in the chart is too high.
     * For example, for a column chart and its derivatives, animation does
     * not run if there is more than 250 points totally. To disable this
     * cap, set `animationLimit` to `Infinity`.
     */
    private Integer animationLimit;
    /**
     * Sets the color blending in the boost module.
     */
    private String boostBlending;
    /**
     * An additional class name to apply to the series' graphical elements.
     * This option does not replace default class names of the graphical
     * element.
     *
     * @since 5.0.0
     */
    private String className;
    /**
     * Disable this option to allow series rendering in the whole plotting
     * area.
     * <p>
     * *Note:** Clipping should be always enabled when
     * [chart.zoomType](#chart.zoomType) is set
     *
     * @since 3.0.0
     */
    private Boolean clip;
    /**
     * The main color of the series. In line type series it applies to the
     * line and the point markers unless otherwise specified. In bar type
     * series it applies to the bars unless a color is specified per point.
     * The default value is pulled from the `options.colors` array.
     * <p>
     * In styled mode, the color can be defined by the
     * [colorIndex](#plotOptions.series.colorIndex) option. Also, the series
     * color can be set with the `.highcharts-series`,
     * `.highcharts-color-{n}`, `.highcharts-{type}-series` or
     * `.highcharts-series-{n}` class, or individual classes given by the
     * `className` option.
     */
    private HighchartsColor color;
    /**
     * When using dual or multiple color axes, this number defines which
     * colorAxis the particular series is connected to. It refers to
     * either the
     * {#colorAxis.id|axis id}
     * or the index of the axis in the colorAxis array, with 0 being the
     * first. Set this option to false to prevent a series from connecting
     * to the default color axis.
     * <p>
     * Since v7.2.0 the option can also be an axis id or an axis index
     * instead of a boolean flag.
     */
    private ColorAxis colorAxis;
    /**
     * Styled mode only. A specific color index to use for the series, so
     * its graphic representations are given the class name
     * `highcharts-color-{n}`.
     *
     * @since 5.0.0
     */
    private Integer colorIndex;
    /**
     * Determines what data value should be used to calculate point color
     * if `colorAxis` is used. Requires to set `min` and `max` if some
     * custom point property is used or if approximation for data grouping
     * is set to `'sum'`.
     *
     * @since 7.2.0
     */
    private String colorKey;
    /**
     * Polar charts only. Whether to connect the ends of a line series
     * plot across the extremes.
     *
     * @since 2.3.0
     */
    private Boolean connectEnds;
    /**
     * Whether to connect a graph line across null points, or render a gap
     * between the two points on either side of the null.
     */
    private Boolean connectNulls;
    /**
     * When the series contains less points than the crop threshold, all
     * points are drawn, even if the points fall outside the visible plot
     * area at the current zoom. The advantage of drawing all points
     * (including markers and columns), is that animation is performed on
     * updates. On the other hand, when the series contains more points than
     * the crop threshold, the series data is cropped to only contain points
     * that fall within the plot area. The advantage of cropping away
     * invisible points is to increase performance on large series.
     *
     * @since 2.2.0
     */
    private Integer cropThreshold;
    /**
     * You can set the cursor to "pointer" if you have click events attached
     * to the series, to signal to the user that the points and lines can
     * be clicked.
     * <p>
     * In styled mode, the series cursor can be set with the same classes
     * as listed under [series.color](#plotOptions.series.color).
     */
    private HighchartsCursorValue cursor;
    /**
     * A name for the dash style to use for the graph, or for some series
     * types the outline of each shape.
     * <p>
     * In styled mode, the
     * [stroke dash-array](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-dashstyle/)
     * can be set with the same classes as listed under
     * [series.color](#plotOptions.series.color).
     *
     * @since 2.1.0
     */
    private HighchartsDashStyleValue dashStyle;
    /**
     * Options for the series data labels, appearing next to each data
     * point.
     * <p>
     * Since v6.2.0, multiple data labels can be applied to each single
     * point by defining them as an array of configs.
     * <p>
     * In styled mode, the data labels can be styled with the
     * `.highcharts-data-label-box` and `.highcharts-data-label` class names
     * ([see example](https://www.highcharts.com/samples/highcharts/css/series-datalabels)).
     */
    private DataLabel dataLabels;
    /**
     * Options for the series data sorting.
     *
     * @since 8.0.0
     */
    private DataSorting dataSorting;

    /**
     * A description of the series to add to the screen reader information
     * about the series.
     *
     * @since 5.0.0
     */
    private String description;
    /**
     * The draggable-points module allows points to be moved around or modified in
     * the chart. In addition to the options mentioned under the `dragDrop` API
     * structure, the module fires three events,
     * [point.dragStart](plotOptions.series.point.events.dragStart),
     * [point.drag](plotOptions.series.point.events.drag) and
     * [point.drop](plotOptions.series.point.events.drop).
     *
     * @since 6.2.0
     */
    private DragDrop dragDrop;
    /**
     * Enable or disable the mouse tracking for a specific series. This
     * includes point tooltips and click events on graphs and points. For
     * large datasets it improves performance.
     */
    private Boolean enableMouseTracking;

    /**
     * General event handlers for the series items. These event hooks can
     * also be attached to the series at run time using the
     * `Highcharts.addEvent` function.
     */
    private SeriesEvents events;
    /**
     * Determines whether the series should look for the nearest point
     * in both dimensions or just the x-dimension when hovering the series.
     * Defaults to `'xy'` for scatter series and `'x'` for most other
     * series. If the data has duplicate x-values, it is recommended to
     * set this to `'xy'` to allow hovering over all points.
     * <p>
     * Applies only to series types using nearest neighbor search (not
     * direct hover) for tooltip.
     *
     * @since 5.0.10
     */
    private String findNearestPointBy;
    /**
     * Whether to use the Y extremes of the total chart width or only the
     * zoomed area when zooming in on parts of the X axis. By default, the
     * Y axis adjusts to the min and max of the visible data. Cartesian
     * series only.
     *
     * @since 4.1.6
     */
    private Boolean getExtremesFromAll;
    /**
     * When set to `false` will prevent the series data from being included in
     * any form of data export.
     * <p>
     * Since version 6.0.0 until 7.1.0 the option was existing undocumented
     * as `includeInCSVExport`.
     *
     * @since 7.1.0
     */
    private Boolean includeInDataExport;
    /**
     * An array specifying which option maps to which key in the data point
     * array. This makes it convenient to work with unstructured data arrays
     * from different sources.
     *
     * @since 4.1.6
     */
    private String[] keys;
    /**
     * Series labels are placed as close to the series as possible in a
     * natural way, seeking to avoid other series. The goal of this
     * feature is to make the chart more easily readable, like if a
     * human designer placed the labels in the optimal position.
     * <p>
     * The series labels currently work with series types having a
     * `graph` or an `area`.
     *
     * @since 6.0.0
     */

    private SeriesLabelOptions label;
    /**
     * The line cap used for line ends and line joins on the graph.
     */
    private HighchartsSeriesLinecapValue linecap;
    /**
     * Pixel width of the graph line.
     */
    private Integer lineWidth;
    /**
     * The [id](#series.id) of another series to link to. Additionally,
     * the value can be ":previous" to link to the previous series. When
     * two series are linked, only the first one appears in the legend.
     * Toggling the visibility of this also toggles the linked series.
     * <p>
     * If master series uses data sorting and linked series does not have
     * its own sorting definition, the linked series will be sorted in the
     * same order as the master one.
     *
     * @since 3.0.0
     */
    private String linkedTo;
    /**
     * Options for the point markers of line-like series. Properties like
     * `fillColor`, `lineColor` and `lineWidth` define the visual appearance
     * of the markers. Other series types, like column series, don't have
     * markers, but have visual options on the series level instead.
     * <p>
     * In styled mode, the markers can be styled with the
     * `.highcharts-point`, `.highcharts-point-hover` and
     * `.highcharts-point-select` class names.
     */
    private Marker marker;
    /**
     * The color for the parts of the graph or points that are below the
     * [threshold](#plotOptions.series.threshold). Note that `zones` takes
     * precedence over the negative color. Using `negativeColor` is
     * equivalent to applying a zone with value of 0.
     *
     * @since 3.0.0
     */
    private HighchartsColor negativeColor;
    /**
     * Opacity of a series parts: line, fill (e.g. area) and dataLabels.
     *
     * @since 7.1.0
     */
    private Integer opacity;
    /**
     * Properties for each single point.
     */
    private Point point;

    /**
     * Same as
     * [accessibility.pointDescriptionFormatter](#accessibility.pointDescriptionFormatter),
     * but for an individual series. Overrides the chart wide configuration.
     *
     * @since 5.0.12
     */
    private HighchartsCallbackFunction pointDescriptionFormatter;
    /**
     * If no x values are given for the points in a series, `pointInterval`
     * defines the interval of the x values. For example, if a series
     * contains one value every decade starting from year 0, set
     * `pointInterval` to `10`. In true `datetime` axes, the `pointInterval`
     * is set in milliseconds.
     * <p>
     * It can be also be combined with `pointIntervalUnit` to draw irregular
     * time intervals.
     * <p>
     * Please note that this options applies to the _series data_, not the
     * interval of the axis ticks, which is independent.
     */
    private Integer pointInterval;
    /**
     * On datetime series, this allows for setting the
     * [pointInterval](#plotOptions.series.pointInterval) to irregular time
     * units, `day`, `month` and `year`. A day is usually the same as 24
     * hours, but `pointIntervalUnit` also takes the DST crossover into
     * consideration when dealing with local time. Combine this option with
     * `pointInterval` to draw weeks, quarters, 6 months, 10 years etc.
     * <p>
     * Please note that this options applies to the _series data_, not the
     * interval of the axis ticks, which is independent.
     *
     * @since 4.1.0
     */
    private String pointIntervalUnit;
    /**
     * Possible values: `"on"`, `"between"`, `number`.
     * <p>
     * In a column chart, when pointPlacement is `"on"`, the point will not
     * create any padding of the X axis. In a polar column chart this means
     * that the first column points directly north. If the pointPlacement is
     * `"between"`, the columns will be laid out between ticks. This is
     * useful for example for visualising an amount between two points in
     * time or in a certain sector of a polar chart.
     * <p>
     * Since Highcharts 3.0.2, the point placement can also be numeric,
     * where 0 is on the axis value, -0.5 is between this value and the
     * previous, and 0.5 is between this value and the next. Unlike the
     * textual options, numeric point placement options won't affect axis
     * padding.
     * <p>
     * Note that pointPlacement needs a [pointRange](#plotOptions.series.pointRange) to work. For column series this is
     * computed, but for line-type series it needs to be set.
     * <p>
     * For the `xrange` series type and gantt charts, if the Y axis is a
     * category axis, the `pointPlacement` applies to the Y axis rather than
     * the (typically datetime) X axis.
     * <p>
     * Defaults to `undefined` in cartesian charts, `"between"` in polar
     * charts.
     *
     * @since 2.3.0
     */
    private PointPlacement pointPlacement;
    /**
     * If no x values are given for the points in a series, pointStart
     * defines on what value to start. For example, if a series contains one
     * yearly value starting from 1945, set pointStart to 1945.
     */
    private Integer pointStart;
    /**
     * Whether to select the series initially. If `showCheckbox` is true,
     * the checkbox next to the series name in the legend will be checked
     * for a selected series.
     *
     * @since 1.2.0
     */
    private Boolean selected;
    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the
     * shadow can be an object configuration containing `color`, `offsetX`,
     * `offsetY`, `opacity` and `width`.
     */
    private HighchartsShadowOptionsObject shadow;
    /**
     * If true, a checkbox is displayed next to the legend item to allow
     * selecting the series. The state of the checkbox is determined by
     * the `selected` option.
     *
     * @since 1.2.0
     */
    private Boolean showCheckbox;

    /**
     * Whether to display this particular series or series type in the
     * legend. Standalone series are shown in legend by default, and linked
     * series are not. Since v7.2.0 it is possible to show series that use
     * colorAxis by setting this option to `true`.
     */
    private Boolean showInLegend;

    /**
     * If set to `true`, the accessibility module will skip past the points
     * in this series for keyboard navigation.
     *
     * @since 5.0.12
     */
    private Boolean skipKeyboardNavigation;
    /**
     * When this is true, the series will not cause the Y axis to cross
     * the zero plane (or [threshold](#plotOptions.series.threshold) option)
     * unless the data actually crosses the plane.
     * <p>
     * For example, if `softThreshold` is `false`, a series of 0, 1, 2,
     * 3 will make the Y axis show negative values according to the
     * `minPadding` option. If `softThreshold` is `true`, the Y axis starts
     * at 0.
     *
     * @since 4.1.9
     */
    private Boolean softThreshold;
    /**
     * Whether to stack the values of each series on top of each other.
     * Possible values are `undefined` to disable, `"normal"` to stack by
     * value or `"percent"`. When stacking is enabled, data must be sorted
     * in ascending X order. A special stacking option is with the
     * streamgraph series type, where the stacking option is set to
     * `"stream"`. The second one is `"overlap"`, which only applies to
     * waterfall series.
     */
    private String stacking;
    /**
     *
     */
    private States states;
    /**
     * Whether to apply steps to the line. Possible values are `left`,
     * `center` and `right`.
     *
     * @since 1.2.5
     */
    private String step;
    /**
     * Sticky tracking of mouse events. When true, the `mouseOut` event on a
     * series isn't triggered until the mouse moves over another series, or
     * out of the plot area. When false, the `mouseOut` event on a series is
     * triggered when the mouse leaves the area around the series' graph or
     * markers. This also implies the tooltip when not shared. When
     * `stickyTracking` is false and `tooltip.shared` is false, the tooltip
     * will be hidden when moving the mouse between series. Defaults to true
     * for line and area type series, but to false for columns, pies etc.
     * <p>
     * *Note:** The boost module will force this option because of
     * technical limitations.
     *
     * @since 2.0.0
     */
    private Boolean stickyTracking;
    /**
     * The threshold, also called zero level or base level. For line type
     * series this is only used in conjunction with
     * [negativeColor](#plotOptions.series.negativeColor).
     *
     * @since 3.0.0
     */
    private Integer threshold;
    /**
     * A configuration object for the tooltip rendering of each single
     * series. Properties are inherited from [tooltip](#tooltip), but only
     * the following properties can be defined on a series level.
     *
     * @since 2.3.0
     */
    private Tooltip tooltip;
    /**
     * When a series contains a data array that is longer than this, only
     * one dimensional arrays of numbers, or two dimensional arrays with
     * x and y values are allowed. Also, only the first point is tested,
     * and the rest are assumed to be the same format. This saves expensive
     * data checking and indexing in long series. Set it to `0` disable.
     * <p>
     * Note:
     * In boost mode turbo threshold is forced. Only array of numbers or
     * two dimensional arrays are allowed.
     *
     * @since 2.2.0
     */
    private Integer turboThreshold;
    /**
     * Set the initial visibility of the series.
     */
    private Boolean visible;
    /**
     * Defines the axis on which the zones are applied.
     *
     * @since 4.1.0
     */
    private String zoneAxis;
    /**
     * An array defining zones within a series. Zones can be applied to the
     * X axis, Y axis or Z axis for bubbles, according to the `zoneAxis`
     * option. The zone definitions have to be in ascending order regarding
     * to the value.
     * <p>
     * In styled mode, the color zones are styled with the
     * `.highcharts-zone-{n}` class, or custom classed from the `className`
     * option
     * ([view live demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/)).
     *
     * @since 4.1.0
     */
    private ZoneOptions[] zones;


    public HighchartsSeriesPlotOptions() {
    }

    /**
     * Getters and Builder-style setters
     */

    public SeriesAccessibility getAccessibility() {
        return this.accessibility = getInstanceOf(SeriesAccessibility.class, this.accessibility);
    }

    public HighchartsSeriesPlotOptions setAccessibility(SeriesAccessibility accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    public boolean isAllowPointSelect() {
        return this.allowPointSelect = getInstanceOf(boolean.class, this.allowPointSelect);
    }

    public HighchartsSeriesPlotOptions setAllowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public Integer getAnimation() {
        return this.animation = getInstanceOf(Integer.class, this.animation);
    }

    public HighchartsSeriesPlotOptions setAnimation(Integer animation) {
        this.animation = animation;
        return this;
    }

    public Integer getAnimationLimit() {
        return this.animationLimit = getInstanceOf(Integer.class, this.animationLimit);
    }

    public HighchartsSeriesPlotOptions setAnimationLimit(Integer animationLimit) {
        this.animationLimit = animationLimit;
        return this;
    }

    public String getBoostBlending() {
        return this.boostBlending = getInstanceOf(String.class, this.boostBlending);
    }

    public HighchartsSeriesPlotOptions setBoostBlending(String boostBlending) {
        this.boostBlending = boostBlending;
        return this;
    }

    public String getClassName() {
        return this.className = getInstanceOf(String.class, this.className);
    }

    public HighchartsSeriesPlotOptions setClassName(String className) {
        this.className = className;
        return this;
    }

    public Boolean getClip() {
        return this.clip = getInstanceOf(Boolean.class, this.clip);
    }

    public HighchartsSeriesPlotOptions setClip(Boolean clip) {
        this.clip = clip;
        return this;
    }

    public HighchartsColor getColor() {
        return this.color = getInstanceOf(HighchartsColor.class, this.color);
    }

    public HighchartsSeriesPlotOptions setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public HighchartsSeriesPlotOptions setColor(String colorString) {
        this.color = new HighchartsColorString(colorString);
        return this;
    }

    public ColorAxis getColorAxis() {
        return this.colorAxis = getInstanceOf(ColorAxis.class, this.colorAxis);
    }

    public HighchartsSeriesPlotOptions setColorAxis(ColorAxis colorAxis) {
        this.colorAxis = colorAxis;
        return this;
    }

    public Integer getColorIndex() {
        return this.colorIndex = getInstanceOf(Integer.class, this.colorIndex);
    }

    public HighchartsSeriesPlotOptions setColorIndex(Integer colorIndex) {
        this.colorIndex = colorIndex;
        return this;
    }

    public String getColorKey() {
        return this.colorKey = getInstanceOf(String.class, this.colorKey);
    }

    public HighchartsSeriesPlotOptions setColorKey(String colorKey) {
        this.colorKey = colorKey;
        return this;
    }

    public Boolean getConnectEnds() {
        return this.connectEnds = getInstanceOf(Boolean.class, this.connectEnds);
    }

    public HighchartsSeriesPlotOptions setConnectEnds(Boolean connectEnds) {
        this.connectEnds = connectEnds;
        return this;
    }

    public Boolean getConnectNulls() {
        return this.connectNulls = getInstanceOf(Boolean.class, this.connectNulls);
    }

    public HighchartsSeriesPlotOptions setConnectNulls(Boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public Integer getCropThreshold() {
        return this.cropThreshold = getInstanceOf(Integer.class, this.cropThreshold);
    }

    public HighchartsSeriesPlotOptions setCropThreshold(Integer cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public HighchartsCursorValue getCursor() {
        return this.cursor = getInstanceOf(HighchartsCursorValue.class, this.cursor);
    }

    public HighchartsSeriesPlotOptions setCursor(HighchartsCursorValue cursor) {
        this.cursor = cursor;
        return this;
    }

    public HighchartsDashStyleValue getDashStyle() {
        return this.dashStyle = getInstanceOf(HighchartsDashStyleValue.class, this.dashStyle);
    }

    public HighchartsSeriesPlotOptions setDashStyle(HighchartsDashStyleValue dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabel getDataLabels() {
        return this.dataLabels = getInstanceOf(DataLabel.class, this.dataLabels);
    }

    public HighchartsSeriesPlotOptions setDataLabels(DataLabel dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public DataSorting getDataSorting() {
        return this.dataSorting = getInstanceOf(DataSorting.class, this.dataSorting);
    }

    public HighchartsSeriesPlotOptions setDataSorting(DataSorting dataSorting) {
        this.dataSorting = dataSorting;
        return this;
    }

    public String getDescription() {
        return this.description = getInstanceOf(String.class, this.description);
    }

    public HighchartsSeriesPlotOptions setDescription(String description) {
        this.description = description;
        return this;
    }

    public DragDrop getDragDrop() {
        return this.dragDrop = getInstanceOf(DragDrop.class, this.dragDrop);
    }

    public HighchartsSeriesPlotOptions setDragDrop(DragDrop dragDrop) {
        this.dragDrop = dragDrop;
        return this;
    }

    public Boolean getEnableMouseTracking() {
        return this.enableMouseTracking = getInstanceOf(Boolean.class, this.enableMouseTracking);
    }

    public HighchartsSeriesPlotOptions setEnableMouseTracking(Boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public SeriesEvents getEvents() {
        return this.events = getInstanceOf(SeriesEvents.class, this.events);
    }

    public HighchartsSeriesPlotOptions setEvents(SeriesEvents events) {
        this.events = events;
        return this;
    }

    public String getFindNearestPointBy() {
        return this.findNearestPointBy = getInstanceOf(String.class, this.findNearestPointBy);
    }

    public HighchartsSeriesPlotOptions setFindNearestPointBy(String findNearestPointBy) {
        this.findNearestPointBy = findNearestPointBy;
        return this;
    }

    public Boolean getGetExtremesFromAll() {
        return this.getExtremesFromAll = getInstanceOf(Boolean.class, this.getExtremesFromAll);
    }

    public HighchartsSeriesPlotOptions setGetExtremesFromAll(Boolean getExtremesFromAll) {
        this.getExtremesFromAll = getExtremesFromAll;
        return this;
    }

    public Boolean getIncludeInDataExport() {
        return this.includeInDataExport = getInstanceOf(Boolean.class, this.includeInDataExport);
    }

    public HighchartsSeriesPlotOptions setIncludeInDataExport(Boolean includeInDataExport) {
        this.includeInDataExport = includeInDataExport;
        return this;
    }

    public String[] getKeys() {
        return this.keys = getInstanceOf(String[].class, this.keys);
    }

    public HighchartsSeriesPlotOptions setKeys(String[] keys) {
        this.keys = keys;
        return this;
    }

    public SeriesLabelOptions getLabel() {
        return this.label = getInstanceOf(SeriesLabelOptions.class, this.label);
    }

    public HighchartsSeriesPlotOptions setLabel(SeriesLabelOptions label) {
        this.label = label;
        return this;
    }

    public HighchartsSeriesLinecapValue getLinecap() {
        return this.linecap = getInstanceOf(HighchartsSeriesLinecapValue.class, this.linecap);
    }

    public HighchartsSeriesPlotOptions setLinecap(HighchartsSeriesLinecapValue linecap) {
        this.linecap = linecap;
        return this;
    }

    public Integer getLineWidth() {
        return this.lineWidth = getInstanceOf(Integer.class, this.lineWidth);
    }

    public HighchartsSeriesPlotOptions setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String getLinkedTo() {
        return this.linkedTo = getInstanceOf(String.class, this.linkedTo);
    }

    public HighchartsSeriesPlotOptions setLinkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker getMarker() {
        return this.marker = getInstanceOf(Marker.class, this.marker);
    }

    public HighchartsSeriesPlotOptions setMarker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public HighchartsColor getNegativeColor() {
        return this.negativeColor = getInstanceOf(HighchartsColor.class, this.negativeColor);
    }

    public HighchartsSeriesPlotOptions setNegativeColor(HighchartsColor negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Integer getOpacity() {
        return this.opacity = getInstanceOf(Integer.class, this.opacity);
    }

    public HighchartsSeriesPlotOptions setOpacity(Integer opacity) {
        this.opacity = opacity;
        return this;
    }

    public Point getPoint() {
        return this.point = getInstanceOf(Point.class, this.point);
    }

    public HighchartsSeriesPlotOptions setPoint(Point point) {
        this.point = point;
        return this;
    }

    public HighchartsCallbackFunction getPointDescriptionFormatter() {
        return this.pointDescriptionFormatter = getInstanceOf(HighchartsCallbackFunction.class, this.pointDescriptionFormatter);
    }

    public HighchartsSeriesPlotOptions setPointDescriptionFormatter(HighchartsCallbackFunction pointDescriptionFormatter) {
        this.pointDescriptionFormatter = pointDescriptionFormatter;
        return this;
    }

    public Integer getPointInterval() {
        return this.pointInterval = getInstanceOf(Integer.class, this.pointInterval);
    }

    public HighchartsSeriesPlotOptions setPointInterval(Integer pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String getPointIntervalUnit() {
        return this.pointIntervalUnit = getInstanceOf(String.class, this.pointIntervalUnit);
    }

    public HighchartsSeriesPlotOptions setPointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public PointPlacement getPointPlacement() {
        return this.pointPlacement = getInstanceOf(PointPlacement.class, this.pointPlacement);
    }

    public HighchartsSeriesPlotOptions setPointPlacement(PointPlacement pointPlacement) {
        this.pointPlacement = pointPlacement;
        return this;
    }

    public Integer getPointStart() {
        return this.pointStart = getInstanceOf(Integer.class, this.pointStart);
    }

    public HighchartsSeriesPlotOptions setPointStart(Integer pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public Boolean getSelected() {
        return this.selected = getInstanceOf(Boolean.class, this.selected);
    }

    public HighchartsSeriesPlotOptions setSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    public HighchartsShadowOptionsObject getShadow() {
        return this.shadow = getInstanceOf(HighchartsShadowOptionsObject.class, this.shadow);
    }

    public HighchartsSeriesPlotOptions setShadow(HighchartsShadowOptionsObject shadow) {
        this.shadow = shadow;
        return this;
    }

    public Boolean getShowCheckbox() {
        return this.showCheckbox = getInstanceOf(Boolean.class, this.showCheckbox);
    }

    public HighchartsSeriesPlotOptions setShowCheckbox(Boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public Boolean getShowInLegend() {
        return this.showInLegend = getInstanceOf(Boolean.class, this.showInLegend);
    }

    public HighchartsSeriesPlotOptions setShowInLegend(Boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public Boolean getSkipKeyboardNavigation() {
        return this.skipKeyboardNavigation = getInstanceOf(Boolean.class, this.skipKeyboardNavigation);
    }

    public HighchartsSeriesPlotOptions setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
        this.skipKeyboardNavigation = skipKeyboardNavigation;
        return this;
    }

    public Boolean getSoftThreshold() {
        return this.softThreshold = getInstanceOf(Boolean.class, this.softThreshold);
    }

    public HighchartsSeriesPlotOptions setSoftThreshold(Boolean softThreshold) {
        this.softThreshold = softThreshold;
        return this;
    }

    public String getStacking() {
        return this.stacking = getInstanceOf(String.class, this.stacking);
    }

    public HighchartsSeriesPlotOptions setStacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public States getStates() {
        return this.states = getInstanceOf(States.class, this.states);
    }

    public HighchartsSeriesPlotOptions setStates(States states) {
        this.states = states;
        return this;
    }

    public String getStep() {
        return this.step = getInstanceOf(String.class, this.step);
    }

    public HighchartsSeriesPlotOptions setStep(String step) {
        this.step = step;
        return this;
    }

    public Boolean getStickyTracking() {
        return this.stickyTracking = getInstanceOf(Boolean.class, this.stickyTracking);
    }

    public HighchartsSeriesPlotOptions setStickyTracking(Boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Integer getThreshold() {
        return this.threshold = getInstanceOf(Integer.class, this.threshold);
    }

    public HighchartsSeriesPlotOptions setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip getTooltip() {
        return this.tooltip = getInstanceOf(Tooltip.class, this.tooltip);
    }

    public HighchartsSeriesPlotOptions setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Integer getTurboThreshold() {
        return this.turboThreshold = getInstanceOf(Integer.class, this.turboThreshold);
    }

    public HighchartsSeriesPlotOptions setTurboThreshold(Integer turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public Boolean getVisible() {
        return this.visible = getInstanceOf(Boolean.class, this.visible);
    }

    public HighchartsSeriesPlotOptions setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    public String getZoneAxis() {
        return this.zoneAxis = getInstanceOf(String.class, this.zoneAxis);
    }

    public HighchartsSeriesPlotOptions setZoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ZoneOptions[] getZones() {
        return this.zones = getInstanceOf(ZoneOptions[].class, this.zones);
    }

    public HighchartsSeriesPlotOptions setZones(ZoneOptions[] zones) {
        this.zones = zones;
        return this;
    }

    @Override
    public String deflateField(Field field, int tabLevel) {
        String ss = DrosteDeflater.super.delegateFieldDeflation(field, "shadow", shadow == null,
                () -> {
                    String s = shadow.deflateFields();
                    if (s == null || s.isEmpty()) {
                        return DrosteDeflater.getTabString(tabLevel) + "shadow: true,\n";
                    } else return s;
                });
        return ss != null && ss.equals(RTS) ? DrosteDeflater.super.deflateField(field, tabLevel) : ss;
    }
}
