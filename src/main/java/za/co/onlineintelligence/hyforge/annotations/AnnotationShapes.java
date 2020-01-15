package za.co.onlineintelligence.hyforge.annotations;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.series.HighchartsPoint;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * AnnotationShapes  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class AnnotationShapes extends ShapeOptions implements Serializable, DrosteDeflater {


    public AnnotationShapes() {
    }

    /**
     * Id of the marker which will be drawn at the final vertex of the
     * path. Custom markers can be defined in defs property.
     *
     * @since 6.0.0
     */
    private String markerEnd;

    /**
     * Id of the marker which will be drawn at the first vertex of the
     * path. Custom markers can be defined in defs property.
     *
     * @since 6.0.0
     */
    private String markerStart;

    /**
     * This option defines the point to which the shape will be
     * connected. It can be either the point which exists in the
     * series - it is referenced by the point's id - or a new point with
     * defined x, y properties and optionally axes.
     *
     * @since 6.0.0
     */
    private HighchartsPoint point;

    /**
     * An array of points for the shape. This option is available for
     * shapes which can use multiple points such as path. A point can be
     * either a point object or a point's id.
     *
     * @since 6.0.0
     */
    private HighchartsPoint[] points;

    /*
        Getters and Builder-Style Setters
    */
    public String getMarkerEnd() {
        return this.markerEnd = getInstanceOf(String.class, this.markerEnd);
    }

    public AnnotationShapes setMarkerEnd(String markerEnd) {
        this.markerEnd = markerEnd;
        return this;
    }

    public String getMarkerStart() {
        return this.markerStart = getInstanceOf(String.class, this.markerStart);
    }

    public AnnotationShapes setMarkerStart(String markerStart) {
        this.markerStart = markerStart;
        return this;
    }

    public HighchartsPoint getPoint() {
        return this.point = getInstanceOf(HighchartsPoint.class, this.point);
    }

    public AnnotationShapes setPoint(HighchartsPoint point) {
        this.point = point;
        return this;
    }

    public HighchartsPoint[] getPoints() {
        return this.points = getInstanceOf(HighchartsPoint[].class, this.points);
    }

    public AnnotationShapes setPoints(HighchartsPoint[] points) {
        this.points = points;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.markerEnd);
        hash = 17 * hash + Objects.hashCode(this.markerStart);
        hash = 17 * hash + Objects.hashCode(this.point);
        hash = 17 * hash + Objects.hashCode(this.points);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "markerEnd:" + markerEnd
                + ", markerStart:" + markerStart
                + ", point:" + point
                + ", points:" + points
                + '}';
    }


}
