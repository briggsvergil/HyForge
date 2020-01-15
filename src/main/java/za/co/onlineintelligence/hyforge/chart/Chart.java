package za.co.onlineintelligence.hyforge.chart;

import java.io.Serializable;
import java.util.Objects;
import za.co.onlineintelligence.hyforge.common.*;

/**
 *
 * @author Sean
 */
public class Chart implements Serializable, DrosteDeflater
{
    public Chart() {
    }

    public Chart(String type) {
        this.type = type;
    }

    /**
     * "When using multiple axis, the ticks of two or more opposite axes will
     * automatically be aligned by adding ticks to the axis or axes with the
     * least ticks, as if `tickAmount` were specified.
     *
     * This can be prevented by setting `alignTicks` to false. If the grid lines
     * look messy, it's a good idea to hide them for the secondary axis by
     * setting `gridLineWidth` to 0.
     *
     * If `startOnTick` or `endOnTick` in an axis options are set to false, then
     * the `alignTicks ` will be disabled for the axis.
     *
     * Disabled for logarithmic axes."
     */
    private Boolean alignTicks;
    /**
     * "Set the overall animation for all chart updating. Animation can be
     * disabled throughout the chart by setting it to false here. It can be
     * overridden for each individual API method as a function parameter. The
     * only animation not affected by this option is the initial series
     * animation, see
     * [plotOptions.series.animation](#plotOptions.series.animation).
     *
     * The animation can either be set as a boolean or a configuration object.
     * If `true`, it will use the 'swing' jQuery easing and a duration of 500
     * ms. If used as a configuration object, the following properties are
     * supported:
     *
     * - **duration**: The duration of the animation in milliseconds.
     *
     * - **easing**: A string reference to an easing function set on the `Math`
     * object. See [the easing
     * demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/)."
     */
    private Boolean animation;
    /**
     * "The background color or gradient for the outer chart area."
     *
     * Can be color string, gradient object or pattern object
     */
    private HighchartsColor backgroundColor;
    /**
     * "The color of the outer chart border."
     */
    private HighchartsColor borderColor;
    /**
     * "The corner radius of the outer chart border."
     */
    private Integer borderRadius;
    /**
     * "The pixel width of the outer chart border."
     */
    private Integer borderWidth;
    /**
     * "A CSS class name to apply to the charts container `div`, allowing unique
     * CSS styling for each chart."
     */
    private String className;
    /**
     * "In styled mode, this sets how many colors the class names should rotate
     * between. With ten colors, series (or points) are given class names like
     * `highcharts-color-0`, `highcharts-color-0` [...] `highcharts-color-9`.
     * The equivalent in non-styled mode is to set colors using the
     * [colors](#colors) setting."
     */
    private Integer colorCount;
    /**
     * "Alias of `type`."
     */
    @Deprecated
    private String defaultSeriesType;
    /**
     * "Whether to display errors on the chart. When `false`, the errors will be
     * shown only in the console."
     */
    private Boolean displayErrors;
    /**
     * "SeriesEvents listeners for the chart."
     */
    private ChartEvents events;
    /**
     * "An explicit height for the chart. If a _number_, the height is given in
     * pixels. If given a _percentage string_ (for example `'56%'`), the height
     * is given as the percentage of the actual chart width. This allows for
     * preserving the aspect ratio across responsive sizes.
     *
     * By default (when `null`) the height is calculated from the offset height
     * of the containing element, or 400 pixels if the containing element's
     * height is 0."
     */
    private HighchartsSize height;
    /**
     * "If true, the axes will scale to the remaining visible series once one
     * series is hidden. If false, hiding and showing a series will not affect
     * the axes or the other series. For stacks, once one series within the
     * stack is hidden, the rest of the stack will close in around it even if
     * the axis is not affected."
     */
    private Boolean ignoreHiddenSeries;
    /**
     * "Whether to invert the axes so that the x axis is vertical and y axis is
     * horizontal. When `true`, the x axis is [reversed](#xAxis.reversed) by
     * default."
     */
    private Boolean inverted;
    /**
     * Default `mapData` for all series. If set to a string, it functions as an
     * index into the `Highcharts.maps` array. Otherwise it is interpreted as
     * map data.
     *
     * @since 5.0.0
     */
    private String map;

    /**
     * Set lat/lon transformation definitions for the chart. If not defined,
     * these are extracted from the map data.
     *
     * @since 5.0.0
     */
    private MapTransforms mapTransforms;

