package za.co.onlineintelligence.hyforge.axis;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;
import za.co.onlineintelligence.hyforge.common.HighchartsLabel;
import za.co.onlineintelligence.hyforge.common.HighchartsMouseEvents;
import za.co.onlineintelligence.hyforge.common.enums.*;

/**
 * PlotLines HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class PlotLine implements Serializable, DrosteDeflater {

    public PlotLine() {
    }

    /**
     * Flag to decide if plotLine should be rendered across all panes.
     *
     * @since 7.1.2
     */
    private boolean acrossPanes;

    /**
     * A custom class name, in addition to the default `highcharts-plot-line`,
     * to apply to each individual line.
     *
     * @since 5.0.0
     */
    private String className;

    /**
     * The color of the line.
     */
    private HighchartsColorString color;

    /**
     * The dashing or dot style for the plot line. For possible values see [this
     * overview](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/).
     *
     * @since 1.2.0
     */
    private HighchartsDashStyleValue dashStyle;

    /**
     * An object defining mouse events for the plot line. Supported properties
     * are `click`, `mouseover`, `mouseout`, `mousemove`.
     *
     * @since 1.2.0
     */
    private HighchartsMouseEvents events;

    /**
     * An id used for identifying the plot line in axis.removePlotLine.
     */
    private String id;

    /**
     * Text labels for the plot bands
     */
    private HighchartsLabel label;

    /**
     * The position of the line in axis units.
     */
    private int value;

    /**
     * The width or thickness of the plot line.
     */
    private int width;

    /**
     * The z index of the plot line within the chart.
     *
     * @since 1.2.0
     */
    private int zIndex;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public boolean getAcrossPanes() {
        return this.acrossPanes;
    }

    public PlotLine setAcrossPanes(boolean acrossPanes) {
        this.acrossPanes = acrossPanes;
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public PlotLine setClassName(String className) {
        this.className = className;
        return this;
    }

    public HighchartsColorString getColor() {
        return this.color;
    }

    public PlotLine setColor(HighchartsColorString color) {
        this.color = color;
        return this;
    }

    public HighchartsDashStyleValue getDashStyle() {
        return this.dashStyle;
    }

    public PlotLine setDashStyle(HighchartsDashStyleValue dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public HighchartsMouseEvents getEvents() {
        return this.events;
    }

    public PlotLine setEvents(HighchartsMouseEvents events) {
        this.events = events;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public PlotLine setId(String id) {
        this.id = id;
        return this;
    }

    public HighchartsLabel getLabel() {
        return this.label;
    }

    public PlotLine setLabel(HighchartsLabel label) {
        this.label = label;
        return this;
    }

    public int getValue() {
        return this.value;
    }

    public PlotLine setValue(int value) {
        this.value = value;
        return this;
    }

    public int getWidth() {
        return this.width;
    }

    public PlotLine setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getZIndex() {
        return this.zIndex;
    }

    public PlotLine setZIndex(int zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.acrossPanes);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.dashStyle);
        hash = 17 * hash + Objects.hashCode(this.events);
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.label);
        hash = 17 * hash + Objects.hashCode(this.value);
        hash = 17 * hash + Objects.hashCode(this.width);
        hash = 17 * hash + Objects.hashCode(this.zIndex);

        return hash;
    }

    @Override
    public String toString() {
        return "acrossPanes:" + acrossPanes
                + ", className:" + className
                + ", color:" + color
                + ", dashStyle:" + dashStyle
                + ", events:" + events
                + ", id:" + id
                + ", label:" + label
                + ", value:" + value
                + ", width:" + width
                + ", zIndex:" + zIndex;
    }

}
