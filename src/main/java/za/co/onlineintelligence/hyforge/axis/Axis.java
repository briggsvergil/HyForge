package za.co.onlineintelligence.hyforge.axis;

import za.co.onlineintelligence.hyforge.accessibility.Accessibility;
import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAxisType;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsDashStyleValue;
import za.co.onlineintelligence.hyforge.scrollbar.Scrollbar;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * @author Sean Briggs
 */
public class Axis implements Serializable, DrosteDeflater {

    public Axis() {
    }

    /**
     * Accessibility options for an axis. Requires the accessibility module.
     *
     * @since 7.1.0
     */
    private Accessibility accessibility;

    /**
     * When using multiple axis, the ticks of two or more opposite axes will
     * automatically be aligned by adding ticks to the axis or axes with the
     * least ticks, as if `tickAmount` were specified.
     * <p>
     * This can be prevented by setting `alignTicks` to false. If the grid lines
     * look messy, it's a good idea to hide them for the secondary axis by
     * setting `gridLineWidth` to 0.
     * <p>
     * If `startOnTick` or `endOnTick` in an axis options are set to false, then
     * the `alignTicks ` will be disabled for the axis.
     * <p>
     * Disabled for logarithmic axes.
     */
    private Boolean alignTicks;

    /**
     * Whether to allow decimals in this axis' ticks. When counting integers,
     * like persons or hits on a web page, decimals should be avoided in the
     * labels.
     *
     * @since 2.0.0
     */
    private Boolean allowDecimals;

    /**
     * When using an alternate grid color, a band is painted across the plot
     * area between every other grid line.
     */
    private HighchartsColor alternateGridColor;

    /**
     * In a polar chart, this is the angle of the Y axis in degrees, where 0 is
     * up and 90 is right. The angle determines the position of the axis line
     * and the labels, though the coordinate system is unaffected. Since v8.0.0
     * this option is also applicable for X axis (inverted polar).
     *
     * @since 4.2.7
     */
    private Integer angle;

    /**
     * An array defining breaks in the axis, the sections defined will be left
     * out and all the points shifted closer to each other.
     *
     * @since 4.1.0
     */
    private Breaks[] breaks;

    /**
     * If categories are present for the xAxis, names are used instead of
     * numbers for that axis.
     * <p>
     * Since Highcharts 3.0, categories can also be extracted by giving each
     * point a [name](#series.data) and setting axis [type](#xAxis.type) to
     * `category`. However, if you have multiple series, best practice remains
     * defining the `categories` array.
     * <p>
     * Example: `categories: ['Apples', 'Bananas', 'Oranges']`
     */
    private String[] categories;

    /**
     * The highest allowed value for automatically computed axis extremes.
     *
     * @since 4.0.0
     */
    private Integer ceiling;

    /**
     * A class name that opens for styling the axis by CSS, especially in
     * Highcharts styled mode. The class name is applied to group elements for
     * the grid, axis elements and labels.
     *
     * @since 5.0.0
     */
    private String className;

    /**
     * Configure a crosshair that follows either the mouse pointer or the
     * hovered point.
     * <p>
     * In styled mode, the crosshairs are styled in the `.highcharts-crosshair`,
     * `.highcharts-crosshair-thin` or `.highcharts-xaxis-category` classes.
     *
     * @since 4.1.0
     */
    private Crosshair crosshair;

    /**
     * Show an indicator on the axis for the current date and time. Can be a
     * boolean or a configuration object similar to
     * [xAxis.plotLines](#xAxis.plotLines).
     * <p>
     * ##STILL TO BE FULLY IMPLEMENTED##
     */
    private Boolean currentDateIndicator;

    /**
     * For a datetime axis, the scale will automatically adjust to the
     * appropriate unit. This member gives the default string representations
     * used for each unit. For intermediate values, different units may be used,
     * for example the `day` unit can be used on midnight and `hour` unit be
     * used for intermediate values on the same axis. For an overview of the
     * replacement codes, see
     * [dateFormat](/class-reference/Highcharts#dateFormat).
     * <p>
     * Defaults to: ```js { millisecond: '%H:%M:%S.%L', second: '%H:%M:%S',
     * minute: '%H:%M', hour: '%H:%M', day: '%e. %b', week: '%e. %b', month: '%b
     * \'%y', year: '%Y' } ```
     */
    private DateTimeLabelFormats dateTimeLabelFormats;

    /**
     * Whether to force the axis to end on a tick. Use this option with the
     * `maxPadding` option to control the axis end.
     *
     * @since 1.2.0
     */
    private Boolean endOnTick;

    /**
     * SeriesEvents handlers for the axis.
     */
    private AxisEvents events;

    /**
     * The lowest allowed value for automatically computed axis extremes.
     *
     * @since 4.0.0
     */
    private Integer floor;

    /**
     * Set grid options for the axis labels. Requires Highcharts Gantt.
     *
     * @since 6.2.0
     */
    private AxisGrid grid;

    /**
     * Color of the grid lines extending the ticks across the plot area.
     * <p>
     * In styled mode, the stroke is given in the `.highcharts-grid-line` class.
     */
    private HighchartsColor gridLineColor;

    /**
     * The dash or dot style of the grid lines. For possible values, see [this
     * demonstration](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/).
     *
     * @since 1.2.0
     */
    private HighchartsDashStyleValue gridLineDashStyle;

    /**
     * Polar charts only. Whether the grid lines should draw as a polygon with
     * straight lines between categories, or as circles. Can be either `circle`
     * or `polygon`. Since v8.0.0 this option is also applicable for X axis
     * (inverted polar).
     */
    private String gridLineInterpolation;

    /**
     * The width of the grid lines extending the ticks across the plot area.
     * <p>
     * In styled mode, the stroke width is given in the `.highcharts-grid-line`
     * class.
     */
    private Integer gridLineWidth;

    /**
     * The Z index of the grid lines.
     */
    private Integer gridZIndex;

    /**
     * The height as the vertical axis. If it's a number, it is interpreted as
     * pixels.
     * <p>
     * Since Highcharts 2: If it's a percentage string, it is interpreted as
     * percentages of the total plot height.
     */
    private HighchartsSize height;