    /**
     * The margin between the outer edge of the chart and the plot area. The
     * numbers in the array designate top, right, bottom and left respectively.
     * Use the options `marginTop`, `marginRight`, `marginBottom` and
     * `marginLeft` for shorthand setting of one option.
     *
     * By default there is no margin. The actual space is dynamically calculated
     * from the offset of axis labels, axis title, title, subtitle and legend in
     * addition to the `spacingTop`, `spacingRight`, `spacingBottom` and
     * `spacingLeft` options.
     */
    private int[] margin;

    /**
     * The margin between the bottom outer edge of the chart and the plot area.
     * Use this to set a fixed pixel value for the margin as opposed to the
     * default dynamic margin. See also `spacingBottom`.
     *
     * @since 2.0.0
     */
    private Integer marginBottom;

    /**
     * The margin between the left outer edge of the chart and the plot area.
     * Use this to set a fixed pixel value for the margin as opposed to the
     * default dynamic margin. See also `spacingLeft`.
     *
     * @since 2.0.0
     */
    private Integer marginLeft;

    /**
     * The margin between the right outer edge of the chart and the plot area.
     * Use this to set a fixed pixel value for the margin as opposed to the
     * default dynamic margin. See also `spacingRight`.
     *
     * @since 2.0.0
     */
    private Integer marginRight;

    /**
     * The margin between the top outer edge of the chart and the plot area. Use
     * this to set a fixed pixel value for the margin as opposed to the default
     * dynamic margin. See also `spacingTop`.
     *
     * @since 2.0.0
     */
    private Integer marginTop;

    /**
     * Callback function to override the default function that formats all the
     * numbers in the chart. Returns a string with the formatted number.
     *
     * @since 8.0.0
     */
    private HighchartsCallbackFunction numberFormatter;

    /**
     * Options to render charts in 3 dimensions. This feature requires
     * `highcharts-3d.js`, found in the download package or online at
     * [code.highcharts.com/highcharts-3d.js](http://code.highcharts.com/highcharts-3d.js).
     *
     * @since 4.0.0
     */
    private Options3d options3d;

    /**
     * Allows setting a key to switch between zooming and panning. Can be one of
     * `alt`, `ctrl`, `meta` (the command key on Mac and Windows key on Windows)
     * or `shift`. The keys are mapped directly to the key properties of the
     * click event argument (`event.altKey`, `event.ctrlKey`, `event.metaKey`
     * and `event.shiftKey`).
     *
     * @since 4.0.3
     */
    private String panKey;

    /**
     * Allow panning in a chart. Best used with [panKey](#chart.panKey) to
     * combine zooming and panning.
     *
     * On touch devices, when the
     * [tooltip.followTouchMove](#tooltip.followTouchMove) option is `true`
     * (default), panning requires two fingers. To allow panning with one
     * finger, set `followTouchMove` to `false`.
     */
    private Panning panning;

    /**
     * Common options for all yAxes rendered in a parallel coordinates plot.
     * This feature requires `modules/parallel-coordinates.js`.
     *
     * The default options are: ```js parallelAxes: { lineWidth: 1, // classic
     * mode only gridlinesWidth: 0, // classic mode only title: { text: '',
     * reserveSpace: false }, labels: { x: 0, y: 0, align: 'center',
     * reserveSpace: false }, offset: 0 } ```
     *
     * @since 6.0.0
     */
    private ParallelAxes parallelAxes;

    /**
     * Flag to render charts as a parallel coordinates plot. In a parallel
     * coordinates plot (||-coords) by default all required yAxes are generated
     * and the legend is disabled. This feature requires
     * `modules/parallel-coordinates.js`.
     *
     * @since 6.0.0
     */
    private Boolean parallelCoordinates;

    /**
     * Equivalent to [zoomType](#chart.zoomType), but for multitouch gestures
     * only. By default, the `pinchType` is the same as the `zoomType` setting.
     * However, pinching can be enabled separately in some cases, for example in
     * stock charts where a mouse drag pans the chart, while pinching is
     * enabled. When [tooltip.followTouchMove](#tooltip.followTouchMove) is
     * true, pinchType only applies to two-finger touches.
     *
     * @since 3.0.0
     */
    private String pinchType;

    /**
     * The background color or gradient for the plot area.
     */
    private HighchartsColor plotBackgroundColor;

