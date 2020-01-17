package za.co.onlineintelligence.hyforge.annotations;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * ControlPointOptions  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ControlPointOptions implements Serializable, DrosteDeflater {


    public ControlPointOptions() {
    }

    /**
     *
     */
    private Integer height;

    /**
     * TODO: Find some useful documentation on what the hell this is?!!
     */
    private Object positioner;

    /**
     *
     */
    private ControlPointOptionsStyle style;

    /**
     *
     */
    private String symbol;

    /**
     *
     */
    private Boolean visible;

    /**
     *
     */
    private Integer width;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public Integer getHeight() {
        return this.height = getInstanceOf(Integer.class, this.height);
    }

    public ControlPointOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Object getPositioner() {
        return this.positioner = getInstanceOf(Object.class, this.positioner);
    }

    public ControlPointOptions setPositioner(Object positioner) {
        this.positioner = positioner;
        return this;
    }

    public ControlPointOptionsStyle getStyle() {
        return this.style = getInstanceOf(ControlPointOptionsStyle.class, this.style);
    }

    public ControlPointOptions setStyle(ControlPointOptionsStyle style) {
        this.style = style;
        return this;
    }

    public String getSymbol() {
        return this.symbol = getInstanceOf(String.class, this.symbol);
    }

    public ControlPointOptions setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public Boolean getVisible() {
        return this.visible = getInstanceOf(Boolean.class, this.visible);
    }

    public ControlPointOptions setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    public Integer getWidth() {
        return this.width = getInstanceOf(Integer.class, this.width);
    }

    public ControlPointOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.height);
        hash = 17 * hash + Objects.hashCode(this.positioner);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.symbol);
        hash = 17 * hash + Objects.hashCode(this.visible);
        hash = 17 * hash + Objects.hashCode(this.width);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "height:" + height
                + ", positioner:" + positioner
                + ", style:" + style
                + ", symbol:" + symbol
                + ", visible:" + visible
                + ", width:" + width
                + '}';
    }


}