    /**
     * An id for the axis. This can be used after render time to get a pointer
     * to the axis object through `chart.get()`.
     *
     * @since 1.2.0
     */
    private String id;

    /**
     * The axis labels show the number or category for each tick.
     * <p>
     * Since v8.0.0: LegendLabelOptions are animated in categorized x-axis with updating
     * data if `tickInterval` and `step` is set to 1.
     */
    private AxisLabels labels;

    /**
     * The left position as the horizontal axis. If it's a number, it is
     * interpreted as pixel position relative to the chart.
     * <p>
     * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
     * as percentages of the plot width, offset from plot area left.
     */
    private HighchartsSize left;

    /**
     * The color of the line marking the axis itself.
     * <p>
     * In styled mode, the line stroke is given in the `.highcharts-axis-line`
     * or `.highcharts-xaxis-line` class.
     */
    private HighchartsColor lineColor;

    /**
     * The width of the line marking the axis itself.
     * <p>
     * In styled mode, the stroke width is given in the `.highcharts-axis-line`
     * or `.highcharts-xaxis-line` class.
     */
    private Integer lineWidth;

    /**
     * Index of another axis that this axis is linked to. When an axis is linked
     * to a master axis, it will take the same extremes as the master, but as
     * assigned by min or max or by setExtremes. It can be used to show
     * additional info, or to ease reading the chart by duplicating the scales.
     *
     * @since 2.0.2
     */
    private Integer linkedTo;

    /**
     * If there are multiple axes on the same side of the chart, the pixel
     * margin between the axes. Defaults to 0 on vertical axes, 15 on horizontal
     * axes.
     *
     * @since 7.0.3
     */
    private Integer margin;

    /**
     * The maximum value of the axis. If `null`, the max value is automatically
     * calculated.
     * <p>
     * If the [endOnTick](#yAxis.endOnTick) option is true, the `max` value
     * might be rounded up.
     * <p>
     * If a [tickAmount](#yAxis.tickAmount) is set, the axis may be extended
     * beyond the set max in order to reach the given number of ticks. The same
     * may happen in a chart with multiple axes, determined by [chart.
     * alignTicks](#chart), where a `tickAmount` is applied internally.
     */
    private Double max;

    /**
     * Padding of the max value relative to the length of the axis. A padding of
     * 0.05 will make a 100px axis 5px longer. This is useful when you don't
     * want the highest data value to appear on the edge of the plot area. When
     * the axis' `max` option is set or a max extreme is set using
     * `axis.setExtremes()`, the maxPadding will be ignored.
     *
     * @since 1.2.0
     */
    private Integer maxPadding;

    /**
     * Maximum range which can be set using the navigator's handles. Opposite of
     * [xAxis.minRange](#xAxis.minRange).
     *
     * @since 6.0.0
     */
    private Integer maxRange;

    /**
     * Deprecated. Use `minRange` instead.
     */
    private Integer maxZoom;

    /**
     * The minimum value of the axis. If `null` the min value is automatically
     * calculated.
     * <p>
     * If the [startOnTick](#yAxis.startOnTick) option is true (default), the
     * `min` value might be rounded down.
     * <p>
     * The automatically calculated minimum value is also affected by
     * [floor](#yAxis.floor), [softMin](#yAxis.softMin),
     * [minPadding](#yAxis.minPadding), [minRange](#yAxis.minRange) as well as
     * [series.threshold](#plotOptions.series.threshold) and
     * [series.softThreshold](#plotOptions.series.softThreshold).
     */
    private Double min;

    /**
     * Padding of the min value relative to the length of the axis. A padding of
     * 0.05 will make a 100px axis 5px longer. This is useful when you don't
     * want the lowest data value to appear on the edge of the plot area. When
     * the axis' `min` option is set or a min extreme is set using
     * `axis.setExtremes()`, the minPadding will be ignored.
     *
     * @since 1.2.0
     */
    private Integer minPadding;

    /**
     * The minimum range to display on this axis. The entire axis will not be
     * allowed to span over a smaller interval than this. For example, for a
     * datetime axis the main unit is milliseconds. If minRange is set to
     * 3600000, you can't zoom in more than to one hour.
     * <p>
     * The default minRange for the x axis is five times the smallest interval
     * between any of the data points.
     * <p>
     * On a logarithmic axis, the unit for the minimum range is the power. So a
     * minRange of 1 means that the axis can be zoomed to 10-100, 100-1000,
     * 1000-10000 etc.
     * <p>
     * Note that the `minPadding`, `maxPadding`, `startOnTick` and `endOnTick`
     * settings also affect how the extremes of the axis are computed.
     */
    private Integer minRange;

    /**
     * The minimum tick interval allowed in axis values. For example on zooming
     * in on an axis with daily data, this can be used to prevent the axis from
     * showing hours. Defaults to the closest distance between two points on the
     * axis.
     *
     * @since 2.3.0
     */
    private Integer minTickInterval;

    /**
     * Color of the minor, secondary grid lines.
     * <p>
     * In styled mode, the stroke width is given in the
     * `.highcharts-minor-grid-line` class.
     */
    private HighchartsColor minorGridLineColor;

    /**
     * The dash or dot style of the minor grid lines. For possible values, see
     * [this
     * demonstration](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/).
     *
     * @since 1.2.0
     */
    private HighchartsDashStyleValue minorGridLineDashStyle;

    /**
     * Width of the minor, secondary grid lines.
     * <p>
     * In styled mode, the stroke width is given in the `.highcharts-grid-line`
     * class.
     */
    private Integer minorGridLineWidth;

    /**
     * Color for the minor tick marks.
     */
    private HighchartsColor minorTickColor;

    /**
     * Specific tick interval in axis units for the minor ticks. On a linear
     * axis, if `"auto"`, the minor tick interval is calculated as a fifth of
     * the tickInterval. If `null` or `undefined`, minor ticks are not shown.
     * <p>
     * On logarithmic axes, the unit is the power of the value. For example,
     * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
     * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
     * and 10, 10 and 100 etc.
     * <p>
     * If user settings dictate minor ticks to become too dense, they don't make
     * sense, and will be ignored to prevent performance problems.
     */
    private HighchartsSize minorTickInterval;

