package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.accessibility.Accessibility;
import za.co.onlineintelligence.hyforge.annotations.Annotations;
import za.co.onlineintelligence.hyforge.axis.Axis;
import za.co.onlineintelligence.hyforge.boost.Boost;
import za.co.onlineintelligence.hyforge.caption.Caption;
import za.co.onlineintelligence.hyforge.chart.Chart;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;
import za.co.onlineintelligence.hyforge.credits.Credits;
import za.co.onlineintelligence.hyforge.data.Data;
import za.co.onlineintelligence.hyforge.defs.Defs;
import za.co.onlineintelligence.hyforge.exporting.Exporting;
import za.co.onlineintelligence.hyforge.global.Global;
import za.co.onlineintelligence.hyforge.lang.Lang;
import za.co.onlineintelligence.hyforge.legend.Legend;
import za.co.onlineintelligence.hyforge.loading.Loading;
import za.co.onlineintelligence.hyforge.navigation.Navigation;
import za.co.onlineintelligence.hyforge.plotoptions.PlotOptions;
import za.co.onlineintelligence.hyforge.responsive.Responsive;
import za.co.onlineintelligence.hyforge.series.Series;
import za.co.onlineintelligence.hyforge.subtitle.Subtitle;
import za.co.onlineintelligence.hyforge.time.Time;
import za.co.onlineintelligence.hyforge.title.Title;
import za.co.onlineintelligence.hyforge.tooltip.Tooltip;

import java.util.Arrays;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * This abstract class is extended by the various products that Highcharts offers, namely,
 * - Highcharts
 * - Highstock
 * - Highmaps
 * - Gannt
 * <p>
 * As such there are many options available to all the products, some being shared by all (*1),
 * some being limited to specific products (*2), and others being shared by a subset of products, but not all (*3).
 *
 * @author Sean Briggs
 */
@SuppressWarnings("unchecked")
public abstract class ChartOptions<T extends ChartOptions> implements DrosteDeflater {
/**
 * NOTE: Reference Highcharts 8.0.0 tree.json:
 *
 * Chart Options Explanation
 * 1.
 * Common Options to Highcharts, Highstock, Highmaps and Gannt:
 * <p>
 * xx.setOptions():
 * - global
 * - lang
 * xx.chart()/ganntChart()/mapChart()/stockChart():
 * - accessibility
 * - annotations
 * - boost
 * - caption
 * - chart
 * - colors
 * - credits
 * - data
 * - defs
 * - loading
 * - legend
 * - exporting
 * - navigation
 * - plotOptions
 * - responsive
 * - series
 * - subtitle
 * - time
 * - title
 * - tooltip
 * - xAxis
 * - yAxis
 *
 * <p>
 * 2.
 * Options Limited to Highcharts:
 * - pane
 * - zAxis
 * <p>
 * Options Limited to Highstock:
 * - stockTools
 * <p>
 * Options Limited to Highmaps:
 * - mapNavigation
 * <p>
 * Options Limited to Gannt:
 * - connectors
 *
 * <p>
 * 3.
 * Options Limited to Subsets:
 * - colorAxis [charts, maps, stocks]
 * - drilldown [charts, maps]
 * - labels [charts, stock]
 * - noData [charts, gannt, stock]
 * - navigator, - rangeSelector, - scrollbar [gannt, stock]
 */

