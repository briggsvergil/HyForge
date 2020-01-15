package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.axis.Axis;
import za.co.onlineintelligence.hyforge.coloraxis.ColorAxis;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.drilldown.Drilldown;
import za.co.onlineintelligence.hyforge.labels.Labels;
import za.co.onlineintelligence.hyforge.nodata.NoData;
import za.co.onlineintelligence.hyforge.pane.Pane;
import za.co.onlineintelligence.hyforge.series.Series;

import java.io.Serializable;
import java.util.Arrays;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * Highcharts Java API Extension:
 * <p>
 * This class serves as a Java Extension on the Highcharts JavaScript library.
 * Options for charts and graphs can be set through an instance of this class, once all desired options and data have
 * been configured, the hydrate() method can be called to return a JSON string ready for injecting into a
 * Highcharts constructor in an HTML "<script>" tag:
 * </p>
 * <p>
 * Example of Highcharts constructor:
 *
 * <div id="container"></div>
 * <script type="text/javascript">
 * Highcharts.chart('container', HyChartForgeInstance.hydrate(); );
 * </script>
 *
 * @author Sean Briggs
 */
public class HighchartsOptions extends ChartOptions<HighchartsOptions> implements Serializable, DrosteDeflater {

    public HighchartsOptions() {
    }

    /**
     * "A color axis for series. Visually, the color axis will appear as a
     * gradient or as separate items inside the legend, depending on whether the
     * axis is scalar or based on data classes.
     * <p>
     * For supported color formats, see the [docs article about
     * colors](https://www.highcharts.com/docs/chart-design-and-style/colors).
     * <p>
     * A scalar color axis is represented by a gradient. The colors either range
     * between the [minColor](#colorAxis.minColor) and the
     * [maxColor](#colorAxis.maxColor), or for more fine grained control the
     * colors can be defined in [stops](#colorAxis.stops). Often times, the
     * color axis needs to be adjusted to get the right color spread for the
     * data. In addition to stops, consider using a logarithmic [axis
     * type](#colorAxis.type), or setting [min](#colorAxis.min) and
     * [max](#colorAxis.max) to aHighcharts the colors being determined by
     * outliers.
     * <p>
     * When [dataClasses](#colorAxis.dataClasses) are used, the ranges are
     * subdivided into separate classes like categories based on their values.
     * This can be used for ranges between two values, but also for a true
     * category. However, when your data is categorized, it may be as convenient
     * to add each category to a separate series.
     * <p>
     * Color axis does not work with: `sankey`, `sunburst`, `dependencywheel`,
     * `networkgraph`, `wordcloud`, `venn`, `gauge` and `solidgauge` series
     * types.
     * <p>
     * Since v7.2.0 `colorAxis` can also be an array of options objects.
     * <p>
     * See [the axis object](/class-reference/Highcharts.axis) for programmatic
     * access to the axis."
     */
    private ColorAxis[] colorAxis;
    /**
     * "Options for drill down, the concept of inspecting increasingly high
     * resolution data through clicking on chart items like columns or pie
     * slices.
     * <p>
     * The drilldown feature requires the drilldown.js file to be loaded, found
     * in the modules directory of the download package, or online at
     * [code.highcharts.com/modules/drilldown.js](https://code.highcharts.com/modules/drilldown.js)."
     */
    private Drilldown drilldown;
    /**
     * "HTML labels that can be positioned anywhere in the chart area.
     * <p>
     * This option is deprecated since v7.1.2. Instead, use
     * [annotations](#annotations) that support labels."
     */
    private Labels labels;

    /**
     * "Options for displaying a message like \"No data to display\". This
     * feature requires the file no-data-to-display.js to be loaded in the page.
     * The actual text to display is set in the lang.noData option."
     */
    private NoData noData;
    /**
     * "The pane serves as a container for axes and backgrounds for circular
     * gauges and polar charts."
     */
    private Pane pane;
    /**
     * "The Z axis or depth axis for 3D plots.
     * <p>
     * See the [axis class](/class-reference/Highcharts.axis) for programmatic
     * access to the axis."
     */
    private Axis[] zAxis;

    /**
     * **************** ACCESSORS AND BUILDER-STYLE MUTATORS *****************
     */
    public ColorAxis[] getColorAxis() {
        return this.colorAxis = getInstanceOf(ColorAxis[].class, this.colorAxis);
    }