    /**
     * The pixel length of the minor tick marks.
     */
    private Integer minorTickLength;

    /**
     * The position of the minor tick marks relative to the axis line. Can be
     * one of `inside` and `outside`.
     */
    private String minorTickPosition;

    /**
     * The pixel width of the minor tick mark.
     */
    private Integer minorTickWidth;

    /**
     * Enable or disable minor ticks. Unless
     * [minorTickInterval](#xAxis.minorTickInterval) is set, the tick interval
     * is calculated as a fifth of the `tickInterval`.
     * <p>
     * On a logarithmic axis, minor ticks are laid out based on a best guess,
     * attempting to enter approximately 5 minor ticks between each major tick.
     * <p>
     * Prior to v6.0.0, ticks were unabled in auto layout by setting
     * `minorTickInterval` to `"auto"`.
     *
     * @since 6.0.0
     */
    private Boolean minorTicks;

    /**
     * The distance in pixels from the plot area to the axis line. A positive
     * offset moves the axis with it's line, labels and ticks away from the plot
     * area. This is typically used when two or more axes are displayed on the
     * same side of the plot. With multiple axes the offset is dynamically
     * adjusted to avoid collision, this can be overridden by setting offset
     * explicitly.
     */
    private Integer offset;

    /**
     * Whether to display the axis on the opposite side of the normal. The
     * normal is on the left side for vertical axes and bottom for horizontal,
     * so the opposite sides will be right and top respectively. This is
     * typically used with dual or multiple axes.
     */
    private Boolean opposite;

    /**
     * In an ordinal axis, the points are equally spaced in the chart regardless
     * of the actual time or x distance between them. This means that missing
     * data periods (e.g. nights or weekends for a stock chart) will not take up
     * space in the chart. Having `ordinal: false` will show any gaps created by
     * the `gapSize` setting proportionate to their duration.
     * <p>
     * In stock charts the X axis is ordinal by default, unless the boost module
     * is used and at least one of the series' data length exceeds the
     * [boostThreshold](#series.line.boostThreshold).
     *
     * @since 1.1.0
     */
    private Boolean ordinal;

    /**
     * Additional range on the right side of the xAxis. Works similar to
     * `xAxis.maxPadding`, but value is set in milliseconds. Can be set for both
     * main `xAxis` and the navigator's `xAxis`.
     *
     * @since 6.0.0
     */
    private Integer overscroll;

    /**
     * Refers to the index in the [panes](#panes) array. Used for circular
     * gauges and polar charts. When the option is not set then first pane will
     * be used.
     */
    private Integer pane;

    /**
     * An array of colored bands stretching across the plot area marking an
     * interval on the axis.
     * <p>
     * In styled mode, the plot bands are styled by the `.highcharts-plot-band`
     * class in addition to the `className` option.
     */
    private PlotBand[] plotBands;

    /**
     * An array of lines stretching across the plot area, marking a specific
     * value on one of the axes.
     * <p>
     * In styled mode, the plot lines are styled by the `.highcharts-plot-line`
     * class in addition to the `className` option.
     */
    private PlotLine[] plotLines;

    /**
     * The zoomed range to display when only defining one or none of `min` or
     * `max`. For example, to show the latest month, a range of one month can be
     * set.
     */
    private Integer range;

    /**
     * Whether to reverse the axis so that the highest number is closest to the
     * origin. If the chart is inverted, the x axis is reversed by default.
     */
    private Boolean reversed;

    /**
     * This option determines how stacks should be ordered within a group. For
     * example reversed xAxis also reverses stacks, so first series comes last
     * in a group. To keep order like for non-reversed xAxis enable this option.
     *
     * @since 6.1.1
     */
    private Boolean reversedStacks;

    /**
     * An optional scrollbar to display on the X axis in response to limiting
     * the minimum and maximum of the axis values.
     * <p>
     * In styled mode, all the presentational options for the scrollbar are
     * replaced by the classes `.highcharts-scrollbar-thumb`,
     * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`,
     * `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`.
     *
     * @since 4.2.6
     */
    private Scrollbar scrollbar;

    /**
     * Whether to show the axis line and title when the axis has no data.
     *
     * @since 1.1.0
     */
    private Boolean showEmpty;

    /**
     * Whether to show the first tick label.
     */
    private Boolean showFirstLabel;

    /**
     * Whether to show the last tick label. Defaults to `true` on cartesian
     * charts, and `false` on polar charts.
     */
    private Boolean showLastLabel;

    /**
     * A soft maximum for the axis. If the series data maximum is less than
     * this, the axis will stay at this maximum, but if the series data maximum
     * is higher, the axis will flex to show all data.
     *
     * @since 5.0.1
     */
    private Integer softMax;

    /**
     * A soft minimum for the axis. If the series data minimum is greater than
     * this, the axis will stay at this minimum, but if the series data minimum
     * is lower, the axis will flex to show all data.
     *
     * @since 5.0.1
     */
    private Integer softMin;

    /**
     * For datetime axes, this decides where to put the tick between weeks. 0 =
     * Sunday, 1 = Monday.
     */
    private Integer startOfWeek;

    /**
     * Whether to force the axis to start on a tick. Use this option with the
     * `minPadding` option to control the axis start.
     *
     * @since 1.2.0
     */
    private Boolean startOnTick;

    /**
     * The amount of ticks to draw on the axis. This opens up for aligning the
     * ticks of multiple charts or panes within a chart. This option overrides
     * the `tickPixelInterval` option.
     * <p>
     * This option only has an effect on linear axes. Datetime, logarithmic or
     * category axes are not affected.
     *
     * @since 4.1.0
     */
    private Integer tickAmount;

    /**
     * Color for the main tick marks.
     * <p>
     * In styled mode, the stroke is given in the `.highcharts-tick` class.
     */
    private HighchartsColor tickColor;

