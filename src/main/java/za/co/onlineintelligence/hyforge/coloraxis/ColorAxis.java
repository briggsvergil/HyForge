package za.co.onlineintelligence.hyforge.coloraxis;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.axis.AxisLabels;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsColorAxisTypeValue;


/**
 * ColorAxis  HighchartsAPI Class
 * @author Sean Briggs
 */
public class ColorAxis implements Serializable, DrosteDeflater {


    public ColorAxis() {
    }

    /**
     * Whether to allow decimals on the color axis.
     */
    private Boolean allowDecimals;

    /**
     * Determines how to set each data class' color if no individual
     color is set. The default value, `tween`, computes intermediate
     colors between `minColor` and `maxColor`. The other possible
     value, `category`, pulls colors from the global or chart specific
     [colors](#colors) array.
     */
    private String dataClassColor;

    /**
     * An array of data classes or ranges for the choropleth map. If
     none given, the color axis is scalar and values are distributed
     as a gradient between the minimum and maximum colors.
     */
    private DataClasses[] dataClasses;

    /**
     * Whether to force the axis to end on a tick. Use this option with
     the [maxPadding](#colorAxis.maxPadding) option to control the
     axis end.
     */
    private Boolean endOnTick;

    /**
     *
     */
    private ColorAxisEvents events;

    /**
     * Color of the grid lines extending from the axis across the
     gradient.
     */
    private HighchartsColor gridLineColor;

    /**
     * The width of the grid lines extending from the axis across the
     gradient of a scalar color axis.
     */
    private Integer gridLineWidth;

    /**
     * The axis labels show the number for each tick.

     For more live examples on label options, see [xAxis.labels in the
     Highcharts API.](/highcharts#xAxis.labels)
     */
    private AxisLabels labels;

    /**
     * The layout of the color axis. Can be `'horizontal'` or `'vertical'`.
     If none given, the color axis has the same layout as the legend.
     * @since 7.2.0
     */
    private String layout;

    /**
     * The triangular marker on a scalar color axis that points to the
     value of the hovered area. To disable the marker, set
     `marker: null`.
     */
    private ColorAxisMarker marker;

    /**
     * The maximum value of the axis in terms of map point values. If
     `null`, the max value is automatically calculated. If the
     `endOnTick` option is true, the max value might be rounded up.
     */
    private Integer max;

    /**
     * The color to represent the maximum of the color axis. Unless
     [dataClasses](#colorAxis.dataClasses) or
     [stops](#colorAxis.stops) are set, the gradient ends at this
     value.

     If dataClasses are set, the color is based on minColor and
     maxColor unless a color is set for each data class, or the
     [dataClassColor](#colorAxis.dataClassColor) is set.
     */
    private HighchartsColor maxColor;

    /**
     * Padding of the max value relative to the length of the axis. A
     padding of 0.05 will make a 100px axis 5px longer.
     */
    private Integer maxPadding;

    /**
     * The minimum value of the axis in terms of map point values. If
     `null`, the min value is automatically calculated. If the
     `startOnTick` option is true, the min value might be rounded
     down.
     */
    private Integer min;

    /**
     * The color to represent the minimum of the color axis. Unless
     [dataClasses](#colorAxis.dataClasses) or
     [stops](#colorAxis.stops) are set, the gradient starts at this
     value.

     If dataClasses are set, the color is based on minColor and
     maxColor unless a color is set for each data class, or the
     [dataClassColor](#colorAxis.dataClassColor) is set.
     */
    private HighchartsColor minColor;

    /**
     * Padding of the min value relative to the length of the axis. A
     padding of 0.05 will make a 100px axis 5px longer.
     */
    private Integer minPadding;

    /**
     * Whether to reverse the axis so that the highest number is closest
     to the origin. Defaults to `false` in a horizontal legend and
     `true` in a vertical legend, where the smallest value starts on
     top.
     */
    private Boolean reversed;

    /**
     * Whether to display the colorAxis in the legend.
     * @since 4.2.7
     */
    private Boolean showInLegend;

    /**
     * Whether to force the axis to start on a tick. Use this option
     with the `maxPadding` option to control the axis start.
     */
    private Boolean startOnTick;

