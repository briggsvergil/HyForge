package za.co.onlineintelligence.hyforge.series;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;
import za.co.onlineintelligence.hyforge.plotoptions.HighchartsSeriesPlotOptions;

import java.io.Serializable;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Column  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ColumnChartOptions extends HighchartsSeriesPlotOptions implements Serializable, Exportable {


    public ColumnChartOptions() {
    }

    /**
     * The color of the border surrounding each column or bar.
     * <p>
     * In styled mode, the border stroke can be set with the
     * `.highcharts-point` rule.
     */
    private HighchartsColor borderColor;

    /**
     * The corner radius of the border surrounding each column or bar.
     */
    private Integer borderRadius;

    /**
     * The width of the border surrounding each column or bar. Defaults to
     * `1` when there is room for a border, but to `0` when the columns are
     * so dense that a border would cover the next column.
     * <p>
     * In styled mode, the stroke width can be set with the
     * `.highcharts-point` rule.
     */
    private Integer borderWidth;

    /**
     * When using automatic point colors pulled from the global
     * [colors](colors) or series-specific
     * [plotOptions.column.colors](series.colors) collections, this option
     * determines whether the chart should receive one color per series or
     * one color per point.
     * <p>
     * In styled mode, the `colors` or `series.colors` arrays are not
     * supported, and instead this option gives the points individual color
     * class names on the form `highcharts-color-{n}`.
     *
     * @since 2.0.0
     */
    private Boolean colorByPoint;

    /**
     * A series specific or series type specific color set to apply instead
     * of the global [colors](#colors) when [colorByPoint](#plotOptions.column.colorByPoint) is true.
     *
     * @since 3.0.0
     */
    private HighchartsColor[] colors;

    /**
     * When true, each column edge is rounded to its nearest pixel in order
     * to render sharp on screen. In some cases, when there are a lot of
     * densely packed columns, this leads to visible difference in column
     * widths or distance between columns. In these cases, setting `crisp`
     * to `false` may look better, even though each column is rendered
     * blurry.
     *
     * @since 5.0.10
     */
    private Boolean crisp;

    /**
     *
     */
    private DataGrouping dataGrouping;

    /**
     * Depth of the columns in a 3D column chart.
     *
     * @since 4.0.0
     */
    private Integer depth;

    /**
     * 3D columns only. The color of the edges. Similar to `borderColor`, except it
     * defaults to the same color as the column.
     */
    private HighchartsColorString edgeColor;

    /**
     * 3D columns only. The width of the colored edges.
     */
    private Integer edgeWidth;

    /**
     * Padding between each value groups, in x axis units.
     */
    private Integer groupPadding;

    /**
     * The spacing between columns on the Z Axis in a 3D chart.
     *
     * @since 4.0.0
     */
    private Integer groupZPadding;

    /**
     * Whether to group non-stacked columns or to let them render
     * independent of each other. Non-grouped columns will be laid out
     * individually and overlap each other.
     *
     * @since 2.3.0
     */
    private Boolean grouping;

    /**
     * The maximum allowed pixel width for a column, translated to the
     * height of a bar in a bar chart. This prevents the columns from
     * becoming too wide when there is a small number of points in the
     * chart.
     *
     * @since 4.1.8
     */
    private Integer maxPointWidth;

    /**
     * The minimal height for a column or width for a bar. By default,
     * 0 values are not shown. To visualize a 0 (or close to zero) point,
     * set the minimal point length to a pixel value like 3\. In stacked
     * column charts, minPointLength might not be respected for tightly
     * packed values.
     */
    private Integer minPointLength;

    /**
     * Padding between each column or bar, in x axis units.
     */
    private Integer pointPadding;

    /**
     * The X axis range that each point is valid for. This determines the
     * width of the column. On a categorized axis, the range will be 1
     * by default (one category unit). On linear and datetime axes, the
     * range will be computed as the distance between the two closest data
     * points.
     * <p>
     * The default `null` means it is computed automatically, but this
     * option can be used to override the automatic value.
     * <p>
     * This option is set by default to 1 if data sorting is enabled.
     *
     * @since 2.3.0
     */
    private Integer pointRange;

    /**
     * A pixel value specifying a fixed width for each column or bar. When
     * `null`, the width is calculated from the `pointPadding` and
     * `groupPadding`.
     *
     * @since 1.2.5
     */
    private Integer pointWidth;

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

    /*
        Instance-Safe Getters
    */
    public HighchartsColor getBorderColor() {
        return this.borderColor = getInstanceOf(HighchartsColor.class, this.borderColor);
    }

    public Integer getBorderRadius() {
        return this.borderRadius = getInstanceOf(Integer.class, this.borderRadius);
    }

    public Integer getBorderWidth() {
        return this.borderWidth = getInstanceOf(Integer.class, this.borderWidth);
    }

    public Boolean getColorByPoint() {
        return this.colorByPoint = getInstanceOf(Boolean.class, this.colorByPoint);
    }

    public HighchartsColor[] getColors() {
        return this.colors = getInstanceOf(HighchartsColor[].class, this.colors);
    }

    public Boolean getCrisp() {
        return this.crisp = getInstanceOf(Boolean.class, this.crisp);
    }

    public DataGrouping getDataGrouping() {
        return this.dataGrouping = getInstanceOf(DataGrouping.class, this.dataGrouping);
    }

    public Integer getDepth() {
        return this.depth = getInstanceOf(Integer.class, this.depth);
    }

    public HighchartsColorString getEdgeColor() {
        return this.edgeColor = getInstanceOf(HighchartsColorString.class, this.edgeColor);
    }

    public Integer getEdgeWidth() {
        return this.edgeWidth = getInstanceOf(Integer.class, this.edgeWidth);
    }

    public Integer getGroupPadding() {
        return this.groupPadding = getInstanceOf(Integer.class, this.groupPadding);
    }

    public Integer getGroupZPadding() {
        return this.groupZPadding = getInstanceOf(Integer.class, this.groupZPadding);
    }

    public Boolean getGrouping() {
        return this.grouping = getInstanceOf(Boolean.class, this.grouping);
    }

    public Integer getMaxPointWidth() {
        return this.maxPointWidth = getInstanceOf(Integer.class, this.maxPointWidth);
    }

    public Integer getMinPointLength() {
        return this.minPointLength = getInstanceOf(Integer.class, this.minPointLength);
    }

    public Integer getPointPadding() {
        return this.pointPadding = getInstanceOf(Integer.class, this.pointPadding);
    }

    public Integer getPointRange() {
        return this.pointRange = getInstanceOf(Integer.class, this.pointRange);
    }

    public Integer getPointWidth() {
        return this.pointWidth = getInstanceOf(Integer.class, this.pointWidth);
    }

    public Boolean getSoftThreshold() {
        return this.softThreshold = getInstanceOf(Boolean.class, this.softThreshold);
    }


    /*
        Builder-Style Setters
    */
    public ColumnChartOptions setBorderColor(HighchartsColor borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public ColumnChartOptions setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public ColumnChartOptions setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public ColumnChartOptions setColorByPoint(Boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ColumnChartOptions setColors(HighchartsColor[] colors) {
        this.colors = colors;
        return this;
    }

    public ColumnChartOptions setCrisp(Boolean crisp) {
        this.crisp = crisp;
        return this;
    }

    public ColumnChartOptions setDataGrouping(DataGrouping dataGrouping) {
        this.dataGrouping = dataGrouping;
        return this;
    }

    public ColumnChartOptions setDepth(Integer depth) {
        this.depth = depth;
        return this;
    }

    public ColumnChartOptions setEdgeColor(HighchartsColorString edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public ColumnChartOptions setEdgeWidth(Integer edgeWidth) {
        this.edgeWidth = edgeWidth;
        return this;
    }

    public ColumnChartOptions setGroupPadding(Integer groupPadding) {
        this.groupPadding = groupPadding;
        return this;
    }

    public ColumnChartOptions setGroupZPadding(Integer groupZPadding) {
        this.groupZPadding = groupZPadding;
        return this;
    }

    public ColumnChartOptions setGrouping(Boolean grouping) {
        this.grouping = grouping;
        return this;
    }

    public ColumnChartOptions setMaxPointWidth(Integer maxPointWidth) {
        this.maxPointWidth = maxPointWidth;
        return this;
    }

    public ColumnChartOptions setMinPointLength(Integer minPointLength) {
        this.minPointLength = minPointLength;
        return this;
    }

    public ColumnChartOptions setPointPadding(Integer pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public ColumnChartOptions setPointRange(Integer pointRange) {
        this.pointRange = pointRange;
        return this;
    }

    public ColumnChartOptions setPointWidth(Integer pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public ColumnChartOptions setSoftThreshold(Boolean softThreshold) {
        this.softThreshold = softThreshold;
        return this;
    }

}
