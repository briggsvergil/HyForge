package za.co.onlineintelligence.hyforge.chart;

import java.io.Serializable;

import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean
 */
public class ChartEvents implements Serializable {

    /**
     * "Fires when a series is added to the chart after load time, using the
     * `addSeries` method. One parameter, `event`, is passed to the function,
     * containing common event information. Through `event.options` you can
     * access the series options that were passed to the `addSeries` method.
     * Returning false prevents the series from being added."
     */
    private HighchartsCallbackFunction addSeries;
    /**
     * "Fires after a chart is printed through the context menu item or the
     * `Chart.print` method."
     */
    private HighchartsCallbackFunction afterPrint;

    /**
     * "Fires before a chart is printed through the context menu item or the
     * `Chart.print` method."
     */
    private HighchartsCallbackFunction beforePrint;
    /**
     * "Fires when clicking on the plot background. One parameter, `event`, is
     * passed to the function, containing common event information.
     * <p>
     * Information on the clicked spot can be found through `event.xAxis` and
     * `event.yAxis`, which are arrays containing the axes of each dimension and
     * each axis' value at the clicked spot. The primary axes are
     * `event.xAxis[0]` and `event.yAxis[0]`. Remember the unit of a datetime
     * axis is milliseconds since 1970-01-01 00:00:00.
     * <p>
     * ```js click: function(e) { console.log( Highcharts.dateFormat('%Y-%m-%d
     * %H:%M:%S', e.xAxis[0].value), e.yAxis[0].value ) } ```"
     */
    private HighchartsCallbackFunction click;
    /**
     * "Fires when a drilldown point is clicked, before the new series is added.
     * This event is also utilized for async drilldown, where the seriesOptions
     * are not added by option, but rather loaded async. Note that when clicking
     * a category label to trigger multiple series drilldown, one `drilldown`
     * event is triggered per point in the category.
     * <p>
     * SeriesEvents arguments:
     * <p>
     * - `category`: If a category label was clicked, which index.
     * <p>
     * - `originalEvent`: The original browser event (usually click) that
     * triggered the drilldown.
     * <p>
     * - `point`: The originating point.
     * <p>
     * - `points`: If a category label was clicked, this array holds all points
     * corresponing to the category.
     * <p>
     * - `seriesOptions`: Options for the new series."
     */
    private HighchartsCallbackFunction drilldown;
    /**
     * "Fires when drilling up from a drilldown series."
     */
    private HighchartsCallbackFunction drillup;
    /**
     * "In a chart with multiple drilldown series, this event fires after all
     * the series have been drilled up."
     */
    private HighchartsCallbackFunction drillupall;
    /**
     * "Callback that fires while exporting data. This allows the modification
     * of data rows before processed into the final format."
     */
    private HighchartsCallbackFunction exportData;
    /**
     * "Fires when the chart is finished loading. Since v4.2.2, it also waits
     * for images to be loaded, for example from point markers. One parameter,
     * `event`, is passed to the function, containing common event information.
     * <p>
     * There is also a second parameter to the chart constructor where a
     * callback function can be passed to be executed on chart.load."
     */
    private HighchartsCallbackFunction load;
    /**
     * "Fires when the chart is redrawn, either after a call to `chart.redraw()`
     * or after an axis, series or point is modified with the `redraw` option
     * set to `true`. One parameter, `event`, is passed to the function,
     * containing common event information."
     */
    private HighchartsCallbackFunction redraw;
    /**
     * "Fires after initial load of the chart (directly after the `load` event),
     * and after each redraw (directly after the `redraw` event)."
     */
    private HighchartsCallbackFunction render;
    /**
     * "Fires when an area of the chart has been selected. Selection is enabled
     * by setting the chart's zoomType. One parameter, `event`, is passed to the
     * function, containing common event information. The default action for the
     * selection event is to zoom the chart to the selected area. It can be
     * prevented by calling `event.preventDefault()` or return this.false = getInstanceevent.classOf(, this.false.
     * <p>
     * Information on the selected area can be found through `event.xAxis` and
     * `event.yAxis`, which are arrays containing the axes of each dimension and
     * each axis' min and max values. The primary axes are `event.xAxis[0]` and
     * `event.yAxis[0]`. Remember the unit of a datetime axis is milliseconds
     * since 1970-01-01 00:00:00.
     * <p>
     * ```js selection: function(event) { // log the min and max of the primary,
     * datetime x-axis console.log( Highcharts.dateFormat( '%Y-%m-%d %H:%M:%S',
     * event.xAxis[0].min ), Highcharts.dateFormat( '%Y-%m-%d %H:%M:%S',
     * event.xAxis[0].max ) ); // log the min and max of the y axis
     * console.log(event.yAxis[0].min, event.yAxis[0].max); } ```"
     */
    private HighchartsCallbackFunction selection;

