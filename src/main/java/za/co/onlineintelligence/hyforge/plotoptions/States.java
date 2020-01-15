package za.co.onlineintelligence.hyforge.plotoptions;


import za.co.onlineintelligence.hyforge.common.DrosteDeflater;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * States HighchartsAPI Class
 * @author Sean Briggs
 */
public class States implements Serializable, DrosteDeflater {


    public States() {
    }

    /**
     * The hover state for a single point marker.
     */
    private Hover hover;

    /**
     * The opposite state of a hover for series.
     */
    private Inactive inactive;

    /**
     * The normal state of a single point marker. Currently only
     used for setting animation when returning to normal state
     from hover.
     */
    private Integer normal;

    /**
     * The appearance of the point marker when selected. In order to
     allow a point to be selected, set the
     `series.allowPointSelect` option to true.
     */
    private Select select;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public Hover getHover() {
        return getInstanceOf(Hover.class, this.hover);
    }

    public States setHover(Hover hover) {
        this.hover = hover;
        return this;
    }

    public Integer getNormal() {
        return getInstanceOf(Integer.class, this.normal);
    }

    public States setNormal(Integer normal) {
        this.normal = normal;
        return this;
    }

    public Select getSelect() {
        return getInstanceOf(Select.class, this.select);
    }

    public States setSelect(Select select) {
        this.select = select;
        return this;
    }


    public Inactive getInactive() {
        return getInstanceOf(Inactive.class, this.inactive);
    }

    public States setInactive(Inactive inactive) {
        this.inactive = inactive;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.hover);
        hash = 17 * hash + Objects.hashCode(this.inactive);
        hash = 17 * hash + Objects.hashCode(this.normal);
        hash = 17 * hash + Objects.hashCode(this.select);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "hover:" + hover
                + ", inactive:" + inactive
                + ", normal:" + normal
                + ", select:" + select
                + '}';
    }


}