    /**
     * The interval of the tick marks in axis units. When `undefined`, the tick
     * interval is computed to approximately follow the
     * [tickPixelInterval](#xAxis.tickPixelInterval) on linear and datetime
     * axes. On categorized axes, a `undefined` tickInterval will default to 1,
     * one category. Note that datetime axes are based on milliseconds, so for
     * example an interval of one day is expressed as `24 * 3600 * 1000`.
     * <p>
     * On logarithmic axes, the tickInterval is based on powers, so a
     * tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A
     * tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of
     * 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40
     * etc.
     * <p>
     * <p>
     * If the tickInterval is too dense for labels to be drawn, Highcharts may
     * remove ticks.
     * <p>
     * If the chart has multiple axes, the [alignTicks](#chart.alignTicks)
     * option may interfere with the `tickInterval` setting.
     */
    private Integer tickInterval;

    /**
     * The pixel length of the main tick marks.
     */
    private Integer tickLength;

    /**
     * If tickInterval is `null` this option sets the approximate pixel interval
     * of the tick marks. Not applicable to categorized axis.
     * <p>
     * The tick interval is also influenced by the
     * [minTickInterval](#xAxis.minTickInterval) option, that, by default
     * prevents ticks from being denser than the data points.
     */
    private Integer tickPixelInterval;

    /**
     * The position of the major tick marks relative to the axis line. Can be
     * one of `inside` and `outside`.
     */
    private String tickPosition;

    /**
     * A callback function returning array defining where the ticks are laid out
     * on the axis. This overrides the default behaviour of
     * [tickPixelInterval](#xAxis.tickPixelInterval) and
     * [tickInterval](#xAxis.tickInterval). The automatic tick positions are
     * accessible through `this.tickPositions` and can be modified by the
     * callback.
     */
    private HighchartsCallbackFunction tickPositioner;

    /**
     * An array defining where the ticks are laid out on the axis. This
     * overrides the default behaviour of
     * [tickPixelInterval](#xAxis.tickPixelInterval) and
     * [tickInterval](#xAxis.tickInterval).
     */
    private int[] tickPositions;

    /**
     * The pixel width of the major tick marks. Defaults to 0 on category axes,
     * otherwise 1.
     * <p>
     * In styled mode, the stroke width is given in the `.highcharts-tick`
     * class, but in order for the element to be generated on category axes, the
     * option must be explicitly set to 1.
     */
    private Integer tickWidth;

    /**
     * For categorized axes only. If `on` the tick mark is placed in the center
     * of the category, if `between` the tick mark is placed between categories.
     * The default is `between` if the `tickInterval` is 1, else `on`.
     */
    private String tickmarkPlacement;

    /**
     * The axis title, showing next to the axis line.
     */
    private AxisTitle title;

    /**
     * The top position as the vertical axis. If it's a number, it is
     * interpreted as pixel position relative to the chart.
     * <p>
     * Since Highcharts 2: If it's a percentage string, it is interpreted as
     * percentages of the plot height, offset from plot area top.
     */
    private HighchartsSize top;

    /**
     * The type of axis. Can be one of `linear`, `logarithmic`, `datetime` or
     * `category`. In a datetime axis, the numbers are given in milliseconds,
     * and tick marks are placed on appropriate values like full hours or days.
     * In a category axis, the [point names](#series.line.data.name) of the
     * chart's series are used for categories, if not a
     * [categories](#xAxis.categories) array is defined.
     */
    private HighchartsAxisType type;

    /**
     * Applies only when the axis `type` is `category`. When `uniqueNames` is
     * true, points are placed on the X axis according to their names. If the
     * same point name is repeated in the same or another series, the point is
     * placed on the same X position as other points of the same name. When
     * `uniqueNames` is false, the points are laid out in increasing X positions
     * regardless of their names, and the X axis category will take the name of
     * the last point in each position.
     *
     * @since 4.2.7
     */
    private Boolean uniqueNames;

    /**
     * Datetime axis only. An array determining what time intervals the ticks
     * are allowed to fall on. Each array item is an array where the first value
     * is the time unit and the second value another array of allowed multiples.
     * <p>
     * Defaults to: ```js units: [[ 'millisecond', // unit name [1, 2, 5, 10,
     * 20, 25, 50, 100, 200, 500] // allowed multiples ], [ 'second', [1, 2, 5,
     * 10, 15, 30] ], [ 'minute', [1, 2, 5, 10, 15, 30] ], [ 'hour', [1, 2, 3,
     * 4, 6, 8, 12] ], [ 'day', [1] ], [ 'week', [1] ], [ 'month', [1, 3, 6] ],
     * [ 'year', null ]] ```
     */
    private List<Map<String, List<Integer>>> units;

    /**
     * Whether axis, including axis title, line, ticks and labels, should be
     * visible.
     *
     * @since 4.1.9
     */
    private Boolean visible;

    /**
     * The width as the horizontal axis. If it's a number, it is interpreted as
     * pixels.
     * <p>
     * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
     * as percentages of the total plot width.
     */
    private HighchartsSize width;

    /**
     * Whether to zoom axis. If `chart.zoomType` is set, the option allows to
     * disable zooming on an individual axis.
     */
    private Boolean zoomEnabled;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */

    public Accessibility getAccessibility() {
        return getInstanceOf(Accessibility.class, this.accessibility);
    }

    public Axis setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    public boolean getAlignTicks() {
        return getInstanceOf(boolean.class, this.alignTicks);
    }

    public Axis setAlignTicks(boolean alignTicks) {
        this.alignTicks = alignTicks;
        return this;
    }

    public boolean getAllowDecimals() {
        return getInstanceOf(boolean.class, this.allowDecimals);
    }

    public Axis setAllowDecimals(boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
        return this;
    }

    public HighchartsColor AxisternateGridColor() {
        return getInstanceOf(HighchartsColor.class, this.alternateGridColor);
    }

    public Axis setAlternateGridColor(HighchartsColor alternateGridColor) {
        this.alternateGridColor = alternateGridColor;
        return this;
    }

    public int getAngle() {
        return getInstanceOf(int.class, this.angle);
    }

    public Axis setAngle(int angle) {
        this.angle = angle;
        return this;
    }

    public Breaks[] getBreaks() {
        return getInstanceOf(Breaks[].class, this.breaks);
    }

    public Axis setBreaks(Breaks[] breaks) {
        this.breaks = breaks;
        return this;
    }

    public String[] getCategories() {
        return getInstanceOf(String[].class, this.categories);
    }

    public Axis setCategories(String[] categories) {
        this.categories = categories;
        return this;
    }

