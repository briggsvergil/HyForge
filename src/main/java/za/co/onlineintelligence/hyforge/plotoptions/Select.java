package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.HighchartsColor;


/**
 * Select HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Select implements Serializable {


    public Select() {
    }

    /**
     * Enable or disable visible feedback for selection.
     */
    private boolean enabled;

    /**
     * The fill color of the point marker.
     */
    private HighchartsColor fillColor;

    /**
     * The color of the point marker's outline. When
     * `undefined`, the series' or point's color is used.
     */
    private HighchartsColor lineColor;

    /**
     * The width of the point marker's outline.
     */
    private int lineWidth;

    /**
     * The radius of the point marker. In hover state, it
     * defaults to the normal state's radius + 2.
     */
    private int radius;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public boolean getEnabled() {
        return this.enabled;
    }

    public Select setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HighchartsColor getFillColor() {
        return this.fillColor;
    }

    public Select setFillColor(HighchartsColor fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public HighchartsColor getLineColor() {
        return this.lineColor;
    }

    public Select setLineColor(HighchartsColor lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public int getLineWidth() {
        return this.lineWidth;
    }

    public Select setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public int getRadius() {
        return this.radius;
    }

    public Select setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.fillColor);
        hash = 17 * hash + Objects.hashCode(this.lineColor);
        hash = 17 * hash + Objects.hashCode(this.lineWidth);
        hash = 17 * hash + Objects.hashCode(this.radius);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "enabled:" + enabled
                + ", fillColor:" + fillColor
                + ", lineColor:" + lineColor
                + ", lineWidth:" + lineWidth
                + ", radius:" + radius
                + '}';
    }


}
