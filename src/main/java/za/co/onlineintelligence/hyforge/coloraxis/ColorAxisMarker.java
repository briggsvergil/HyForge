package za.co.onlineintelligence.hyforge.coloraxis;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;


/**
 * ColorAxisMarker  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ColorAxisMarker implements Serializable, DrosteDeflater {


    public ColorAxisMarker() {
    }

    /**
     * Animation for the marker as it moves between values. Set to
     * `false` to disable animation. Defaults to `{ duration: 50 }`.
     */
    private Integer animation;

    /**
     * The color of the marker.
     */
    private HighchartsColor color;

    /**
     *
     */
    private Integer width;

    /*
        Getters and Builder-Style Setters
    */
    public Integer getAnimation() {
        return this.animation;
    }

    public ColorAxisMarker setAnimation(Integer animation) {
        this.animation = animation;
        return this;
    }

    public HighchartsColor getColor() {
        return this.color;
    }

    public ColorAxisMarker setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public ColorAxisMarker setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.animation);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.width);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "animation:" + animation
                + ", color:" + color
                + ", width:" + width
                + '}';
    }


}