    /**
     * Color stops for the gradient of a scalar color axis. Use this in
     cases where a linear gradient between a `minColor` and `maxColor`
     is not sufficient. The stops is an array of tuples, where the
     first item is a float between 0 and 1 assigning the relative
     position in the gradient, and the second item is the color.
     */
    private HighchartsColor[] stops;

    /**
     * The interval of the tick marks in axis units. When `null`, the
     tick interval is computed to approximately follow the
     `tickPixelInterval`.
     */
    private Integer tickInterval;

    /**
     * The pixel length of the main tick marks on the color axis.
     */
    private Integer tickLength;

    /**
     * If [tickInterval](#colorAxis.tickInterval) is `null` this option
     sets the approximate pixel interval of the tick marks.
     */
    private Integer tickPixelInterval;

    /**
     * The type of interpolation to use for the color axis. Can be
     `linear` or `logarithmic`.
     */
    private HighchartsColorAxisTypeValue type;

    /*
        Getters and Builder-Style Setters
    */
    public Boolean getAllowDecimals() {
        return this.allowDecimals;
    }

    public ColorAxis setAllowDecimals(Boolean allowDecimals){
        this.allowDecimals = allowDecimals;
        return this;
    }

    public String getDataClassColor() {
        return this.dataClassColor;
    }

    public ColorAxis setDataClassColor(String dataClassColor){
        this.dataClassColor = dataClassColor;
        return this;
    }

    public DataClasses[] getDataClasses() {
        return this.dataClasses;
    }

    public ColorAxis setDataClasses(DataClasses[] dataClasses){
        this.dataClasses = dataClasses;
        return this;
    }

    public Boolean getEndOnTick() {
        return this.endOnTick;
    }

    public ColorAxis setEndOnTick(Boolean endOnTick){
        this.endOnTick = endOnTick;
        return this;
    }

    public ColorAxisEvents getEvents() {
        return this.events;
    }

    public ColorAxis setEvents(ColorAxisEvents events){
        this.events = events;
        return this;
    }

    public HighchartsColor getGridLineColor() {
        return this.gridLineColor;
    }

    public ColorAxis setGridLineColor(HighchartsColor gridLineColor){
        this.gridLineColor = gridLineColor;
        return this;
    }

    public Integer getGridLineWidth() {
        return this.gridLineWidth;
    }

    public ColorAxis setGridLineWidth(Integer gridLineWidth){
        this.gridLineWidth = gridLineWidth;
        return this;
    }

    public AxisLabels getLabels() {
        return this.labels;
    }

    public ColorAxis setLabels(AxisLabels labels){
        this.labels = labels;
        return this;
    }

    public String getLayout() {
        return this.layout;
    }

    public ColorAxis setLayout(String layout){
        this.layout = layout;
        return this;
    }

    public ColorAxisMarker getMarker() {
        return this.marker;
    }

    public ColorAxis setMarker(ColorAxisMarker marker){
        this.marker = marker;
        return this;
    }

    public Integer getMax() {
        return this.max;
    }

    public ColorAxis setMax(Integer max){
        this.max = max;
        return this;
    }

    public HighchartsColor getMaxColor() {
        return this.maxColor;
    }

    public ColorAxis setMaxColor(HighchartsColor maxColor){
        this.maxColor = maxColor;
        return this;
    }

    public Integer getMaxPadding() {
        return this.maxPadding;
    }

    public ColorAxis setMaxPadding(Integer maxPadding){
        this.maxPadding = maxPadding;
        return this;
    }

    public Integer getMin() {
        return this.min;
    }

    public ColorAxis setMin(Integer min){
        this.min = min;
        return this;
    }

    public HighchartsColor getMinColor() {
        return this.minColor;
    }

    public ColorAxis setMinColor(HighchartsColor minColor){
        this.minColor = minColor;
        return this;
    }

    public Integer getMinPadding() {
        return this.minPadding;
    }

    public ColorAxis setMinPadding(Integer minPadding){
        this.minPadding = minPadding;
        return this;
    }