    /**
     * "Options for configuring accessibility for the chart. Requires the
     * [accessibility
     * module](https://code.highcharts.com/modules/accessibility.js) to be
     * loaded. For a description of the module and information on its features,
     * see [Highcharts
     * Accessibility](http://www.highcharts.com/docs/chart-concepts/accessibility)."
     */
    protected Accessibility accessibility;
    /**
     * "A basic type of an annotation. It allows to add custom labels or shapes.
     * The items can be tied to points, axis coordinates or chart pixel
     * coordinates."
     */
    protected Annotations[] annotations;
    /**
     * ...
     */
    protected Boost boost;
    /**
     * "The chart's caption, which will render below the chart and will be part
     * of exported charts. The caption can be updated after chart initialization
     * through the `Chart.update` or `Chart.caption.update` methods."
     */
    protected Caption caption;
    /**
     * "General options for the chart."
     */
    protected Chart chart;
    /**
     * "An array containing the default colors for the chart's series. When all
     * colors are used, new colors are pulled from the start again.
     * <p>
     * Default colors can also be set on a series or series.type basis, see
     * [column.colors](#plotOptions.column.colors),
     * [pie.colors](#plotOptions.pie.colors).
     * <p>
     * In styled mode, the colors option doesn't exist. Instead, colors are
     * defined in CSS and applied either through series or point class names, or
     * through the [chart.colorCount](#chart.colorCount) option.
     * <p>
     * <p>
     * ### Legacy
     * <p>
     * In Highcharts 3.x, the default colors were: ```js colors: ['#2f7ed8',
     * '#0d233a', '#8bbc21', '#910000', '#1aadce', '#492970', '#f28f43',
     * '#77a1e5', '#c42525', '#a6c96a'] ```
     * <p>
     * In Highcharts 2.x, the default colors were: ```js colors: ['#4572A7',
     * '#AA4643', '#89A54E', '#80699B', '#3D96AE', '#DB843D', '#92A8CD',
     * '#A47D7C', '#B5CA92'] ```"
     */
    protected HighchartsColorString[] colors;
    /**
     * "Highchart by default puts a credits label in the lower right corner of
     * the chart. This can be changed using these options."
     */
    protected Credits credits;
    /**
     * "The Data module provides a simplified interface for adding data to a
     * chart from sources like CVS, HTML tables or grid views. See also the
     * [tutorial article on the Data
     * module](https://www.highcharts.com/docs/working-with-data/data-module).
     * <p>
     * It requires the `modules/data.js` file to be loaded.
     * <p>
     * Please note that the default way of adding data in Highcharts, without
     * the need of a module, is through the
     * [series._type_.data](#series.line.data) option."
     */
    protected Data data;
    /**
     * "Styled mode only. Configuration object for adding SVG definitions for
     * reusable elements. See [gradients, shadows and
     * patterns](https://www.highcharts.com/docs/chart-design-and-style/gradients-shadows-and-patterns)
     * for more information and code examples."
     */
    protected Defs defs;
    /**
     * "Options for the exporting module. For an overview on the matter, see
     * [the
     * docs](https://www.highcharts.com/docs/export-module/export-module-overview)."
     */
    protected Exporting exporting;
    /**
     * ...
     */
    protected Global global;
    /**
     * "Language object. The language object is global and it can't be set on
     * each chart initialization. Instead, use `Highcharts.setOptions` to set it
     * before any chart is initialized.
     * <p>
     * ```js Highcharts.setOptions({ lang: { months: [ 'Janvier', 'Février',
     * 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre',
     * 'Octobre', 'Novembre', 'Décembre' ], weekdays: [ 'Dimanche', 'Lundi',
     * 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi' ] } }); ```"
     */
    protected Lang lang;
    /**
     * "The legend is a box containing a symbol and name for each series item or
     * point item in the chart. Each series (or points in case of pie charts) is
     * represented by a symbol and its name in the legend.
     * <p>
     * It is possible to override the symbol creator function and create [custom
     * legend
     * symbols](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-custom-symbol/)."
     */
    protected Legend legend;
    /**
     * "The loading options control the appearance of the loading screen that
     * covers the plot area on chart operations. This screen only appears after
     * an explicit call to `chart.showLoading()`. It is a utility for developers
     * to communicate to the end user that something is going on, for example
     * while retrieving new data via an XHR connection. The \"Loading...\" text
     * itself is not part of this configuration object, but part of the `lang`
     * object."
     */
    protected Loading loading;
    /**
     * "A collection of options for buttons and menus appearing in the exporting
     * module."
     */
    protected Navigation navigation;
    /**
     * "The plotOptions is a wrapper object for config objects for each series
     * type. The config objects for each series can also be overridden for each
     * series item as given in the series array.
     * <p>
     * Configuration options for the series are given in three levels. Options
     * for all series in a chart are given in the
     * [plotOptions.series](#plotOptions.series) object. Then options for all
     * series of a specific type are given in the plotOptions of that type, for
     * example `plotOptions.line`. Next, options for one single series are given
     * in [the series array](#series)."
     */
    protected PlotOptions plotOptions;
    /**
     * "Allows setting a set of rules to apply for different screen or chart
     * sizes. Each rule specifies additional chart options."
     */
    protected Responsive responsive;
    /**
     * "Series options for specific data and the data itself. In TypeScript you
     * have to cast the series options to specific series types, to get all
     * possible options for a series."
     */
    protected Series[] series;
    /**
     * "The chart's subtitle. This can be used both to display a subtitle below
     * the main title, and to display random text anywhere in the chart. The
     * subtitle can be updated after chart initialization through the
     * `Chart.setTitle` method."
     */
    protected Subtitle subtitle;
    /**
     * "Time options that can apply globally or to individual charts. These
     * settings affect how `datetime` axes are laid out, how tooltips are
     * formatted, how series
     * [pointIntervalUnit](#plotOptions.series.pointIntervalUnit) works and how
     * the Highstock range selector handles time.
     * <p>
     * The common use case is that all charts in the same Highcharts object
     * share the same time settings, in which case the global settings are set
     * using `setOptions`.
     */
    protected Time time;
    /**
     * "The chart's main title."
     */
    protected Title title;
    /**
     * "Options for the tooltip that appears when the user hovers over a series
     * or point."
     */
    protected Tooltip tooltip;
    /**
     * "The X axis or category axis. Normally this is the horizontal axis,
     * though if the chart is inverted this is the vertical axis. In case of
     * multiple axes, the xAxis node is an array of configuration objects.
     * <p>
     * See the [axis class](/class-reference/Highcharts.axis) for programmatic
     * access to the axis."
     */
    protected Axis[] xAxis;
    /**
     * "The Y axis or value axis. Normally this is the vertical axis, though if
     * the chart is inverted this is the horizontal axis. In case of multiple
     * axes, the yAxis node is an array of configuration objects.
     * <p>
     * See [the axis object](/class-reference/Highcharts.axis) for programmatic
     * access to the axis."
     */
    protected Axis[] yAxis;
    /**
     * "The Z axis or depth axis for 3D plots.
     * <p>
     * See the [axis class](/class-reference/Highcharts.axis) for programmatic
     * access to the axis."
     */