    public int getCeiling() {
        return getInstanceOf(int.class, this.ceiling);
    }

    public Axis setCeiling(int ceiling) {
        this.ceiling = ceiling;
        return this;
    }

    public String getClassName() {
        return getInstanceOf(String.class, this.className);
    }

    public Axis setClassName(String className) {
        this.className = className;
        return this;
    }

    public Crosshair Axisosshair() {
        return getInstanceOf(Crosshair.class, this.crosshair);
    }

    public Axis setCrosshair(Crosshair crosshair) {
        this.crosshair = crosshair;
        return this;
    }

    public boolean AxisrrentDateIndicator() {
        return getInstanceOf(boolean.class, this.currentDateIndicator);
    }

    public Axis setCurrentDateIndicator(boolean currentDateIndicator) {
        this.currentDateIndicator = currentDateIndicator;
        return this;
    }

    public DateTimeLabelFormats getDateTimeLabelFormats() {
        return getInstanceOf(DateTimeLabelFormats.class, this.dateTimeLabelFormats);
    }

    public Axis setDateTimeLabelFormats(DateTimeLabelFormats dateTimeLabelFormats) {
        this.dateTimeLabelFormats = dateTimeLabelFormats;
        return this;
    }

    public boolean getEndOnTick() {
        return getInstanceOf(boolean.class, this.endOnTick);
    }

    public Axis setEndOnTick(boolean endOnTick) {
        this.endOnTick = endOnTick;
        return this;
    }

    public AxisEvents getEvents() {
        return getInstanceOf(AxisEvents.class, this.events);
    }

    public Axis setEvents(AxisEvents events) {
        this.events = events;
        return this;
    }

    public int getFloor() {
        return getInstanceOf(int.class, this.floor);
    }

    public Axis setFloor(int floor) {
        this.floor = floor;
        return this;
    }

    public AxisGrid getGrid() {
        return getInstanceOf(AxisGrid.class, this.grid);
    }

    public Axis setGrid(AxisGrid grid) {
        this.grid = grid;
        return this;
    }

    public HighchartsColor getGridLineColor() {
        return getInstanceOf(HighchartsColor.class, this.gridLineColor);
    }

    public Axis setGridLineColor(HighchartsColor gridLineColor) {
        this.gridLineColor = gridLineColor;
        return this;
    }

    public HighchartsDashStyleValue getGridLineDashStyle() {
        return getInstanceOf(HighchartsDashStyleValue.class, this.gridLineDashStyle);
    }

    public Axis setGridLineDashStyle(HighchartsDashStyleValue gridLineDashStyle) {
        this.gridLineDashStyle = gridLineDashStyle;
        return this;
    }

    public String getGridLineInterpolation() {
        return getInstanceOf(String.class, this.gridLineInterpolation);
    }

    public Axis setGridLineInterpolation(String gridLineInterpolation) {
        this.gridLineInterpolation = gridLineInterpolation;
        return this;
    }

    public int getGridLineWidth() {
        return getInstanceOf(int.class, this.gridLineWidth);
    }

    public Axis setGridLineWidth(int gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
        return this;
    }

    public int getGridZIndex() {
        return getInstanceOf(int.class, this.gridZIndex);
    }

    public Axis setGridZIndex(int gridZIndex) {
        this.gridZIndex = gridZIndex;
        return this;
    }

    public HighchartsSize getHeight() {
        return getInstanceOf(HighchartsSize.class, this.height);
    }

    public Axis setHeight(HighchartsSize height) {
        this.height = height;
        return this;
    }

    public String getId() {
        return getInstanceOf(String.class, this.id);
    }

    public Axis setId(String id) {
        this.id = id;
        return this;
    }

    public AxisLabels getLabels() {
        return getInstanceOf(AxisLabels.class, this.labels);
    }

    public Axis setLabels(AxisLabels labels) {
        this.labels = labels;
        return this;
    }

    public HighchartsSize getLeft() {
        return getInstanceOf(HighchartsSize.class, this.left);
    }

    public Axis setLeft(HighchartsSize left) {
        this.left = left;
        return this;
    }

    public HighchartsColor getLineColor() {
        return getInstanceOf(HighchartsColor.class, this.lineColor);
    }