    /**
     * The URL for an image to use as the plot background. To set an image as
     * the background for the entire chart, set a CSS background image to the
     * container element. Note that for the image to be applied to exported
     * charts, its URL needs to be accessible by the export server.
     */
    private String plotBackgroundImage;

    /**
     * The color of the inner chart or plot area border.
     */
    private HighchartsColor plotBorderColor;

    /**
     * The pixel width of the plot area border.
     */
    private Integer plotBorderWidth;

    /**
     * Whether to apply a drop shadow to the plot area. Requires that
     * plotBackgroundColor be set. The shadow can be an object configuration
     * containing `color`, `offsetX`, `offsetY`, `opacity` and `width`.
     */
    private Boolean plotShadow;

    /**
     * When true, cartesian charts like line, spline, area and column are
     * transformed into the polar coordinate system. This produces _polar
     * charts_, also known as _radar charts_.
     *
     * @since 2.3.0
     */
    private Boolean polar;

    /**
     * Whether to reflow the chart to fit the width of the container div on
     * resizing the window.
     *
     * @since 2.1.0
     */
    private Boolean reflow;

    /**
     * The HTML element where the chart will be rendered. If it is a string, the
     * element by that id is used. The HTML element can also be passed by direct
     * reference, or as the first argument of the chart constructor, in which
     * case the option is not needed.
     */
    private String renderTo;

    /**
     * The button that appears after a selection zoom, allowing the user to
     * reset zoom.
     */
    private ResetZoomButton resetZoomButton;

    /**
     * Options for a scrollable plot area. This feature provides a minimum size
     * for the plot area of the chart. If the size gets smaller than this,
     * typically on mobile devices, a native browser scrollbar is presented.
     * This scrollbar provides smooth scrolling for the contents of the plot
     * area, whereas the title, legend and unaffected axes are fixed.
     *
     * Since v7.1.2, a scrollable plot area can be defined for either horizontal
     * or vertical scrolling, depending on whether the `minWidth` or `minHeight`
     * option is set.
     *
     * @since 6.1.0
     */
    private ScrollablePlotArea scrollablePlotArea;

    /**
     * The background color of the marker square when selecting (zooming in on)
     * an area of the chart.
     *
     * @since 2.1.7
     */
    private HighchartsColor selectionMarkerFill;

    /**
     * Whether to apply a drop shadow to the outer chart area. Requires that
     * backgroundColor be set. The shadow can be an object configuration
     * containing `color`, `offsetX`, `offsetY`, `opacity` and `width`.
     */
    private Boolean shadow;

    /**
     * Whether to show the axes initially. This only applies to empty charts
     * where series are added dynamically, as axes are automatically added to
     * cartesian series.
     *
     * @since 1.2.5
     */
    private Boolean showAxes;

    /**
     * The distance between the outer edge of the chart and the content, like
     * title or legend, or axis title and labels if present. The numbers in the
     * array designate top, right, bottom and left respectively. Use the options
     * spacingTop, spacingRight, spacingBottom and spacingLeft options for
     * shorthand setting of one option.
     *
     * @since 3.0.6
     */
    private int[] spacing;

    /**
     * The space between the bottom edge of the chart and the content (plot
     * area, axis title and labels, title, subtitle or legend in top position).
     *
     * @since 2.1.0
     */
    private Integer spacingBottom;

    /**
     * The space between the left edge of the chart and the content (plot area,
     * axis title and labels, title, subtitle or legend in top position).
     *
     * @since 2.1.0
     */
    private Integer spacingLeft;

    /**
     * The space between the right edge of the chart and the content (plot area,
     * axis title and labels, title, subtitle or legend in top position).
     *
     * @since 2.1.0
     */
    private Integer spacingRight;

    /**
     * The space between the top edge of the chart and the content (plot area,
     * axis title and labels, title, subtitle or legend in top position).
     *
     * @since 2.1.0
     */
    private Integer spacingTop;

    /**
     * Additional CSS styles to apply inline to the container `div`. Note that
     * since the default font styles are applied in the renderer, it is ignorant
     * of the individual chart options and must be set globally.
     */
    private HighchartsCSS style;

    /**
     * Whether to apply styled mode. When in styled mode, no presentational
     * attributes or CSS are applied to the chart SVG. Instead, CSS rules are
     * required to style the chart. The default style sheet is available from
     * `https://code.highcharts.com/css/highcharts.css`.
     *
     * @since 7.0.0
     */
    private Boolean styledMode;