    public ChartEvents() {
    }

    public HighchartsCallbackFunction getAddSeries() {
        return this.addSeries = getInstanceOf(HighchartsCallbackFunction.class, this.addSeries);
    }

    public ChartEvents setAddSeries(HighchartsCallbackFunction addSeries) {
        this.addSeries = addSeries;
        return this;
    }

    public HighchartsCallbackFunction getBeforePrint() {
        return this.beforePrint = getInstanceOf(HighchartsCallbackFunction.class, this.beforePrint);
    }

    public ChartEvents setBeforePrint(HighchartsCallbackFunction beforePrint) {
        this.beforePrint = beforePrint;
        return this;
    }

    public HighchartsCallbackFunction getClick() {
        return this.click = getInstanceOf(HighchartsCallbackFunction.class, this.click);
    }

    public ChartEvents setClick(HighchartsCallbackFunction click) {
        this.click = click;
        return this;
    }

    public HighchartsCallbackFunction getDrilldown() {
        return this.drilldown = getInstanceOf(HighchartsCallbackFunction.class, this.drilldown);
    }

    public ChartEvents setDrilldown(HighchartsCallbackFunction drilldown) {
        this.drilldown = drilldown;
        return this;
    }

    public HighchartsCallbackFunction getDrillup() {
        return this.drillup = getInstanceOf(HighchartsCallbackFunction.class, this.drillup);
    }

    public ChartEvents setDrillup(HighchartsCallbackFunction drillup) {
        this.drillup = drillup;
        return this;
    }

    public HighchartsCallbackFunction getDrillupall() {
        return this.drillupall = getInstanceOf(HighchartsCallbackFunction.class, this.drillupall);
    }

    public ChartEvents setDrillupall(HighchartsCallbackFunction drillupall) {
        this.drillupall = drillupall;
        return this;
    }

    public HighchartsCallbackFunction getExportData() {
        return this.exportData = getInstanceOf(HighchartsCallbackFunction.class, this.exportData);
    }

    public ChartEvents setExportData(HighchartsCallbackFunction exportData) {
        this.exportData = exportData;
        return this;
    }

    public HighchartsCallbackFunction getLoad() {
        return this.load = getInstanceOf(HighchartsCallbackFunction.class, this.load);
    }

    public ChartEvents setLoad(HighchartsCallbackFunction load) {
        this.load = load;
        return this;
    }

    public HighchartsCallbackFunction getRedraw() {
        return this.redraw = getInstanceOf(HighchartsCallbackFunction.class, this.redraw);
    }

    public ChartEvents setRedraw(HighchartsCallbackFunction redraw) {
        this.redraw = redraw;
        return this;
    }

    public HighchartsCallbackFunction getRender() {
        return this.render = getInstanceOf(HighchartsCallbackFunction.class, this.render);
    }

    public ChartEvents setRender(HighchartsCallbackFunction render) {
        this.render = render;
        return this;
    }

    public HighchartsCallbackFunction getSelection() {
        return this.selection = getInstanceOf(HighchartsCallbackFunction.class, this.selection);
    }

    public ChartEvents setSelection(HighchartsCallbackFunction selection) {
        this.selection = selection;
        return this;
    }

    public HighchartsCallbackFunction getAfterPrint() {
        return this.afterPrint = getInstanceOf(HighchartsCallbackFunction.class, this.afterPrint);
    }

    public ChartEvents setAfterPrint(HighchartsCallbackFunction afterPrint) {
        this.afterPrint = afterPrint;
        return this;
    }

    @Override
    public String toString() {
        return "{" + "addSeries:" + addSeries + ", afterPrint:" + afterPrint
                + ", beforePrint:" + beforePrint + ", click:" + click
                + ", drilldown:" + drilldown + ", drillup:" + drillup
                + ", drillupall:" + drillupall + ", exportData:"
                + exportData + ", load:" + load + ", redraw:" + redraw
                + ", render:" + render + ", selection:" + selection + '}';
    }

}
