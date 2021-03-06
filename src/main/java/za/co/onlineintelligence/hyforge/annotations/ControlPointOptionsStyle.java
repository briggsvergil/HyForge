package za.co.onlineintelligence.hyforge.annotations;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * ControlPointOptionsStyle  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ControlPointOptionsStyle implements Serializable, Exportable {


    public ControlPointOptionsStyle() {
    }

    /**
     *
     */
    private String fill;

    /**
     *
     */
    private String stroke;

    /**
     *
     */
    private Integer stroke_width;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public String getFill() {
        return this.fill = getInstanceOf(String.class, this.fill);
    }

    public ControlPointOptionsStyle setFill(String fill) {
        this.fill = fill;
        return this;
    }

    public String getStroke() {
        return this.stroke = getInstanceOf(String.class, this.stroke);
    }

    public ControlPointOptionsStyle setStroke(String stroke) {
        this.stroke = stroke;
        return this;
    }

    public Integer getStroke_Width() {
        return this.stroke_width = getInstanceOf(Integer.class, this.stroke_width);
    }

    public ControlPointOptionsStyle setStroke_Width(Integer stroke_width) {
        this.stroke_width = stroke_width;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.fill);
        hash = 17 * hash + Objects.hashCode(this.stroke);
        hash = 17 * hash + Objects.hashCode(this.stroke_width);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "fill:" + fill
                + ", stroke:" + stroke
                + ", stroke-width:" + stroke_width
                + '}';
    }


}