    /**
     * The default series type for the chart. Can be any of the chart types
     * listed under [plotOptions](#plotOptions) and [series](#series) or can be
     * a series provided by an additional module.
     *
     * In TypeScript this option has no effect in sense of typing and instead
     * the `type` option must always be set in the series.
     *
     * @since 2.1.0
     */
    private String type;

    /**
     * An explicit width for the chart. By default (when `null`) the width is
     * calculated from the offset width of the containing element.
     */
    private HighchartsSize width;

    /**
     * Set a key to hold when dragging to zoom the chart. This is useful to
     * avoid zooming while moving points. Should be set different than
     * [chart.panKey](#chart.panKey).
     *
     * @since 6.2.0
     */
    private String zoomKey;

    /**
     * Decides in what dimensions the user can zoom by dragging the mouse. Can
     * be one of `x`, `y` or `xy`.
     */
    private String zoomType;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public boolean getAlignTicks()
    {
        return this.alignTicks;
    }

    public Chart setAlignTicks(boolean alignTicks)
    {
        this.alignTicks = alignTicks;
        return this;
    }

    public boolean getAnimation()
    {
        return this.animation;
    }

    public Chart setAnimation(boolean animation)
    {
        this.animation = animation;
        return this;
    }

    public HighchartsColor getBackgroundColor()
    {
        return this.backgroundColor;
    }

