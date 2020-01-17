package za.co.onlineintelligence.hyforge.annotations;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.series.HighchartsPoint;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * AnnotationsLabels  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class AnnotationsLabels extends LabelOptions implements Serializable, DrosteDeflater {


    public AnnotationsLabels() {
    }

    /**
     * This option defines the point to which the label will be
     * connected. It can be either the point which exists in the
     * series - it is referenced by the point's id - or a new point with
     * defined x, y properties and optionally axes.
     *
     * @since 6.0.0
     */
    private HighchartsPoint point;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsPoint getPoint() {
        return this.point = getInstanceOf(HighchartsPoint.class, this.point);
    }

    public AnnotationsLabels setPoint(HighchartsPoint point) {
        this.point = point;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.point);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "point:" + point
                + '}';
    }


}
