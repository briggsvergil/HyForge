/*
 */
package za.co.onlineintelligence.hyforge.axis;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.series.HighchartsPoint;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * PlotBands HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class PlotBand implements Serializable, DrosteDeflater {

    public PlotBand() {
    }

    /**
     * Flag to decide if plotBand should be rendered across all panes.
     *
     * @since 7.1.2
     */
    private boolean acrossPanes;

    /**
     * Border color for the plot band. Also requires `borderWidth` to be set.
     */
    private HighchartsColorString borderColor;

    /**
     * Border width for the plot band. Also requires `borderColor` to be set.
     */
    private int borderWidth;

    /**
     * A custom class name, in addition to the default `highcharts-plot-band`,
     * to apply to each individual band.
     *
     * @since 5.0.0
     */
    private String className;

    /**
     * The color of the plot band.
     */
    private HighchartsColor color;

    /**
     * An object defining mouse events for the plot band. Supported properties
     * are `click`, `mouseover`, `mouseout`, `mousemove`.
     *
     * @since 1.2.0
     */
    private HighchartsMouseEvents events;

    /**
     * The start position of the plot band in axis units.
     */
    private int from;

    /**
     * An id used for identifying the plot band in axis.removePlotBand.
     */
    private String id;

    /**
     * Text labels for the plot bands
     */
    private HighchartsLabel label;

    /**
     * The end position of the plot band in axis units.
     */
    private int to;

    /**
     * The z index of the plot band within the chart, relative to other
     * elements. Using the same z index as another element may give
     * unpredictable results, as the last rendered element will be on top.
     * Values from 0 to 20 make sense.
     *
     * @since 1.2.0
     */
    private int zIndex;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public boolean getAcrossPanes() {
        return this.acrossPanes = getInstanceOf(boolean.class, this.acrossPanes);
    }

    public PlotBand setAcrossPanes(boolean acrossPanes) {
        this.acrossPanes = acrossPanes;
        return this;
    }

    public HighchartsColorString getBorderColor() {
        return this.borderColor = getInstanceOf(HighchartsColorString.class, this.borderColor);
    }

    public PlotBand setBorderColor(HighchartsColorString borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public int getBorderWidth() {
        return this.borderWidth = getInstanceOf(int.class, this.borderWidth);
    }

    public PlotBand setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String getClassName() {
        return this.className = getInstanceOf(String.class, this.className);
    }

    public PlotBand setClassName(String className) {
        this.className = className;
        return this;
    }

    public HighchartsColor getColor() {
        return this.color = getInstanceOf(HighchartsColor.class, this.color);
    }

    public PlotBand setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public PlotBand setColor(String colorString) {
        this.color = new HighchartsColorString(colorString);
        return this;
    }

    public HighchartsMouseEvents getEvents() {
        return this.events = getInstanceOf(HighchartsMouseEvents.class, this.events);
    }

    public PlotBand setEvents(HighchartsMouseEvents events) {
        this.events = events;
        return this;
    }

    public int getFrom() {
        return this.from = getInstanceOf(int.class, this.from);
    }

    public PlotBand setFrom(int from) {
        this.from = from;
        return this;
    }

    public String getId() {
        return this.id = getInstanceOf(String.class, this.id);
    }

    public PlotBand setId(String id) {
        this.id = id;
        return this;
    }

    public HighchartsLabel getLabel() {
        return this.label = getInstanceOf(HighchartsLabel.class, this.label);
    }

    public PlotBand setLabel(HighchartsLabel label) {
        this.label = label;
        return this;
    }

    public int getTo() {
        return this.to = getInstanceOf(int.class, this.to);
    }

    public PlotBand setTo(int to) {
        this.to = to;
        return this;
    }

    public int getZIndex() {
        return this.zIndex = getInstanceOf(int.class, this.zIndex);
    }

    public PlotBand setZIndex(int zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.acrossPanes);
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.borderWidth);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.events);
        hash = 17 * hash + Objects.hashCode(this.from);
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.label);
        hash = 17 * hash + Objects.hashCode(this.to);
        hash = 17 * hash + Objects.hashCode(this.zIndex);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "acrossPanes:" + acrossPanes
                + ", borderColor:" + borderColor
                + ", borderWidth:" + borderWidth
                + ", className:" + className
                + ", color:" + color
                + ", events:" + events
                + ", from:" + from
                + ", id:" + id
                + ", label:" + label
                + ", to:" + to
                + ", zIndex:" + zIndex
                + '}';
    }

}
