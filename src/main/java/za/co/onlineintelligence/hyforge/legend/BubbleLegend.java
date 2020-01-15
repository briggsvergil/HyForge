package za.co.onlineintelligence.hyforge.legend;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * BubbleLegend HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class BubbleLegend implements Serializable, DrosteDeflater {


    public BubbleLegend() {
    }

    /**
     * The color of the ranges borders, can be also defined for an
     * individual range.
     *
     * @since 7.0.0
     */
    private HighchartsColor borderColor;

    /**
     * The width of the ranges borders in pixels, can be also
     * defined for an individual range.
     *
     * @since 7.0.0
     */
    private Integer borderWidth;

    /**
     * An additional class name to apply to the bubble legend'
     * circle graphical elements. This option does not replace
     * default class names of the graphical element.
     *
     * @since 7.0.0
     */
    private String className;

    /**
     * The main color of the bubble legend. Applies to ranges, if
     * individual color is not defined.
     *
     * @since 7.0.0
     */
    private HighchartsColor color;

    /**
     * An additional class name to apply to the bubble legend's
     * connector graphical elements. This option does not replace
     * default class names of the graphical element.
     *
     * @since 7.0.0
     */
    private String connectorClassName;

    /**
     * The color of the connector, can be also defined
     * for an individual range.
     *
     * @since 7.0.0
     */
    private HighchartsColor connectorColor;

    /**
     * The length of the connectors in pixels. If labels are
     * centered, the distance is reduced to 0.
     *
     * @since 7.0.0
     */
    private Integer connectorDistance;

    /**
     * The width of the connectors in pixels.
     *
     * @since 7.0.0
     */
    private Integer connectorWidth;

    /**
     * Enable or disable the bubble legend.
     *
     * @since 7.0.0
     */
    private Boolean enabled;

    /**
     * Options for the bubble legend labels.
     *
     * @since 7.0.0
     */
    private LegendLabelOptions labels;

    /**
     * The position of the bubble legend in the legend.
     *
     * @since 7.0.0
     */
    private Integer legendIndex;

    /**
     * Miximum bubble legend range size. If values for ranges are
     * not specified, the `minSize` and the `maxSize` are calculated
     * from bubble series.
     *
     * @since 7.0.0
     */
    private Integer maxSize;

    /**
     * Minimum bubble legend range size. If values for ranges are
     * not specified, the `minSize` and the `maxSize` are calculated
     * from bubble series.
     *
     * @since 7.0.0
     */
    private Integer minSize;

    /**
     * Options for specific range. One range consists of bubble,
     * label and connector.
     *
     * @since 7.0.0
     */
    private LegendRangeOptions[] ranges;

    /**
     * Whether the bubble legend range value should be represented
     * by the area or the width of the bubble. The default, area,
     * corresponds best to the human perception of the size of each
     * bubble.
     *
     * @since 7.0.0
     */
    private String sizeBy;

    /**
     * When this is true, the absolute value of z determines the
     * size of the bubble. This means that with the default
     * zThreshold of 0, a bubble of value -1 will have the same size
     * as a bubble of value 1, while a bubble of value 0 will have a
     * smaller size according to minSize.
     *
     * @since 7.0.0
     */
    private Boolean sizeByAbsoluteValue;

    /**
     * Define the visual z index of the bubble legend.
     *
     * @since 7.0.0
     */
    private Integer zIndex;

    /**
     * LegendRangeOptions with with lower value than zThreshold, are skipped.
     *
     * @since 7.0.0
     */
    private Integer zThreshold;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsColor getBorderColor() {
        return this.borderColor = getInstanceOf(HighchartsColor.class, this.borderColor);
    }

    public BubbleLegend setBorderColor(HighchartsColor borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderWidth() {
        return this.borderWidth = getInstanceOf(Integer.class, this.borderWidth);
    }

    public BubbleLegend setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String getClassName() {
        return this.className = getInstanceOf(String.class, this.className);
    }

    public BubbleLegend setClassName(String className) {
        this.className = className;
        return this;
    }

    public HighchartsColor getColor() {
        return this.color = getInstanceOf(HighchartsColor.class, this.color);
    }

    public BubbleLegend setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public String getConnectorClassName() {
        return this.connectorClassName = getInstanceOf(String.class, this.connectorClassName);
    }

    public BubbleLegend setConnectorClassName(String connectorClassName) {
        this.connectorClassName = connectorClassName;
        return this;
    }

    public HighchartsColor getConnectorColor() {
        return this.connectorColor = getInstanceOf(HighchartsColor.class, this.connectorColor);
    }

    public BubbleLegend setConnectorColor(HighchartsColor connectorColor) {
        this.connectorColor = connectorColor;
        return this;
    }

    public Integer getConnectorDistance() {
        return this.connectorDistance = getInstanceOf(Integer.class, this.connectorDistance);
    }

    public BubbleLegend setConnectorDistance(Integer connectorDistance) {
        this.connectorDistance = connectorDistance;
        return this;
    }

    public Integer getConnectorWidth() {
        return this.connectorWidth = getInstanceOf(Integer.class, this.connectorWidth);
    }

    public BubbleLegend setConnectorWidth(Integer connectorWidth) {
        this.connectorWidth = connectorWidth;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled = getInstanceOf(Boolean.class, this.enabled);
    }

    public BubbleLegend setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public LegendLabelOptions getLabels() {
        return this.labels = getInstanceOf(LegendLabelOptions.class, this.labels);
    }

    public BubbleLegend setLabels(LegendLabelOptions labels) {
        this.labels = labels;
        return this;
    }

    public Integer getLegendIndex() {
        return this.legendIndex = getInstanceOf(Integer.class, this.legendIndex);
    }

    public BubbleLegend setLegendIndex(Integer legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public Integer getMaxSize() {
        return this.maxSize = getInstanceOf(Integer.class, this.maxSize);
    }

    public BubbleLegend setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    public Integer getMinSize() {
        return this.minSize = getInstanceOf(Integer.class, this.minSize);
    }

    public BubbleLegend setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    public LegendRangeOptions[] getRanges() {
        return this.ranges = getInstanceOf(LegendRangeOptions[].class, this.ranges);
    }

    public BubbleLegend setRanges(LegendRangeOptions[] ranges) {
        this.ranges = ranges;
        return this;
    }

    public String getSizeBy() {
        return this.sizeBy = getInstanceOf(String.class, this.sizeBy);
    }

    public BubbleLegend setSizeBy(String sizeBy) {
        this.sizeBy = sizeBy;
        return this;
    }

    public Boolean getSizeByAbsoluteValue() {
        return this.sizeByAbsoluteValue = getInstanceOf(Boolean.class, this.sizeByAbsoluteValue);
    }

    public BubbleLegend setSizeByAbsoluteValue(Boolean sizeByAbsoluteValue) {
        this.sizeByAbsoluteValue = sizeByAbsoluteValue;
        return this;
    }

    public Integer getZIndex() {
        return this.zIndex = getInstanceOf(Integer.class, this.zIndex);
    }

    public BubbleLegend setZIndex(Integer zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public Integer getZThreshold() {
        return this.zThreshold = getInstanceOf(Integer.class, this.zThreshold);
    }

    public BubbleLegend setZThreshold(Integer zThreshold) {
        this.zThreshold = zThreshold;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.borderWidth);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.connectorClassName);
        hash = 17 * hash + Objects.hashCode(this.connectorColor);
        hash = 17 * hash + Objects.hashCode(this.connectorDistance);
        hash = 17 * hash + Objects.hashCode(this.connectorWidth);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.labels);
        hash = 17 * hash + Objects.hashCode(this.legendIndex);
        hash = 17 * hash + Objects.hashCode(this.maxSize);
        hash = 17 * hash + Objects.hashCode(this.minSize);
        hash = 17 * hash + Objects.hashCode(this.ranges);
        hash = 17 * hash + Objects.hashCode(this.sizeBy);
        hash = 17 * hash + Objects.hashCode(this.sizeByAbsoluteValue);
        hash = 17 * hash + Objects.hashCode(this.zIndex);
        hash = 17 * hash + Objects.hashCode(this.zThreshold);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "borderColor:" + borderColor
                + ", borderWidth:" + borderWidth
                + ", className:" + className
                + ", color:" + color
                + ", connectorClassName:" + connectorClassName
                + ", connectorColor:" + connectorColor
                + ", connectorDistance:" + connectorDistance
                + ", connectorWidth:" + connectorWidth
                + ", enabled:" + enabled
                + ", labels:" + labels
                + ", legendIndex:" + legendIndex
                + ", maxSize:" + maxSize
                + ", minSize:" + minSize
                + ", ranges:" + ranges
                + ", sizeBy:" + sizeBy
                + ", sizeByAbsoluteValue:" + sizeByAbsoluteValue
                + ", zIndex:" + zIndex
                + ", zThreshold:" + zThreshold
                + '}';
    }


}
