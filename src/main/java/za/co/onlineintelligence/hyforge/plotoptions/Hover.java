package za.co.onlineintelligence.hyforge.plotoptions;


import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;


/**
 * Hover HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Hover implements Serializable, DrosteDeflater {


    public Hover() {
    }

    /**
     * Animation when hovering over the marker.
     */
    private Integer animation;

    /**
     * Enable or disable the point marker.
     */
    private Boolean enabled;

    /**
     * The fill color of the marker in hover state. When
     * `undefined`, the series' or point's fillColor for normal
     * state is used.
     */
    private HighchartsColor fillColor;

    /**
     * The color of the point marker's outline. When
     * `undefined`, the series' or point's lineColor for normal
     * state is used.
     */
    private HighchartsColor lineColor;

    /**
     * The width of the point marker's outline. When
     * `undefined`, the series' or point's lineWidth for normal
     * state is used.
     */
    private Integer lineWidth;

    /**
     * The additional line width for a hovered point.
     *
     * @since 4.0.3
     */
    private Integer lineWidthPlus;

    /**
     * The radius of the point marker. In hover state, it
     * defaults to the normal state's radius + 2 as per the
     * [radiusPlus](#plotOptions.series.marker.states.hover.radiusPlus)
     * option.
     */
    private Integer radius;

    /**
     * The number of pixels to increase the radius of the
     * hovered point.
     *
     * @since 4.0.3
     */
    private Integer radiusPlus;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public Integer getAnimation() {
        return this.animation;
    }

    public Hover setAnimation(Integer animation) {
        this.animation = animation;
        return this;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public Hover setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HighchartsColor getFillColor() {
        return this.fillColor;
    }

    public Hover setFillColor(HighchartsColor fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public HighchartsColor getLineColor() {
        return this.lineColor;
    }

    public Hover setLineColor(HighchartsColor lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Hover setLineColor(String lineColor) {
        this.lineColor = new HighchartsColorString(lineColor);
        return this;
    }

    public int getLineWidth() {
        return this.lineWidth;
    }

    public Hover setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public int getLineWidthPlus() {
        return this.lineWidthPlus;
    }

    public Hover setLineWidthPlus(int lineWidthPlus) {
        this.lineWidthPlus = lineWidthPlus;
        return this;
    }

    public int getRadius() {
        return this.radius;
    }

    public Hover setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    public int getRadiusPlus() {
        return this.radiusPlus;
    }

    public Hover setRadiusPlus(int radiusPlus) {
        this.radiusPlus = radiusPlus;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.animation);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.fillColor);
        hash = 17 * hash + Objects.hashCode(this.lineColor);
        hash = 17 * hash + Objects.hashCode(this.lineWidth);
        hash = 17 * hash + Objects.hashCode(this.lineWidthPlus);
        hash = 17 * hash + Objects.hashCode(this.radius);
        hash = 17 * hash + Objects.hashCode(this.radiusPlus);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "animation:" + animation
                + ", enabled:" + enabled
                + ", fillColor:" + fillColor
                + ", lineColor:" + lineColor
                + ", lineWidth:" + lineWidth
                + ", lineWidthPlus:" + lineWidthPlus
                + ", radius:" + radius
                + ", radiusPlus:" + radiusPlus
                + '}';
    }


}