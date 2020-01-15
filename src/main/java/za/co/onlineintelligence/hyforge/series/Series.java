package za.co.onlineintelligence.hyforge.series;

import org.javatuples.Pair;
import org.javatuples.Triplet;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsSize;
import za.co.onlineintelligence.hyforge.plotoptions.HighchartsSeriesPlotOptions;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Series HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Series<O extends HighchartsSeriesPlotOptions> implements Serializable, DrosteDeflater {

    public Series() {

    }

    public Series(String name) {
        this.name = name;
    }

    private HighchartsPoint[] data;

    /**
     * An id for the series. This can be used after render time to get a pointer
     * to the series object through `chart.get()`.
     *
     * @since 1.2.0
     */
    private String id;

    /**
     * The index of the series in the chart, affecting the internal index in the
     * `chart.series` array, the visible Z index as well as the order in the
     * legend.
     *
     * @since 2.3.0
     */
    private Integer index;

    /**
     * The sequential index of the series in the legend.
     */
    private Integer legendIndex;

    /**
     * A map data object containing a `path` definition and optionally
     * additional properties to join in the data as per the `joinBy` option.
     */
    private HighchartsSeriesMapDataOptions[] mapData;

    /**
     * The name of the series as shown in the legend, tooltip etc.
     */
    private String name;

    /**
     * The Specific options for this series
     */
    private O options;

    private Class<O> optionsClass;

    /**
     * This option allows grouping series in a stacked chart. The stack option
     * can be a string or anything else, as long as the grouped series' stack
     * options match each other after conversion into a string.
     *
     * @since 2.1.0
     */
    private HighchartsSize stack;

    /**
     * The type of series, for example `line` or `column`. By default, the
     * series type is inherited from [chart.type](#chart.type), so unless the
     * chart is a combination of series types, there is no need to set it on the
     * series level.
     */
    private String type;

    /**
     * When using dual or multiple x axes, this number defines which xAxis the
     * particular series is connected to. It refers to either the
     * {#xAxis.id|axis id} or the index of the axis in the xAxis array,
     * with 0 being the first.
     */
    private HighchartsSize xAxis;


    /**
     * When using dual or multiple y axes, this number defines which yAxis the
     * particular series is connected to. It refers to either the
     * {#yAxis.id|axis id} or the index of the axis in the yAxis array,
     * with 0 being the first.
     */
    private HighchartsSize yAxis;

    /**
     * Define the visual z index of the series.
     */
    private Integer zIndex;


    public String getId() {
        return id;
    }

    public Series setId(String id) {
        this.id = id;
        return this;
    }

    public int getIndex() {
        return index;
    }

    public Series setIndex(int index) {
        this.index = index;
        return this;
    }

    public int getLegendIndex() {
        return legendIndex;
    }

    public Series setLegendIndex(int legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public HighchartsSeriesMapDataOptions[] getMapData() {
        return mapData;
    }

    public Series setMapData(HighchartsSeriesMapDataOptions[] mapData) {
        this.mapData = mapData;
        return this;
    }

    public String getName() {
        return name;
    }

    public Series setName(String name) {
        this.name = name;
        return this;
    }

    public O getOptions() {
        return options;
    }

    public Series setOptions(O options) {
        this.options = options;
        return this;
    }

    public HighchartsSize getStack() {
        return stack;
    }

    public Series setStack(HighchartsSize stack) {
        this.stack = stack;
        return this;
    }

    public String getType() {
        return type;
    }

    protected Series setType(String type) {
        this.type = type;
        return this;
    }

    public HighchartsSize getxAxis() {
        return xAxis;
    }

    public Series setxAxis(HighchartsSize xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public HighchartsSize getyAxis() {
        return yAxis;
    }

    public Series setyAxis(HighchartsSize yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public int getzIndex() {
        return zIndex;
    }

    public Series setzIndex(int zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public HighchartsPoint[] getData() {
        if (data == null) {
            this.data = new HighchartsPoint[0];
        }

        return data;
    }

    /**
     * @param data
     * @return
     */
    public Series setData(HighchartsPoint[] data) {
        this.data = data;
        return this;
    }

    /**
     * Override the options field so the fields of that class appear as fields as this one.
     *
     * @param field    The field currently being serialized.
     * @param tabLevel This is the number of whitespace tabs to create before Key-Value pairs.
     * @return
     */
    @Override
    public String deflateField(Field field, int tabLevel) {
        String s = delegateFieldDeflation(field, "options", options == null,
                () -> options.deflateFields(true, null, tabLevel));
        return s != null && s.equals(RTS) ? DrosteDeflater.super.deflateField(field, tabLevel) : s;
    }

    /*
                EASE-OF-USE METHODS
     */

    /**
     * Ease-of-Use method to add an array of y values to the data of this series, in the form of a double array.
     *
     * @param y
     * @return
     */

    public Series setData(Double[] y) {
        List<HighchartsPoint> points = new ArrayList<>(Arrays.asList(getData()));
        for (Double e : y) {
            points.add(new HighchartsPoint()
                    .setY(e));
        }
        this.data = points.toArray(new HighchartsPoint[0]);

        return this;
    }

    /**
     * Ease-of-Use method to add an array of y values to the data of this series.
     * <p>
     * Example Usage:
     * 1. Series.setData_Y_Values(52.6, 98.62, 54.74, 63.5, ...);
     *
     * @param y
     * @return
     */

    public Series setData_Y_Values(Object... y) {
        List<HighchartsPoint> points = new ArrayList<>(Arrays.asList(getData()));
        for (Object e : y) {
            points.add(new HighchartsPoint()
                    .setY(e));
        }
        this.data = points.toArray(new HighchartsPoint[0]);

        return this;
    }

    /**
     * Insanity, pure insanity: Just put your data in here varargs style with whatever.
     * If whatever you put in here is supported it will be added otherwise you have only yourself to blame.
     * <p>
     * Refer to HighchartsPoint class Javadoc for more information.
     *
     * @param data
     * @return
     */
    @SuppressWarnings("varargs")
    public Series setData(Object... data) {
        List<HighchartsPoint> points = new ArrayList<>(Arrays.asList(getData()));
        for (Object o : data) {
            if (o instanceof Double || o instanceof Integer) {
                points.add(new HighchartsPoint().setY(o));
            } else if (o.getClass().isArray()) {
                List<Object> objs = Arrays.asList(o);
                if (objs.size() == 2) {
                    if (objs.get(0) instanceof String) {
                        points.add(new HighchartsPoint()
                                .setName((String) objs.get(0))
                                .setY(objs.get(1)));
                    } else {
                        points.add(new HighchartsPoint()
                                .setX(objs.get(0))
                                .setY(objs.get(1)));
                    }
                } else if (objs.size() == 3) {
                    if (objs.get(0) instanceof String) {
                        points.add(new HighchartsPoint()
                                .setName((String) objs.get(0))
                                .setLow((Integer) objs.get(1))
                                .setHigh((Integer) objs.get(2)));
                    } else {
                        points.add(new HighchartsPoint().setX(objs.get(0))
                                .setLow((Integer) objs.get(1))
                                .setHigh((Integer) objs.get(2)));
                    }
                } else {
                    //you are on your own...good luck.
                }
            }

        }

        this.data = points.toArray(new HighchartsPoint[0]);
        return this;
    }

    /**
     * Ease-of-Use method to add X, Y values
     * <p>
     * Example Usage:
     * 1. Series.setData_X_Y_Pairs(Pair.with(42, 54)); //One data point - x value of 42, y values of 54.
     * 2. Series.setData_X_Y_Pairs(Pair.with(42, 54), Pair.with(27, 65), Pair.with(85, 96)) // Three data points.
     * 3. Series.setData_X_Y_Pairs(Pair.with(42.45, 54.12), Pair.with(27.09, 65.56), Pair.with(85.45, 96.35)) //Float values
     *
     * @param x_y_Tuple
     * @param <X>
     * @param <Y>
     * @return
     */
    @SuppressWarnings("varargs")
    public <X, Y> Series setData_X_Y_Pairs(Pair<X, Y>... x_y_Tuple) {
        List<HighchartsPoint> points = new ArrayList<>(Arrays.asList(getData()));
        for (Pair<X, Y> e : x_y_Tuple) {
            points.add(new HighchartsPoint()
                    .setX(e.getValue0())
                    .setY(e.getValue1()));
        }
        this.data = points.toArray(new HighchartsPoint[0]);

        return this;
    }

    /**
     * Ease-of-Use method to add X, Y values in the form of a 2 dimensional double array.
     *
     * @param x_y_pairs
     * @return
     */
    public Series setData_X_Y_Pairs(double[][] x_y_pairs) {
        List<HighchartsPoint> points = new ArrayList<>(Arrays.asList(getData()));
        for (double[] e : x_y_pairs) {
            points.add(new HighchartsPoint()
                    .setX(e[0])
                    .setY(e[1]));
        }
        this.data = points.toArray(new HighchartsPoint[0]);

        return this;
    }

    /**
     * Ease-of-Use method to add named Y points
     * <p>
     * Example Usage:
     * 1. Series.setData_Named_Y_Points(Pair.with("A", 54), Pair.with("B", 65), Pair.with("C", 96))
     *
     * @param name_y_Tuple
     * @param <Y>
     * @return
     */
    @SuppressWarnings("varargs")
    public <Y> Series setData_Named_Y_Points(Pair<String, Y>... name_y_Tuple) {
        List<HighchartsPoint> points = new ArrayList<>(Arrays.asList(getData()));
        for (Pair<String, Y> e : name_y_Tuple) {
            points.add(new HighchartsPoint()
                    .setName(e.getValue0())
                    .setY(e.getValue1()));
        }
        this.data = points.toArray(new HighchartsPoint[0]);

        return this;
    }

    /**
     * Ease-of-Use method to add X, Low and High Points for range charts.
     * <p>
     * Example Usage:
     * 1. Series.setData_X_Low_High_Points(Triplet.with(1, 12, 54), Triplet.with(2, 10, 65), Triplet.with(3, 17, 96))
     *
     * @param x_low_high_Tuple
     * @param <X>
     * @return
     */
    @SuppressWarnings("varargs")
    public <X> Series setData_X_Low_High_Points(Triplet<X, Integer, Integer>... x_low_high_Tuple) {
        List<HighchartsPoint> points = new ArrayList<>(Arrays.asList(getData()));
        for (Triplet<X, Integer, Integer> e : x_low_high_Tuple) {
            points.add(new HighchartsPoint()
                    .setX(e.getValue0())
                    .setLow(e.getValue1())
                    .setHigh(e.getValue2()));
        }
        this.data = points.toArray(new HighchartsPoint[0]);

        return this;
    }

    /**
     * Ease-of-Use method to add Named Low and High Points for range charts.
     * <p>
     * Example Usage:
     * 1. Series.setData_Named_Low_High_Points(Triplet.with("A", 12, 54), Triplet.with("B", 10, 65), Triplet.with("C", 17, 96))
     *
     * @param name_low_high_Tuple
     * @return
     */
    @SuppressWarnings("varargs")
    public Series setData_Named_Low_High_Points(Triplet<String, Integer, Integer>... name_low_high_Tuple) {
        List<HighchartsPoint> points = new ArrayList<>(Arrays.asList(getData()));
        for (Triplet<String, Integer, Integer> e : name_low_high_Tuple) {
            points.add(new HighchartsPoint()
                    .setName(e.getValue0())
                    .setLow(e.getValue1())
                    .setHigh(e.getValue2()));
        }
        this.data = points.toArray(new HighchartsPoint[0]);

        return this;
    }

    public Series addPoint(HighchartsPoint point) {
        if(this.data == null) {
            this.data = new HighchartsPoint[0];
        }
        int len = this.data.length;
        this.data = Arrays.copyOf(this.data, len + 1);
        this.data[len] = point;
        return this;
    }


}
