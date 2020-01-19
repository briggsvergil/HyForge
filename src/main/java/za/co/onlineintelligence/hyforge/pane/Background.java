package za.co.onlineintelligence.hyforge.pane;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsSize;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Background  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Background implements Serializable, Exportable {


    public Background() {
    }

    /**
     * The background color or gradient for the pane.
     *
     * @since 2.3.0
     */
    private HighchartsColor backgroundColor;

    /**
     * The pane background border color.
     *
     * @since 2.3.0
     */
    private HighchartsColor borderColor;

    /**
     * The pixel border width of the pane background.
     *
     * @since 2.3.0
     */
    private Integer borderWidth;

    /**
     * The class name for this background.
     *
     * @since 5.0.0
     */
    private String className;

    /**
     * The inner radius of the pane background. Can be either numeric
     * (pixels) or a percentage string.
     *
     * @since 2.3.0
     */
    private HighchartsSize innerRadius;

    /**
     * The outer radius of the circular pane background. Can be either
     * numeric (pixels) or a percentage string.
     *
     * @since 2.3.0
     */
    private HighchartsSize outerRadius;

    /**
     * The shape of the pane background. When `solid`, the background
     * is circular. When `arc`, the background extends only from the min
     * to the max of the value axis.
     *
     * @since 2.3.0
     */
    private String shape;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsColor getBackgroundColor() {
        return this.backgroundColor = getInstanceOf(HighchartsColor.class, this.backgroundColor);
    }

    public Background setBackgroundColor(HighchartsColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public HighchartsColor getBorderColor() {
        return this.borderColor = getInstanceOf(HighchartsColor.class, this.borderColor);
    }

    public Background setBorderColor(HighchartsColor borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderWidth() {
        return this.borderWidth = getInstanceOf(Integer.class, this.borderWidth);
    }

    public Background setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String getClassName() {
        return this.className = getInstanceOf(String.class, this.className);
    }

    public Background setClassName(String className) {
        this.className = className;
        return this;
    }

    public HighchartsSize getInnerRadius() {
        return this.innerRadius = getInstanceOf(HighchartsSize.class, this.innerRadius);
    }

    public Background setInnerRadius(HighchartsSize innerRadius) {
        this.innerRadius = innerRadius;
        return this;
    }

    public HighchartsSize getOuterRadius() {
        return this.outerRadius = getInstanceOf(HighchartsSize.class, this.outerRadius);
    }

    public Background setOuterRadius(HighchartsSize outerRadius) {
        this.outerRadius = outerRadius;
        return this;
    }

    public String getShape() {
        return this.shape = getInstanceOf(String.class, this.shape);
    }

    public Background setShape(String shape) {
        this.shape = shape;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.backgroundColor);
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.borderWidth);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.innerRadius);
        hash = 17 * hash + Objects.hashCode(this.outerRadius);
        hash = 17 * hash + Objects.hashCode(this.shape);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "backgroundColor:" + backgroundColor
                + ", borderColor:" + borderColor
                + ", borderWidth:" + borderWidth
                + ", className:" + className
                + ", innerRadius:" + innerRadius
                + ", outerRadius:" + outerRadius
                + ", shape:" + shape
                + '}';
    }

}