    /**
     * Add a series to the existing chart options series.
     *
     * @param series
     * @return this instance
     */
    public abstract T addSeries(Series series);


    /**
     * **************** ACCESSORS AND BUILDER-STYLE MUTATORS *****************
     */

    public Accessibility getAccessibility() {
        return this.accessibility = getInstanceOf(Accessibility.class, this.accessibility);
    }

    public T setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
        return (T) this;
    }

    public Annotations[] getAnnotations() {
        return this.annotations = getInstanceOf(Annotations[].class, this.annotations);
    }

    public T setAnnotations(Annotations[] annotations) {
        this.annotations = annotations;
        return (T) this;
    }

    public Boost getBoost() {
        return this.boost = getInstanceOf(Boost.class, this.boost);
    }

    public T setBoost(Boost boost) {
        this.boost = boost;
        return (T) this;
    }

    public Caption getCaption() {
        return this.caption = getInstanceOf(Caption.class, this.caption);
    }

    public T setCaption(Caption caption) {
        this.caption = caption;
        return (T) this;
    }

    public Chart getChart() {
        return this.chart = getInstanceOf(Chart.class, this.chart);
    }

    public T setChart(Chart chart) {
        this.chart = chart;
        return (T) this;
    }

    public HighchartsColorString[] getColors() {
        return this.colors = getInstanceOf(HighchartsColorString[].class, this.colors);
    }

    public T setColors(HighchartsColorString[] colors) {
        this.colors = colors;
        return (T) this;
    }

    public Credits getCredits() {
        return this.credits = getInstanceOf(Credits.class, this.credits);
    }

    public T setCredits(Credits credits) {
        this.credits = credits;
        return (T) this;
    }

    public Data getData() {
        return this.data = getInstanceOf(Data.class, this.data);
    }

    public T setData(Data data) {
        this.data = data;
        return (T) this;
    }

    public Defs getDefs() {
        return this.defs = getInstanceOf(Defs.class, this.defs);
    }

    public T setDefs(Defs defs) {
        this.defs = defs;
        return (T) this;
    }

    public Exporting getExporting() {
        return this.exporting = getInstanceOf(Exporting.class, this.exporting);
    }

    public T setExporting(Exporting exporting) {
        this.exporting = exporting;
        return (T) this;
    }

    public Global getGlobal() {
        return this.global = getInstanceOf(Global.class, this.global);
    }

    public T setGlobal(Global global) {
        this.global = global;
        return (T) this;
    }

    public Lang getLang() {
        return this.lang = getInstanceOf(Lang.class, this.lang);
    }

    public T setLang(Lang lang) {
        this.lang = lang;
        return (T) this;
    }

    public Legend getLegend() {
        return this.legend = getInstanceOf(Legend.class, this.legend);
    }

    public T setLegend(Legend legend) {
        this.legend = legend;
        return (T) this;
    }

    public Loading getLoading() {
        return this.loading = getInstanceOf(Loading.class, this.loading);
    }

    public T setLoading(Loading loading) {
        this.loading = loading;
        return (T) this;
    }

    public Navigation getNavigation() {
        return this.navigation = getInstanceOf(Navigation.class, this.navigation);
    }

    public T setNavigation(Navigation navigation) {
        this.navigation = navigation;
        return (T) this;
    }

    public PlotOptions getPlotOptions() {
        return this.plotOptions = getInstanceOf(PlotOptions.class, this.plotOptions);
    }

    public T setPlotOptions(PlotOptions plotOptions) {
        this.plotOptions = plotOptions;
        return (T) this;
    }

    public Responsive getResponsive() {
        return this.responsive = getInstanceOf(Responsive.class, this.responsive);
    }

    public T setResponsive(Responsive responsive) {
        this.responsive = responsive;
        return (T) this;
    }

    public Series[] getSeries() {
        return this.series = getInstanceOf(Series[].class, this.series);
    }

    public T setSeries(Series[] series) {
        this.series = series;
        return (T) this;
    }

    public T setSeries(Series series) {
        this.series = new Series[]{series};
        return (T) this;
    }

    public Subtitle getSubtitle() {
        return this.subtitle = getInstanceOf(Subtitle.class, this.subtitle);
    }

    public T setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
        return (T) this;
    }

    public Time getTime() {
        return this.time = getInstanceOf(Time.class, this.time);
    }

    public T setTime(Time time) {
        this.time = time;
        return (T) this;
    }

    public Title getTitle() {
        return this.title = getInstanceOf(Title.class, this.title);
    }

    public T setTitle(Title title) {
        this.title = title;
        return (T) this;
    }

    public Tooltip getTooltip() {
        return this.tooltip = getInstanceOf(Tooltip.class, this.tooltip);
    }

    public T setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return (T) this;
    }

    public Axis[] getXAxis() {
        if (xAxis == null) {
            xAxis = new Axis[]{new Axis()};
        }
        return xAxis;
    }

    public T setXAxis(Axis[] xAxis) {
        this.xAxis = xAxis;
        return (T) this;
    }

    public T setXAxis(Axis xAxis) {
        this.xAxis = new Axis[]{xAxis};
        return (T) this;
    }

    public Axis[] getYAxis() {
        if (yAxis == null) {
            yAxis = new Axis[]{new Axis()};
        }
        return yAxis;
    }

    public T setYAxis(Axis[] yAxis) {
        this.yAxis = yAxis;
        return (T) this;
    }

    public T setYAxis(Axis yAxis) {
        this.yAxis = new Axis[]{yAxis};
        return (T) this;
    }

    /**
     * Method to return the full serialization of options and data set to this instance of HyForgeOptions
     *
     * @return JSON String
     */
    public String hydrate() {
        String JSON;
        try {
            JSON = this.deflateFields();
            JSON = JSON.replace("\r", "").replace("\n", "");
        } catch (Exception e) {
            JSON = "{ error: \"" + e.getMessage() + "\", stack: \"" + Arrays.toString(e.getStackTrace()) + "\" }";
        }
        return JSON;
    }
}
