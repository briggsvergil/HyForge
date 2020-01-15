package za.co.onlineintelligence.hyforge.series;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsSize;
import za.co.onlineintelligence.hyforge.plotoptions.HighchartsSeriesPlotOptions;

import java.io.Serializable;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * PieChartOptions HighchartsAPI Class
 * @author Sean Briggs
 */
public class PieChartOptions extends HighchartsSeriesPlotOptions implements Serializable, DrosteDeflater {


    public PieChartOptions() {
    }

    /**
     * The color of the border surrounding each slice. When `null`, the
     border takes the same color as the slice fill. This can be used
     together with a `borderWidth` to fill drawing gaps created by
     antialiazing artefacts in borderless pies.

     In styled mode, the border stroke is given in the `.highcharts-point`
     class.
     */
    private HighchartsColor borderColor;

    /**
     * The width of the border surrounding each slice.

     When setting the border width to 0, there may be small gaps between
     the slices due to SVG antialiasing artefacts. To work around this,
     keep the border width at 0.5 or 1, but set the `borderColor` to
     `null` instead.

     In styled mode, the border stroke width is given in the
     `.highcharts-point` class.
     */
    private Integer borderWidth;

    /**
     * The center of the pie chart relative to the plot area. Can be
     percentages or pixel values. The default behaviour (as of 3.0) is to
     center the pie so that all slices and data labels are within the plot
     area. As a consequence, the pie may actually jump around in a chart
     with dynamic values, as the data labels move. In that case, the
     center should be explicitly set, for example to `["50%", "50%"]`.
     */
    private HighchartsSize[] center;

    /**
     * A series specific or series type specific color set to use instead
     of the global [colors](#colors).
     * @since 3.0.0
     */
    private HighchartsColor[] colors;


    /**
     * The thickness of a 3D pie.
     * @since 4.0.0
     */
    private Integer depth;

    /**
     * The end angle of the pie in degrees where 0 is top and 90 is right.
     Defaults to `startAngle` plus 360.
     * @since 1.3.6
     */
    private Integer endAngle;

    /**
     * If the total sum of the pie's values is 0, the series is represented
     as an empty circle . The `fillColor` option defines the color of that
     circle. Use [pie.borderWidth](#plotOptions.pie.borderWidth) to set
     the border thickness.
     */
    private HighchartsColor fillColor;

    /**
     * Equivalent to [chart.ignoreHiddenSeries](#chart.ignoreHiddenSeries),
     this option tells whether the series shall be redrawn as if the
     hidden point were `null`.

     The default value changed from `false` to `true` with Highcharts
     3.0.
     * @since 2.3.0
     */
    private Boolean ignoreHiddenPoint;

    /**
     * The size of the inner diameter for the pie. A size greater than 0
     renders a donut chart. Can be a percentage or pixel value.
     Percentages are relative to the pie size. Pixel values are given as
     integers.


     Note: in Highcharts < 4.1.2, the percentage was relative to the plot
     area, not the pie size.
     * @since 2.0.0
     */
    private HighchartsSize innerSize;

    /**
     * The minimum size for a pie in response to auto margins. The pie will
     try to shrink to make room for data labels in side the plot area,
     but only to this size.
     * @since 3.0.0
     */
    private HighchartsSize minSize;

    /**
     * The diameter of the pie relative to the plot area. Can be a
     percentage or pixel value. Pixel values are given as integers. The
     default behaviour (as of 3.0) is to scale to the plot area and give
     room for data labels within the plot area.
     [slicedOffset](#plotOptions.pie.slicedOffset) is also included in the
     default size calculation. As a consequence, the size of the pie may
     vary when points are updated and data labels more around. In that
     case it is best to set a fixed value, for example `"75%"`.
     */
    private HighchartsSize size;

    /**
     * If a point is sliced, moved out from the center, how many pixels
     should it be moved?.
     */
    private Integer slicedOffset;

    /**
     * The start angle of the pie slices in degrees where 0 is top and 90
     right.
     * @since 2.3.4
     */
    private Integer startAngle;

    /*
        Instance-Safe Getters
    */
    public HighchartsColor getBorderColor() {
        return getInstanceOf(HighchartsColor.class, this.borderColor);
    }

    public Integer getBorderWidth() {
        return getInstanceOf(Integer.class, this.borderWidth);
    }

    public HighchartsSize[] getCenter() {
        return getInstanceOf(HighchartsSize[].class, this.center);
    }


    public HighchartsColor[] getColors() {
        return getInstanceOf(HighchartsColor[].class, this.colors);
    }

    public Integer getDepth() {
        return getInstanceOf(Integer.class, this.depth);
    }

    public Integer getEndAngle() {
        return getInstanceOf(Integer.class, this.endAngle);
    }

    public HighchartsColor getFillColor() {
        return getInstanceOf(HighchartsColor.class, this.fillColor);
    }

    public Boolean getIgnoreHiddenPoint() {
        return getInstanceOf(Boolean.class, this.ignoreHiddenPoint);
    }

    public HighchartsSize getInnerSize() {
        return getInstanceOf(HighchartsSize.class, this.innerSize);
    }

    public HighchartsSize getMinSize() {
        return getInstanceOf(HighchartsSize.class, this.minSize);
    }

    public HighchartsSize getSize() {
        return getInstanceOf(HighchartsSize.class, this.size);
    }

    public Integer getSlicedOffset() {
        return getInstanceOf(Integer.class, this.slicedOffset);
    }

    public Integer getStartAngle() {
        return getInstanceOf(Integer.class, this.startAngle);
    }

    /*
        Builder-Style Setters
    */
    public PieChartOptions setBorderColor(HighchartsColor borderColor){
        this.borderColor = borderColor;
        return this;
    }

    public PieChartOptions setBorderWidth(Integer borderWidth){
        this.borderWidth = borderWidth;
        return this;
    }

    public PieChartOptions setCenter(HighchartsSize[] center){
        this.center = center;
        return this;
    }

    public PieChartOptions setColors(HighchartsColor[] colors){
        this.colors = colors;
        return this;
    }

    public PieChartOptions setDepth(Integer depth){
        this.depth = depth;
        return this;
    }

    public PieChartOptions setEndAngle(Integer endAngle){
        this.endAngle = endAngle;
        return this;
    }

    public PieChartOptions setFillColor(HighchartsColor fillColor){
        this.fillColor = fillColor;
        return this;
    }

    public PieChartOptions setIgnoreHiddenPoint(Boolean ignoreHiddenPoint){
        this.ignoreHiddenPoint = ignoreHiddenPoint;
        return this;
    }

    public PieChartOptions setInnerSize(HighchartsSize innerSize){
        this.innerSize = innerSize;
        return this;
    }

    public PieChartOptions setMinSize(HighchartsSize minSize){
        this.minSize = minSize;
        return this;
    }

    public PieChartOptions setSize(HighchartsSize size){
        this.size = size;
        return this;
    }

    public PieChartOptions setSlicedOffset(Integer slicedOffset){
        this.slicedOffset = slicedOffset;
        return this;
    }

    public PieChartOptions setStartAngle(Integer startAngle){
        this.startAngle = startAngle;
        return this;
    }


}