    public Boolean getReversed() {
        return this.reversed;
    }

    public ColorAxis setReversed(Boolean reversed){
        this.reversed = reversed;
        return this;
    }

    public Boolean getShowInLegend() {
        return this.showInLegend;
    }

    public ColorAxis setShowInLegend(Boolean showInLegend){
        this.showInLegend = showInLegend;
        return this;
    }

    public Boolean getStartOnTick() {
        return this.startOnTick;
    }

    public ColorAxis setStartOnTick(Boolean startOnTick){
        this.startOnTick = startOnTick;
        return this;
    }

    public HighchartsColor[] getStops() {
        return this.stops;
    }

    public ColorAxis setStops(HighchartsColor[] stops){
        this.stops = stops;
        return this;
    }

    public Integer getTickInterval() {
        return this.tickInterval;
    }

    public ColorAxis setTickInterval(Integer tickInterval){
        this.tickInterval = tickInterval;
        return this;
    }

    public Integer getTickLength() {
        return this.tickLength;
    }

    public ColorAxis setTickLength(Integer tickLength){
        this.tickLength = tickLength;
        return this;
    }

    public Integer getTickPixelInterval() {
        return this.tickPixelInterval;
    }

    public ColorAxis setTickPixelInterval(Integer tickPixelInterval){
        this.tickPixelInterval = tickPixelInterval;
        return this;
    }

    public HighchartsColorAxisTypeValue getType() {
        return this.type;
    }

    public ColorAxis setType(HighchartsColorAxisTypeValue type){
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.allowDecimals);
        hash = 17 * hash + Objects.hashCode(this.dataClassColor);
        hash = 17 * hash + Objects.hashCode(this.dataClasses);
        hash = 17 * hash + Objects.hashCode(this.endOnTick);
        hash = 17 * hash + Objects.hashCode(this.events);
        hash = 17 * hash + Objects.hashCode(this.gridLineColor);
        hash = 17 * hash + Objects.hashCode(this.gridLineWidth);
        hash = 17 * hash + Objects.hashCode(this.labels);
        hash = 17 * hash + Objects.hashCode(this.layout);
        hash = 17 * hash + Objects.hashCode(this.marker);
        hash = 17 * hash + Objects.hashCode(this.max);
        hash = 17 * hash + Objects.hashCode(this.maxColor);
        hash = 17 * hash + Objects.hashCode(this.maxPadding);
        hash = 17 * hash + Objects.hashCode(this.min);
        hash = 17 * hash + Objects.hashCode(this.minColor);
        hash = 17 * hash + Objects.hashCode(this.minPadding);
        hash = 17 * hash + Objects.hashCode(this.reversed);
        hash = 17 * hash + Objects.hashCode(this.showInLegend);
        hash = 17 * hash + Objects.hashCode(this.startOnTick);
        hash = 17 * hash + Objects.hashCode(this.stops);
        hash = 17 * hash + Objects.hashCode(this.tickInterval);
        hash = 17 * hash + Objects.hashCode(this.tickLength);
        hash = 17 * hash + Objects.hashCode(this.tickPixelInterval);
        hash = 17 * hash + Objects.hashCode(this.type);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "allowDecimals:" + allowDecimals
                + ", dataClassColor:" + dataClassColor
                + ", dataClasses:" + dataClasses
                + ", endOnTick:" + endOnTick
                + ", events:" + events
                + ", gridLineColor:" + gridLineColor
                + ", gridLineWidth:" + gridLineWidth
                + ", labels:" + labels
                + ", layout:" + layout
                + ", marker:" + marker
                + ", max:" + max
                + ", maxColor:" + maxColor
                + ", maxPadding:" + maxPadding
                + ", min:" + min
                + ", minColor:" + minColor
                + ", minPadding:" + minPadding
                + ", reversed:" + reversed
                + ", showInLegend:" + showInLegend
                + ", startOnTick:" + startOnTick
                + ", stops:" + stops
                + ", tickInterval:" + tickInterval
                + ", tickLength:" + tickLength
                + ", tickPixelInterval:" + tickPixelInterval
                + ", type:" + type
                + '}';
    }


}