package za.co.onlineintelligence.hyforge.annotations;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;


/**
 * ShapeOptions  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ShapeOptions implements Serializable, DrosteDeflater {


    public ShapeOptions() {
    }

    /**
     * The color of the shape's fill.
     *
     * @since 6.0.0
     */
    private HighchartsColor fill;

    /**
     * The height of the shape.
     *
     * @since 6.0.0
     */
    private Integer height;

    /**
     * The radius of the shape.
     *
     * @since 6.0.0
     */
    private Integer r;

    /**
     * Defines additional snapping area around an annotation
     * making this annotation to focus. Defined in pixels.
     *
     * @since 6.0.0
     */
    private Integer snap;

    /**
     * The color of the shape's stroke.
     *
     * @since 6.0.0
     */
    private HighchartsColorString stroke;

    /**
     * The pixel stroke width of the shape.
     *
     * @since 6.0.0
     */
    private Integer strokeWidth;

    /**
     * The type of the shape, e.g. circle or rectangle.
     *
     * @since 6.0.0
     */
    private String type;

    /**
     * The width of the shape.
     *
     * @since 6.0.0
     */
    private Integer width;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsColor getFill() {
        return this.fill;
    }

    public ShapeOptions setFill(HighchartsColor fill) {
        this.fill = fill;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    public ShapeOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getR() {
        return this.r;
    }

    public ShapeOptions setR(Integer r) {
        this.r = r;
        return this;
    }

    public Integer getSnap() {
        return this.snap;
    }

    public ShapeOptions setSnap(Integer snap) {
        this.snap = snap;
        return this;
    }

    public HighchartsColorString getStroke() {
        return this.stroke;
    }

    public ShapeOptions setStroke(HighchartsColorString stroke) {
        this.stroke = stroke;
        return this;
    }

    public Integer getStrokeWidth() {
        return this.strokeWidth;
    }

    public ShapeOptions setStrokeWidth(Integer strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ShapeOptions setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public ShapeOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.fill);
        hash = 17 * hash + Objects.hashCode(this.height);
        hash = 17 * hash + Objects.hashCode(this.r);
        hash = 17 * hash + Objects.hashCode(this.snap);
        hash = 17 * hash + Objects.hashCode(this.stroke);
        hash = 17 * hash + Objects.hashCode(this.strokeWidth);
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + Objects.hashCode(this.width);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "fill:" + fill
                + ", height:" + height
                + ", r:" + r
                + ", snap:" + snap
                + ", stroke:" + stroke
                + ", strokeWidth:" + strokeWidth
                + ", type:" + type
                + ", width:" + width
                + '}';
    }


}
