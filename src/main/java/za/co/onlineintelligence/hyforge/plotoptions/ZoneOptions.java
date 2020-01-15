package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsDashStyleValue;


/**
 * Zones HighchartsAPI Class
 * @author Sean Briggs
 */
public class ZoneOptions implements Serializable {


    public ZoneOptions() {
    }

    /**
     * Styled mode only. A custom class name for the zone.
     * @since 5.0.0
     */
    private String className;

    /**
     * Defines the color of the series.
     * @since 4.1.0
     */
    private HighchartsColor color;

    /**
     * A name for the dash style to use for the graph.
     * @since 4.1.0
     */
    private HighchartsDashStyleValue dashStyle;

    /**
     * Defines the fill color for the series (in area type series)
     * @since 4.1.0
     */
    private HighchartsColor fillColor;

    /**
     * The value up to where the zone extends, if undefined the zones
     stretches to the last value in the series.
     * @since 4.1.0
     */
    private int value;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public String getClassName() {
        return this.className;
    }

    public ZoneOptions setClassName(String className) {
        this.className = className;
        return this;
    }

    public HighchartsColor getColor() {
        return this.color;
    }

    public ZoneOptions setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public HighchartsDashStyleValue getDashStyle() {
        return this.dashStyle;
    }

    public ZoneOptions setDashStyle(HighchartsDashStyleValue dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public HighchartsColor getFillColor() {
        return this.fillColor;
    }

    public ZoneOptions setFillColor(HighchartsColor fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public int getValue() {
        return this.value;
    }

    public ZoneOptions setValue(int value) {
        this.value = value;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.dashStyle);
        hash = 17 * hash + Objects.hashCode(this.fillColor);
        hash = 17 * hash + Objects.hashCode(this.value);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "className:" + className
                + ", color:" + color
                + ", dashStyle:" + dashStyle
                + ", fillColor:" + fillColor
                + ", value:" + value
                + '}';
    }


}