    public Chart setBackgroundColor(HighchartsColor backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public HighchartsColor getBorderColor()
    {
        return this.borderColor;
    }

    public Chart setBorderColor(HighchartsColor borderColor)
    {
        this.borderColor = borderColor;
        return this;
    }

    public int getBorderRadius()
    {
        return this.borderRadius;
    }

    public Chart setBorderRadius(int borderRadius)
    {
        this.borderRadius = borderRadius;
        return this;
    }

    public int getBorderWidth()
    {
        return this.borderWidth;
    }

    public Chart setBorderWidth(int borderWidth)
    {
        this.borderWidth = borderWidth;
        return this;
    }

    public String getClassName()
    {
        return this.className;
    }

    public Chart setClassName(String className)
    {
        this.className = className;
        return this;
    }

    public int getColorCount()
    {
        return this.colorCount;
    }

    public Chart setColorCount(int colorCount)
    {
        this.colorCount = colorCount;
        return this;
    }

    public String getDefaultSeriesType()
    {
        return this.defaultSeriesType;
    }

    public Chart setDefaultSeriesType(String defaultSeriesType)
    {
        this.defaultSeriesType = defaultSeriesType;
        return this;
    }

    public boolean getDisplayErrors()
    {
        return this.displayErrors;
    }

    public Chart setDisplayErrors(boolean displayErrors)
    {
        this.displayErrors = displayErrors;
        return this;
    }

    public ChartEvents getEvents()
    {
        return this.events;
    }

    public Chart setEvents(ChartEvents events)
    {
        this.events = events;
        return this;
    }

    public HighchartsSize getHeight()
    {
        return this.height;
    }

    public Chart setHeight(HighchartsSize height)
    {
        this.height = height;
        return this;
    }

    public boolean getIgnoreHiddenSeries()
    {
        return this.ignoreHiddenSeries;
    }

    public Chart setIgnoreHiddenSeries(boolean ignoreHiddenSeries)
    {
        this.ignoreHiddenSeries = ignoreHiddenSeries;
        return this;
    }

    public boolean getInverted()
    {
        return this.inverted;
    }

    public Chart setInverted(boolean inverted)
    {
        this.inverted = inverted;
        return this;
    }

    public String getMap()
    {
        return this.map;
    }

    public Chart setMap(String map)
    {
        this.map = map;
        return this;
    }

    public MapTransforms getMapTransforms()
    {
        return this.mapTransforms;
    }

    public Chart setMapTransforms(MapTransforms mapTransforms)
    {
        this.mapTransforms = mapTransforms;
        return this;
    }

    public int[] getMargin()
    {
        return this.margin;
    }

    public Chart setMargin(int[] margin)
    {
        this.margin = margin;
        if (this.margin.length == 1)
        {
            this.marginTop = this.margin[0];
            this.marginRight = this.margin[0];
            this.marginBottom = this.margin[0];
            this.marginLeft = this.margin[0];
        } else if (this.margin.length == 4)
        {
            this.marginTop = this.margin[0];
            this.marginRight = this.margin[1];
            this.marginBottom = this.margin[2];
            this.marginLeft = this.margin[3];
        } else
        {
            throw new HighChartsException("Incorrect number of margin arguments "
                    + "in Chart. Expected 1 or 4, found " + this.margin.length);
        }
        return this;
    }

    public int getMarginBottom()
    {
        return this.marginBottom;
    }

    public Chart setMarginBottom(int marginBottom)
    {
        this.marginBottom = marginBottom;
        return this;
    }

    public int getMarginLeft()
    {
        return this.marginLeft;
    }

    public Chart setMarginLeft(int marginLeft)
    {
        this.marginLeft = marginLeft;
        return this;
    }

    public int getMarginRight()
    {
        return this.marginRight;
    }

    public Chart setMarginRight(int marginRight)
    {
        this.marginRight = marginRight;
        return this;
    }

    public int getMarginTop()
    {
        return this.marginTop;
    }

    public Chart setMarginTop(int marginTop)
    {
        this.marginTop = marginTop;
        return this;
    }

    public HighchartsCallbackFunction getNumberFormatter()
    {
        return this.numberFormatter;
    }

    public Chart setNumberFormatter(HighchartsCallbackFunction numberFormatter)
    {
        this.numberFormatter = numberFormatter;
        return this;
    }

    public Options3d getOptions3d()
    {
        return this.options3d;
    }

    public Chart setOptions3d(Options3d options3d)
    {
        this.options3d = options3d;
        return this;
    }

    public String getPanKey()
    {
        return this.panKey;
    }

    public Chart setPanKey(String panKey)
    {
        this.panKey = panKey;
        return this;
    }

    public Panning getPanning()
    {
        return this.panning;
    }

    public Chart setPanning(Panning panning)
    {
        this.panning = panning;
        return this;
    }

    public ParallelAxes getParallelAxes()
    {
        return this.parallelAxes;
    }

    public Chart setParallelAxes(ParallelAxes parallelAxes)
    {
        this.parallelAxes = parallelAxes;
        return this;
    }

    public boolean getParallelCoordinates()
    {
        return this.parallelCoordinates;
    }

    public Chart setParallelCoordinates(boolean parallelCoordinates)
    {
        this.parallelCoordinates = parallelCoordinates;
        return this;
    }

    public String getPinchType()
    {
        return this.pinchType;
    }

    public Chart setPinchType(String pinchType)
    {
        this.pinchType = pinchType;
        return this;
    }

    public HighchartsColor getPlotBackgroundColor()
    {
        return this.plotBackgroundColor;
    }

    public Chart setPlotBackgroundColor(HighchartsColor plotBackgroundColor)
    {
        this.plotBackgroundColor = plotBackgroundColor;
        return this;
    }

    public String getPlotBackgroundImage()
    {
        return this.plotBackgroundImage;
    }

    public Chart setPlotBackgroundImage(String plotBackgroundImage)
    {
        this.plotBackgroundImage = plotBackgroundImage;
        return this;
    }

    public HighchartsColor getPlotBorderColor()
    {
        return this.plotBorderColor;
    }

    public Chart setPlotBorderColor(HighchartsColor plotBorderColor)
    {
        this.plotBorderColor = plotBorderColor;
        return this;
    }

    public int getPlotBorderWidth()
    {
        return this.plotBorderWidth;
    }

    public Chart setPlotBorderWidth(int plotBorderWidth)
    {
        this.plotBorderWidth = plotBorderWidth;
        return this;
    }

    public boolean getPlotShadow()
    {
        return this.plotShadow;
    }

    public Chart setPlotShadow(boolean plotShadow)
    {
        this.plotShadow = plotShadow;
        return this;
    }

    public boolean getPolar()
    {
        return this.polar;
    }

    public Chart setPolar(boolean polar)
    {
        this.polar = polar;
        return this;
    }

    public boolean getReflow()
    {
        return this.reflow;
    }

    public Chart setReflow(boolean reflow)
    {
        this.reflow = reflow;
        return this;
    }

    public String getRenderTo()
    {
        return this.renderTo;
    }

    public Chart setRenderTo(String renderTo)
    {
        this.renderTo = renderTo;
        return this;
    }

    public ResetZoomButton getResetZoomButton()
    {
        return this.resetZoomButton;
    }

    public Chart setResetZoomButton(ResetZoomButton resetZoomButton)
    {
        this.resetZoomButton = resetZoomButton;
        return this;
    }

    public ScrollablePlotArea getScrollablePlotArea()
    {
        return this.scrollablePlotArea;
    }

    public Chart setScrollablePlotArea(ScrollablePlotArea scrollablePlotArea)
    {
        this.scrollablePlotArea = scrollablePlotArea;
        return this;
    }

    public HighchartsColor getSelectionMarkerFill()
    {
        return this.selectionMarkerFill;
    }

    public Chart setSelectionMarkerFill(HighchartsColor selectionMarkerFill)
    {
        this.selectionMarkerFill = selectionMarkerFill;
        return this;
    }

    public boolean isShadow()
    {
        return this.shadow;
    }

    public Chart setShadow(boolean shadow)
    {
        this.shadow = shadow;
        return this;
    }

    public boolean getShowAxes()
    {
        return this.showAxes;
    }

    public Chart setShowAxes(boolean showAxes)
    {
        this.showAxes = showAxes;
        return this;
    }

    public int[] getSpacing()
    {
        return this.spacing;
    }

    public Chart setSpacing(int[] spacing)
    {
        this.spacing = spacing;
        return this;
    }

    public int getSpacingBottom()
    {
        return this.spacingBottom;
    }

    public Chart setSpacingBottom(int spacingBottom)
    {
        this.spacingBottom = spacingBottom;
        return this;
    }

    public int getSpacingLeft()
    {
        return this.spacingLeft;
    }

    public Chart setSpacingLeft(int spacingLeft)
    {
        this.spacingLeft = spacingLeft;
        return this;
    }

    public int getSpacingRight()
    {
        return this.spacingRight;
    }

    public Chart setSpacingRight(int spacingRight)
    {
        this.spacingRight = spacingRight;
        return this;
    }

    public int getSpacingTop()
    {
        return this.spacingTop;
    }

    public Chart setSpacingTop(int spacingTop)
    {
        this.spacingTop = spacingTop;
        return this;
    }

    public HighchartsCSS getStyle()
    {
        return this.style;
    }

    public Chart setStyle(HighchartsCSS style)
    {
        this.style = style;
        return this;
    }

    public boolean getStyledMode()
    {
        return this.styledMode;
    }

    public Chart setStyledMode(boolean styledMode)
    {
        this.styledMode = styledMode;
        return this;
    }

    public String getType()
    {
        return this.type;
    }

    public Chart setType(String type)
    {
        this.type = type;
        return this;
    }

    public HighchartsSize getWidth()
    {
        return this.width;
    }

    public Chart setWidth(HighchartsSize width)
    {
        this.width = width;
        return this;
    }

    public String getZoomKey()
    {
        return this.zoomKey;
    }

    public Chart setZoomKey(String zoomKey)
    {
        this.zoomKey = zoomKey;
        return this;
    }

    public String getZoomType()
    {
        return this.zoomType;
    }

    public Chart setZoomType(String zoomType)
    {
        this.zoomType = zoomType;
        return this;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.alignTicks);
        hash = 17 * hash + Objects.hashCode(this.animation);
        hash = 17 * hash + Objects.hashCode(this.backgroundColor);
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.borderRadius);
        hash = 17 * hash + Objects.hashCode(this.borderWidth);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.colorCount);
        hash = 17 * hash + Objects.hashCode(this.defaultSeriesType);
        hash = 17 * hash + Objects.hashCode(this.displayErrors);
        hash = 17 * hash + Objects.hashCode(this.events);
        hash = 17 * hash + Objects.hashCode(this.height);
        hash = 17 * hash + Objects.hashCode(this.ignoreHiddenSeries);
        hash = 17 * hash + Objects.hashCode(this.inverted);
        hash = 17 * hash + Objects.hashCode(this.map);
        hash = 17 * hash + Objects.hashCode(this.mapTransforms);
        hash = 17 * hash + Objects.hashCode(this.margin);
        hash = 17 * hash + Objects.hashCode(this.marginBottom);
        hash = 17 * hash + Objects.hashCode(this.marginLeft);
        hash = 17 * hash + Objects.hashCode(this.marginRight);
        hash = 17 * hash + Objects.hashCode(this.marginTop);
        hash = 17 * hash + Objects.hashCode(this.numberFormatter);
        hash = 17 * hash + Objects.hashCode(this.options3d);
        hash = 17 * hash + Objects.hashCode(this.panKey);
        hash = 17 * hash + Objects.hashCode(this.panning);
        hash = 17 * hash + Objects.hashCode(this.parallelAxes);
        hash = 17 * hash + Objects.hashCode(this.parallelCoordinates);
        hash = 17 * hash + Objects.hashCode(this.pinchType);
        hash = 17 * hash + Objects.hashCode(this.plotBackgroundColor);
        hash = 17 * hash + Objects.hashCode(this.plotBackgroundImage);
        hash = 17 * hash + Objects.hashCode(this.plotBorderColor);
        hash = 17 * hash + Objects.hashCode(this.plotBorderWidth);
        hash = 17 * hash + Objects.hashCode(this.plotShadow);
        hash = 17 * hash + Objects.hashCode(this.polar);
        hash = 17 * hash + Objects.hashCode(this.reflow);
        hash = 17 * hash + Objects.hashCode(this.renderTo);
        hash = 17 * hash + Objects.hashCode(this.resetZoomButton);
        hash = 17 * hash + Objects.hashCode(this.scrollablePlotArea);
        hash = 17 * hash + Objects.hashCode(this.selectionMarkerFill);
        hash = 17 * hash + Objects.hashCode(this.shadow);
        hash = 17 * hash + Objects.hashCode(this.showAxes);
        hash = 17 * hash + Objects.hashCode(this.spacing);
        hash = 17 * hash + Objects.hashCode(this.spacingBottom);
        hash = 17 * hash + Objects.hashCode(this.spacingLeft);
        hash = 17 * hash + Objects.hashCode(this.spacingRight);
        hash = 17 * hash + Objects.hashCode(this.spacingTop);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.styledMode);
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + Objects.hashCode(this.width);
        hash = 17 * hash + Objects.hashCode(this.zoomKey);
        hash = 17 * hash + Objects.hashCode(this.zoomType);

        return hash;
    }

    @Override
    public String toString()
    {
        return '{'
                + "alignTicks:" + alignTicks
                + ", animation:" + animation
                + ", backgroundColor:" + backgroundColor
                + ", borderColor:" + borderColor
                + ", borderRadius:" + borderRadius
                + ", borderWidth:" + borderWidth
                + ", className:" + className
                + ", colorCount:" + colorCount
                + ", defaultSeriesType:" + defaultSeriesType
                + ", displayErrors:" + displayErrors
                + ", events:" + events
                + ", height:" + height
                + ", ignoreHiddenSeries:" + ignoreHiddenSeries
                + ", inverted:" + inverted
                + ", map:" + map
                + ", mapTransforms:" + mapTransforms
                + ", margin:" + margin
                + ", marginBottom:" + marginBottom
                + ", marginLeft:" + marginLeft
                + ", marginRight:" + marginRight
                + ", marginTop:" + marginTop
                + ", numberFormatter:" + numberFormatter
                + ", options3d:" + options3d
                + ", panKey:" + panKey
                + ", panning:" + panning
                + ", parallelAxes:" + parallelAxes
                + ", parallelCoordinates:" + parallelCoordinates
                + ", pinchType:" + pinchType
                + ", plotBackgroundColor:" + plotBackgroundColor
                + ", plotBackgroundImage:" + plotBackgroundImage
                + ", plotBorderColor:" + plotBorderColor
                + ", plotBorderWidth:" + plotBorderWidth
                + ", plotShadow:" + plotShadow
                + ", polar:" + polar
                + ", reflow:" + reflow
                + ", renderTo:" + renderTo
                + ", resetZoomButton:" + resetZoomButton
                + ", scrollablePlotArea:" + scrollablePlotArea
                + ", selectionMarkerFill:" + selectionMarkerFill
                + ", shadow:" + shadow
                + ", showAxes:" + showAxes
                + ", spacing:" + spacing
                + ", spacingBottom:" + spacingBottom
                + ", spacingLeft:" + spacingLeft
                + ", spacingRight:" + spacingRight
                + ", spacingTop:" + spacingTop
                + ", style:" + style
                + ", styledMode:" + styledMode
                + ", type:" + type
                + ", width:" + width
                + ", zoomKey:" + zoomKey
                + ", zoomType:" + zoomType
                + '}';
    }

}
