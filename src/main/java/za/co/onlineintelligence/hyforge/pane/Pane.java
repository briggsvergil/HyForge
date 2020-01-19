package za.co.onlineintelligence.hyforge.pane;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsSize;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Pane  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Pane implements Serializable, Exportable {


    public Pane() {
    }

    /**
     * An array of background items for the pane.
     *
     * @since 2.3.0
     */
    private Background[] background;

    /**
     * The center of a polar chart or angular gauge, given as an array
     * of [x, y] positions. Positions can be given as integers that
     * transform to pixels, or as percentages of the plot area size.
     *
     * @since 2.3.0
     */
    private Object[] center;

    /**
     * The end angle of the polar X axis or gauge value axis, given in
     * degrees where 0 is north. Defaults to [startAngle](#pane.startAngle)
     * + 360.
     *
     * @since 2.3.0
     */
    private Integer endAngle;

    /**
     * The size of the pane, either as a number defining pixels, or a
     * percentage defining a percentage of the plot are.
     *
     * @since 2.3.0
     */
    private HighchartsSize size;

    /**
     * The start angle of the polar X axis or gauge axis, given in degrees
     * where 0 is north. Defaults to 0.
     *
     * @since 2.3.0
     */
    private Integer startAngle;

    /*
        Getters and Builder-Style Setters
    */
    public Background[] getBackground() {
        return this.background = getInstanceOf(Background[].class, this.background);
    }

    public Pane setBackground(Background[] background) {
        this.background = background;
        return this;
    }

    public Object[] getCenter() {
        return this.center = getInstanceOf(Object[].class, this.center);
    }

    public Pane setCenter(Object[] center) {
        this.center = center;
        return this;
    }

    public Integer getEndAngle() {
        return this.endAngle = getInstanceOf(Integer.class, this.endAngle);
    }

    public Pane setEndAngle(Integer endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public HighchartsSize getSize() {
        return this.size = getInstanceOf(HighchartsSize.class, this.size);
    }

    public Pane setSize(HighchartsSize size) {
        this.size = size;
        return this;
    }

    public Integer getStartAngle() {
        return this.startAngle = getInstanceOf(Integer.class, this.startAngle);
    }

    public Pane setStartAngle(Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.background);
        hash = 17 * hash + Objects.hashCode(this.center);
        hash = 17 * hash + Objects.hashCode(this.endAngle);
        hash = 17 * hash + Objects.hashCode(this.size);
        hash = 17 * hash + Objects.hashCode(this.startAngle);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "background:" + background
                + ", center:" + center
                + ", endAngle:" + endAngle
                + ", size:" + size
                + ", startAngle:" + startAngle
                + '}';
    }


}