    public HighchartsOptions setColorAxis(ColorAxis[] colorAxis) {
        this.colorAxis = colorAxis;
        return this;
    }

    public Drilldown getDrilldown() {
        return this.drilldown = getInstanceOf(Drilldown.class, this.drilldown);
    }

    public HighchartsOptions setDrilldown(Drilldown drilldown) {
        this.drilldown = drilldown;
        return this;
    }

    public Labels getLabels() {
        return this.labels = getInstanceOf(Labels.class, this.labels);
    }

    public HighchartsOptions setLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public NoData getNoData() {
        return this.noData = getInstanceOf(NoData.class, this.noData);
    }

    public HighchartsOptions setNoData(NoData noData) {
        this.noData = noData;
        return this;
    }

    public Pane getPane() {
        return this.pane = getInstanceOf(Pane.class, this.pane);
    }

    public HighchartsOptions setPane(Pane pane) {
        this.pane = pane;
        return this;
    }

    public Axis[] getZAxis() {
        if (zAxis == null) {
            zAxis = new Axis[1];
        }
        return zAxis;
    }

    public HighchartsOptions setZAxis(Axis[] zAxis) {
        this.zAxis = zAxis;
        return this;
    }

    public HighchartsOptions setZAxis(Axis zAxis) {
        this.zAxis = new Axis[]{zAxis};
        return this;
    }


//    /**
//     * NOTE!! Experimental, Use at own risk!
//     *
//     * @param series
//     * @param addScatterPlotTrendLine
//     * @param addSeperateTrends
//     * @return
//     */
//    @SuppressWarnings({"varargs", "unchecked"})
//    public HighchartsOptions setSeries(Series[] series, boolean addScatterPlotTrendLine, boolean addSeperateTrends) {
//        this.series = series;
//        if (addScatterPlotTrendLine) {
//            //check if the chart type is scatter in chart obj and series obj
//            if (this.chart.getType().equalsIgnoreCase("scatter")
//                    || Arrays.stream(series).anyMatch(s ->
//                    s.getType() != null && s.getType().equalsIgnoreCase("scatter"))) {
//                int len = series.length;
//                if (addScatterPlotTrendLine) {
//                    List<Series> tl = new ArrayList<>();
//                    tl.addAll(Arrays.asList(series));
//                    Arrays.stream(series).filter(s ->
//                            s.getType() == null || s.getType().equalsIgnoreCase("scatter"))
//                            .forEach(s -> {
//                                final double[] xS = {Double.MAX_VALUE};
//                                final double[] xE = {Double.MIN_VALUE};
//                                double[][] dA = Arrays.stream(s.getData()).map(p -> {
//                                    double x = (Double) p.getX();
//                                    double y = (Double) p.getY();
//                                    xS[0] = Math.min(x, xS[0]);
//                                    xE[0] = Math.max(x, xE[0]);
//                                    return new double[]{x, y};
//                                }).toArray(double[][]::new);
//                                SimpleRegression r = new SimpleRegression();
//                                r.addData(dA);
//                                double m = r.getSlope();
//                                double c = r.getIntercept();
//                                double yS = m * xS[0] + c;
//                                double yE = m * xS[0] + c;
//                                String sN = s.getName();
//                                s.setType("scatter");
//                                tl.add(new Series("Regression " + sN, "line")
//                                        .setOptions(new HighchartsSeriesPlotOptions()
//                                                .setMarker(new Marker()
//                                                        .setEnabled(true))
//                                                .setStates(new States()
//                                                        .setHover(new Hover()
//                                                                .setLineWidth(0)))
//                                                .setEnableMouseTracking(false))
//                                        .setData_X_Y_Pairs(Pair.with(xS[0], yS), Pair.with(xE[0], yE)));
//                            });
//                    this.series = tl.toArray(new Series[0]);
//                    this.chart.setType(null);
//
//                } else {
////                    this.series = Arrays.copyOf(series, len + 1);
//                    //something else.
//                }
//            }
//        }
//        return this;
//    }

    @Override
    public HighchartsOptions addSeries(Series series) {
        if (this.series == null) {
            this.series = new Series[0];
        }
        int len = this.series.length;
        this.series = Arrays.copyOf(this.series, len + 1);
        this.series[len] = series;
        return this;
    }
}