    public Axis setLineColor(HighchartsColor lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public int getLineWidth() {
        return getInstanceOf(int.class, this.lineWidth);
    }

    public Axis setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public int getLinkedTo() {
        return getInstanceOf(int.class, this.linkedTo);
    }

    public Axis setLinkedTo(int linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public int getMargin() {
        return getInstanceOf(int.class, this.margin);
    }

    public Axis setMargin(int margin) {
        this.margin = margin;
        return this;
    }

    public Double getMax() {
        return getInstanceOf(Double.class, this.max);
    }

    public Axis setMax(Double max) {
        this.max = max;
        return this;
    }

    public int getMaxPadding() {
        return getInstanceOf(int.class, this.maxPadding);
    }

    public Axis setMaxPadding(int maxPadding) {
        this.maxPadding = maxPadding;
        return this;
    }

    public int getMaxRange() {
        return getInstanceOf(int.class, this.maxRange);
    }

    public Axis setMaxRange(int maxRange) {
        this.maxRange = maxRange;
        return this;
    }

    public int getMaxZoom() {
        return getInstanceOf(int.class, this.maxZoom);
    }

    public Axis setMaxZoom(int maxZoom) {
        this.maxZoom = maxZoom;
        return this;
    }

    public Double getMin() {
        return getInstanceOf(Double.class, this.min);
    }

    public Axis setMin(Double min) {
        this.min = min;
        return this;
    }

    public int getMinPadding() {
        return getInstanceOf(int.class, this.minPadding);
    }

    public Axis setMinPadding(int minPadding) {
        this.minPadding = minPadding;
        return this;
    }

    public int getMinRange() {
        return getInstanceOf(int.class, this.minRange);
    }

    public Axis setMinRange(int minRange) {
        this.minRange = minRange;
        return this;
    }

    public int getMinTickInterval() {
        return getInstanceOf(int.class, this.minTickInterval);
    }

    public Axis setMinTickInterval(int minTickInterval) {
        this.minTickInterval = minTickInterval;
        return this;
    }

    public HighchartsColor getMinorGridLineColor() {
        return getInstanceOf(HighchartsColor.class, this.minorGridLineColor);
    }

    public Axis setMinorGridLineColor(HighchartsColor minorGridLineColor) {
        this.minorGridLineColor = minorGridLineColor;
        return this;
    }

    public HighchartsDashStyleValue getMinorGridLineDashStyle() {
        return getInstanceOf(HighchartsDashStyleValue.class, this.minorGridLineDashStyle);
    }

    public Axis setMinorGridLineDashStyle(HighchartsDashStyleValue minorGridLineDashStyle) {
        this.minorGridLineDashStyle = minorGridLineDashStyle;
        return this;
    }

    public int getMinorGridLineWidth() {
        return getInstanceOf(int.class, this.minorGridLineWidth);
    }

    public Axis setMinorGridLineWidth(int minorGridLineWidth) {
        this.minorGridLineWidth = minorGridLineWidth;
        return this;
    }

    public HighchartsColor getMinorTickColor() {
        return getInstanceOf(HighchartsColor.class, this.minorTickColor);
    }

    public Axis setMinorTickColor(HighchartsColor minorTickColor) {
        this.minorTickColor = minorTickColor;
        return this;
    }

    public HighchartsSize getMinorTickInterval() {
        return getInstanceOf(HighchartsSize.class, this.minorTickInterval);
    }

    public Axis setMinorTickInterval(HighchartsSize minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
        return this;
    }

    public int getMinorTickLength() {
        return getInstanceOf(int.class, this.minorTickLength);
    }

    public Axis setMinorTickLength(int minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    public String getMinorTickPosition() {
        return getInstanceOf(String.class, this.minorTickPosition);
    }

    public Axis setMinorTickPosition(String minorTickPosition) {
        this.minorTickPosition = minorTickPosition;
        return this;
    }

    public int getMinorTickWidth() {
        return getInstanceOf(int.class, this.minorTickWidth);
    }

    public Axis setMinorTickWidth(int minorTickWidth) {
        this.minorTickWidth = minorTickWidth;
        return this;
    }

    public boolean getMinorTicks() {
        return getInstanceOf(boolean.class, this.minorTicks);
    }

    public Axis setMinorTicks(boolean minorTicks) {
        this.minorTicks = minorTicks;
        return this;
    }

    public int getOffset() {
        return getInstanceOf(int.class, this.offset);
    }

    public Axis setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    public boolean getOpposite() {
        return getInstanceOf(boolean.class, this.opposite);
    }

    public Axis setOpposite(boolean opposite) {
        this.opposite = opposite;
        return this;
    }

    public boolean getOrdinal() {
        return getInstanceOf(boolean.class, this.ordinal);
    }

    public Axis setOrdinal(boolean ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    public int getOverscroll() {
        return getInstanceOf(int.class, this.overscroll);
    }

    public Axis setOverscroll(int overscroll) {
        this.overscroll = overscroll;
        return this;
    }

    public int getPane() {
        return getInstanceOf(int.class, this.pane);
    }

    public Axis setPane(int pane) {
        this.pane = pane;
        return this;
    }

    public PlotBand[] getPlotBands() {
        return getInstanceOf(PlotBand[].class, this.plotBands);
    }

    public Axis setPlotBands(PlotBand[] plotBands) {
        this.plotBands = plotBands;
        return this;
    }

    public PlotLine[] getPlotLines() {
        return getInstanceOf(PlotLine[].class, this.plotLines);
    }

    public Axis setPlotLines(PlotLine[] plotLines) {
        this.plotLines = plotLines;
        return this;
    }

    public int getRange() {
        return getInstanceOf(int.class, this.range);
    }

    public Axis setRange(int range) {
        this.range = range;
        return this;
    }

    public boolean getReversed() {
        return getInstanceOf(boolean.class, this.reversed);
    }

    public Axis setReversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public boolean getReversedStacks() {
        return getInstanceOf(boolean.class, this.reversedStacks);
    }

    public Axis setReversedStacks(boolean reversedStacks) {
        this.reversedStacks = reversedStacks;
        return this;
    }

    public Scrollbar getScrollbar() {
        return getInstanceOf(Scrollbar.class, this.scrollbar);
    }

    public Axis setScrollbar(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
        return this;
    }

    public boolean getShowEmpty() {
        return getInstanceOf(boolean.class, this.showEmpty);
    }

    public Axis setShowEmpty(boolean showEmpty) {
        this.showEmpty = showEmpty;
        return this;
    }

    public boolean getShowFirstLabel() {
        return getInstanceOf(boolean.class, this.showFirstLabel);
    }

    public Axis setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public boolean getShowLastLabel() {
        return getInstanceOf(boolean.class, this.showLastLabel);
    }

    public Axis setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    public int getSoftMax() {
        return getInstanceOf(int.class, this.softMax);
    }

    public Axis setSoftMax(int softMax) {
        this.softMax = softMax;
        return this;
    }

    public int getSoftMin() {
        return getInstanceOf(int.class, this.softMin);
    }

    public Axis setSoftMin(int softMin) {
        this.softMin = softMin;
        return this;
    }

    public int getStartOfWeek() {
        return getInstanceOf(int.class, this.startOfWeek);
    }

    public Axis setStartOfWeek(int startOfWeek) {
        this.startOfWeek = startOfWeek;
        return this;
    }

    public boolean getStartOnTick() {
        return getInstanceOf(boolean.class, this.startOnTick);
    }

    public Axis setStartOnTick(boolean startOnTick) {
        this.startOnTick = startOnTick;
        return this;
    }

    public int getTickAmount() {
        return getInstanceOf(int.class, this.tickAmount);
    }

    public Axis setTickAmount(int tickAmount) {
        this.tickAmount = tickAmount;
        return this;
    }

    public HighchartsColor getTickColor() {
        return getInstanceOf(HighchartsColor.class, this.tickColor);
    }

    public Axis setTickColor(HighchartsColor tickColor) {
        this.tickColor = tickColor;
        return this;
    }

    public int getTickInterval() {
        return getInstanceOf(int.class, this.tickInterval);
    }

    public Axis setTickInterval(int tickInterval) {
        this.tickInterval = tickInterval;
        return this;
    }

    public int getTickLength() {
        return getInstanceOf(int.class, this.tickLength);
    }

    public Axis setTickLength(int tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public int getTickPixelInterval() {
        return getInstanceOf(int.class, this.tickPixelInterval);
    }

    public Axis setTickPixelInterval(int tickPixelInterval) {
        this.tickPixelInterval = tickPixelInterval;
        return this;
    }

    public String getTickPosition() {
        return getInstanceOf(String.class, this.tickPosition);
    }

    public Axis setTickPosition(String tickPosition) {
        this.tickPosition = tickPosition;
        return this;
    }

    public HighchartsCallbackFunction getTickPositioner() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.tickPositioner);
    }

    public Axis setTickPositioner(HighchartsCallbackFunction tickPositioner) {
        this.tickPositioner = tickPositioner;
        return this;
    }

    public int[] getTickPositions() {
        return getInstanceOf(int[].class, this.tickPositions);
    }

    public Axis setTickPositions(int[] tickPositions) {
        this.tickPositions = tickPositions;
        return this;
    }

    public int getTickWidth() {
        return getInstanceOf(int.class, this.tickWidth);
    }

    public Axis setTickWidth(int tickWidth) {
        this.tickWidth = tickWidth;
        return this;
    }

    public String getTickmarkPlacement() {
        return getInstanceOf(String.class, this.tickmarkPlacement);
    }

    public Axis setTickmarkPlacement(String tickmarkPlacement) {
        this.tickmarkPlacement = tickmarkPlacement;
        return this;
    }

    public AxisTitle getTitle() {
        return getInstanceOf(AxisTitle.class, this.title);
    }

    public Axis setTitle(AxisTitle title) {
        this.title = title;
        return this;
    }

    public HighchartsSize getTop() {
        return getInstanceOf(HighchartsSize.class, this.top);
    }

    public Axis setTop(HighchartsSize top) {
        this.top = top;
        return this;
    }

    public HighchartsAxisType getType() {
        return getInstanceOf(HighchartsAxisType.class, this.type);
    }

    public Axis setType(HighchartsAxisType type) {
        this.type = type;
        return this;
    }

    public boolean getUniqueNames() {
        return getInstanceOf(boolean.class, this.uniqueNames);
    }

    public Axis setUniqueNames(boolean uniqueNames) {
        this.uniqueNames = uniqueNames;
        return this;
    }

    public List<Map<String, List<Integer>>> getUnits() {
        return getInstanceOf(List.class, this.units);
    }

    public Axis setUnits(List<Map<String, List<Integer>>> units) {
        this.units = units;
        return this;
    }

    public boolean getVisible() {
        return getInstanceOf(boolean.class, this.visible);
    }

    public Axis setVisible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public HighchartsSize getWidth() {
        return getInstanceOf(HighchartsSize.class, this.width);
    }

    public Axis setWidth(HighchartsSize width) {
        this.width = width;
        return this;
    }

    public boolean getZoomEnabled() {
        return getInstanceOf(boolean.class, this.zoomEnabled);
    }

    public Axis setZoomEnabled(boolean zoomEnabled) {
        this.zoomEnabled = zoomEnabled;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.accessibility);
        hash = 17 * hash + Objects.hashCode(this.alignTicks);
        hash = 17 * hash + Objects.hashCode(this.allowDecimals);
        hash = 17 * hash + Objects.hashCode(this.alternateGridColor);
        hash = 17 * hash + Objects.hashCode(this.angle);
        hash = 17 * hash + Objects.hashCode(this.breaks);
        hash = 17 * hash + Objects.hashCode(this.categories);
        hash = 17 * hash + Objects.hashCode(this.ceiling);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.crosshair);
        hash = 17 * hash + Objects.hashCode(this.currentDateIndicator);
        hash = 17 * hash + Objects.hashCode(this.dateTimeLabelFormats);
        hash = 17 * hash + Objects.hashCode(this.endOnTick);
        hash = 17 * hash + Objects.hashCode(this.events);
        hash = 17 * hash + Objects.hashCode(this.floor);
        hash = 17 * hash + Objects.hashCode(this.grid);
        hash = 17 * hash + Objects.hashCode(this.gridLineColor);
        hash = 17 * hash + Objects.hashCode(this.gridLineDashStyle);
        hash = 17 * hash + Objects.hashCode(this.gridLineInterpolation);
        hash = 17 * hash + Objects.hashCode(this.gridLineWidth);
        hash = 17 * hash + Objects.hashCode(this.gridZIndex);
        hash = 17 * hash + Objects.hashCode(this.height);
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.labels);
        hash = 17 * hash + Objects.hashCode(this.left);
        hash = 17 * hash + Objects.hashCode(this.lineColor);
        hash = 17 * hash + Objects.hashCode(this.lineWidth);
        hash = 17 * hash + Objects.hashCode(this.linkedTo);
        hash = 17 * hash + Objects.hashCode(this.margin);
        hash = 17 * hash + Objects.hashCode(this.max);
        hash = 17 * hash + Objects.hashCode(this.maxPadding);
        hash = 17 * hash + Objects.hashCode(this.maxRange);
        hash = 17 * hash + Objects.hashCode(this.maxZoom);
        hash = 17 * hash + Objects.hashCode(this.min);
        hash = 17 * hash + Objects.hashCode(this.minPadding);
        hash = 17 * hash + Objects.hashCode(this.minRange);
        hash = 17 * hash + Objects.hashCode(this.minTickInterval);
        hash = 17 * hash + Objects.hashCode(this.minorGridLineColor);
        hash = 17 * hash + Objects.hashCode(this.minorGridLineDashStyle);
        hash = 17 * hash + Objects.hashCode(this.minorGridLineWidth);
        hash = 17 * hash + Objects.hashCode(this.minorTickColor);
        hash = 17 * hash + Objects.hashCode(this.minorTickInterval);
        hash = 17 * hash + Objects.hashCode(this.minorTickLength);
        hash = 17 * hash + Objects.hashCode(this.minorTickPosition);
        hash = 17 * hash + Objects.hashCode(this.minorTickWidth);
        hash = 17 * hash + Objects.hashCode(this.minorTicks);
        hash = 17 * hash + Objects.hashCode(this.offset);
        hash = 17 * hash + Objects.hashCode(this.opposite);
        hash = 17 * hash + Objects.hashCode(this.ordinal);
        hash = 17 * hash + Objects.hashCode(this.overscroll);
        hash = 17 * hash + Objects.hashCode(this.pane);
        hash = 17 * hash + Objects.hashCode(this.plotBands);
        hash = 17 * hash + Objects.hashCode(this.plotLines);
        hash = 17 * hash + Objects.hashCode(this.range);
        hash = 17 * hash + Objects.hashCode(this.reversed);
        hash = 17 * hash + Objects.hashCode(this.reversedStacks);
        hash = 17 * hash + Objects.hashCode(this.scrollbar);
        hash = 17 * hash + Objects.hashCode(this.showEmpty);
        hash = 17 * hash + Objects.hashCode(this.showFirstLabel);
        hash = 17 * hash + Objects.hashCode(this.showLastLabel);
        hash = 17 * hash + Objects.hashCode(this.softMax);
        hash = 17 * hash + Objects.hashCode(this.softMin);
        hash = 17 * hash + Objects.hashCode(this.startOfWeek);
        hash = 17 * hash + Objects.hashCode(this.startOnTick);
        hash = 17 * hash + Objects.hashCode(this.tickAmount);
        hash = 17 * hash + Objects.hashCode(this.tickColor);
        hash = 17 * hash + Objects.hashCode(this.tickInterval);
        hash = 17 * hash + Objects.hashCode(this.tickLength);
        hash = 17 * hash + Objects.hashCode(this.tickPixelInterval);
        hash = 17 * hash + Objects.hashCode(this.tickPosition);
        hash = 17 * hash + Objects.hashCode(this.tickPositioner);
        hash = 17 * hash + Objects.hashCode(this.tickPositions);
        hash = 17 * hash + Objects.hashCode(this.tickWidth);
        hash = 17 * hash + Objects.hashCode(this.tickmarkPlacement);
        hash = 17 * hash + Objects.hashCode(this.title);
        hash = 17 * hash + Objects.hashCode(this.top);
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + Objects.hashCode(this.uniqueNames);
        hash = 17 * hash + Objects.hashCode(this.units);
        hash = 17 * hash + Objects.hashCode(this.visible);
        hash = 17 * hash + Objects.hashCode(this.width);
        hash = 17 * hash + Objects.hashCode(this.zoomEnabled);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "accessibility:" + accessibility
                + ", alignTicks:" + alignTicks
                + ", allowDecimals:" + allowDecimals
                + ", alternateGridColor:" + alternateGridColor
                + ", angle:" + angle
                + ", breaks:" + breaks
                + ", categories:" + categories
                + ", ceiling:" + ceiling
                + ", className:" + className
                + ", crosshair:" + crosshair
                + ", currentDateIndicator:" + currentDateIndicator
                + ", dateTimeLabelFormats:" + dateTimeLabelFormats
                + ", endOnTick:" + endOnTick
                + ", events:" + events
                + ", floor:" + floor
                + ", grid:" + grid
                + ", gridLineColor:" + gridLineColor
                + ", gridLineDashStyle:" + gridLineDashStyle
                + ", gridLineInterpolation:" + gridLineInterpolation
                + ", gridLineWidth:" + gridLineWidth
                + ", gridZIndex:" + gridZIndex
                + ", height:" + height
                + ", id:" + id
                + ", labels:" + labels
                + ", left:" + left
                + ", lineColor:" + lineColor
                + ", lineWidth:" + lineWidth
                + ", linkedTo:" + linkedTo
                + ", margin:" + margin
                + ", max:" + max
                + ", maxPadding:" + maxPadding
                + ", maxRange:" + maxRange
                + ", maxZoom:" + maxZoom
                + ", min:" + min
                + ", minPadding:" + minPadding
                + ", minRange:" + minRange
                + ", minTickInterval:" + minTickInterval
                + ", minorGridLineColor:" + minorGridLineColor
                + ", minorGridLineDashStyle:" + minorGridLineDashStyle
                + ", minorGridLineWidth:" + minorGridLineWidth
                + ", minorTickColor:" + minorTickColor
                + ", minorTickInterval:" + minorTickInterval
                + ", minorTickLength:" + minorTickLength
                + ", minorTickPosition:" + minorTickPosition
                + ", minorTickWidth:" + minorTickWidth
                + ", minorTicks:" + minorTicks
                + ", offset:" + offset
                + ", opposite:" + opposite
                + ", ordinal:" + ordinal
                + ", overscroll:" + overscroll
                + ", pane:" + pane
                + ", plotBands:" + plotBands
                + ", plotLines:" + plotLines
                + ", range:" + range
                + ", reversed:" + reversed
                + ", reversedStacks:" + reversedStacks
                + ", scrollbar:" + scrollbar
                + ", showEmpty:" + showEmpty
                + ", showFirstLabel:" + showFirstLabel
                + ", showLastLabel:" + showLastLabel
                + ", softMax:" + softMax
                + ", softMin:" + softMin
                + ", startOfWeek:" + startOfWeek
                + ", startOnTick:" + startOnTick
                + ", tickAmount:" + tickAmount
                + ", tickColor:" + tickColor
                + ", tickInterval:" + tickInterval
                + ", tickLength:" + tickLength
                + ", tickPixelInterval:" + tickPixelInterval
                + ", tickPosition:" + tickPosition
                + ", tickPositioner:" + tickPositioner
                + ", tickPositions:" + tickPositions
                + ", tickWidth:" + tickWidth
                + ", tickmarkPlacement:" + tickmarkPlacement
                + ", title:" + title
                + ", top:" + top
                + ", type:" + type
                + ", uniqueNames:" + uniqueNames
                + ", units:" + units
                + ", visible:" + visible
                + ", width:" + width
                + ", zoomEnabled:" + zoomEnabled
                + '}';
    }

    public Axis addCategory(String category) {
        if (this.categories == null) {
            this.categories = new String[0];
        }
        CommonUtils.addE(this.categories, category);
        return this;
    }

}
