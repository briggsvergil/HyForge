package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;

import java.io.Serializable;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * PlotOptions HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class PlotOptions implements Serializable, DrosteDeflater {

    public PlotOptions() {
    }

    /**
     * The area series type.
     * <p>
     * In TypeScript the [type](series.area.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `area` series are defined in [plotOptions.area](plotOptions.area). 3.
     * Options for one single series are given in [the series instance
     * array](series.area).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, area: { // shared options for all area series }
     * }, series: [{ // specific options for this series instance type: 'area'
     * }] }); ```
     */
    private HighchartsSeriesPlotOptions area;

    /**
     * The area range series is a carteseian series with higher and lower values
     * for each point along an X axis, where the area between the values is
     * shaded.
     * <p>
     * In TypeScript the [type](series.arearange.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `arearange` series are defined in
     * [plotOptions.arearange](plotOptions.arearange). 3. Options for one single
     * series are given in [the series instance array](series.arearange).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, arearange: { // shared options for all
     * arearange series } }, series: [{ // specific options for this series
     * instance type: 'arearange' }] }); ```
     */
    private HighchartsSeriesPlotOptions arearange;

    /**
     * The area spline series is an area series where the graph between the
     * points is smoothed into a spline.
     * <p>
     * In TypeScript the [type](series.areaspline.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `areaspline` series are defined in
     * [plotOptions.areaspline](plotOptions.areaspline). 3. Options for one
     * single series are given in [the series instance
     * array](series.areaspline).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, areaspline: { // shared options for all
     * areaspline series } }, series: [{ // specific options for this series
     * instance type: 'areaspline' }] }); ```
     */
    private HighchartsSeriesPlotOptions areaspline;

    /**
     * The area spline range is a cartesian series type with higher and lower Y
     * values along an X axis. The area inside the range is colored, and the
     * graph outlining the area is a smoothed spline.
     * <p>
     * In TypeScript the [type](series.areasplinerange.type) option must always
     * be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `areasplinerange` series are defined in
     * [plotOptions.areasplinerange](plotOptions.areasplinerange). 3. Options
     * for one single series are given in [the series instance
     * array](series.areasplinerange).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, areasplinerange: { // shared options for all
     * areasplinerange series } }, series: [{ // specific options for this
     * series instance type: 'areasplinerange' }] }); ```
     *
     * @since 2.3.0
     */
    private HighchartsSeriesPlotOptions areasplinerange;


    /**
     * A bar series is a special type of column series where the columns are
     * horizontal.
     * <p>
     * In TypeScript the [type](series.bar.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all `bar`
     * series are defined in [plotOptions.bar](plotOptions.bar). 3. Options for
     * one single series are given in [the series instance array](series.bar).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, bar: { // shared options for all bar series }
     * }, series: [{ // specific options for this series instance type: 'bar' }]
     * }); ```
     */
    private HighchartsSeriesPlotOptions bar;


    /**
     * A bell curve is an areaspline series which represents the probability
     * density function of the normal distribution. It calculates mean and
     * standard deviation of the base series data and plots the curve according
     * to the calculated parameters.
     * <p>
     * In TypeScript the [type](series.bellcurve.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `bellcurve` series are defined in
     * [plotOptions.bellcurve](plotOptions.bellcurve). 3. Options for one single
     * series are given in [the series instance array](series.bellcurve).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, bellcurve: { // shared options for all
     * bellcurve series } }, series: [{ // specific options for this series
     * instance type: 'bellcurve' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions bellcurve;

    /**
     * A box plot is a convenient way of depicting groups of data through their
     * five-number summaries: the smallest observation (sample minimum), lower
     * quartile (Q1), median (Q2), upper quartile (Q3), and largest observation
     * (sample maximum).
     * <p>
     * In TypeScript the [type](series.boxplot.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `boxplot` series are defined in
     * [plotOptions.boxplot](plotOptions.boxplot). 3. Options for one single
     * series are given in [the series instance array](series.boxplot).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, boxplot: { // shared options for all boxplot
     * series } }, series: [{ // specific options for this series instance type:
     * 'boxplot' }] }); ```
     */
    private HighchartsSeriesPlotOptions boxplot;

    /**
     * A bubble series is a three dimensional series type where each point
     * renders an X, Y and Z value. Each points is drawn as a bubble where the
     * position along the X and Y axes mark the X and Y values, and the size of
     * the bubble relates to the Z value.
     * <p>
     * In TypeScript the [type](series.bubble.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `bubble` series are defined in [plotOptions.bubble](plotOptions.bubble).
     * 3. Options for one single series are given in [the series instance
     * array](series.bubble).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, bubble: { // shared options for all bubble
     * series } }, series: [{ // specific options for this series instance type:
     * 'bubble' }] }); ```
     */
    private HighchartsSeriesPlotOptions bubble;

    /**
     * A bullet graph is a variation of a bar graph. The bullet graph features a
     * single measure, compares it to a target, and displays it in the context
     * of qualthis.itative ranges of performance that could be set usin = getInstanceOfmeasure.class, qualthis.itative(g
     * [plotBands](#yAxis.plotBands) on [yAxis](#yAxis).
     * <p>
     * In TypeScript the [type](series.bullet.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `bullet` series are defined in [plotOptions.bullet](plotOptions.bullet).
     * 3. Options for one single series are given in [the series instance
     * array](series.bullet).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, bullet: { // shared options for all bullet
     * series } }, series: [{ // specific options for this series instance type:
     * 'bullet' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions bullet;


    /**
     * Column series display one column per value along an X axis.
     * <p>
     * In TypeScript the [type](series.column.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `column` series are defined in [plotOptions.column](plotOptions.column).
     * 3. Options for one single series are given in [the series instance
     * array](series.column).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, column: { // shared options for all column
     * series } }, series: [{ // specific options for this series instance type:
     * 'column' }] }); ```
     */
    private HighchartsSeriesPlotOptions column;

    /**
     * Column pyramid series display one pyramid per value along an X axis. To
     * display horizontal pyramids, set [chart.inverted](#chart.inverted) to
     * `true`.
     * <p>
     * In TypeScript the [type](series.columnpyramid.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `columnpyramid` series are defined in
     * [plotOptions.columnpyramid](plotOptions.columnpyramid). 3. Options for
     * one single series are given in [the series instance
     * array](series.columnpyramid).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, columnpyramid: { // shared options for all
     * columnpyramid series } }, series: [{ // specific options for this series
     * instance type: 'columnpyramid' }] }); ```
     *
     * @since 7.0.0
     */
    private HighchartsSeriesPlotOptions columnpyramid;

    /**
     * The column range is a cartesian series type with higher and lower Y
     * values along an X axis. To display horizontal bars, set
     * [chart.inverted](#chart.inverted) to `true`.
     * <p>
     * In TypeScript the [type](series.columnrange.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `columnrange` series are defined in
     * [plotOptions.columnrange](plotOptions.columnrange). 3. Options for one
     * single series are given in [the series instance
     * array](series.columnrange).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, columnrange: { // shared options for all
     * columnrange series } }, series: [{ // specific options for this series
     * instance type: 'columnrange' }] }); ```
     *
     * @since 2.3.0
     */
    private HighchartsSeriesPlotOptions columnrange;

    /**
     * A cylinder graph is a variation of a 3d column graph. The cylinder graph
     * features cylindrical points.
     * <p>
     * In TypeScript the [type](series.cylinder.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `cylinder` series are defined in
     * [plotOptions.cylinder](plotOptions.cylinder). 3. Options for one single
     * series are given in [the series instance array](series.cylinder).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, cylinder: { // shared options for all cylinder
     * series } }, series: [{ // specific options for this series instance type:
     * 'cylinder' }] }); ```
     *
     * @since 7.0.0
     */
    private HighchartsSeriesPlotOptions cylinder;


    /**
     * A dependency wheel chart is a type of flow diagram, where all nodes are
     * laid out in a circle, and the flow between the are drawn as link bands.
     * <p>
     * In TypeScript the [type](series.dependencywheel.type) option must always
     * be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `dependencywheel` series are defined in
     * [plotOptions.dependencywheel](plotOptions.dependencywheel). 3. Options
     * for one single series are given in [the series instance
     * array](series.dependencywheel).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, dependencywheel: { // shared options for all
     * dependencywheel series } }, series: [{ // specific options for this
     * series instance type: 'dependencywheel' }] }); ```
     *
     * @since 7.1.0
     */
    private HighchartsSeriesPlotOptions dependencywheel;


    /**
     * Error bars are a graphical representation of the variability of data and
     * are used on graphs to indicate the error, or uncertainty in a reported
     * measurement.
     * <p>
     * In TypeScript the [type](series.errorbar.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `errorbar` series are defined in
     * [plotOptions.errorbar](plotOptions.errorbar). 3. Options for one single
     * series are given in [the series instance array](series.errorbar).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, errorbar: { // shared options for all errorbar
     * series } }, series: [{ // specific options for this series instance type:
     * 'errorbar' }] }); ```
     */
    private HighchartsSeriesPlotOptions errorbar;


    /**
     * Funnel charts are a type of chart often used to visualize stages in a
     * sales project, where the top are the initial stages with the most
     * clients. It requires that the modules/funnel.js file is loaded.
     * <p>
     * In TypeScript the [type](series.funnel.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `funnel` series are defined in [plotOptions.funnel](plotOptions.funnel).
     * 3. Options for one single series are given in [the series instance
     * array](series.funnel).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, funnel: { // shared options for all funnel
     * series } }, series: [{ // specific options for this series instance type:
     * 'funnel' }] }); ```
     */
    private HighchartsSeriesPlotOptions funnel;

    /**
     * A funnel3d is a 3d version of funnel series type. Funnel charts are a
     * type of chart often used to visualize stages in a sales project, where
     * the top are the initial stages with the most clients.
     * <p>
     * It requires that the `highcharts-3d.js`, `cylinder.js` and `funnel3d.js`
     * module are loaded.
     * <p>
     * In TypeScript the [type](series.funnel3d.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `funnel3d` series are defined in
     * [plotOptions.funnel3d](plotOptions.funnel3d). 3. Options for one single
     * series are given in [the series instance array](series.funnel3d).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, funnel3d: { // shared options for all funnel3d
     * series } }, series: [{ // specific options for this series instance type:
     * 'funnel3d' }] }); ```
     *
     * @since 7.1.0
     */
    private HighchartsSeriesPlotOptions funnel3d;

    /**
     * Gauges are circular plots displaying one or more values with a dial
     * pointing to values along the perimeter.
     * <p>
     * In TypeScript the [type](series.gauge.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `gauge` series are defined in [plotOptions.gauge](plotOptions.gauge). 3.
     * Options for one single series are given in [the series instance
     * array](series.gauge).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, gauge: { // shared options for all gauge series
     * } }, series: [{ // specific options for this series instance type:
     * 'gauge' }] }); ```
     */
    private HighchartsSeriesPlotOptions gauge;

    /**
     * A heatmap is a graphical representation of data where the individual
     * values contained in a matrix are represented as colors.
     * <p>
     * In TypeScript the [type](series.heatmap.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `heatmap` series are defined in
     * [plotOptions.heatmap](plotOptions.heatmap). 3. Options for one single
     * series are given in [the series instance array](series.heatmap).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, heatmap: { // shared options for all heatmap
     * series } }, series: [{ // specific options for this series instance type:
     * 'heatmap' }] }); ```
     */
    private HighchartsSeriesPlotOptions heatmap;

    /**
     * A histogram is a column series which represents the distribution of the
     * data set in the base series. Histogram splits data into bins and shows
     * their frequencies.
     * <p>
     * In TypeScript the [type](series.histogram.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `histogram` series are defined in
     * [plotOptions.histogram](plotOptions.histogram). 3. Options for one single
     * series are given in [the series instance array](series.histogram).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, histogram: { // shared options for all
     * histogram series } }, series: [{ // specific options for this series
     * instance type: 'histogram' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions histogram;


    /**
     * An item chart is an infographic chart where a number of items are laid
     * out in either a rectangular or circular pattern. It can be used to
     * visualize counts within a group, or for the circular pattern, typically a
     * parliament.
     * <p>
     * The circular layout has much in common with a pie chart. Many of the item
     * series options, like `center`, `size` and data label positioning, are
     * inherited from the pie series and don't apply for rectangular layouts.
     * <p>
     * In TypeScript the [type](series.item.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `item` series are defined in [plotOptions.item](plotOptions.item). 3.
     * Options for one single series are given in [the series instance
     * array](series.item).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, item: { // shared options for all item series }
     * }, series: [{ // specific options for this series instance type: 'item'
     * }] }); ```
     *
     * @since 7.1.0
     */
    private HighchartsSeriesPlotOptions item;


    /**
     * A line series displays information as a series of data points connected
     * by straight line segments.
     * <p>
     * In TypeScript the [type](series.line.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `line` series are defined in [plotOptions.line](plotOptions.line). 3.
     * Options for one single series are given in [the series instance
     * array](series.line).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, line: { // shared options for all line series }
     * }, series: [{ // specific options for this series instance type: 'line'
     * }] }); ```
     */
    private HighchartsSeriesPlotOptions line;


    /**
     * A networkgraph is a type of relationship chart, where connnections
     * (links) attracts nodes (points) and other nodes repulse each other.
     * <p>
     * In TypeScript the [type](series.networkgraph.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `networkgraph` series are defined in
     * [plotOptions.networkgraph](plotOptions.networkgraph). 3. Options for one
     * single series are given in [the series instance
     * array](series.networkgraph).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, networkgraph: { // shared options for all
     * networkgraph series } }, series: [{ // specific options for this series
     * instance type: 'networkgraph' }] }); ```
     *
     * @since 7.0.0
     */
    private HighchartsSeriesPlotOptions networkgraph;


    /**
     * An organization chart is a diagram that shows the structure of an
     * organization and the relationships and relative ranks of its parts and
     * positions.
     * <p>
     * In TypeScript the [type](series.organization.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `organization` series are defined in
     * [plotOptions.organization](plotOptions.organization). 3. Options for one
     * single series are given in [the series instance
     * array](series.organization).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, organization: { // shared options for all
     * organization series } }, series: [{ // specific options for this series
     * instance type: 'organization' }] }); ```
     *
     * @since 7.1.0
     */
    private HighchartsSeriesPlotOptions organization;


    /**
     * A packed bubble series is a two dimensional series type, where each point
     * renders a value in X, Y position. Each point is drawn as a bubble where
     * the bubbles don't overlap with each other and the radius of the bubble
     * relates to the value.
     * <p>
     * In TypeScript the [type](series.packedbubble.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `packedbubble` series are defined in
     * [plotOptions.packedbubble](plotOptions.packedbubble). 3. Options for one
     * single series are given in [the series instance
     * array](series.packedbubble).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, packedbubble: { // shared options for all
     * packedbubble series } }, series: [{ // specific options for this series
     * instance type: 'packedbubble' }] }); ```
     *
     * @since 7.0.0
     */
    private HighchartsSeriesPlotOptions packedbubble;

    /**
     * A pareto diagram is a type of chart that contains both bars and a line
     * graph, where individual values are represented in descending order by
     * bars, and the cumulative total is represented by the line.
     * <p>
     * In TypeScript the [type](series.pareto.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `pareto` series are defined in [plotOptions.pareto](plotOptions.pareto).
     * 3. Options for one single series are given in [the series instance
     * array](series.pareto).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, pareto: { // shared options for all pareto
     * series } }, series: [{ // specific options for this series instance type:
     * 'pareto' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions pareto;


    /**
     * A pie chart is a circular graphic which is divided into slices to
     * illustrate numerical proportion.
     * <p>
     * In TypeScript the [type](series.pie.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all `pie`
     * series are defined in [plotOptions.pie](plotOptions.pie). 3. Options for
     * one single series are given in [the series instance array](series.pie).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, pie: { // shared options for all pie series }
     * }, series: [{ // specific options for this series instance type: 'pie' }]
     * }); ```
     */
    private HighchartsSeriesPlotOptions pie;


    /**
     * A polygon series can be used to draw any freeform shape in the cartesian
     * coordinate system. A fill is applied with the `color` option, and stroke
     * is applied through `lineWidth` and `lineColor` options.
     * <p>
     * In TypeScript the [type](series.polygon.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `polygon` series are defined in
     * [plotOptions.polygon](plotOptions.polygon). 3. Options for one single
     * series are given in [the series instance array](series.polygon).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, polygon: { // shared options for all polygon
     * series } }, series: [{ // specific options for this series instance type:
     * 'polygon' }] }); ```
     *
     * @since 4.1.0
     */
    private HighchartsSeriesPlotOptions polygon;


    /**
     * A pyramid series is a special type of funnel, without neck and reversed
     * by default.
     * <p>
     * In TypeScript the [type](series.pyramid.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `pyramid` series are defined in
     * [plotOptions.pyramid](plotOptions.pyramid). 3. Options for one single
     * series are given in [the series instance array](series.pyramid).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, pyramid: { // shared options for all pyramid
     * series } }, series: [{ // specific options for this series instance type:
     * 'pyramid' }] }); ```
     */
    private HighchartsSeriesPlotOptions pyramid;

    /**
     * A pyramid3d is a 3d version of pyramid series type. Pyramid charts are a
     * type of chart often used to visualize stages in a sales project, where
     * the top are the initial stages with the most clients.
     * <p>
     * In TypeScript the [type](series.pyramid3d.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `pyramid3d` series are defined in
     * [plotOptions.pyramid3d](plotOptions.pyramid3d). 3. Options for one single
     * series are given in [the series instance array](series.pyramid3d).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, pyramid3d: { // shared options for all
     * pyramid3d series } }, series: [{ // specific options for this series
     * instance type: 'pyramid3d' }] }); ```
     *
     * @since 7.1.0
     */
    private HighchartsSeriesPlotOptions pyramid3d;


    /**
     * A sankey diagram is a type of flow diagram, in which the width of the
     * link between two nodes is shown proportionally to the flow quantity.
     * <p>
     * In TypeScript the [type](series.sankey.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `sankey` series are defined in [plotOptions.sankey](plotOptions.sankey).
     * 3. Options for one single series are given in [the series instance
     * array](series.sankey).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, sankey: { // shared options for all sankey
     * series } }, series: [{ // specific options for this series instance type:
     * 'sankey' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions sankey;

    /**
     * A scatter plot uses cartesian coordinates to display values for two
     * variables for a set of data.
     * <p>
     * In TypeScript the [type](series.scatter.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `scatter` series are defined in
     * [plotOptions.scatter](plotOptions.scatter). 3. Options for one single
     * series are given in [the series instance array](series.scatter).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, scatter: { // shared options for all scatter
     * series } }, series: [{ // specific options for this series instance type:
     * 'scatter' }] }); ```
     */
    private HighchartsSeriesPlotOptions scatter;

    /**
     * A 3D scatter plot uses x, y and z coordinates to display values for three
     * variables for a set of data.
     * <p>
     * In TypeScript the [type](series.scatter3d.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `scatter3d` series are defined in
     * [plotOptions.scatter3d](plotOptions.scatter3d). 3. Options for one single
     * series are given in [the series instance array](series.scatter3d).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, scatter3d: { // shared options for all
     * scatter3d series } }, series: [{ // specific options for this series
     * instance type: 'scatter3d' }] }); ```
     */
    private HighchartsSeriesPlotOptions scatter3d;

    /**
     * General options for all series types.
     * <p>
     * In TypeScript the [type](series.line.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `line` series are defined in [plotOptions.line](plotOptions.line). 3.
     * Options for one single series are given in [the series instance
     * array](series.line).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, line: { // shared options for all line series }
     * }, series: [{ // specific options for this series instance type: 'line'
     * }] }); ```
     */
    private HighchartsSeriesPlotOptions series;


    /**
     * A solid gauge is a circular gauge where the value is indicated by a
     * filled arc, and the color of the arc may variate with the value.
     * <p>
     * In TypeScript the [type](series.solidgauge.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `solidgauge` series are defined in
     * [plotOptions.solidgauge](plotOptions.solidgauge). 3. Options for one
     * single series are given in [the series instance
     * array](series.solidgauge).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, solidgauge: { // shared options for all
     * solidgauge series } }, series: [{ // specific options for this series
     * instance type: 'solidgauge' }] }); ```
     */
    private HighchartsSeriesPlotOptions solidgauge;

    /**
     * A spline series is a special type of line series, where the segments
     * between the data points are smoothed.
     * <p>
     * In TypeScript the [type](series.spline.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `spline` series are defined in [plotOptions.spline](plotOptions.spline).
     * 3. Options for one single series are given in [the series instance
     * array](series.spline).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, spline: { // shared options for all spline
     * series } }, series: [{ // specific options for this series instance type:
     * 'spline' }] }); ```
     */
    private HighchartsSeriesPlotOptions spline;


    /**
     * A streamgraph is a type of stacked area graph which is displaced around a
     * central axis, resulting in a flowing, organic shape.
     * <p>
     * In TypeScript the [type](series.streamgraph.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `streamgraph` series are defined in
     * [plotOptions.streamgraph](plotOptions.streamgraph). 3. Options for one
     * single series are given in [the series instance
     * array](series.streamgraph).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, streamgraph: { // shared options for all
     * streamgraph series } }, series: [{ // specific options for this series
     * instance type: 'streamgraph' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions streamgraph;

    /**
     * A Sunburst displays hierarchical data, where a level in the hierarchy is
     * represented by a circle. The center represents the root node of the tree.
     * The visualization bears a resemblance to both treemap and pie charts.
     * <p>
     * In TypeScript the [type](series.sunburst.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `sunburst` series are defined in
     * [plotOptions.sunburst](plotOptions.sunburst). 3. Options for one single
     * series are given in [the series instance array](series.sunburst).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, sunburst: { // shared options for all sunburst
     * series } }, series: [{ // specific options for this series instance type:
     * 'sunburst' }] }); ```
     */
    private HighchartsSeriesPlotOptions sunburst;


    /**
     * A tilemap series is a type of heatmap where the tile shapes are
     * configurable.
     * <p>
     * In TypeScript the [type](series.tilemap.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `tilemap` series are defined in
     * [plotOptions.tilemap](plotOptions.tilemap). 3. Options for one single
     * series are given in [the series instance array](series.tilemap).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, tilemap: { // shared options for all tilemap
     * series } }, series: [{ // specific options for this series instance type:
     * 'tilemap' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions tilemap;

    /**
     * The timeline series presents given events along a drawn line.
     * <p>
     * In TypeScript the [type](series.timeline.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `timeline` series are defined in
     * [plotOptions.timeline](plotOptions.timeline). 3. Options for one single
     * series are given in [the series instance array](series.timeline).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, timeline: { // shared options for all timeline
     * series } }, series: [{ // specific options for this series instance type:
     * 'timeline' }] }); ```
     *
     * @since 7.0.0
     */
    private HighchartsSeriesPlotOptions timeline;

    /**
     * A treemap displays hierarchical data using nested rectangles. The data
     * can be laid out in varying ways depending on options.
     * <p>
     * In TypeScript the [type](series.treemap.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `treemap` series are defined in
     * [plotOptions.treemap](plotOptions.treemap). 3. Options for one single
     * series are given in [the series instance array](series.treemap).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, treemap: { // shared options for all treemap
     * series } }, series: [{ // specific options for this series instance type:
     * 'treemap' }] }); ```
     */
    private HighchartsSeriesPlotOptions treemap;


    /**
     * A variable pie series is a two dimensional series type, where each point
     * renders an Y and Z value. Each point is drawn as a pie slice where the
     * size (arc) of the slice relates to the Y value and the radius of pie
     * slice relates to the Z value.
     * <p>
     * In TypeScript the [type](series.variablepie.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `variablepie` series are defined in
     * [plotOptions.variablepie](plotOptions.variablepie). 3. Options for one
     * single series are given in [the series instance
     * array](series.variablepie).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, variablepie: { // shared options for all
     * variablepie series } }, series: [{ // specific options for this series
     * instance type: 'variablepie' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions variablepie;

    /**
     * A variwide chart (related to marimekko chart) is a column chart with a
     * variable width expressing a third dimension.
     * <p>
     * In TypeScript the [type](series.variwide.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `variwide` series are defined in
     * [plotOptions.variwide](plotOptions.variwide). 3. Options for one single
     * series are given in [the series instance array](series.variwide).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, variwide: { // shared options for all variwide
     * series } }, series: [{ // specific options for this series instance type:
     * 'variwide' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions variwide;


    /**
     * A vector plot is a type of cartesian chart where each point has an X and
     * Y position, a length and a direction. Vectors are drawn as arrows.
     * <p>
     * In TypeScript the [type](series.vector.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `vector` series are defined in [plotOptions.vector](plotOptions.vector).
     * 3. Options for one single series are given in [the series instance
     * array](series.vector).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, vector: { // shared options for all vector
     * series } }, series: [{ // specific options for this series instance type:
     * 'vector' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions vector;

    /**
     * A Venn diagram displays all possible logical relations between a
     * collection of different sets. The sets are represented by circles, and
     * the relation between the sets are displayed by the overlap or lack of
     * overlap between them. The venn diagram is a special case of Euler
     * diagrams, which can also be displayed by this series type.
     * <p>
     * In TypeScript the [type](series.venn.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `venn` series are defined in [plotOptions.venn](plotOptions.venn). 3.
     * Options for one single series are given in [the series instance
     * array](series.venn).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, venn: { // shared options for all venn series }
     * }, series: [{ // specific options for this series instance type: 'venn'
     * }] }); ```
     */
    private HighchartsSeriesPlotOptions venn;


    /**
     * A waterfall chart displays sequentially introduced positive or negative
     * values in cumulative columns.
     * <p>
     * In TypeScript the [type](series.waterfall.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `waterfall` series are defined in
     * [plotOptions.waterfall](plotOptions.waterfall). 3. Options for one single
     * series are given in [the series instance array](series.waterfall).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, waterfall: { // shared options for all
     * waterfall series } }, series: [{ // specific options for this series
     * instance type: 'waterfall' }] }); ```
     */
    private HighchartsSeriesPlotOptions waterfall;


    /**
     * Wind barbs are a convenient way to represent wind speed and direction in
     * one graphical form. Wind direction is given by the stem direction, and
     * wind speed by the number and shape of barbs.
     * <p>
     * In TypeScript the [type](series.windbarb.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `windbarb` series are defined in
     * [plotOptions.windbarb](plotOptions.windbarb). 3. Options for one single
     * series are given in [the series instance array](series.windbarb).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, windbarb: { // shared options for all windbarb
     * series } }, series: [{ // specific options for this series instance type:
     * 'windbarb' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions windbarb;


    /**
     * A word cloud is a visualization of a set of words, where the size and
     * placement of a word is determined by how it is weighted.
     * <p>
     * In TypeScript the [type](series.wordcloud.type) option must always be
     * set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `wordcloud` series are defined in
     * [plotOptions.wordcloud](plotOptions.wordcloud). 3. Options for one single
     * series are given in [the series instance array](series.wordcloud).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, wordcloud: { // shared options for all
     * wordcloud series } }, series: [{ // specific options for this series
     * instance type: 'wordcloud' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions wordcloud;

    /**
     * The X-range series displays ranges on the X axis, typically time
     * intervals with a start and end date.
     * <p>
     * In TypeScript the [type](series.xrange.type) option must always be set.
     * <p>
     * Configuration options for the series are given in three levels: 1.
     * Options for all series in a chart are defined in the
     * [plotOptions.series](plotOptions.series) object. 2. Options for all
     * `xrange` series are defined in [plotOptions.xrange](plotOptions.xrange).
     * 3. Options for one single series are given in [the series instance
     * array](series.xrange).
     * <p>
     * ``` Highcharts.chart('container', { plotOptions: { series: { // general
     * options for all series }, xrange: { // shared options for all xrange
     * series } }, series: [{ // specific options for this series instance type:
     * 'xrange' }] }); ```
     *
     * @since 6.0.0
     */
    private HighchartsSeriesPlotOptions xrange;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */

    public HighchartsSeriesPlotOptions getArea() {
        return this.area = getInstanceOf(HighchartsSeriesPlotOptions.class, this.area);
    }

    public PlotOptions setArea(HighchartsSeriesPlotOptions area) {
        this.area = area;
        return this;
    }

    public HighchartsSeriesPlotOptions getArearange() {
        return this.arearange = getInstanceOf(HighchartsSeriesPlotOptions.class, this.arearange);
    }

    public PlotOptions setArearange(HighchartsSeriesPlotOptions arearange) {
        this.arearange = arearange;
        return this;
    }

    public HighchartsSeriesPlotOptions getAreaspline() {
        return this.areaspline = getInstanceOf(HighchartsSeriesPlotOptions.class, this.areaspline);
    }

    public PlotOptions setAreaspline(HighchartsSeriesPlotOptions areaspline) {
        this.areaspline = areaspline;
        return this;
    }

    public HighchartsSeriesPlotOptions getAreasplinerange() {
        return this.areasplinerange = getInstanceOf(HighchartsSeriesPlotOptions.class, this.areasplinerange);
    }

    public PlotOptions setAreasplinerange(HighchartsSeriesPlotOptions areasplinerange) {
        this.areasplinerange = areasplinerange;
        return this;
    }

    public HighchartsSeriesPlotOptions getBar() {
        return this.bar = getInstanceOf(HighchartsSeriesPlotOptions.class, this.bar);
    }

    public PlotOptions setBar(HighchartsSeriesPlotOptions bar) {
        this.bar = bar;
        return this;
    }

    public HighchartsSeriesPlotOptions getBellcurve() {
        return this.bellcurve = getInstanceOf(HighchartsSeriesPlotOptions.class, this.bellcurve);
    }

    public PlotOptions setBellcurve(HighchartsSeriesPlotOptions bellcurve) {
        this.bellcurve = bellcurve;
        return this;
    }

    public HighchartsSeriesPlotOptions getBoxplot() {
        return this.boxplot = getInstanceOf(HighchartsSeriesPlotOptions.class, this.boxplot);
    }

    public PlotOptions setBoxplot(HighchartsSeriesPlotOptions boxplot) {
        this.boxplot = boxplot;
        return this;
    }

    public HighchartsSeriesPlotOptions getBubble() {
        return this.bubble = getInstanceOf(HighchartsSeriesPlotOptions.class, this.bubble);
    }

    public PlotOptions setBubble(HighchartsSeriesPlotOptions bubble) {
        this.bubble = bubble;
        return this;
    }

    public HighchartsSeriesPlotOptions getBullet() {
        return this.bullet = getInstanceOf(HighchartsSeriesPlotOptions.class, this.bullet);
    }

    public PlotOptions setBullet(HighchartsSeriesPlotOptions bullet) {
        this.bullet = bullet;
        return this;
    }

    public HighchartsSeriesPlotOptions getColumn() {
        return this.column = getInstanceOf(HighchartsSeriesPlotOptions.class, this.column);
    }

    public PlotOptions setColumn(HighchartsSeriesPlotOptions column) {
        this.column = column;
        return this;
    }

    public HighchartsSeriesPlotOptions getColumnpyramid() {
        return this.columnpyramid = getInstanceOf(HighchartsSeriesPlotOptions.class, this.columnpyramid);
    }

    public PlotOptions setColumnpyramid(HighchartsSeriesPlotOptions columnpyramid) {
        this.columnpyramid = columnpyramid;
        return this;
    }

    public HighchartsSeriesPlotOptions getColumnrange() {
        return this.columnrange = getInstanceOf(HighchartsSeriesPlotOptions.class, this.columnrange);
    }

    public PlotOptions setColumnrange(HighchartsSeriesPlotOptions columnrange) {
        this.columnrange = columnrange;
        return this;
    }

    public HighchartsSeriesPlotOptions getCylinder() {
        return this.cylinder = getInstanceOf(HighchartsSeriesPlotOptions.class, this.cylinder);
    }

    public PlotOptions setCylinder(HighchartsSeriesPlotOptions cylinder) {
        this.cylinder = cylinder;
        return this;
    }

    public HighchartsSeriesPlotOptions getDependencywheel() {
        return this.dependencywheel = getInstanceOf(HighchartsSeriesPlotOptions.class, this.dependencywheel);
    }

    public PlotOptions setDependencywheel(HighchartsSeriesPlotOptions dependencywheel) {
        this.dependencywheel = dependencywheel;
        return this;
    }

    public HighchartsSeriesPlotOptions getErrorbar() {
        return this.errorbar = getInstanceOf(HighchartsSeriesPlotOptions.class, this.errorbar);
    }

    public PlotOptions setErrorbar(HighchartsSeriesPlotOptions errorbar) {
        this.errorbar = errorbar;
        return this;
    }

    public HighchartsSeriesPlotOptions getFunnel() {
        return this.funnel = getInstanceOf(HighchartsSeriesPlotOptions.class, this.funnel);
    }

    public PlotOptions setFunnel(HighchartsSeriesPlotOptions funnel) {
        this.funnel = funnel;
        return this;
    }

    public HighchartsSeriesPlotOptions getFunnel3d() {
        return this.funnel3d = getInstanceOf(HighchartsSeriesPlotOptions.class, this.funnel3d);
    }

    public PlotOptions setFunnel3d(HighchartsSeriesPlotOptions funnel3d) {
        this.funnel3d = funnel3d;
        return this;
    }

    public HighchartsSeriesPlotOptions getGauge() {
        return this.gauge = getInstanceOf(HighchartsSeriesPlotOptions.class, this.gauge);
    }

    public PlotOptions setGauge(HighchartsSeriesPlotOptions gauge) {
        this.gauge = gauge;
        return this;
    }

    public HighchartsSeriesPlotOptions getHeatmap() {
        return this.heatmap = getInstanceOf(HighchartsSeriesPlotOptions.class, this.heatmap);
    }

    public PlotOptions setHeatmap(HighchartsSeriesPlotOptions heatmap) {
        this.heatmap = heatmap;
        return this;
    }

    public HighchartsSeriesPlotOptions getHistogram() {
        return this.histogram = getInstanceOf(HighchartsSeriesPlotOptions.class, this.histogram);
    }

    public PlotOptions setHistogram(HighchartsSeriesPlotOptions histogram) {
        this.histogram = histogram;
        return this;
    }

    public HighchartsSeriesPlotOptions getItem() {
        return this.item = getInstanceOf(HighchartsSeriesPlotOptions.class, this.item);
    }

    public PlotOptions setItem(HighchartsSeriesPlotOptions item) {
        this.item = item;
        return this;
    }

    public HighchartsSeriesPlotOptions getLine() {
        return this.line = getInstanceOf(HighchartsSeriesPlotOptions.class, this.line);
    }

    public PlotOptions setLine(HighchartsSeriesPlotOptions line) {
        this.line = line;
        return this;
    }

    public HighchartsSeriesPlotOptions getNetworkgraph() {
        return this.networkgraph = getInstanceOf(HighchartsSeriesPlotOptions.class, this.networkgraph);
    }

    public PlotOptions setNetworkgraph(HighchartsSeriesPlotOptions networkgraph) {
        this.networkgraph = networkgraph;
        return this;
    }

    public HighchartsSeriesPlotOptions getOrganization() {
        return this.organization = getInstanceOf(HighchartsSeriesPlotOptions.class, this.organization);
    }

    public PlotOptions setOrganization(HighchartsSeriesPlotOptions organization) {
        this.organization = organization;
        return this;
    }

    public HighchartsSeriesPlotOptions getPackedbubble() {
        return this.packedbubble = getInstanceOf(HighchartsSeriesPlotOptions.class, this.packedbubble);
    }

    public PlotOptions setPackedbubble(HighchartsSeriesPlotOptions packedbubble) {
        this.packedbubble = packedbubble;
        return this;
    }

    public HighchartsSeriesPlotOptions getPareto() {
        return this.pareto = getInstanceOf(HighchartsSeriesPlotOptions.class, this.pareto);
    }

    public PlotOptions setPareto(HighchartsSeriesPlotOptions pareto) {
        this.pareto = pareto;
        return this;
    }

    public HighchartsSeriesPlotOptions getPie() {
        return this.pie = getInstanceOf(HighchartsSeriesPlotOptions.class, this.pie);
    }

    public PlotOptions setPie(HighchartsSeriesPlotOptions pie) {
        this.pie = pie;
        return this;
    }

    public HighchartsSeriesPlotOptions getPolygon() {
        return this.polygon = getInstanceOf(HighchartsSeriesPlotOptions.class, this.polygon);
    }

    public PlotOptions setPolygon(HighchartsSeriesPlotOptions polygon) {
        this.polygon = polygon;
        return this;
    }

    public HighchartsSeriesPlotOptions getPyramid() {
        return this.pyramid = getInstanceOf(HighchartsSeriesPlotOptions.class, this.pyramid);
    }

    public PlotOptions setPyramid(HighchartsSeriesPlotOptions pyramid) {
        this.pyramid = pyramid;
        return this;
    }

    public HighchartsSeriesPlotOptions getPyramid3d() {
        return this.pyramid3d = getInstanceOf(HighchartsSeriesPlotOptions.class, this.pyramid3d);
    }

    public PlotOptions setPyramid3d(HighchartsSeriesPlotOptions pyramid3d) {
        this.pyramid3d = pyramid3d;
        return this;
    }

    public HighchartsSeriesPlotOptions getSankey() {
        return this.sankey = getInstanceOf(HighchartsSeriesPlotOptions.class, this.sankey);
    }

    public PlotOptions setSankey(HighchartsSeriesPlotOptions sankey) {
        this.sankey = sankey;
        return this;
    }

    public HighchartsSeriesPlotOptions getScatter() {
        return this.scatter = getInstanceOf(HighchartsSeriesPlotOptions.class, this.scatter);
    }

    public PlotOptions setScatter(HighchartsSeriesPlotOptions scatter) {
        this.scatter = scatter;
        return this;
    }

    public HighchartsSeriesPlotOptions getScatter3d() {
        return this.scatter3d = getInstanceOf(HighchartsSeriesPlotOptions.class, this.scatter3d);
    }

    public PlotOptions setScatter3d(HighchartsSeriesPlotOptions scatter3d) {
        this.scatter3d = scatter3d;
        return this;
    }

    public HighchartsSeriesPlotOptions getSeries() {
        return this.series = getInstanceOf(HighchartsSeriesPlotOptions.class, this.series);
    }

    public PlotOptions setSeries(HighchartsSeriesPlotOptions series) {
        this.series = series;
        return this;
    }

    public HighchartsSeriesPlotOptions getSolidgauge() {
        return this.solidgauge = getInstanceOf(HighchartsSeriesPlotOptions.class, this.solidgauge);
    }

    public PlotOptions setSolidgauge(HighchartsSeriesPlotOptions solidgauge) {
        this.solidgauge = solidgauge;
        return this;
    }

    public HighchartsSeriesPlotOptions getSpline() {
        return this.spline = getInstanceOf(HighchartsSeriesPlotOptions.class, this.spline);
    }

    public PlotOptions setSpline(HighchartsSeriesPlotOptions spline) {
        this.spline = spline;
        return this;
    }

    public HighchartsSeriesPlotOptions getStreamgraph() {
        return this.streamgraph = getInstanceOf(HighchartsSeriesPlotOptions.class, this.streamgraph);
    }

    public PlotOptions setStreamgraph(HighchartsSeriesPlotOptions streamgraph) {
        this.streamgraph = streamgraph;
        return this;
    }

    public HighchartsSeriesPlotOptions getSunburst() {
        return this.sunburst = getInstanceOf(HighchartsSeriesPlotOptions.class, this.sunburst);
    }

    public PlotOptions setSunburst(HighchartsSeriesPlotOptions sunburst) {
        this.sunburst = sunburst;
        return this;
    }

    public HighchartsSeriesPlotOptions getTilemap() {
        return this.tilemap = getInstanceOf(HighchartsSeriesPlotOptions.class, this.tilemap);
    }

    public PlotOptions setTilemap(HighchartsSeriesPlotOptions tilemap) {
        this.tilemap = tilemap;
        return this;
    }

    public HighchartsSeriesPlotOptions getTimeline() {
        return this.timeline = getInstanceOf(HighchartsSeriesPlotOptions.class, this.timeline);
    }

    public PlotOptions setTimeline(HighchartsSeriesPlotOptions timeline) {
        this.timeline = timeline;
        return this;
    }

    public HighchartsSeriesPlotOptions getTreemap() {
        return this.treemap = getInstanceOf(HighchartsSeriesPlotOptions.class, this.treemap);
    }

    public PlotOptions setTreemap(HighchartsSeriesPlotOptions treemap) {
        this.treemap = treemap;
        return this;
    }

    public HighchartsSeriesPlotOptions getVariablepie() {
        return this.variablepie = getInstanceOf(HighchartsSeriesPlotOptions.class, this.variablepie);
    }

    public PlotOptions setVariablepie(HighchartsSeriesPlotOptions variablepie) {
        this.variablepie = variablepie;
        return this;
    }

    public HighchartsSeriesPlotOptions getVariwide() {
        return this.variwide = getInstanceOf(HighchartsSeriesPlotOptions.class, this.variwide);
    }

    public PlotOptions setVariwide(HighchartsSeriesPlotOptions variwide) {
        this.variwide = variwide;
        return this;
    }

    public HighchartsSeriesPlotOptions getVector() {
        return this.vector = getInstanceOf(HighchartsSeriesPlotOptions.class, this.vector);
    }

    public PlotOptions setVector(HighchartsSeriesPlotOptions vector) {
        this.vector = vector;
        return this;
    }

    public HighchartsSeriesPlotOptions getVenn() {
        return this.venn = getInstanceOf(HighchartsSeriesPlotOptions.class, this.venn);
    }

    public PlotOptions setVenn(HighchartsSeriesPlotOptions venn) {
        this.venn = venn;
        return this;
    }

    public HighchartsSeriesPlotOptions getWaterfall() {
        return this.waterfall = getInstanceOf(HighchartsSeriesPlotOptions.class, this.waterfall);
    }

    public PlotOptions setWaterfall(HighchartsSeriesPlotOptions waterfall) {
        this.waterfall = waterfall;
        return this;
    }

    public HighchartsSeriesPlotOptions getWindbarb() {
        return this.windbarb = getInstanceOf(HighchartsSeriesPlotOptions.class, this.windbarb);
    }

    public PlotOptions setWindbarb(HighchartsSeriesPlotOptions windbarb) {
        this.windbarb = windbarb;
        return this;
    }

    public HighchartsSeriesPlotOptions getWordcloud() {
        return this.wordcloud = getInstanceOf(HighchartsSeriesPlotOptions.class, this.wordcloud);
    }

    public PlotOptions setWordcloud(HighchartsSeriesPlotOptions wordcloud) {
        this.wordcloud = wordcloud;
        return this;
    }

    public HighchartsSeriesPlotOptions getXrange() {
        return this.xrange = getInstanceOf(HighchartsSeriesPlotOptions.class, this.xrange);
    }

    public PlotOptions setXrange(HighchartsSeriesPlotOptions xrange) {
        this.xrange = xrange;
        return this;
    }

    @Override
    public String toString() {
        return
                '{' + "area:" + area +
                        ", arearange:" + arearange +
                        ", areaspline:" + areaspline +
                        ", areasplinerange:" + areasplinerange +
                        ", bar:" + bar +
                        ", bellcurve:" + bellcurve +
                        ", boxplot:" + boxplot +
                        ", bubble:" + bubble +
                        ", bullet:" + bullet +
                        ", column:" + column +
                        ", columnpyramid:" + columnpyramid +
                        ", columnrange:" + columnrange +
                        ", cylinder:" + cylinder +
                        ", dependencywheel:" + dependencywheel +
                        ", errorbar:" + errorbar +
                        ", funnel:" + funnel +
                        ", funnel3d:" + funnel3d +
                        ", gauge:" + gauge +
                        ", heatmap:" + heatmap +
                        ", histogram:" + histogram +
                        ", item:" + item +
                        ", line:" + line +
                        ", networkgraph:" + networkgraph +
                        ", organization:" + organization +
                        ", packedbubble:" + packedbubble +
                        ", pareto:" + pareto +
                        ", pie:" + pie +
                        ", polygon:" + polygon +
                        ", pyramid:" + pyramid +
                        ", pyramid3d:" + pyramid3d +
                        ", sankey:" + sankey +
                        ", scatter:" + scatter +
                        ", scatter3d:" + scatter3d +
                        ", series:" + series +
                        ", solidgauge:" + solidgauge +
                        ", spline:" + spline +
                        ", streamgraph:" + streamgraph +
                        ", sunburst:" + sunburst +
                        ", tilemap:" + tilemap +
                        ", timeline:" + timeline +
                        ", treemap:" + treemap +
                        ", variablepie:" + variablepie +
                        ", variwide:" + variwide +
                        ", vector:" + vector +
                        ", venn:" + venn +
                        ", waterfall:" + waterfall +
                        ", windbarb:" + windbarb +
                        ", wordcloud:" + wordcloud +
                        ", xrange:" + xrange +
                        '}';
    }
}
